package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4306uv0 implements Iv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3871qv0 f27145a;

    /* renamed from: b, reason: collision with root package name */
    private final Ov0 f27146b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27147c = false;

    /* renamed from: d, reason: collision with root package name */
    private final Fu0 f27148d;

    private C4306uv0(Ov0 ov0, Fu0 fu0, InterfaceC3871qv0 interfaceC3871qv0) {
        this.f27146b = ov0;
        this.f27148d = fu0;
        this.f27145a = interfaceC3871qv0;
    }

    static C4306uv0 k(Ov0 ov0, Fu0 fu0, InterfaceC3871qv0 interfaceC3871qv0) {
        return new C4306uv0(ov0, fu0, interfaceC3871qv0);
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final int a(Object obj) {
        int b8 = ((Qu0) obj).zzt.b();
        if (!this.f27147c) {
            return b8;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final Object b() {
        InterfaceC3871qv0 interfaceC3871qv0 = this.f27145a;
        return interfaceC3871qv0 instanceof Qu0 ? ((Qu0) interfaceC3871qv0).K() : interfaceC3871qv0.c().d();
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final int c(Object obj) {
        int hashCode = ((Qu0) obj).zzt.hashCode();
        if (!this.f27147c) {
            return hashCode;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void d(Object obj) {
        this.f27146b.i(obj);
        this.f27148d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void e(Object obj, Object obj2) {
        Kv0.A(this.f27146b, obj, obj2);
        if (this.f27147c) {
            Kv0.z(this.f27148d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final boolean f(Object obj, Object obj2) {
        if (!((Qu0) obj).zzt.equals(((Qu0) obj2).zzt)) {
            return false;
        }
        if (!this.f27147c) {
            return true;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void g(Object obj, InterfaceC2242bw0 interfaceC2242bw0) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void h(Object obj, byte[] bArr, int i8, int i9, C2129au0 c2129au0) {
        Qu0 qu0 = (Qu0) obj;
        if (qu0.zzt == Pv0.c()) {
            qu0.zzt = Pv0.f();
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final boolean i(Object obj) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void j(Object obj, Cv0 cv0, Eu0 eu0) {
        this.f27146b.a(obj);
        androidx.appcompat.app.E.a(obj);
        throw null;
    }
}
