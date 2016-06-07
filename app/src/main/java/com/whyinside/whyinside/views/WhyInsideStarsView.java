package com.whyinside.whyinside.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.whyinside.whyinside.R;
import com.whyinside.whyinside.app.ContextHolder;
import com.whyinside.whyinside.utils.Utils;

public class WhyInsideStarsView extends LinearLayout {
	ImageView[] mStars;
	int mStarSize = 15;
	int mStarsPadding = 5;

	public WhyInsideStarsView(Context context) {
		super(context);
		init();
	}

	public WhyInsideStarsView(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.StarsView, 0, 0);

		try {
			mStarSize = (int) Utils.convertDpToPixel(a.getInt(R.styleable.StarsView_size, mStarSize), context);
			mStarsPadding = (int) Utils.convertDpToPixel(a.getInt(R.styleable.StarsView_stars_padding, mStarsPadding), context);
		} finally {
			a.recycle();
		}
		init();
	}

	public WhyInsideStarsView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	private void init() {
		mStars = new ImageView[5];
		LayoutInflater inflater = LayoutInflater.from(ContextHolder.getInstance().getContext());
		for (int i = 0; i < 5; i++) {
			mStars[i] = (ImageView) inflater.inflate(R.layout.item_star, null);
			LayoutParams params = new LayoutParams(mStarSize, mStarSize);
			params.setMargins(0, 0, mStarsPadding, 0);
			mStars[i].setLayoutParams(params);
			addView(mStars[i]);
		}
	}

	public void setRate(float rate) {
		int rateInteger = (int)rate;//Math.round(rate);
		float remainPart = rate - rateInteger;
		int integerIndex = 0;
		for (int i = 0; i < 5; i++) {
			if (i <= rateInteger - 1) {
				mStars[i].setImageResource(R.drawable.ic_star_fill);
				integerIndex = i;
			} else {
				mStars[i].setImageResource(R.drawable.ic_star_empty);
			}
		}

		if (integerIndex + 1 == rateInteger && (remainPart > 0 && remainPart < 1)) {
			mStars[integerIndex + 1].setImageResource(R.drawable.ic_star_half);
		}
	}

}
