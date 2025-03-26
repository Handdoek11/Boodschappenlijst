package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.um0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4288um0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4179tm0 f27099a;

    private C4288um0(C4179tm0 c4179tm0) {
        this.f27099a = c4179tm0;
    }

    public static C4288um0 c(C4179tm0 c4179tm0) {
        return new C4288um0(c4179tm0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f27099a != C4179tm0.f26924d;
    }

    public final C4179tm0 b() {
        return this.f27099a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4288um0) && ((C4288um0) obj).f27099a == this.f27099a;
    }

    public final int hashCode() {
        return Objects.hash(C4288um0.class, this.f27099a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f27099a.toString() + ")";
    }
}
