package com.hansung.android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //MainActivity의 ContentView를 activity_main.xml로 등록 --> 이제 해당 xml파일에 등록해놓은 id로 호출하면 됨

        //id가 button1인 view객체를 찾아서 자바 객체로 return 해줘라
        Button btn1 = findViewById(R.id.button1);

        //btn1이 눌려졌을때 행동을 등록
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //btn1이 눌려졌을때 수행될 코드

                Toast.makeText(getApplicationContext(), R.string.button1_msg,   Toast.LENGTH_SHORT).show();

            }
        });

        //btn4를 누르면 btn1의 텍스트가 토글 ex) BUTTON1 --> BUTTON One
        Button btn4 = findViewById(R.id.button4);

        //btn4가 눌려졌을때 행동을 등록
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //btn4가 눌려졌을때 수행될 코드
                Button btn1 = findViewById(R.id.button1);
                if (btn1.getText().equals("BUTTON1")){
                    btn1.setText("BUTTON One");
                }
                else
                    btn1.setText("BUTTON1");

            }
        });

        //btn5를 누르면 이를 포함한 리니어 레이아웃의 gravity 값을 "CENTER_HORIZONTAL"로 변경
        Button btn5 = findViewById(R.id.button5);

        //btn5가 눌려졌을때 행동을 등록
        btn5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {   //btn4가 눌려졌을때 수행될 코드
                Button btn5 = findViewById(R.id.button5);  //

                LinearLayout layout = findViewById(R.id.linearlayout2); //xml파일에서 linearLayout2라는 id를 가진 것을 찾아서 참조
                layout.setGravity(Gravity.CENTER_HORIZONTAL);  //id가 linearLayout2인 것의 Gravity를 변경
            }
        });

        //btn6를 누르면 이를 포함한 리니어 레이아웃의 padding 값을 상하좌우 각각 20으로 변경
        Button btn6 = findViewById(R.id.button6);

        //btn6가 눌려졌을때 행동을 등록
        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {   //btn4가 눌려졌을때 수행될 코드
                Button btn6 = findViewById(R.id.button6);  //

                LinearLayout layout = findViewById(R.id.linearlayout2); //xml파일에서 linearLayout2라는 id를 가진 것을 찾아서 참조
                layout.setPadding(20,20,20,20);  //id가 linearLayout2인 것의 Gravity를 변경
            }
        });


    }




}