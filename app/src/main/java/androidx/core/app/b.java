package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
public abstract class b extends AbstractC6278a {

    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C0152b {
        static void a(Activity activity, String[] strArr, int i8) {
            activity.requestPermissions(strArr, i8);
        }
    }

    public interface c {
        void validateRequestPermissionsRequestCode(int i8);
    }

    public static void A(Activity activity) {
        a.e(activity);
    }

    public static void q(Activity activity) {
        activity.finishAffinity();
    }

    public static void r(Activity activity) {
        a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Activity activity) {
        if (activity.isFinishing() || d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void t(Activity activity) {
        a.b(activity);
    }

    public static void u(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.s(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(Activity activity, String[] strArr, int i8) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (TextUtils.isEmpty(strArr[i9])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i9], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i9));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    strArr2[i10] = strArr[i11];
                    i10++;
                }
            }
        }
        if (activity instanceof c) {
            ((c) activity).validateRequestPermissionsRequestCode(i8);
        }
        C0152b.a(activity, strArr, i8);
    }

    public static void w(Activity activity, s sVar) {
        a.c(activity, null);
    }

    public static void x(Activity activity, s sVar) {
        a.d(activity, null);
    }

    public static void y(Activity activity, Intent intent, int i8, Bundle bundle) {
        activity.startActivityForResult(intent, i8, bundle);
    }

    public static void z(Activity activity, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }
}
