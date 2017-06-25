package com.example.yh.gotgam;

import android.content.BroadcastReceiver;

import android.app.*;
import android.content.*;
import android.net.*;
import android.provider.MediaStore.*;
import android.widget.*;


public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, R.string.app_name, Toast.LENGTH_SHORT).show();

        showNotification(context, R.drawable.icon,

                "상대바에 대한 ID", "상태바에 대한 ID보다 더 디테일한 ID"); //뒤에 두 텍스트는 어디에 쓰이는지 잘 모르겠다.

    }



    private void showNotification(Context context, int statusBarIconID,

                                  String statusBarTextID, String detailedTextID) {

        Intent contentIntent = new Intent(context, NNextActivity.class);

        PendingIntent theappIntent =

                PendingIntent.getActivity(context, 0, contentIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//만일 이미 생성된 PendingIntent 가 존재 한다면, 해당 Intent 의 내용을 변경.

        CharSequence from = "알람"; // 알람이 울린 후 타이틀명

        CharSequence message = "무슨짓을 해야 알람이 꺼질까요?"; //알람이 울린 후 드래그해보면 있는 내용

        Notification notif = new Notification(statusBarIconID, null, System.currentTimeMillis());

        notif.sound = Uri.withAppendedPath(Audio.Media.INTERNAL_CONTENT_URI, "3");
//	ringURI;
//	지정한 시간에 울리는 알람의 경우 여기서 지정한 소리에서 알람이 울립니다.
// 즉 set 버튼으로 지정한 시간에 여기서 지정한 소리가 울립니다.

        for(int i=0; i<10; i++)
        {
            notif.flags = Notification.FLAG_INSISTENT; // 사용자의 응답이 있을 때 까지 반복
        }
        notif.flags = Notification.FLAG_AUTO_CANCEL; // notification Icon 클릭시 icon 이 사라짐
//두 개를 같이 쓰니 INSISTENT가 안 먹힘 순서를 바꾸면 CANCEL이 안 먹힘
//finish를 써야할 것 같긴 한데 어떻게 써야할지 잘 모르겠음
/*
        notif.setLatestEventInfo(context, from, message, theappIntent);
//notification에 등록될 메시지에 대한 제어*/

        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1234, notif);
//notification의 고유 id(1234)와 notification 객체를 통해 관리한다.


    }


}