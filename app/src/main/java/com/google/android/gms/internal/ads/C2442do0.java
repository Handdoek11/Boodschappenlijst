package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.do0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2442do0 implements Ik0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ik0 f21668a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f21669b;

    private C2442do0(Ik0 ik0, byte[] bArr) {
        this.f21668a = ik0;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f21669b = bArr;
    }

    public static Ik0 b(Mo0 mo0) {
        byte[] c8;
        Kp0 a8 = mo0.a(Rk0.a());
        C3320ls0 b02 = C3647os0.b0();
        b02.D(a8.g());
        b02.E(a8.e());
        b02.C(a8.b());
        Ik0 ik0 = (Ik0) AbstractC3088jl0.b((C3647os0) b02.x(), Ik0.class);
        Ts0 c9 = a8.c();
        int ordinal = c9.ordinal();
        if (ordinal == 1) {
            c8 = AbstractC3532np0.b(mo0.b().intValue()).c();
        } else if (ordinal == 2) {
            c8 = AbstractC3532np0.a(mo0.b().intValue()).c();
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(c9)));
            }
            c8 = AbstractC3532np0.a(mo0.b().intValue()).c();
        } else {
            c8 = AbstractC3532np0.f25038a.c();
        }
        return new C2442do0(ik0, c8);
    }

    @Override // com.google.android.gms.internal.ads.Ik0
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f21669b;
        if (bArr3.length == 0) {
            return this.f21668a.a(bArr, bArr2);
        }
        if (Wp0.c(bArr3, bArr)) {
            return this.f21668a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
