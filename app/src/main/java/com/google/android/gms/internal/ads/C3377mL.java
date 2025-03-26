package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3377mL implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3785q60 f24494a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4111t60 f24495b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C3874qx f24496c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4030sL f24497d;

    C3377mL(C4030sL c4030sL, C3785q60 c3785q60, C4111t60 c4111t60, C3874qx c3874qx) {
        this.f24494a = c3785q60;
        this.f24495b = c4111t60;
        this.f24496c = c3874qx;
        this.f24497d = c4030sL;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        interfaceC4410vt.l0(this.f24494a, this.f24495b);
        InterfaceC3759pu L7 = interfaceC4410vt.L();
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Y9)).booleanValue() && L7 != null) {
            C3874qx c3874qx = this.f24496c;
            C4030sL c4030sL = this.f24497d;
            L7.o0(c3874qx, c4030sL.f26645i, c4030sL.f26646j);
            C3874qx c3874qx2 = this.f24496c;
            C4030sL c4030sL2 = this.f24497d;
            L7.b1(c3874qx2, c4030sL2.f26645i, c4030sL2.f26640d);
        }
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.Rc)).booleanValue() || L7 == null) {
            return;
        }
        L7.c1(this.f24494a);
    }
}
