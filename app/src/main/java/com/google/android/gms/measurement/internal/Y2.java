package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class Y2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ D3 f30779o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ S2 f30780s;

    Y2(S2 s22, D3 d32) {
        this.f30779o = d32;
        this.f30780s = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S2.e(this.f30780s, this.f30779o);
        this.f30780s.b(this.f30779o.f30322g);
    }
}
