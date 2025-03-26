package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5462z3 extends AbstractC5441w3 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f31308b;

    AbstractC5462z3(S2 s22) {
        super(s22);
        this.f31239a.l();
    }

    protected void m() {
    }

    protected final void n() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o() {
        if (this.f31308b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        this.f31239a.P();
        this.f31308b = true;
    }

    public final void p() {
        if (this.f31308b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        m();
        this.f31239a.P();
        this.f31308b = true;
    }

    final boolean q() {
        return this.f31308b;
    }

    protected abstract boolean r();
}
