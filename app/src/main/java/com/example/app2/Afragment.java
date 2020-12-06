package com.example.app2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Afragment extends Fragment {
     RecyclerView recyclerView;
     List<RvData> list=new ArrayList<>();
      Adapter adapter =new Adapter(list);




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_afragment, container, false);
        recyclerView=view.findViewById(R.id.re_a);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager
                (getActivity(), LinearLayoutManager.VERTICAL,false));

        list.add(new RvData(R.drawable.beef,"这是一块牛肉","牛肉"));
        list.add(new RvData(R.drawable.cake,"这是一块蛋糕","蛋糕"));
        list.add(new RvData(R.drawable.carrot,"这是一根胡萝卜","胡萝卜"));
        list.add(new RvData(R.drawable.dumpling,"这是一个饺子","饺子"));
        list.add(new RvData(R.drawable.hambger,"老八蜜汁小汉堡","你看着汉堡做的行不行"));
        adapter.notifyDataSetChanged();
        return view;


    }
}