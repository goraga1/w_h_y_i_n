package com.whyinside.whyinside.fragment;

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
import android.widget.TextView;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.activity.LoginActivity;
import com.whyinside.whyinside.listener.LoginNavigationListener;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 29/05/2016.
 */
public class SignUpFragment extends LoginBaseFragment {
    @Bind(R.id.sign_in)
    TextView mSignIn;

    @Bind(R.id.terms)
    TextView mTerms;
    @Override
    public void setNavigationListener(LoginNavigationListener loginNavigationInterface) {
        mNavigationInterface = loginNavigationInterface;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup,null);
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mSignIn.setHighlightColor(getResources().getColor(android.R.color.transparent));
        mSignIn.setMovementMethod(LinkMovementMethod.getInstance());
        mSignIn.setText(getSpannableStringBuilder(), TextView.BufferType.SPANNABLE);

        mTerms.setHighlightColor(getResources().getColor(android.R.color.transparent));
        mTerms.setMovementMethod(LinkMovementMethod.getInstance());
        mTerms.setText(getTermsSpannableStringBuilder(), TextView.BufferType.SPANNABLE);
    }

    private SpannableStringBuilder getSpannableStringBuilder() {
        String readText;
        String text;

        readText = getResources().getString(R.string.label_sign_in);
        text = String.format(getResources().getString(R.string.label_already_registered), readText);

        text += " ";
        Spanned spanned = Html.fromHtml(text);

        int start = spanned.toString().indexOf(readText);
        int end = start + readText.length();

        SpannableStringBuilder ssb = new SpannableStringBuilder(spanned);
        ssb.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                mNavigationInterface.OnSignIn();
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


    private SpannableStringBuilder getTermsSpannableStringBuilder() {
        String termsText;
        String cookieText;
        String privacyText;
        String text;

        termsText = getResources().getString(R.string.label_terms);
        cookieText = getResources().getString(R.string.label_c_policy);
        privacyText = getResources().getString(R.string.label_p_policy);
        text = String.format(getResources().getString(R.string.label_terms_format), termsText,cookieText,privacyText);

        text += " ";
        Spanned spanned = Html.fromHtml(text);
        SpannableStringBuilder ssb = new SpannableStringBuilder(spanned);
        int start = spanned.toString().indexOf(termsText);
        int end = start + termsText.length();
        ssb.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                mNavigationInterface.OnSignIn();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
              //  ds.setUnderlineText(false);
                ds.setColor(getResources().getColor(R.color.colorYellow));
            }
        }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        start = spanned.toString().indexOf(cookieText);
        end = start + cookieText.length();
        ssb.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                mNavigationInterface.OnSignIn();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
              //  ds.setUnderlineText(false);
                ds.setColor(getResources().getColor(R.color.colorYellow));
            }
        }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        start = spanned.toString().indexOf(privacyText);
        end = start + privacyText.length();
        ssb.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                mNavigationInterface.OnSignIn();
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
              //  ds.setUnderlineText(false);
                ds.setColor(getResources().getColor(R.color.colorYellow));
            }
        }, start, end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return ssb;
    }
}
