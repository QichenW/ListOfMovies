package com.example.android.listofmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by qichen on 12/2/15.
 * adapter for movie Info
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private LayoutInflater inflater;
    private List<MovieInfo> listOfInfo = Collections.emptyList();

    public MovieAdapter(Context context, List<MovieInfo> listOfInfo) {
        inflater = LayoutInflater.from(context);
        this.listOfInfo = listOfInfo;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View movieItemView = inflater.inflate(R.layout.item_movie, parent, false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(movieItemView);
        return movieViewHolder;
    }



    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder holder, int position) {
        MovieInfo info = listOfInfo.get(position);

        //holder.icon.setImageResource(info.iconId);

        holder.title.setText(info.movieTitle);

    }

    @Override
    public int getItemCount() {
        return listOfInfo.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView icon;
        public MovieViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.movie_title);
            icon = (ImageView) itemView.findViewById(R.id.movie_icon);
        }
    }
}
