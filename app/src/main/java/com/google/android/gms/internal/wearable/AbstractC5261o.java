package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5261o {
    public static int a(int i8, int i9, String str) {
        String a8;
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        if (i8 < 0) {
            a8 = AbstractC5263p.a("%s (%s) must not be negative", "index", Integer.valueOf(i8));
        } else {
            if (i9 < 0) {
                throw new IllegalArgumentException("negative size: " + i9);
            }
            a8 = AbstractC5263p.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(a8);
    }

    public static void b(int i8, int i9, int i10) {
        if (i8 < 0 || i9 < i8 || i9 > i10) {
            throw new IndexOutOfBoundsException((i8 < 0 || i8 > i10) ? c(i8, i10, "start index") : (i9 < 0 || i9 > i10) ? c(i9, i10, "end index") : AbstractC5263p.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8)));
        }
    }

    private static String c(int i8, int i9, String str) {
        if (i8 < 0) {
            return AbstractC5263p.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return AbstractC5263p.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        throw new IllegalArgumentException("negative size: " + i9);
    }
}
