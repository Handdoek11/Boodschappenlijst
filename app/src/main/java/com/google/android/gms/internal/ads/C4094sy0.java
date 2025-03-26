package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.sy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4094sy0 implements InterfaceC3441my0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f26767c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC3441my0 f26768a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f26769b = f26767c;

    private C4094sy0(InterfaceC3441my0 interfaceC3441my0) {
        this.f26768a = interfaceC3441my0;
    }

    public static InterfaceC3441my0 a(InterfaceC3441my0 interfaceC3441my0) {
        return ((interfaceC3441my0 instanceof C4094sy0) || (interfaceC3441my0 instanceof C2354cy0)) ? interfaceC3441my0 : new C4094sy0(interfaceC3441my0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final Object zzb() {
        Object obj = this.f26769b;
        if (obj != f26767c) {
            return obj;
        }
        InterfaceC3441my0 interfaceC3441my0 = this.f26768a;
        if (interfaceC3441my0 == null) {
            return this.f26769b;
        }
        Object zzb = interfaceC3441my0.zzb();
        this.f26769b = zzb;
        this.f26768a = null;
        return zzb;
    }
}
