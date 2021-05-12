package edu.git.weixin.activity.setting;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import edu.git.weixin.R;
import edu.git.weixin.activity.login.LoadingActivity;
import edu.git.weixin.databinding.ActivitySettingBinding;
import edu.git.weixin.databinding.ActivitySettingBindingImpl;
import edu.git.weixin.view.MyWithSettingViewModel;

public class SettingActivity extends AppCompatActivity {
    MyWithSettingViewModel myWithSettingViewModel;
    ActivitySettingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_setting);
        myWithSettingViewModel = ViewModelProviders.of(this).get(MyWithSettingViewModel.class);
        binding.setData(myWithSettingViewModel);
        binding.setLifecycleOwner(this);

        binding.tvExitLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingActivity.this, LoadingActivity.class));
            }
        });
    }
}