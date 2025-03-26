package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4839zp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f28711a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f28712b;

    /* synthetic */ AbstractC4839zp0(Class cls, Class cls2, AbstractC4730yp0 abstractC4730yp0) {
        this.f28711a = cls;
        this.f28712b = cls2;
    }

    public static AbstractC4839zp0 b(InterfaceC4621xp0 interfaceC4621xp0, Class cls, Class cls2) {
        return new C4512wp0(cls, cls2, interfaceC4621xp0);
    }

    public abstract Object a(Sk0 sk0);

    public final Class c() {
        return this.f28711a;
    }

    public final Class d() {
        return this.f28712b;
    }
}
