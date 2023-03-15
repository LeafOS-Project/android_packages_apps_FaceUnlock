package com.libremobileos.facedetect;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

import android.util.Log;

public class OnLockedBootCompleteReceiver extends BroadcastReceiver {
    private static final String LOG_TAG = "FaceDetectBootReceiverService";

    @Override
    public void onReceive(final Context context, Intent intent) {
        Log.i(LOG_TAG, "onBoot");

        Intent sIntent = new Intent(context, FaceDetectService.class);
        context.startService(sIntent);
    }
}
