package com.example.opendatademo.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.opendatademo.DataBean;
import com.example.opendatademo.R;
import com.example.opendatademo.RecyclerViewAdapter;
import com.example.opendatademo.VolleyFactory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wade on 2020/2/12.
 */
public class ListFragment extends Fragment implements VolleyFactory.IGetData {
    private final static String TAG = "ListFragment";
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter adapter;
    private List<DataBean> list;

    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mRecyclerView = view.findViewById(R.id.mRecyclerView);

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        init();
    }

    private void init(){
        list = new ArrayList<>();

        VolleyFactory volleyFactory = new VolleyFactory(getContext(), this);
        volleyFactory.SendGet();

        adapter = new RecyclerViewAdapter(getContext(), list);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void Success(String msg) {
        JsonToObject(msg);
        adapter.updateData(list);
    }

    @Override
    public void Error(String msg) {
        Log.d(TAG,msg);
    }

    private void JsonToObject(String json){
        Gson gson = new Gson();
        list = gson.fromJson(json, new TypeToken<List<DataBean>>(){}.getType());
    }
}
