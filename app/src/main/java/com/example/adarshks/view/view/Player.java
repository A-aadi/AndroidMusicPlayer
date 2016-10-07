package com.example.adarshks.view.view;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import model.Song;
import view.R;

public class Player extends Activity implements View.OnClickListener {

    ArrayList<Song> songList;
    Button playBtn, forwardBtn, backwardBtn;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playBtn = (Button) findViewById(R.id.play);
        forwardBtn = (Button) findViewById(R.id.forward);
        backwardBtn = (Button) findViewById(R.id.backward);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        songList = extras.getParcelableArrayList("songList");
        int position = extras.getInt("pos", 0);

//        File path = android.os.Environment.getExternalStorageDirectory();
//        System.out.println(path + "===========================");
//        try {
//            mp = MediaPlayer.create(getBaseContext(), Uri.parse((path + "/fileName.mp3")));
////            mp.setDataSource(path + "/fileName.mp3");
//            mp.prepare();
//            mp.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Uri u = Uri.parse(songList.get(position).toString());
        System.out.println(u.toString()+"==============================");
        mp = MediaPlayer.create(getBaseContext(),u);
        mp.start();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.play:
                if (mp.isPlaying())
                    mp.pause();
                else
                    mp.start();
                break;
            case R.id.forward:
                mp.seekTo(mp.getCurrentPosition() + 5000);
        }
    }
}
