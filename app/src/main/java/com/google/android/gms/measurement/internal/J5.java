package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class J5 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ W5 f30566o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ H5 f30567s;

    J5(H5 h52, W5 w52) {
        this.f30566o = w52;
        this.f30567s = h52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5.w(this.f30567s, this.f30566o);
        this.f30567s.B0();
    }
}
