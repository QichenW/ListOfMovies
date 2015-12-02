package com.example.android.listofmovies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by qichen on 12/2/15.
 * adapter for movie Info
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private LayoutInflater mInflater;
    private List<MovieInfo> listOfInfo = null;

    public MovieAdapter(Context context) {
        mInflater = LayoutInflater.from(context);

    }

    public void setListOfInfo(List<MovieInfo> listOfInfo) {
        this.listOfInfo = listOfInfo;

        // notify the observer of the adapter to update the data set
        // this is a method of Adapter
        notifyDataSetChanged();

    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View movieItemView = mInflater.inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(movieItemView);
    }



    @Override
    public void onBindViewHolder(MovieAdapter.MovieViewHolder holder, int position) {
        MovieInfo info = listOfInfo.get(position);

        holder.title.setText(info.movieTitle);

    }

    @Override
    public int getItemCount() {
        return listOfInfo == null ? 0 : listOfInfo.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView icon;

        public MovieViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.movie_title);
            icon = (ImageView) itemView.findViewById(R.id.movie_icon);
        }
    }
}
