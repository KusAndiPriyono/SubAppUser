package com.dicoding.submission.githubapp.service

import android.content.Intent
import android.widget.RemoteViewsService
import com.dicoding.submission.githubapp.view.adapter.StackRemoteViewsFactory

class StackWidgetService : RemoteViewsService() {

    override fun onGetViewFactory(intent: Intent?): RemoteViewsFactory =
        StackRemoteViewsFactory(this.applicationContext)
}
