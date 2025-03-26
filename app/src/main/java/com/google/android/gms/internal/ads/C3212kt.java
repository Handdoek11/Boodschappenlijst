package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.kt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3212kt extends AbstractC3970rr {

    /* renamed from: t, reason: collision with root package name */
    private final C1602Nr f24102t;

    /* renamed from: u, reason: collision with root package name */
    private C3321lt f24103u;

    /* renamed from: v, reason: collision with root package name */
    private Uri f24104v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC3862qr f24105w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f24106x;

    /* renamed from: y, reason: collision with root package name */
    private int f24107y;

    public C3212kt(Context context, C1602Nr c1602Nr) {
        super(context);
        this.f24107y = 1;
        this.f24106x = false;
        this.f24102t = c1602Nr;
        c1602Nr.a(this);
    }

    private final boolean C() {
        int i8 = this.f24107y;
        return (i8 == 1 || i8 == 2 || this.f24103u == null) ? false : true;
    }

    private final void D(int i8) {
        if (i8 == 4) {
            this.f24102t.c();
            this.f26225s.b();
        } else if (this.f24107y == 4) {
            this.f24102t.e();
            this.f26225s.c();
        }
        this.f24107y = i8;
    }

    final /* synthetic */ void A() {
        InterfaceC3862qr interfaceC3862qr = this.f24105w;
        if (interfaceC3862qr != null) {
            if (!this.f24106x) {
                interfaceC3862qr.g();
                this.f24106x = true;
            }
            this.f24105w.b();
        }
    }

    final /* synthetic */ void B() {
        InterfaceC3862qr interfaceC3862qr = this.f24105w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int e() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int f() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long i() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long j() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final long k() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr, com.google.android.gms.internal.ads.InterfaceC1672Pr
    public final void l() {
        if (this.f24103u != null) {
            this.f26225s.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final String m() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void n() {
        AbstractC0608p0.k("AdImmersivePlayerView pause");
        if (C() && this.f24103u.d()) {
            this.f24103u.a();
            D(5);
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23353o.z();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void o() {
        AbstractC0608p0.k("AdImmersivePlayerView play");
        if (C()) {
            this.f24103u.b();
            D(4);
            this.f26224o.b();
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ht
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22643o.A();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void p(int i8) {
        AbstractC0608p0.k("AdImmersivePlayerView seek " + i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void q(InterfaceC3862qr interfaceC3862qr) {
        this.f24105w = interfaceC3862qr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void r(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f24104v = parse;
            this.f24103u = new C3321lt(parse.toString());
            D(3);
            G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22449o.B();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void s() {
        AbstractC0608p0.k("AdImmersivePlayerView stop");
        C3321lt c3321lt = this.f24103u;
        if (c3321lt != null) {
            c3321lt.c();
            this.f24103u = null;
            D(1);
        }
        this.f24102t.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3970rr
    public final void t(float f8, float f9) {
    }

    @Override // android.view.View
    public final String toString() {
        return C3212kt.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    final /* synthetic */ void z() {
        InterfaceC3862qr interfaceC3862qr = this.f24105w;
        if (interfaceC3862qr != null) {
            interfaceC3862qr.d();
        }
    }
}
