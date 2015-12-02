package com.example.android.listofmovies;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private MovieAdapter mMovieAdapter;
    private RecyclerView mRecyclerView;

    public MainActivityFragment() {
        // do not touch the constructor of fragments and activities
        // if you wanted to put something here,
        // put then in onViewCreated or onActivityCreated

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_movies);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        mMovieAdapter = new MovieAdapter(this.getActivity());

        //A LayoutManager is responsible for measuring and positioning item views
        // within a RecyclerView as well as determining the policy for when to recycle
        // item views that are no longer visible to the user.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        // setting layout manager before setting adapter
        mRecyclerView.setAdapter(mMovieAdapter);

        List<MovieInfo> listOfInfo = Collections.emptyList();
        mMovieAdapter.setListOfInfo(listOfInfo);
    }
}
