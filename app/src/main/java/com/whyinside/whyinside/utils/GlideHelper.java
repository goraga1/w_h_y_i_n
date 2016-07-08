package com.whyinside.whyinside.utils;


import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.animation.ViewPropertyAnimation;
import com.bumptech.glide.request.target.Target;

public class GlideHelper {

    private static final ViewPropertyAnimation.Animator ANIMATOR =
            new ViewPropertyAnimation.Animator() {
                @Override
                public void animate(View view) {
                    view.setAlpha(0f);
                    view.animate().alpha(1f);
                }
            };


    public static void loadResource(@DrawableRes int drawableId, @NonNull ImageView image) {
        Glide.with(image.getContext()).load(drawableId).animate(ANIMATOR).into(image);
    }

    public static void loadImageURL(String url, @NonNull final ImageView image, final ProgressBar progressBar, int placeHolder) {


        if (!url.isEmpty()) {
            if (progressBar != null)
                progressBar.setVisibility(View.VISIBLE);


            Glide.with(image.getContext())

                    .load(url)
                    .centerCrop()
                    .listener(new RequestListener<String, GlideDrawable>() {
                        @Override
                        public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                            if (progressBar != null)
                                progressBar.setVisibility(View.GONE);

//                            System.out.println("******* " + e.getMessage());
                            return false;
                        }

                        @Override
                        public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                            if (progressBar != null)
                                progressBar.setVisibility(View.GONE);
                            return false;
                        }
                    })
                    .placeholder(placeHolder)
                    .dontAnimate()
                    .into(image)
            ;


        }
    }


}
