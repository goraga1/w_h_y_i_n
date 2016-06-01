package com.whyinside.whyinside.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.whyinside.whyinside.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Hayk on 31/05/2016.
 */
public class SettingsActivity extends BaseMenuActivity {

    @Bind(R.id.settingImagesTitle)
    TextView settingImagesTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ButterKnife.bind(this);


        settingImagesTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this, "Okay", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_settings;
    }
}
