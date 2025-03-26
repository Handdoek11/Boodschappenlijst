package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.jn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3092jn0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2984in0 f23347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23348b;

    private C3092jn0(C2984in0 c2984in0, int i8) {
        this.f23347a = c2984in0;
        this.f23348b = i8;
    }

    public static C3092jn0 d(C2984in0 c2984in0, int i8) {
        if (i8 < 8 || i8 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new C3092jn0(c2984in0, i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f23347a != C2984in0.f23066c;
    }

    public final int b() {
        return this.f23348b;
    }

    public final C2984in0 c() {
        return this.f23347a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3092jn0)) {
            return false;
        }
        C3092jn0 c3092jn0 = (C3092jn0) obj;
        return c3092jn0.f23347a == this.f23347a && c3092jn0.f23348b == this.f23348b;
    }

    public final int hashCode() {
        return Objects.hash(C3092jn0.class, this.f23347a, Integer.valueOf(this.f23348b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f23347a.toString() + "salt_size_bytes: " + this.f23348b + ")";
    }
}
