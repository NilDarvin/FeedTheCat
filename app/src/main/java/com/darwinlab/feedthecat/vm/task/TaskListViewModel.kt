package com.darwinlab.feedthecat.vm.task

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.darwinlab.feedthecat.MyApplication
import com.darwinlab.feedthecat.model.RepoTask
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class TaskListViewModel
    @Inject
    constructor(application: MyApplication, private val repoTask : RepoTask) : BaseViewModel(application)  {
    private val _text = MutableLiveData<String>().apply {
        value = ""
    }
    val text: LiveData<String> = _text

    fun refresh(status : Int){
        GlobalScope.launch(Dispatchers.Main) {
            _text.value = repoTask.refreshData(status)
        }
    }
}