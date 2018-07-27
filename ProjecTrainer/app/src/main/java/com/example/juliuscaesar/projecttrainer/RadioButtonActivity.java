package com.example.juliuscaesar.projecttrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class RadioButtonActivity extends AppCompatActivity {

    private RadioGroup mRg1;
    private RadioButton mMaleRb;
    private RadioButton mFamaleRb;
    private Button mOkBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        initView();
    }


    private void initView() {
//        初始化按钮对象
        mMaleRb = (RadioButton)findViewById(R.id.rbtn_1);
        mFamaleRb = (RadioButton)findViewById(R.id.rbtn_2);
        mOkBt = (Button)findViewById(R.id.ok_bt);
//        给按钮对象设置监听器
        mOkBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMaleRb.isChecked()){
                    Toast.makeText(RadioButtonActivity.this,"性别是:男",Toast.LENGTH_SHORT).show();
                }
                if (mFamaleRb.isChecked()){
                    Toast.makeText(RadioButtonActivity.this,"性别是:女",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
