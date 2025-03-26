package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class Jo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f16307a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f16308b;

    /* synthetic */ Jo0(Class cls, Class cls2, Io0 io0) {
        this.f16307a = cls;
        this.f16308b = cls2;
    }

    public static Jo0 b(Ho0 ho0, Class cls, Class cls2) {
        return new Go0(cls, cls2, ho0);
    }

    public abstract Pp0 a(Sk0 sk0, C3197kl0 c3197kl0);

    public final Class c() {
        return this.f16307a;
    }

    public final Class d() {
        return this.f16308b;
    }
}
