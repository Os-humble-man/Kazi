package com.example.kazi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import kotlinx.coroutines.Delay;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Intent intent = new Intent(this, Login.class);
        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(Thread.currentThread().getName());
        }
        startActivity(intent);
    }

}