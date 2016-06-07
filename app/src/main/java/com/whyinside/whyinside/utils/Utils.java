package com.whyinside.whyinside.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class Utils {

	public static boolean isNetworkAvailable(Context c) {
		ConnectivityManager connectivity = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connectivity == null) {
			return false;
		} else {
			NetworkInfo[] info = connectivity.getAllNetworkInfo();
			if (info != null) {
				for (int i = 0; i < info.length; i++) {
					if (info[i].getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean isValidEmailAddress(String emailAddress) {
		String emailRegEx;
		Pattern pattern;
		// Regex for a valid email address

		emailRegEx = "^[A-Za-z0-9._%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}$";

		// Compare the regex with the email address
		pattern = Pattern.compile(emailRegEx);
		Matcher matcher = pattern.matcher(emailAddress);
		if (!matcher.find()) {
			return false;
		}
		return true;
	}


	public static void hideKeyboard(Activity act) {
		// Check if no view has focus:
		View view = act.getCurrentFocus();
		if (view != null) {

			InputMethodManager inputManager = (InputMethodManager) act
					.getSystemService(act.getApplicationContext().INPUT_METHOD_SERVICE);
			inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

		}
	}

	public static float convertDpToPixel(float dp, Context context) {
		if (context != null) {
			Resources resources = context.getResources();
			DisplayMetrics metrics = resources.getDisplayMetrics();
			float px = dp * (metrics.densityDpi / 160f);
			return px;
		}
		return 0;
	}

	public static int getScreenWidth() {
		return Resources.getSystem().getDisplayMetrics().widthPixels;
	}

	public static int getScreenHeight() {
		return Resources.getSystem().getDisplayMetrics().heightPixels;
	}

	public static String capitalize(String text) {
		String capTexts = "";
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0 && chars[i] != ' ') {
				capTexts += Character.toUpperCase(chars[i]);
			} else {
				if (i!=0 && chars[i - 1] == ' ' && chars[i] != ' ') {
					capTexts += Character.toUpperCase(chars[i]);
				} else {
					capTexts += chars[i];
				}
			}
		}
		return capTexts;
	}
	
	public static String capitalizeFirst(String text) {
		String capTexts = "";
		char[] chars = text.toCharArray();
		boolean isCap = false;
		for (int i = 0; i < chars.length; i++) {
			if (i == 0 && chars[i] != ' ') {
				capTexts += Character.toUpperCase(chars[i]);
				isCap = true;
			} else {
				if (i != 0 && !isCap && chars[i] != ' ') {
					capTexts += Character.toUpperCase(chars[i]);
					isCap = true;
				} else {
					capTexts += chars[i];
				}
			}
		}
		return capTexts;
	}
}
