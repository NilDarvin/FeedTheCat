package com.darwinlab.feedthecat.di.module

import android.app.Application
import android.content.Context
import com.darwinlab.feedthecat.di.scope.AppScoped
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule{
    @Binds
    @AppScoped
    abstract fun bindContext(app : Application) : Context
}