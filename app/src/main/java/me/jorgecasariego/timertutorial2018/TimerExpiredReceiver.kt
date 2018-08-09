package me.jorgecasariego.timertutorial2018

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import me.jorgecasariego.timertutorial2018.util.NotificationUtil
import me.jorgecasariego.timertutorial2018.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
