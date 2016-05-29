package com.whyinside.whyinside.fragment;

import android.support.v4.app.Fragment;

import com.whyinside.whyinside.activity.LoginActivity;
import com.whyinside.whyinside.listener.LoginNavigationListener;

/**
 * Created by Hayk on 29/05/2016.
 */
public abstract class LoginBaseFragment extends Fragment {
    public LoginNavigationListener mNavigationInterface;

    public abstract void setNavigationListener(LoginNavigationListener loginNavigationInterface);
}
