package com.example.yh.gotgam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class NextActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

    }
    public void onClick08(View v)
    {
        Intent intent1= new Intent(this, AlarmActivity.class);
        startActivity(intent1);
    }

    public void onClick02(View v)
    {
        Intent intent = new Intent( Intent.ACTION_SENDTO );
        intent.putExtra( "sms_body", " 지금 집 가는 중입니다. " );
        intent.setData( Uri.parse( "smsto:01087319379; 01087130031" ) );
        startActivity( intent );

    }
    public void onClick04(View v)
    {
        Intent intent= new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



}