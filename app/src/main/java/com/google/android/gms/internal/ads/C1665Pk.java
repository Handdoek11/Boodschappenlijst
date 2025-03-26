package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.Pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665Pk extends AbstractC2122ar {

    /* renamed from: d, reason: collision with root package name */
    private final G2.E f18255d;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18254c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f18256e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f18257f = 0;

    public C1665Pk(G2.E e8) {
        this.f18255d = e8;
    }

    public final C1491Kk g() {
        C1491Kk c1491Kk = new C1491Kk(this);
        AbstractC0608p0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f18254c) {
            AbstractC0608p0.k("createNewReference: Lock acquired");
            f(new C1526Lk(this, c1491Kk), new C1560Mk(this, c1491Kk));
            Z2.r.p(this.f18257f >= 0);
            this.f18257f++;
        }
        AbstractC0608p0.k("createNewReference: Lock released");
        return c1491Kk;
    }

    public final void h() {
        AbstractC0608p0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f18254c) {
            AbstractC0608p0.k("markAsDestroyable: Lock acquired");
            Z2.r.p(this.f18257f >= 0);
            AbstractC0608p0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f18256e = true;
            i();
        }
        AbstractC0608p0.k("markAsDestroyable: Lock released");
    }

    protected final void i() {
        AbstractC0608p0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f18254c) {
            try {
                AbstractC0608p0.k("maybeDestroy: Lock acquired");
                Z2.r.p(this.f18257f >= 0);
                if (this.f18256e && this.f18257f == 0) {
                    AbstractC0608p0.k("No reference is left (including root). Cleaning up engine.");
                    f(new C1630Ok(this), new C1916Wq());
                } else {
                    AbstractC0608p0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0608p0.k("maybeDestroy: Lock released");
    }

    protected final void j() {
        AbstractC0608p0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f18254c) {
            AbstractC0608p0.k("releaseOneReference: Lock acquired");
            Z2.r.p(this.f18257f > 0);
            AbstractC0608p0.k("Releasing 1 reference for JS Engine");
            this.f18257f--;
            i();
        }
        AbstractC0608p0.k("releaseOneReference: Lock released");
    }
}
