package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4536x1 extends AbstractC2249c0 {
    public C4536x1(final C0 c02, int i8, long j8, long j9) {
        long j10;
        Objects.requireNonNull(c02);
        Z z7 = new Z() { // from class: com.google.android.gms.internal.ads.u1
            @Override // com.google.android.gms.internal.ads.Z
            public final long a(long j11) {
                return c02.b(j11);
            }
        };
        C4318v1 c4318v1 = new C4318v1(c02, i8, null);
        long a8 = c02.a();
        long j11 = c02.f14060j;
        int i9 = c02.f14054d;
        if (i9 > 0) {
            j10 = ((i9 + c02.f14053c) / 2) + 1;
        } else {
            int i10 = c02.f14051a;
            long j12 = 4096;
            if (i10 == c02.f14052b && i10 > 0) {
                j12 = i10;
            }
            j10 = (((j12 * c02.f14057g) * c02.f14058h) / 8) + 64;
        }
        super(z7, c4318v1, a8, 0L, j11, j8, j9, j10, Math.max(6, c02.f14053c));
    }
}
