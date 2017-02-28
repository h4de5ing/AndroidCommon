package com.code19.library;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by gh0st on 2017/1/17.
 */

public class ToastUtils {
    private static Toast mToast;

    public static void showToast(Context context, int id) {
        if (mToast == null) {
            mToast = new Toast(context);
            mToast.setText(id);
        }
        mToast.show();
    }

    public static void showToast(Context context, String string) {
        if (mToast == null) {
            mToast = new Toast(context);
            mToast.setText(string);
        }
        mToast.show();
    }
}
