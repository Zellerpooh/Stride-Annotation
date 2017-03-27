package com.zeller.annotation.viewinject;

import android.app.Activity;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class description goes here.
 *
 * @author Zeller
 * @version 1.0.0  17/3/27
 * @date 17/3/27
 */

public class InjectUtils {
    public static final String FIND_VIEW_BY_ID="findViewById";
    /**
     * setContentView
     *
     * @param activity
     */
    public static void injectContentView(Activity activity) {
        Class<? extends Activity> cls = activity.getClass();
        ContentView contentView = cls.getAnnotation(ContentView.class);
        if (contentView != null) {
            int contentViewLayoutId = contentView.value();

            try {
                Method method = cls.getMethod("setContentView", int.class);
                method.setAccessible(true);
                method.invoke(activity, contentViewLayoutId);
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 绑定View对象
     * @param activity
     */
    public static void injectViews(Activity activity) {
        Class<? extends Activity> cls = activity.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field filed : fields) {
            ViewInject viewInject=filed.getAnnotation(ViewInject.class);
            int viewId=viewInject.value();
            if (viewId!=-1){
                try {
                    Method method=cls.getMethod(FIND_VIEW_BY_ID,int.class);
                    Object resView=method.invoke(activity,viewId);
                    filed.setAccessible(true);
                    filed.set(activity,resView);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void inject(Activity activity) {
        injectContentView(activity);
        injectViews(activity);
    }
}
