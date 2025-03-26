package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3445n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24851a;

    private C3445n0(int i8, int i9, String str) {
        this.f24851a = str;
    }

    public static C3445n0 a(UQ uq) {
        String str;
        uq.m(2);
        int C7 = uq.C();
        int i8 = C7 >> 1;
        int i9 = C7 & 1;
        int C8 = uq.C() >> 3;
        if (i8 == 4 || i8 == 5 || i8 == 7) {
            str = "dvhe";
        } else if (i8 == 8) {
            str = "hev1";
        } else {
            if (i8 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i10 = C8 | (i9 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i8);
        sb.append(i10 >= 10 ? "." : ".0");
        sb.append(i10);
        return new C3445n0(i8, i10, sb.toString());
    }
}
