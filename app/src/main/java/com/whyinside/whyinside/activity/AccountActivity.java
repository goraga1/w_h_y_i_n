package com.whyinside.whyinside.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.whyinside.whyinside.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 31/05/2016.
 */
public class AccountActivity extends BaseMenuActivity {
    @Bind(R.id.change_password)
    TextView mChangePassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this);

        mChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AccountActivity.this, SecurityActivity.class));
            }
        });
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_account;
    }
}
