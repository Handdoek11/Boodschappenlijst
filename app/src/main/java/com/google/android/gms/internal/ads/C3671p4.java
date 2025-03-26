package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3671p4 implements InterfaceC4207u0 {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4207u0 f25329o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC3344m4 f25330s;

    /* renamed from: t, reason: collision with root package name */
    private final SparseArray f25331t = new SparseArray();

    public C3671p4(InterfaceC4207u0 interfaceC4207u0, InterfaceC3344m4 interfaceC3344m4) {
        this.f25329o = interfaceC4207u0;
        this.f25330s = interfaceC3344m4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void P() {
        this.f25329o.P();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final void Q(R0 r02) {
        this.f25329o.Q(r02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4207u0
    public final Y0 R(int i8, int i9) {
        if (i9 != 3) {
            return this.f25329o.R(i8, i9);
        }
        C3888r4 c3888r4 = (C3888r4) this.f25331t.get(i8);
        if (c3888r4 != null) {
            return c3888r4;
        }
        C3888r4 c3888r42 = new C3888r4(this.f25329o.R(i8, 3), this.f25330s);
        this.f25331t.put(i8, c3888r42);
        return c3888r42;
    }
}
