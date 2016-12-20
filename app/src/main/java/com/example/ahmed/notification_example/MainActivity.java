package com.example.ahmed.notification_example;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int id =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public void click(View v){

        id ++;

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);


        if (id%2==0){
            builder.setSmallIcon(R.mipmap.ic_launcher);

            builder.setContentText("hello world");

            builder.setContentTitle("MY APP");
        }
        else{

            builder.setSmallIcon(R.mipmap.ic_launcher);

            builder.setContentText("Khaled");

            builder.setContentTitle("AMR");

        }

        Intent intent = new Intent(MainActivity.this,MainActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this,0,intent,0);

        builder.addAction(0,"View",pendingIntent);

        builder.setOngoing(true);



        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notificationManager.notify(1,builder.build());




    }


    public  void cancel(View v){

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        notificationManager.cancel(1);
    }
}
