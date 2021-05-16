package edu.git.weixin.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.git.weixin.R;
import edu.git.weixin.activity.home.MainActivity;
import edu.git.weixin.util.HintAlertDialog;

public class LoginActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = findViewById(R.id.tv_other_login);
        button = findViewById(R.id.phone_login_other_next);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,OtherLoginActivity.class));
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.tv_login_phone_number);
                String text_phone;
                text_phone = editText.getText().toString();
                if (TextUtils.isEmpty(text_phone)){
                    new HintAlertDialog(LoginActivity.this).showDialog(new View(LoginActivity.this));
//                    Toast.makeText(this, "请输入手机号！！！", Toast.LENGTH_SHORT).show();
                    return;
                }
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    }
}