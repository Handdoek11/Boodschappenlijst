package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
abstract class E5 extends F5 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f30338c;

    E5(H5 h52) {
        super(h52);
        this.f30369b.A0();
    }

    protected final void s() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.f30338c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.f30369b.z0();
        this.f30338c = true;
    }

    final boolean u() {
        return this.f30338c;
    }

    protected abstract boolean v();
}
