package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class No0 extends AbstractC2763gl0 {

    /* renamed from: a, reason: collision with root package name */
    private final Lp0 f17631a;

    public No0(Lp0 lp0) {
        this.f17631a = lp0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f17631a.c().f0() != Ts0.RAW;
    }

    public final Lp0 b() {
        return this.f17631a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof No0)) {
            return false;
        }
        Lp0 lp0 = ((No0) obj).f17631a;
        return this.f17631a.c().f0().equals(lp0.c().f0()) && this.f17631a.c().h0().equals(lp0.c().h0()) && this.f17631a.c().g0().equals(lp0.c().g0());
    }

    public final int hashCode() {
        Lp0 lp0 = this.f17631a;
        return Objects.hash(lp0.c(), lp0.d());
    }

    public final String toString() {
        String h02 = this.f17631a.c().h0();
        int ordinal = this.f17631a.c().f0().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", h02, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
