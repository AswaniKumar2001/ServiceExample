package com.example.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import kotlin.math.UMathKt;

public class myService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for (int i = 0; i<=100;i++){
            Log.i("App...","inside loop" + i);
        }
        return START_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public void onDestroy() {
        Log.i("App...","inside onDestry");
        super.onDestroy();
    }
}