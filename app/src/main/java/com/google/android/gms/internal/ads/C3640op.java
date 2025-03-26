package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3640op {

    /* renamed from: a, reason: collision with root package name */
    public final int f25274a;

    /* renamed from: b, reason: collision with root package name */
    private final C4614xm f25275b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25276c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f25277d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean[] f25278e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3640op(C4614xm c4614xm, boolean z7, int[] iArr, boolean[] zArr) {
        int i8 = c4614xm.f27902a;
        this.f25274a = i8;
        AbstractC3796qC.d(i8 == iArr.length && i8 == zArr.length);
        this.f25275b = c4614xm;
        this.f25276c = z7 && i8 > 1;
        this.f25277d = (int[]) iArr.clone();
        this.f25278e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f25275b.f27904c;
    }

    public final D b(int i8) {
        return this.f25275b.b(i8);
    }

    public final boolean c() {
        for (boolean z7 : this.f25278e) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i8) {
        return this.f25278e[i8];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3640op.class == obj.getClass()) {
            C3640op c3640op = (C3640op) obj;
            if (this.f25276c == c3640op.f25276c && this.f25275b.equals(c3640op.f25275b) && Arrays.equals(this.f25277d, c3640op.f25277d) && Arrays.equals(this.f25278e, c3640op.f25278e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f25275b.hashCode() * 31) + (this.f25276c ? 1 : 0)) * 31) + Arrays.hashCode(this.f25277d)) * 31) + Arrays.hashCode(this.f25278e);
    }
}
