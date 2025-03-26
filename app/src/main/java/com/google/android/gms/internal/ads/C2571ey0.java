package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ey0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571ey0 implements InterfaceC2462dy0, Xx0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C2571ey0 f21905b = new C2571ey0(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f21906a;

    private C2571ey0(Object obj) {
        this.f21906a = obj;
    }

    public static InterfaceC2462dy0 a(Object obj) {
        AbstractC3332ly0.a(obj, "instance cannot be null");
        return new C2571ey0(obj);
    }

    public static InterfaceC2462dy0 b(Object obj) {
        return obj == null ? f21905b : new C2571ey0(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final Object zzb() {
        return this.f21906a;
    }
}
