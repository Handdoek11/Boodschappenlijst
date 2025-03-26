package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5202v {
    public static int a(int i8, int i9, String str) {
        String a8;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            a8 = AbstractC5208w.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            a8 = AbstractC5208w.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(a8);
    }

    public static int b(int i8, int i9, String str) {
        if (i8 < 0 || i8 > i9) {
            throw new IndexOutOfBoundsException(f(i8, i9, "index"));
        }
        return i8;
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void d(boolean z7, String str, Object obj, Object obj2) {
        if (!z7) {
            throw new IllegalArgumentException(AbstractC5208w.a(str, obj, obj2));
        }
    }

    public static void e(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? f(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? f(i9, i10, "end index") : AbstractC5208w.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    private static String f(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC5208w.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC5208w.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
