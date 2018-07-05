package com.example.anila.musicplayerservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SimpleBroadCastReceiver extends BroadcastReceiver {

    public SimpleBroadCastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Action: " + intent.getAction(), Toast.LENGTH_SHORT).show();
        Log.e("onReceive", "onReceive: " );
    }
}
