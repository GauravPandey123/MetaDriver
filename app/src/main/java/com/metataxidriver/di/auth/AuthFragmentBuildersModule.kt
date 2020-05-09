package com.metataxidriver

import com.metataxidriver.ui.fragment.*
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): SignupFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector()
    abstract fun contributeDriverDetailFragment(): DriverRegistrationFragment

    @ContributesAndroidInjector()
    abstract fun contibuterVechileDetailFragment() : VechileRegistrationFragment

    @ContributesAndroidInjector()
    abstract fun contributerSetYourPinFragment() : SetPinFragment

}