package edu.git.weixin.activity.home;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import edu.git.weixin.R;
import edu.git.weixin.adapter.HomePageAdapter;
import edu.git.weixin.databinding.ActivityHomePageBinding;
import edu.git.weixin.entity.HomePage;
import edu.git.weixin.entity.SimulatedData;
import edu.git.weixin.view.HomePageViewModel;

public class HomePageActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    HomePageViewModel homePageViewModel;
    ActivityHomePageBinding binding;
    List<HomePage> homePages = new ArrayList<HomePage>();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        context = HomePageActivity.this;
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home_page);
        homePageViewModel = ViewModelProviders.of(this).get(HomePageViewModel.class);
        binding.setData(homePageViewModel);
        binding.setLifecycleOwner(this);
        //指定列表布局
        binding.recycleView.setLayoutManager(new LinearLayoutManager(context));
        //配置adapter
        HomePageAdapter homePageAdapter = new HomePageAdapter();
        binding.recycleView.setAdapter(homePageAdapter);
        homePages = new SimulatedData().initData();
        homePageAdapter.setData(homePages);


    }
}