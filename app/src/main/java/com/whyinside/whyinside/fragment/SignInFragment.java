package com.whyinside.whyinside.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.activity.AccountActivity;
import com.whyinside.whyinside.activity.ContactUsActivity;
import com.whyinside.whyinside.activity.FAQActivity;
import com.whyinside.whyinside.activity.FindNearActivity;
import com.whyinside.whyinside.activity.LoginActivity;
import com.whyinside.whyinside.activity.MainActivity;
import com.whyinside.whyinside.activity.SettingsActivity;
import com.whyinside.whyinside.listener.LoginNavigationListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 29/05/2016.
 */
public class SignInFragment extends LoginBaseFragment {
    @Bind(R.id.btn_skip)
    View mSkipButton;

    @Bind(R.id.sign_up)
    TextView mSignUp;

    @Bind(R.id.btn_signin)
    TextView mSignIn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signin, null);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        mSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mNavigationInterface.OnSignUp();
//            }
//        });

        mSkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),FindNearActivity.class));
            }
        });

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),AccountActivity.class));
            }
        });

        mSignUp.setHighlightColor(getResources().getColor(android.R.color.transparent));
        mSignUp.setMovementMethod(LinkMovementMethod.getInstance());
        mSignUp.setText(getSpannableStringBuilder(), TextView.BufferType.SPANNABLE);
    }


    private SpannableStringBuilder getSpannableStringBuilder() {
        String readText;
        String text;

        readText = getResources().getString(R.string.label_sign_up);
        text = String.format(getResources().getString(R.string.label_dont_have_account), readText);

        text += " ";
        Spanned spanned = Html.fromHtml(text);

        int start = spanned.toString().indexOf(readText);
        int end = start + readText.length();

        SpannableStringBuilder ssb = new SpannableStringBuilder(spanned);
        ssb.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                mNavigationInterface.OnSignUp();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                ds.setColor(getResources().getColor(R.color.colorYellow));


            }
        }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return ssb;
    }

//    mRegisterLink.setHighlightColor(getResources().getColor(android.R.color.transparent));
//    mRegisterLink.setMovementMethod(LinkMovementMethod.getInstance());
//    mRegisterLink.setText(getSpannableStringBuilder(), TextView.BufferType.SPANNABLE);
//    mRegisterLink.setOnClickListener(new OnClickListener() {
//
//        @Override
//        public void onClick(View v) {
//            Intent i = new Intent(getApplicationContext(), SignupActivity.class);
//            startActivity(i);
//        }
//    });


    @Override
    public void setNavigationListener(LoginNavigationListener loginNavigationInterface) {
        mNavigationInterface = loginNavigationInterface;
    }
}
