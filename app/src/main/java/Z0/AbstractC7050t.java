package z0;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: z0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7050t {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f44807a = false;

    /* renamed from: b, reason: collision with root package name */
    private static Method f44808b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f44809c = false;

    /* renamed from: d, reason: collision with root package name */
    private static Field f44810d;

    /* renamed from: z0.t$a */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f44807a) {
            try {
                f44808b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f44807a = true;
        }
        Method method = f44808b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (X.h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f8 = f(dialog);
        if (f8 != null && f8.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (X.h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return X.i(view, keyEvent);
    }

    public static boolean e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? b((Activity) callback, keyEvent) : callback instanceof Dialog ? c((Dialog) callback, keyEvent) : (view != null && X.h(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f44809c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f44810d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f44809c = true;
        }
        Field field = f44810d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
