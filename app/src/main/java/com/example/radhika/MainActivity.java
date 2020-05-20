package com.example.radhika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 CardView youtube,insta,whatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youtube=findViewById(R.id.youtube_card);
        insta=findViewById(R.id.insta_card);
        whatsapp=findViewById(R.id.whatsapp_card);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Web.class);
                intent.putExtra("url","https://www.youtube.com/");
                startActivity(intent);

            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Web.class);
                intent.putExtra("url","https://www.instagram.com/");
                startActivity(intent);
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Web.class);
                intent.putExtra("url","https://web.whatsapp.com/");
                startActivity(intent);
            }
        });
    }

}
