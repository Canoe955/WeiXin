package edu.git.weixin.entity;

import java.util.ArrayList;
import java.util.List;

import edu.git.weixin.R;

public class SimulatedData {
    List<HomePage> homePages = new ArrayList<HomePage>();
    public SimulatedData(){

    }
    public List<HomePage> initData(){
        for (int i = 0 ; i < 10 ; i++ ){
            HomePage homePage = new HomePage();
            homePage.setName("王二狗");
            homePage.setMessage("凯爸爸，吃饭吗");
            homePage.setTime("下午6:57");
            homePage.setImage(R.drawable.profile_photo);
            homePages.add(homePage);
        }
        return homePages;
    }
}
