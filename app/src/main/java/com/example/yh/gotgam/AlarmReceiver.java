package com.example.yh.gotgam;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.net.*;
import android.os.*;
import android.provider.MediaStore.*;
import android.util.*;
import android.widget.*;

import static com.example.yh.gotgam.R.id.set;

public class AlarmReceiver extends BroadcastReceiver {

    private int YOURAPP_NOTIFICATION_ID;

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, R.string.app_name, Toast.LENGTH_SHORT).show();

        showNotification(context, R.drawable.icon,
                "알람!!", "지금 이러고 있을 시간 없다.");
    }

    private void showNotification(Context context, int statusBarIconID,
                                  String statusBarTextID, String detailedTextID) {
        Intent contentIntent = new Intent(context, AlarmActivity.class);
        PendingIntent theappIntent =
                PendingIntent.getActivity(context, 0, contentIntent, PendingIntent.FLAG_UPDATE_CURRENT);


        CharSequence from = "알람";
        CharSequence message = "무슨짓을 해야  알람이 꺼질까요?";

        Notification.Builder builder = new Notification.Builder(context)
                .setSmallIcon(statusBarIconID)
                .setContentTitle(null)
                .setContentIntent(contentIntent);
        Notification notification = builder.build();
        notif.sound = Uri.withAppendedPath(Audio.Media.INTERNAL_CONTENT_URI, "6");//ringURI;
        notif.flags = Notification.FLAG_INSISTENT;
        notif.ledARGB = Color.GREEN;
        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        nm.notify(1234, notif);

    }
}