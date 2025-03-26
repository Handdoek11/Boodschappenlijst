package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3967rp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Tt0 f26220a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f26221b;

    /* synthetic */ AbstractC3967rp0(Tt0 tt0, Class cls, AbstractC3859qp0 abstractC3859qp0) {
        this.f26220a = tt0;
        this.f26221b = cls;
    }

    public static AbstractC3967rp0 b(InterfaceC3750pp0 interfaceC3750pp0, Tt0 tt0, Class cls) {
        return new C3641op0(tt0, cls, interfaceC3750pp0);
    }

    public abstract AbstractC2763gl0 a(Pp0 pp0);

    public final Tt0 c() {
        return this.f26220a;
    }

    public final Class d() {
        return this.f26221b;
    }
}
