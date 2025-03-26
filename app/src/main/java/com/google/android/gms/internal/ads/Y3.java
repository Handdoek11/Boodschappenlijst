package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class Y3 extends AbstractC2257c4 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f20195o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f20196p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f20197n;

    Y3() {
    }

    public static boolean j(UQ uq) {
        return k(uq, f20195o);
    }

    private static boolean k(UQ uq, byte[] bArr) {
        if (uq.r() < 8) {
            return false;
        }
        int t7 = uq.t();
        byte[] bArr2 = new byte[8];
        uq.h(bArr2, 0, 8);
        uq.l(t7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final long a(UQ uq) {
        return f(N0.d(uq.n()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final void b(boolean z7) {
        super.b(z7);
        if (z7) {
            this.f20197n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2257c4
    protected final boolean c(UQ uq, long j8, Z3 z32) {
        if (k(uq, f20195o)) {
            byte[] copyOf = Arrays.copyOf(uq.n(), uq.u());
            int i8 = copyOf[9] & 255;
            List e8 = N0.e(copyOf);
            if (z32.f20403a == null) {
                C2723gJ0 c2723gJ0 = new C2723gJ0();
                c2723gJ0.B("audio/opus");
                c2723gJ0.r0(i8);
                c2723gJ0.C(48000);
                c2723gJ0.n(e8);
                z32.f20403a = c2723gJ0.H();
                return true;
            }
        } else {
            if (!k(uq, f20196p)) {
                AbstractC3796qC.b(z32.f20403a);
                return false;
            }
            AbstractC3796qC.b(z32.f20403a);
            if (!this.f20197n) {
                this.f20197n = true;
                uq.m(8);
                C3503nb b8 = AbstractC2468e1.b(AbstractC4169th0.v(AbstractC2468e1.c(uq, false, false).f20802a));
                if (b8 != null) {
                    C2723gJ0 b9 = z32.f20403a.b();
                    b9.t(b8.d(z32.f20403a.f14331l));
                    z32.f20403a = b9.H();
                }
            }
        }
        return true;
    }
}
