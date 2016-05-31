package com.whyinside.whyinside.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.whyinside.whyinside.R;

import butterknife.ButterKnife;

/**
 * Created by Hayk on 31/05/2016.
 */
public class FAQActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ButterKnife.bind(this);
    }
}
