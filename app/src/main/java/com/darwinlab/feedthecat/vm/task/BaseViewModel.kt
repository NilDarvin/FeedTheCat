package com.darwinlab.feedthecat.vm.task

import android.app.Application
import androidx.annotation.StringRes
import androidx.lifecycle.AndroidViewModel

open class BaseViewModel(application: Application) : AndroidViewModel(application) {
    private fun getContext() = getApplication<Application>()
    fun getString (@StringRes id : Int):String = getContext().getString(id)
}