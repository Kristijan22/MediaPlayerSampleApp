package com.example.krisvido.mediaplayertesting;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sampleaudio04mb);
        Button playButton = (Button) findViewById(R.id.PlayButton);
        playButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.PauseButton);
        pauseButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });

        Button plusButton = (Button) findViewById(R.id.VolumePlus);
        plusButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mediaPlayer.setVolume(1.0f,1.0f);
            }
        });

        Button minusButton = (Button) findViewById(R.id.VolumeMinus);
        minusButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mediaPlayer.setVolume(0.1f,0.1f);
            }
        });
    }
}
