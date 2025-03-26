package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3336m0 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f24407a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void a(UQ uq, int i8) {
        W0.b(this, uq, i8);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void b(long j8, int i8, int i9, int i10, X0 x02) {
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void c(D d8) {
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ void d(long j8) {
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final /* synthetic */ int e(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7) {
        return W0.a(this, interfaceC3684pA0, i8, z7);
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final int f(InterfaceC3684pA0 interfaceC3684pA0, int i8, boolean z7, int i9) {
        int C7 = interfaceC3684pA0.C(this.f24407a, 0, Math.min(4096, i8));
        if (C7 != -1) {
            return C7;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.Y0
    public final void g(UQ uq, int i8, int i9) {
        uq.m(i8);
    }
}
