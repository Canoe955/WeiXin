package edu.git.weixin.entity;

import java.util.ArrayList;
import java.util.List;

import edu.git.weixin.R;

public class SimulatedData {
    List<HomePage> homePages = new ArrayList<HomePage>();
    static List<String> list = new ArrayList<>();
    static List<Integer> imageList = new ArrayList<>();
    static List<String> listWriting = new ArrayList<>();
    static List<String> listTime = new ArrayList<>();

    public SimulatedData(){}
    public List<HomePage> initData(){
            data();
        for (int i = 0 ; i < 10 ; i++ ){
            HomePage homePage = new HomePage();
            homePage.setName(list.get(i));
            homePage.setMessage(listWriting.get(i));
            homePage.setTime(listTime.get(i));
            homePage.setImage(imageList.get(i));
            homePages.add(homePage);
        }
        return homePages;
    }
    static void data(){
        list.add("深圳马");
        list.add("杭州马");
        list.add( "建林兄");
        list.add( "东哥");
        list.add( "雷布斯");
        list.add( "铮哥");
        list.add( "彦宏兄");
        list.add( "家印哥");
        list.add( "磊哥");
        list.add( "惠妍姐");

        imageList.add(R.drawable.profile_photo);
        imageList.add(R.drawable.touxiang1);
        imageList.add(R.drawable.touxiang2);
        imageList.add(R.drawable.touxiang3);
        imageList.add(R.drawable.touxiang4);
        imageList.add(R.drawable.touxiang5);
        imageList.add(R.drawable.touxiang6);
        imageList.add(R.drawable.touxiang7);
        imageList.add(R.drawable.touxiang8);
        imageList.add(R.drawable.touxiang9);

        listWriting.add("hello");
        listWriting.add("world");
        listWriting.add("又挂科了");
        listWriting.add("今天辛苦了，犒劳自己一下");
        listWriting.add("给大家推荐两部好看的电影，真心不错");
        listWriting.add("今天天气真不错");
        listWriting.add("两只都好可爱");
        listWriting.add("有要打球的吗？没有我等一会儿再来问问");
        listWriting.add("哪位大哥有爱奇艺会员，求借一下");
        listWriting.add("风景真的好");

        listTime.add("上午6:57");
        listTime.add("上午10:50");
        listTime.add("上午11:2");
        listTime.add("上午11:27");
        listTime.add("上午11:37");
        listTime.add("下午12:57");
        listTime.add("下午3:27");
        listTime.add("下午4:37");
        listTime.add("下午5:53");
        listTime.add("下午6:01");

    }

}
