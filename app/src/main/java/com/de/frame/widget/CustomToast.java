package com.de.frame.widget;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.de.frame.R;
import com.de.frame.application.CrashApplication;


/**
 * 描述：自定义toast 通知
 * 公司：北京海鑫科金高科技股份有限公司
 * 作者：张绪飞
 * 创建时间:2016/12/19
 * 最后修改时间:2016/12/19
 */
public class CustomToast {
    
    private static Toast toast;
    
    private static Toast initToast(Context context, CharSequence message, int duration) {
        if (toast == null) {
            View layout = LayoutInflater.from(context).inflate(R.layout.toast_custom, null);
            toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setView(layout);
            toast.setDuration(duration);
        }
        ((TextView) toast.getView().findViewById(R.id.tv_message)).setText(message);
        toast.setDuration(duration);
        return toast;
    }
    
    public static void showToast(Context context, CharSequence text, int duration) {
        initToast(context, text, duration).show();
    }
    
    public static void showToast(Context context, int resId, int duration) {
        initToast(context, context.getText(resId), duration).show();
    }
    
    public static void showShort(CharSequence text) {
        showToast(CrashApplication.getIns().getApplicationContext(), text, Toast.LENGTH_SHORT);
    }
    
    public static void showLong(CharSequence text) {
        showToast(CrashApplication.getIns().getApplicationContext(), text, Toast.LENGTH_LONG);
    }
}
