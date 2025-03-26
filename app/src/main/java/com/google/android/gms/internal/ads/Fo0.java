package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class Fo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Tt0 f15198a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f15199b;

    /* synthetic */ Fo0(Tt0 tt0, Class cls, Eo0 eo0) {
        this.f15198a = tt0;
        this.f15199b = cls;
    }

    public static Fo0 b(Do0 do0, Tt0 tt0, Class cls) {
        return new Co0(tt0, cls, do0);
    }

    public abstract Sk0 a(Pp0 pp0, C3197kl0 c3197kl0);

    public final Tt0 c() {
        return this.f15198a;
    }

    public final Class d() {
        return this.f15199b;
    }
}
