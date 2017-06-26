package com.example.yh.gotgam;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AlarmRing extends Activity {
    private static MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alamring);
        mp = MediaPlayer.create(this, R.raw.sou);
        mp.start();
    }
    public void onClick011(View v) {
        mp.stop();
    }
}

