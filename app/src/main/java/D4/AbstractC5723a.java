package d4;

import b4.h;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5723a extends AbstractC5724b {
    public static int a(int i8, int i9, int i10) {
        h.f(i9 <= i10, "min (%s) must be less than or equal to max (%s)", i9, i10);
        return Math.min(Math.max(i8, i9), i10);
    }
}
