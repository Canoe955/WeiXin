package edu.git.weixin.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.git.weixin.R;
import edu.git.weixin.activity.home.HomePageActivity;

public class OtherLoginActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_login);
        button = findViewById(R.id.phone_login_other_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtherLoginActivity.this, HomePageActivity.class));
            }
        });
    }
}