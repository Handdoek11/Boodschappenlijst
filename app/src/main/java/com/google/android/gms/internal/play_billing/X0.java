package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class X0 extends R0 {
    /* synthetic */ X0(AbstractC5115g1 abstractC5115g1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final U0 a(AbstractC5091c1 abstractC5091c1, U0 u02) {
        U0 u03;
        synchronized (abstractC5091c1) {
            try {
                u03 = abstractC5091c1.f29884s;
                if (u03 != u02) {
                    abstractC5091c1.f29884s = u02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u03;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final C5085b1 b(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1) {
        C5085b1 c5085b12;
        synchronized (abstractC5091c1) {
            try {
                c5085b12 = abstractC5091c1.f29885t;
                if (c5085b12 != c5085b1) {
                    abstractC5091c1.f29885t = c5085b1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5085b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void c(C5085b1 c5085b1, C5085b1 c5085b12) {
        c5085b1.f29876b = c5085b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void d(C5085b1 c5085b1, Thread thread) {
        c5085b1.f29875a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean e(AbstractC5091c1 abstractC5091c1, U0 u02, U0 u03) {
        synchronized (abstractC5091c1) {
            try {
                if (abstractC5091c1.f29884s != u02) {
                    return false;
                }
                abstractC5091c1.f29884s = u03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean f(AbstractC5091c1 abstractC5091c1, Object obj, Object obj2) {
        synchronized (abstractC5091c1) {
            try {
                if (abstractC5091c1.f29883o != obj) {
                    return false;
                }
                abstractC5091c1.f29883o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean g(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1, C5085b1 c5085b12) {
        synchronized (abstractC5091c1) {
            try {
                if (abstractC5091c1.f29885t != c5085b1) {
                    return false;
                }
                abstractC5091c1.f29885t = c5085b12;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
