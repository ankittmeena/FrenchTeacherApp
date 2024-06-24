package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button black, green, purple, red, yellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button black=findViewById(R.id.blackBtn);
        Button green=findViewById(R.id.greenBtn);
        Button purple=findViewById(R.id.purpleBtn);
        Button red=findViewById(R.id.redBtn);
        Button yellow=findViewById(R.id.yellowBtn);

//        black.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.black);
//                mediaPlayer.start();
//
//            }
//        });
        black.setOnClickListener(this);
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        yellow.setOnClickListener(this);
        red.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickedBtnID=v.getId();
        if (clickedBtnID==R.id.blackBtn){
            PlaySounds(R.raw.red);
        }
        else if (clickedBtnID==R.id.greenBtn){
            PlaySounds(R.raw.green);
        }
        else if (clickedBtnID==R.id.purpleBtn){
            PlaySounds(R.raw.purple);
        }
        else if (clickedBtnID==R.id.redBtn){
            PlaySounds(R.raw.red);
        }
        else if (clickedBtnID==R.id.yellowBtn){
            PlaySounds(R.raw.yellow);
        }

    }

    private void PlaySounds(int id) {
        MediaPlayer mediaPlayer=MediaPlayer.create(this, id);
        mediaPlayer.start();
    };

}