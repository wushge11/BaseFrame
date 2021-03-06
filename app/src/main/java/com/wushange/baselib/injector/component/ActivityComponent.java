package com.wushange.baselib.injector.component;

import android.app.Activity;

import com.wushange.baselib.injector.PerActivity;
import com.wushange.baselib.injector.module.ActivityModule;

import dagger.Component;

/**
 * Created by sll on 2016/3/8.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  Activity getActivity();
}
