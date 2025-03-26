package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class T3 extends AbstractC2257c4 {

    /* renamed from: n, reason: collision with root package name */
    private C0 f19054n;

    /* renamed from: o, reason: collision with root package name */
    private S3 f19055o;

    T3() {
    }

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final long a(UQ uq) {
        if (!j(uq.n())) {
            return -1L;
        }
        int i8 = (uq.n()[2] & 255) >> 4;
        if (i8 == 6) {
            uq.m(4);
            uq.N();
        } else if (i8 == 7) {
            i8 = 7;
            uq.m(4);
            uq.N();
        }
        int a8 = AbstractC4643y0.a(uq, i8);
        uq.l(0);
        return a8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f19054n = null;
            this.f19055o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final boolean c(UQ uq, long j8, Z3 z32) {
        byte[] n8 = uq.n();
        C0 c02 = this.f19054n;
        if (c02 == null) {
            C0 c03 = new C0(n8, 17);
            this.f19054n = c03;
            z32.f20403a = c03.c(Arrays.copyOfRange(n8, 9, uq.u()), null);
            return true;
        }
        if ((n8[0] & Byte.MAX_VALUE) == 3) {
            B0 b8 = AbstractC4752z0.b(uq);
            C0 f8 = c02.f(b8);
            this.f19054n = f8;
            this.f19055o = new S3(f8, b8);
            return true;
        }
        if (!j(n8)) {
            return true;
        }
        S3 s32 = this.f19055o;
        if (s32 != null) {
            s32.d(j8);
            z32.f20404b = this.f19055o;
        }
        z32.f20403a.getClass();
        return false;
    }
}
