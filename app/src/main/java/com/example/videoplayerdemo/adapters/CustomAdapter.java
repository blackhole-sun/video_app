package com.example.videoplayerdemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.videoplayerdemo.R;
import com.example.videoplayerdemo.model.VideoData;

import java.util.List;

public class CustomAdapter extends
        RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<VideoData> mData;

    public  CustomAdapter(List<VideoData> data){
        this.mData = data;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.row_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VideoData videoData = mData.get(position);
        TextView textView = holder.nameTextView;
        textView.setText(videoData.getName());
        TextView mb = holder.messageButton;
        mb.setText(videoData.getName());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView messageButton;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.tv_name);
            messageButton = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
