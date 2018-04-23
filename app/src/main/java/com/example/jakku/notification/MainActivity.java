package com.example.jakku.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSendNotification(View view) {
        //Here we build notification message with image, title and content
        NotificationCompat.Builder  build = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.help_icon)
                .setContentTitle("First Time Notification")
                .setContentText("Hello Rajesh This is your first Notification for Your App");


        // getting service of Notification service from local
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        //notifying  messagex
        manager.notify(001, build.build());
    }
}
