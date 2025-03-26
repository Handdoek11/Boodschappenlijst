package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3193kj0 extends AbstractC2541ej0 {
    /* synthetic */ C3193kj0(AbstractC4282uj0 abstractC4282uj0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C2868hj0 a(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0) {
        C2868hj0 c2868hj02;
        synchronized (abstractC3738pj0) {
            try {
                c2868hj02 = abstractC3738pj0.f25498s;
                if (c2868hj02 != c2868hj0) {
                    abstractC3738pj0.f25498s = c2868hj0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2868hj02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C3629oj0 b(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0) {
        C3629oj0 c3629oj02;
        synchronized (abstractC3738pj0) {
            try {
                c3629oj02 = abstractC3738pj0.f25499t;
                if (c3629oj02 != c3629oj0) {
                    abstractC3738pj0.f25499t = c3629oj0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3629oj02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void c(C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        c3629oj0.f25262b = c3629oj02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void d(C3629oj0 c3629oj0, Thread thread) {
        c3629oj0.f25261a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean e(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0, C2868hj0 c2868hj02) {
        synchronized (abstractC3738pj0) {
            try {
                if (abstractC3738pj0.f25498s != c2868hj0) {
                    return false;
                }
                abstractC3738pj0.f25498s = c2868hj02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean f(AbstractC3738pj0 abstractC3738pj0, Object obj, Object obj2) {
        synchronized (abstractC3738pj0) {
            try {
                if (abstractC3738pj0.f25497o != obj) {
                    return false;
                }
                abstractC3738pj0.f25497o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean g(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        synchronized (abstractC3738pj0) {
            try {
                if (abstractC3738pj0.f25499t != c3629oj0) {
                    return false;
                }
                abstractC3738pj0.f25499t = c3629oj02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
