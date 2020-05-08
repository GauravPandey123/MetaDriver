package com.metataxidriver

import com.metataxidriver.ui.fragment.DriverRegistrationFragment
import com.metataxidriver.ui.fragment.LoginFragment
import com.metataxidriver.ui.fragment.SignupFragment
import com.metataxidriver.ui.fragment.VechileRegistrationFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthFragmentBuildersModule {

    @ContributesAndroidInjector()
    abstract fun contributeRegisterFragment(): SignupFragment

    @ContributesAndroidInjector()
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector
    abstract fun contributeDriverDetailFragment(): DriverRegistrationFragment

    @ContributesAndroidInjector
    abstract fun contibuterVechileDetailFragment() : VechileRegistrationFragment

}