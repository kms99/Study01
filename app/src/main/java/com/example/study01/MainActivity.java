package com.example.study01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView iv_test;
    EditText et_text;
    Button btn_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_text=(EditText)findViewById(R.id.et_text);
        btn_test=(Button)findViewById(R.id.btn_test);
        iv_test=(ImageView)findViewById(R.id.iv_test);

        iv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"토스트 메세지",Toast.LENGTH_SHORT).show();
            }
        });
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);
            }
        });
    }
}
