package com.metataxidriver

import android.app.Application
import com.metataxidriver.di.ActivityBuildersModule

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuildersModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent

    }
    fun inject(app: MetaTaxiDriverApplication)

}