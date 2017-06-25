package com.example.yh.gotgam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by yh on 2017. 6. 25..
 */

public class NNextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nnext);

    }
    public void onClick08(View v)
    {
        Intent intent1= new Intent(this, AlarmActivity.class);
        startActivity(intent1);
    }

};

