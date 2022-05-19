package com.example.bt2195;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button chuyendoi;
    TextView namam;
    EditText ednamduong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chuyendoi=(findViewById(R.id.button));
        namam=(findViewById(R.id.namam));
        ednamduong=(findViewById(R.id.namduong));
        chuyendoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]={"Canh","Tân" ,"Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
                String chi[]={"Thân","Dậu" ,"Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = ednamduong.getText().toString();
                int n=Integer.parseInt(di);
                String am= can[n%10] + " " +chi[n%12];
                namam.setText(am);
            }
        });
    }
}