package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private static Field f6775a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f6776b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f6777c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f6778d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f6779e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f6780f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f6781g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f6782h;

    static void a(Resources resources) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            return;
        }
        if (i8 >= 24) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f6776b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f6775a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
            }
            f6776b = true;
        }
        Field field = f6775a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        d(obj);
    }

    private static void c(Resources resources) {
        Object obj;
        if (!f6782h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f6781g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
            }
            f6782h = true;
        }
        Field field = f6781g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f6776b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f6775a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
            }
            f6776b = true;
        }
        Field field2 = f6775a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
            }
        }
        if (obj2 != null) {
            d(obj2);
        }
    }

    private static void d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f6778d) {
            try {
                f6777c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f6778d = true;
        }
        Class cls = f6777c;
        if (cls == null) {
            return;
        }
        if (!f6780f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f6779e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
            }
            f6780f = true;
        }
        Field field = f6779e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
