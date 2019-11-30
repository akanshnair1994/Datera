package com.hexamind.datera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesViewHolder> {
    private Context context;
    private List<UserDating> matchesList;

    public MatchesAdapter(Context context, List<UserDating> matchesList) {
        this.context = context;
        this.matchesList = matchesList;
    }

    @NonNull
    @Override
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MatchesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_matches, null, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MatchesViewHolder holder, int position) {
        UserDating match = matchesList.get(position);

        Glide.with(context)
                .load(R.drawable.ic_placeholder)
                .apply(RequestOptions.centerCropTransform())
                .into(holder.profileImage);
        holder.profileName.setText(context.getString(R.string.profile_name_string, match.getfName(), match.getlName()));
    }

    @Override
    public int getItemCount() {
        return matchesList.size();
    }
}
