package com.example.reprodutormidia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_reproduzir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_reproduzir = findViewById(R.id.button);

        btn_reproduzir.setOnClickListener(this);
    }

    public void onClick(View v){
        if (v == btn_reproduzir) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound);
            mediaPlayer.start();
        }
    }
}