package com.example.opendatademo.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.opendatademo.R;

/**
 * Created by Wade on 2020/2/12.
 */
public class AboutFragment extends Fragment {

    public static AboutFragment newInstance(){
        return new AboutFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

}
