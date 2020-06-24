package com.darwinlab.feedthecat.ui.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.darwinlab.feedthecat.R
import com.darwinlab.feedthecat.vm.task.TaskListViewModel

/**
 * Фрагмент со списком задач.
 * На начальном этапе содержит только строку
 * Закинули параметр с навигатора в репозиторий. Обновили(вернули с репозитория) строку.
 */
class TaskListFragment : Fragment() {
    private lateinit var taskListViewModel: TaskListViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        taskListViewModel =
                ViewModelProvider(this).get(TaskListViewModel::class.java)
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