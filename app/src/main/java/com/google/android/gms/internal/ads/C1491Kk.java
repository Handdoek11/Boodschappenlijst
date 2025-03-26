package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.Kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491Kk extends AbstractC2122ar {

    /* renamed from: c, reason: collision with root package name */
    private final Object f16619c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final C1665Pk f16620d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16621e;

    public C1491Kk(C1665Pk c1665Pk) {
        this.f16620d = c1665Pk;
    }

    public final void h() {
        AbstractC0608p0.k("release: Trying to acquire lock");
        synchronized (this.f16619c) {
            try {
                AbstractC0608p0.k("release: Lock acquired");
                if (this.f16621e) {
                    AbstractC0608p0.k("release: Lock already released");
                    return;
                }
                this.f16621e = true;
                f(new C1385Hk(this), new C1916Wq());
                f(new C1421Ik(this), new C1456Jk(this));
                AbstractC0608p0.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
