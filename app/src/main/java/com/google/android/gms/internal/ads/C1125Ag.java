package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125Ag {

    /* renamed from: a, reason: collision with root package name */
    private final ZG0 f13616a = new ZG0();

    public final C1125Ag a(int i8) {
        this.f13616a.a(i8);
        return this;
    }

    public final C1125Ag b(C2211bh c2211bh) {
        YH0 yh0 = c2211bh.f20910a;
        for (int i8 = 0; i8 < yh0.b(); i8++) {
            this.f13616a.a(yh0.a(i8));
        }
        return this;
    }

    public final C1125Ag c(int... iArr) {
        for (int i8 = 0; i8 < 20; i8++) {
            this.f13616a.a(iArr[i8]);
        }
        return this;
    }

    public final C1125Ag d(int i8, boolean z7) {
        if (z7) {
            this.f13616a.a(i8);
        }
        return this;
    }

    public final C2211bh e() {
        return new C2211bh(this.f13616a.b(), null);
    }
}
