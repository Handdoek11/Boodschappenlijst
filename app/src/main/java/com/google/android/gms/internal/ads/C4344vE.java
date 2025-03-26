package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4344vE {

    /* renamed from: a, reason: collision with root package name */
    private boolean f27214a;

    public C4344vE(RC rc) {
    }

    public final synchronized void a() {
        while (!this.f27214a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z7 = false;
        while (!this.f27214a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z7;
        z7 = this.f27214a;
        this.f27214a = false;
        return z7;
    }

    public final synchronized boolean d() {
        return this.f27214a;
    }

    public final synchronized boolean e() {
        if (this.f27214a) {
            return false;
        }
        this.f27214a = true;
        notifyAll();
        return true;
    }
}
