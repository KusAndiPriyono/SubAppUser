package com.dicoding.submission.githubapp.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.dicoding.submission.githubapp.R
import com.dicoding.submission.githubapp.helper.AlarmHelper.showAlarmNotification

class AlarmReceiver : BroadcastReceiver() {

    companion object {
        const val CHANNEL_ID = "Channel_1"
        const val CHANNEL_NAME = "Alarm Manager Channel"
        const val NOTIFICATION_ID = 1
    }

    override fun onReceive(context: Context, intent: Intent) {
        val title = context.resources.getString(R.string.app_name)
        val message = context.resources.getString(R.string.message)
        showAlarmNotification(context, title, message)
    }
}
