package edu.git.weixin.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.git.weixin.R;
import edu.git.weixin.activity.home.MainActivity;
import edu.git.weixin.util.HintAlertDialog;

public class OtherLoginActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_login);
        button = findViewById(R.id.phone_login_other_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = findViewById(R.id.tv_other_login_phone_number);
                String text_phone;
                text_phone = editText.getText().toString();
                if (TextUtils.isEmpty(text_phone)){
                    new HintAlertDialog(OtherLoginActivity.this).showDialog(new View(OtherLoginActivity.this));
                    return;
                }
                startActivity(new Intent(OtherLoginActivity.this, MainActivity.class));
            }
        });
    }
}