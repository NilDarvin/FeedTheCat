package com.darwinlab.feedthecat.di.module

import com.darwinlab.feedthecat.di.scope.AppScoped
import com.darwinlab.feedthecat.model.RepoTask
import com.darwinlab.feedthecat.model.RepoTaskImpl
import dagger.Module
import dagger.Provides

@Module
class ModelModule {
    @Provides
    @AppScoped
    fun provideRepoTask(): RepoTask{
        return RepoTaskImpl()
    }
}