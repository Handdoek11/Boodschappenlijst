package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class NE implements JD {

    /* renamed from: o, reason: collision with root package name */
    private int f17490o = ((Integer) D2.A.c().a(AbstractC3184kf.f23975p1)).intValue();

    /* renamed from: s, reason: collision with root package name */
    private int f17491s = ((Integer) D2.A.c().a(AbstractC3184kf.Jc)).intValue();

    @Override // com.google.android.gms.internal.ads.JD
    public final void Q(C4618xo c4618xo) {
    }

    @Override // com.google.android.gms.internal.ads.JD
    public final synchronized void T0(C60 c60) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23984q1)).booleanValue()) {
            try {
                C4111t60 c4111t60 = c60.f14101b.f13520b;
                this.f17490o = c4111t60.f26833c;
                this.f17491s = c4111t60.f26834d;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final synchronized int a() {
        return this.f17490o;
    }

    public final synchronized int b() {
        return this.f17491s;
    }
}
