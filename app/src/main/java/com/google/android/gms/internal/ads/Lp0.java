package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Lp0 implements Pp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Tt0 f16890a;

    /* renamed from: b, reason: collision with root package name */
    private final C4082ss0 f16891b;

    private Lp0(C4082ss0 c4082ss0, Tt0 tt0) {
        this.f16891b = c4082ss0;
        this.f16890a = tt0;
    }

    public static Lp0 a(C4082ss0 c4082ss0) {
        return new Lp0(c4082ss0, Wp0.a(c4082ss0.h0()));
    }

    public static Lp0 b(C4082ss0 c4082ss0) {
        return new Lp0(c4082ss0, Wp0.b(c4082ss0.h0()));
    }

    public final C4082ss0 c() {
        return this.f16891b;
    }

    @Override // com.google.android.gms.internal.ads.Pp0
    public final Tt0 d() {
        return this.f16890a;
    }
}
