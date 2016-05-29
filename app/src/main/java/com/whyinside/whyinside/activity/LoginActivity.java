package com.whyinside.whyinside.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.fragment.LoginBaseFragment;
import com.whyinside.whyinside.fragment.SignInFragment;
import com.whyinside.whyinside.fragment.SignUpFragment;
import com.whyinside.whyinside.listener.LoginNavigationListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 29/05/2016.
 */
public class LoginActivity extends FragmentActivity implements LoginNavigationListener{

    private FragmentManager mFragmentManager;
    private LoginState mState = LoginState.SIGN_IN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        mFragmentManager = getSupportFragmentManager();

        LoginBaseFragment fragment = null;
        switch (mState) {
            case SIGN_IN:
                fragment = new SignInFragment();
                break;
            case SIGN_UP:
                fragment = new SignUpFragment();
                break;
        }
        fragment.setNavigationListener(this);
        mFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }

    @Override
    public void OnSignIn() {
        LoginBaseFragment fragment = new SignInFragment();
        fragment.setNavigationListener(this);
        mFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        mState = LoginState.SIGN_IN;
    }

    @Override
    public void OnSignUp() {
        LoginBaseFragment fragment = new SignUpFragment();
        fragment.setNavigationListener(this);
        mFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit();
        mState = LoginState.SIGN_UP;
    }

    @Override
    public void onBackPressed() {
        if (mState == LoginState.SIGN_UP) {
            OnSignIn();
        } else {
            super.onBackPressed();
        }
    }

    //    @Override
//    public void OnSignIn() {
//        onBackPressed();
//    }
//
//    @Override
//    public void OnSignUp() {
//        mFragmentManager.beginTransaction().replace(R.id.fragment_container,new SignUpFragment()).commit();
//    }

    public enum LoginState {
        SIGN_IN,SIGN_UP;
    }


}
