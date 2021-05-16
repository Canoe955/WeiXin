package edu.git.weixin.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.git.weixin.R;
import edu.git.weixin.activity.contacts.DetailActivity;
import edu.git.weixin.entity.HomePage;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<HomePage> homePages;
    private Context context;
    public void setDate(Context context ,List<HomePage> homePages){
        this.homePages = homePages;
        this.context = context;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_page,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        HomePage homePage = homePages.get(i);
        myViewHolder.imageView.setImageResource(homePage.getImage());
        myViewHolder.textView_name.setText(homePage.getName());
        myViewHolder.textView_message.setText(homePage.getMessage());
        myViewHolder.textView_time.setText(homePage.getTime());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DetailActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return homePages == null ? 0 : homePages.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView_name;
        TextView textView_message;
        TextView textView_time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_image);
            textView_name = itemView.findViewById(R.id.tv_name);
            textView_message = itemView.findViewById(R.id.tv_message);
            textView_time = itemView.findViewById(R.id.tv_time);

        }

    }
}
