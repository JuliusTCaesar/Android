package com.example.juliuscaesar.projecttrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ButtonActivity extends AppCompatActivity {

    private Button btn_3;
    private TextView btv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(ButtonActivity.this,"按钮3被点击了",Toast.LENGTH_SHORT).show();
            }
        });

        btv_1 = findViewById(R.id.btv_1);
        btv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"文字1被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }

            public void showToast(View v){
                Toast.makeText(this,"按钮4被点击了",Toast.LENGTH_SHORT).show();
            }
}
