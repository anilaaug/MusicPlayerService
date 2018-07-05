package com.example.anila.musicplayerservice;


import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MxPlayerService extends IntentService{

   public  MxPlayerService()
    {
        super("MXPlayerService");
    }
    MediaPlayer mMediaPlayer;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "service Started", Toast.LENGTH_SHORT).show();
        mMediaPlayer= MediaPlayer.create(this,R.raw.sampleaudio);
        mMediaPlayer.setLooping(false );
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(this, "Media Player Started", Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        mMediaPlayer.start();
        return super.onStartCommand(intent,flags,startId);
    }

    public void onDestroy(){

        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();
        mMediaPlayer.stop();
    }

}

