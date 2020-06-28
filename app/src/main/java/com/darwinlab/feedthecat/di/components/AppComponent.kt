package com.darwinlab.feedthecat.di.components

import android.app.Application
import com.darwinlab.feedthecat.MyApplication
import com.darwinlab.feedthecat.di.module.ActivityModule
import com.darwinlab.feedthecat.di.module.AppModule
import com.darwinlab.feedthecat.di.module.ModelModule
import com.darwinlab.feedthecat.di.scope.AppScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@AppScoped
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ModelModule::class,
    ActivityModule::class
])
interface AppComponent: AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MyApplication): Builder
        fun build(): AppComponent
    }
}