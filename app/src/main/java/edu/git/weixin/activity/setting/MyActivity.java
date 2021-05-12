package edu.git.weixin.activity.setting;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.git.weixin.R;
import edu.git.weixin.activity.home.HomePageActivity;
import edu.git.weixin.databinding.ActivityMyBinding;
import edu.git.weixin.view.MyWithSettingViewModel;

public class MyActivity extends AppCompatActivity {
     MyWithSettingViewModel myWithSettingViewModel;
     ActivityMyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_my);
        myWithSettingViewModel = ViewModelProviders.of(this).get(MyWithSettingViewModel.class);
        binding.setData(myWithSettingViewModel);
        binding.setLifecycleOwner(this);
        /*
        * 跳转到SettingActivity
        * */
        binding.tvSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this, SettingActivity.class));
            }
        });
    }

}