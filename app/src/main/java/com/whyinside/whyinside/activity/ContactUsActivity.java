package com.whyinside.whyinside.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.whyinside.whyinside.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 31/05/2016.
 */
public class ContactUsActivity extends BaseMenuActivity {
    @Bind(R.id.layout_faq)
    View mLayoutFAQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        mLayoutFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactUsActivity.this, FAQActivity.class));
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_contactus;
    }
}
