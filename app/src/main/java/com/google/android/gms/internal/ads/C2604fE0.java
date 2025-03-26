package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2604fE0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1143Au[] f21968a;

    /* renamed from: b, reason: collision with root package name */
    private final HE0 f21969b;

    /* renamed from: c, reason: collision with root package name */
    private final C2457dw f21970c;

    public C2604fE0(InterfaceC1143Au... interfaceC1143AuArr) {
        HE0 he0 = new HE0();
        C2457dw c2457dw = new C2457dw();
        InterfaceC1143Au[] interfaceC1143AuArr2 = {he0, c2457dw};
        this.f21968a = interfaceC1143AuArr2;
        System.arraycopy(interfaceC1143AuArr, 0, interfaceC1143AuArr2, 0, 0);
        this.f21969b = he0;
        this.f21970c = c2457dw;
    }

    public final long a(long j8) {
        return this.f21970c.g() ? this.f21970c.h(j8) : j8;
    }

    public final long b() {
        return this.f21969b.n();
    }

    public final C2006Zf c(C2006Zf c2006Zf) {
        this.f21970c.j(c2006Zf.f20521a);
        this.f21970c.i(c2006Zf.f20522b);
        return c2006Zf;
    }

    public final boolean d(boolean z7) {
        this.f21969b.o(z7);
        return z7;
    }

    public final InterfaceC1143Au[] e() {
        return this.f21968a;
    }
}
