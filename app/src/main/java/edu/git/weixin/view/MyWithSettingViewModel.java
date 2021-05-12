package edu.git.weixin.view;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import edu.git.weixin.activity.home.HomePageActivity;
import edu.git.weixin.activity.setting.MyActivity;

public class MyWithSettingViewModel extends ViewModel {
    private MutableLiveData<String> mutableLiveData;

    /*public void OnClick(){
        Intent intent = new Intent();
        new MyActivity().startActivity(intent);
    }*/


}
