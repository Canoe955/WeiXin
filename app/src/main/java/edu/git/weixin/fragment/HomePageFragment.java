package edu.git.weixin.fragment;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.git.weixin.R;
import edu.git.weixin.adapter.MyAdapter;
import edu.git.weixin.entity.HomePage;
import edu.git.weixin.entity.SimulatedData;

public class HomePageFragment extends Fragment {
    private HomePageViewModel mViewModel;
    private RecyclerView recyclerView;
    private List<HomePage> homePages = new ArrayList<>();

    public static HomePageFragment newInstance() {
        return new HomePageFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_page_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(HomePageViewModel.class);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView;
        textView = getView().findViewById(R.id.username_textview);
        String phone = getActivity().getIntent().getStringExtra("phone");
        textView.setText(phone);

        recyclerView = view.findViewById(R.id.recycle_fragment_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);

        homePages = new SimulatedData().initData();
        myAdapter.setDate(getActivity(),homePages);




    }
}