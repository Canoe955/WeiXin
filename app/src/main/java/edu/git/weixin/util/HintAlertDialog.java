package edu.git.weixin.util;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

public class HintAlertDialog {
    private Context context ;

    public HintAlertDialog(Context context) {
        this.context = context;
    }
    public void showDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("没有用户名");
        builder.setMessage("请输入电话号码");
        builder.setPositiveButton("我知道了",new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
