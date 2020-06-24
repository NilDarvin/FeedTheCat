package com.darwinlab.feedthecat.vm.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.darwinlab.feedthecat.model.RepoTask
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TaskListViewModel : ViewModel() {
    private var repoTask : RepoTask = RepoTask()
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