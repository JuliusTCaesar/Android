package com.example.juliuscaesar.projecttrainer;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    private TextView Mtv_4;
    private TextView Mtv_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Mtv_4 = findViewById(R.id.tv_4);
        Mtv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        Mtv_4.getPaint().setAntiAlias(true);//去锯齿

        Mtv_5 = findViewById(R.id.tv_5);
        Mtv_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
    }
}
