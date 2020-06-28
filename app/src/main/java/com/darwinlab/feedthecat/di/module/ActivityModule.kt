package com.darwinlab.feedthecat.di.module

import com.darwinlab.feedthecat.MainActivity
import com.darwinlab.feedthecat.di.scope.ActivityScoped
import com.darwinlab.feedthecat.ui.tasks.TaskListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    @ActivityScoped
    internal abstract fun contributeMainActivity(): MainActivity
    @ContributesAndroidInjector
    @ActivityScoped
    internal abstract fun contributeTaskListFragment(): TaskListFragment
}