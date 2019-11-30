package com.hexamind.datera;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    ImageView profileImage;
    TextView username, lastMessage;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);

        profileImage = itemView.findViewById(R.id.profileImage);
        username = itemView.findViewById(R.id.userName);
        lastMessage = itemView.findViewById(R.id.lastMessage);
    }
}
