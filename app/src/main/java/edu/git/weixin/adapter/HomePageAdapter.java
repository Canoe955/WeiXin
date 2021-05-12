package edu.git.weixin.adapter;

import android.net.CaptivePortal;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.git.weixin.R;
import edu.git.weixin.entity.HomePage;

/*
*
* */
public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.HomePageAdapterViewHolder>{
    private List<HomePage> homePages;
    public void setData(List<HomePage> homePages){
        this.homePages = homePages ;
        notifyDataSetChanged();
    }
    /*
    * 指定item布局
    * */
    @NonNull
    @Override
    public HomePageAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return  new HomePageAdapterViewHolder(LayoutInflater.from(viewGroup.getContext()).
                        inflate(R.layout.item_home_page,viewGroup,false));
    }

    /*
    * 绑定数据
    * */
    @Override
    public void onBindViewHolder(@NonNull HomePageAdapterViewHolder homePageAdapterViewHolder, int position) {
        HomePage homePage = homePages.get(position);
        homePageAdapterViewHolder.imageView.setImageResource(homePage.getImage());
        homePageAdapterViewHolder.textView_name.setText(homePage.getName());
        homePageAdapterViewHolder.textView_message.setText(homePage.getMessage());
        homePageAdapterViewHolder.textView_time.setText(homePage.getTime());
    }

    /*
    * 返回当前item数
    * */
    @Override
    public int getItemCount() {
        return homePages == null ? 0 : homePages.size();
    }

    public class HomePageAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView_name;
        TextView textView_message;
        TextView textView_time;
        public HomePageAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_image);
            textView_name = itemView.findViewById(R.id.tv_name);
            textView_message = itemView.findViewById(R.id.tv_message);
            textView_time = itemView.findViewById(R.id.tv_time);
        }
    }
}
