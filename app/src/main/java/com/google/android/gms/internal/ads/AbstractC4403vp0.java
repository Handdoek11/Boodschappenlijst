package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4403vp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f27357a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f27358b;

    /* synthetic */ AbstractC4403vp0(Class cls, Class cls2, AbstractC4294up0 abstractC4294up0) {
        this.f27357a = cls;
        this.f27358b = cls2;
    }

    public static AbstractC4403vp0 b(InterfaceC4185tp0 interfaceC4185tp0, Class cls, Class cls2) {
        return new C4076sp0(cls, cls2, interfaceC4185tp0);
    }

    public abstract Pp0 a(AbstractC2763gl0 abstractC2763gl0);

    public final Class c() {
        return this.f27357a;
    }

    public final Class d() {
        return this.f27358b;
    }
}
