package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Xl0 implements InterfaceC2646fh0 {

    /* renamed from: b, reason: collision with root package name */
    private Wu0 f20132b;

    /* renamed from: c, reason: collision with root package name */
    private String f20133c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20136f;

    /* renamed from: a, reason: collision with root package name */
    private final C2342cs0 f20131a = new C2342cs0();

    /* renamed from: d, reason: collision with root package name */
    private int f20134d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f20135e = 8000;

    public final Xl0 a(boolean z7) {
        this.f20136f = true;
        return this;
    }

    public final Xl0 b(int i8) {
        this.f20134d = i8;
        return this;
    }

    public final Xl0 c(int i8) {
        this.f20135e = i8;
        return this;
    }

    public final Xl0 d(Wu0 wu0) {
        this.f20132b = wu0;
        return this;
    }

    public final Xl0 e(String str) {
        this.f20133c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2646fh0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Bo0 zza() {
        Bo0 bo0 = new Bo0(this.f20133c, this.f20134d, this.f20135e, this.f20136f, false, this.f20131a, null, false, null);
        Wu0 wu0 = this.f20132b;
        if (wu0 != null) {
            bo0.f(wu0);
        }
        return bo0;
    }
}
