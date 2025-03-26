package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3855qn0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3746pn0 f25990a;

    private C3855qn0(C3746pn0 c3746pn0) {
        this.f25990a = c3746pn0;
    }

    public static C3855qn0 c(C3746pn0 c3746pn0) {
        return new C3855qn0(c3746pn0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f25990a != C3746pn0.f25511d;
    }

    public final C3746pn0 b() {
        return this.f25990a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3855qn0) && ((C3855qn0) obj).f25990a == this.f25990a;
    }

    public final int hashCode() {
        return Objects.hash(C3855qn0.class, this.f25990a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f25990a.toString() + ")";
    }
}
