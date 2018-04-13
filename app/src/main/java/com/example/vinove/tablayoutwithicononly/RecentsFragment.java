package com.example.vinove.tablayoutwithicononly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RecentsFragment extends android.support.v4.app.Fragment {
    View view;

    public RecentsFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.recents_layout,container,false);

         return view;

    }
}
