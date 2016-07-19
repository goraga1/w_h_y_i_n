package com.whyinside.whyinside.utils;


import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PicassoHelper {


    public static void loadImageURL(String url, @NonNull final ImageView image, final ProgressBar progressBar, int placeHolder) {


        if (!url.isEmpty()) {
            if (progressBar != null)
                progressBar.setVisibility(View.VISIBLE);

            url = url.substring(2);


            /// System.out.println("*****" + url);


//            Picasso picasso = new Picasso.Builder(image.getContext())
//                    .listener(new Picasso.Listener() {
//                        @Override
//                        public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
//                            //Here your log
//                            System.out.println("*****" + exception.getMessage());
//                        }
//                    })
//                    .build();
//            picasso.load("https://www.whyinside.com/images/restaurants/c81e728d9d4c2f636f067f89cc14862c.jpg")
//                    .fit()
//                    .into(image);

            Picasso.with(image.getContext())
                    .load("https://" + url)

                    .error(android.R.drawable.ic_menu_week)
                    // .centerCrop()
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
                            //System.out.println("Error image load");
                            if (progressBar != null)
                                progressBar.setVisibility(View.GONE);
                        }
                    });
        }


    }
}



