package com.darwinlab.feedthecat.di.module

import com.darwinlab.feedthecat.MyApplication
import com.darwinlab.feedthecat.di.scope.AppScoped
import com.darwinlab.feedthecat.model.RepoTask
import com.darwinlab.feedthecat.vm.task.TaskListViewModel
import dagger.Module
import dagger.Provides

@Module (includes = [ModelModule::class])
class VMModule(val app : MyApplication) {
    @Provides
    @AppScoped
    fun provideTaskListViewModel (app : MyApplication, repo : RepoTask): TaskListViewModel{
        return TaskListViewModel(app,repo)
    }
}