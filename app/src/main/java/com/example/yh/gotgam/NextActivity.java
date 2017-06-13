package com.example.yh.gotgam;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by yh on 2017. 6. 9..
 */

public class NextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void onClick02(View v)
    {
        Intent intent = new Intent( Intent.ACTION_SENDTO );
        intent.putExtra( "sms_body", " 지금 집 가는 중입니다. " );
        intent.setData( Uri.parse( "smsto:01087319379; 01087130031" ) );
        startActivity( intent );

    }


}