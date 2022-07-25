package com.example.meit_alcoholfree;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NoticeActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_notice1);

        Button nxtBtn1 = (Button) findViewById(R.id.notice_next_btn1);
        Button nxtBtn2 = (Button) findViewById(R.id.notice_next_btn2);
        Button nxtBtn3 = (Button) findViewById(R.id.notice_next_btn3);

        nxtBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_notice2.class);
                startActivity(intent);
            }
        });
    }
}
