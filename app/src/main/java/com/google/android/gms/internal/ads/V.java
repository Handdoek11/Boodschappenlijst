package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f19497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19498b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19499c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19500d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19501e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19502f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19503g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19504h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19505i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19506j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19507k;

    /* renamed from: l, reason: collision with root package name */
    public final String f19508l;

    private V(List list, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f8, String str) {
        this.f19497a = list;
        this.f19498b = i8;
        this.f19499c = i9;
        this.f19500d = i10;
        this.f19501e = i11;
        this.f19502f = i12;
        this.f19503g = i13;
        this.f19504h = i14;
        this.f19505i = i15;
        this.f19506j = i16;
        this.f19507k = f8;
        this.f19508l = str;
    }

    public static V a(UQ uq) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        float f8;
        try {
            uq.m(4);
            int C7 = uq.C() & 3;
            int i16 = C7 + 1;
            if (i16 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int C8 = uq.C() & 31;
            for (int i17 = 0; i17 < C8; i17++) {
                arrayList.add(b(uq));
            }
            int C9 = uq.C();
            for (int i18 = 0; i18 < C9; i18++) {
                arrayList.add(b(uq));
            }
            if (C8 > 0) {
                C2850ha0 f9 = AbstractC1366Ha0.f((byte[]) arrayList.get(0), C7 + 2, ((byte[]) arrayList.get(0)).length);
                int i19 = f9.f22577e;
                int i20 = f9.f22578f;
                int i21 = f9.f22580h + 8;
                int i22 = f9.f22581i + 8;
                int i23 = f9.f22582j;
                int i24 = f9.f22583k;
                int i25 = f9.f22584l;
                int i26 = f9.f22585m;
                float f10 = f9.f22579g;
                str = AbstractC4015sD.c(f9.f22573a, f9.f22574b, f9.f22575c);
                i14 = i25;
                i15 = i26;
                f8 = f10;
                i11 = i22;
                i12 = i23;
                i13 = i24;
                i8 = i19;
                i9 = i20;
                i10 = i21;
            } else {
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                str = null;
                f8 = 1.0f;
            }
            return new V(arrayList, i16, i8, i9, i10, i11, i12, i13, i14, i15, f8, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw zzbc.a("Error parsing AVC config", e8);
        }
    }

    private static byte[] b(UQ uq) {
        int G7 = uq.G();
        int t7 = uq.t();
        uq.m(G7);
        return AbstractC4015sD.e(uq.n(), t7, G7);
    }
}
