package com.hexamind.datera;


import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ExploreFragment extends Fragment {
    private View root;
    private AppCompatImageView profileImage;
    private ImageView like, dislike;
    private AppCompatButton sendRequest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_explore, container, false);

        profileImage = root.findViewById(R.id.profileImage);
        like = root.findViewById(R.id.like);
        dislike = root.findViewById(R.id.dislike);
        sendRequest = root.findViewById(R.id.sendRequest);

        return root;
    }

}
