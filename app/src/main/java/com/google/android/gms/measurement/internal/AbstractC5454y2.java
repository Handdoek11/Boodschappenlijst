package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5454y2 extends AbstractC5286a1 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f31270b;

    AbstractC5454y2(S2 s22) {
        super(s22);
        this.f31239a.l();
    }

    protected final void t() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f31270b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (y()) {
            return;
        }
        this.f31239a.P();
        this.f31270b = true;
    }

    public final void v() {
        if (this.f31270b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        w();
        this.f31239a.P();
        this.f31270b = true;
    }

    protected void w() {
    }

    final boolean x() {
        return this.f31270b;
    }

    protected abstract boolean y();
}
