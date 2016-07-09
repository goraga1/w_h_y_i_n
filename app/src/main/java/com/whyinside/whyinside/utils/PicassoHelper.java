package com.whyinside.whyinside.utils;


import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;

public class PicassoHelper {


    public static void loadImageURL(String url, @NonNull final ImageView image, final ProgressBar progressBar, int placeHolder) {


        if (!url.isEmpty()) {
            if (progressBar != null)
                progressBar.setVisibility(View.VISIBLE);

            PicassoTrustAll.getInstance(image.getContext())
                    .load(url)
                    .fit()
                    .centerCrop()
                    // .resize(image.getMeasuredWidth(), image.getMeasuredHeight())
                    //.placeholder(placeHolder)


                    .into(image, new Callback() {
                        @Override
                        public void onSuccess() {
                            if (progressBar != null)
                                progressBar.setVisibility(View.GONE);
                        }

                        @Override
                        public void onError() {
                            if (progressBar != null)
                                progressBar.setVisibility(View.GONE);
                        }
                    });
        }


    }
}



