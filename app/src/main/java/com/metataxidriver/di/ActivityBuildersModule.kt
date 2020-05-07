package com.metataxidriver.di

import com.metataxidriver.AuthFragmentBuildersModule
import com.metataxidriver.AuthScope
import com.metataxidriver.ui.activity.AuthActivity
import com.metataxidriver.ui.activity.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector()
    abstract fun contributeActivity(): SplashActivity

    @AuthScope
    @ContributesAndroidInjector(modules = [AuthFragmentBuildersModule::class])
    abstract fun cotributeLoginActivity(): AuthActivity

}