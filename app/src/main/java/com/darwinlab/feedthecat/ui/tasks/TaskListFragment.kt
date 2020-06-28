package com.darwinlab.feedthecat.ui.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.darwinlab.feedthecat.R
import com.darwinlab.feedthecat.vm.task.TaskListViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class TaskListFragment: DaggerFragment(){
      lateinit var taskListViewModel: TaskListViewModel
          @Inject set

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_task_list, container, false)
        val textView: TextView = root.findViewById(R.id.text)
        taskListViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
            status = arguments?.getInt("status") ?: 1
        return root
    }

    private var status : Int = 1

    override fun onStart() {
        super.onStart()
        taskListViewModel.refresh(status)
    }
}