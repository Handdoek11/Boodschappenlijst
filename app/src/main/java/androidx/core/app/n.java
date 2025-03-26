package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f9180c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Set f9181d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f9182e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f9183a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f9184b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private n(Context context) {
        this.f9183a = context;
        this.f9184b = (NotificationManager) context.getSystemService("notification");
    }

    public static n b(Context context) {
        return new n(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f9184b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f9183a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f9183a.getApplicationInfo();
        String packageName = this.f9183a.getApplicationContext().getPackageName();
        int i8 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i8), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
