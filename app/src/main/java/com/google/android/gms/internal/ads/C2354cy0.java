package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2354cy0 implements InterfaceC3441my0, Xx0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f21356c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC3441my0 f21357a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f21358b = f21356c;

    private C2354cy0(InterfaceC3441my0 interfaceC3441my0) {
        this.f21357a = interfaceC3441my0;
    }

    public static Xx0 a(InterfaceC3441my0 interfaceC3441my0) {
        return interfaceC3441my0 instanceof Xx0 ? (Xx0) interfaceC3441my0 : new C2354cy0(interfaceC3441my0);
    }

    public static InterfaceC3441my0 b(InterfaceC3441my0 interfaceC3441my0) {
        return interfaceC3441my0 instanceof C2354cy0 ? interfaceC3441my0 : new C2354cy0(interfaceC3441my0);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.f21358b;
            Object obj2 = f21356c;
            if (obj != obj2) {
                return obj;
            }
            Object zzb = this.f21357a.zzb();
            Object obj3 = this.f21358b;
            if (obj3 != obj2 && obj3 != zzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
            }
            this.f21358b = zzb;
            this.f21357a = null;
            return zzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final Object zzb() {
        Object obj = this.f21358b;
        return obj == f21356c ? c() : obj;
    }
}
