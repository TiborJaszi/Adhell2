package com.almafa.AdHell2.receiver;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

import com.almafa.AdHell2.blocker.ContentBlocker;
import com.almafa.AdHell2.blocker.ContentBlocker56;
import com.almafa.AdHell2.blocker.ContentBlocker57;
import com.almafa.AdHell2.utils.BlockedDomainAlarmHelper;
import com.almafa.AdHell2.utils.DeviceAdminInteractor;

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ContentBlocker contentBlocker = DeviceAdminInteractor.getInstance().getContentBlocker();
        if (contentBlocker != null && contentBlocker.isEnabled() && (contentBlocker instanceof ContentBlocker56
                || contentBlocker instanceof ContentBlocker57)) {
            BlockedDomainAlarmHelper.scheduleAlarm();
        }
//        HeartbeatAlarmHelper.scheduleAlarm();
    }
}
