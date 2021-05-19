package edu.git.weixin.view;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import edu.git.weixin.entity.HomePage;

public class HomePageViewModel extends ViewModel {
    private MutableLiveData<HomePage> mutableLiveData;

    public MutableLiveData<HomePage> getMutableLiveData() {

        return mutableLiveData;
    }
}
