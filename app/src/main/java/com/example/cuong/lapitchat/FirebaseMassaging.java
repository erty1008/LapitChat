package com.example.cuong.lapitchat;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseMassaging extends FirebaseMessagingService {



    public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
        @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
            super.onMessageReceived(remoteMessage);

      /*  String notification_title = remoteMessage.getNotification().getTitle();
        String notification_message = remoteMessage.getNotification().getBody();

        String click_action = remoteMessage.getNotification().getClickAction();

        String from_user_id = remoteMessage.getData().get("from_user_id");*/

            android.support.v4.app.NotificationCompat.Builder mBuilder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.mipmap.ic_launcher)
                            .setContentTitle("New Friend Request")
                            .setContentText("Hello world");

/*
        Intent resultIntent = new Intent(click_action);
        resultIntent.putExtra("user_id", from_user_id);*/


      /*  PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );*/
/*
        mBuilder.setContentIntent(resultPendingIntent);*/




            int mNotificationId = (int) System.currentTimeMillis();

            NotificationManager mNotifyMgr =
                    (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

            mNotifyMgr.notify(mNotificationId, mBuilder.build());


        }
    }

}
