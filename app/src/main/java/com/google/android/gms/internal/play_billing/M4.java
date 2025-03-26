package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class M4 extends F1 {
    M4() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final void a(N4 n42, N4 n43) {
        n42.f29796b = n43;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final void b(N4 n42, Thread thread) {
        n42.f29795a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean c(P4 p42, C5206v3 c5206v3, C5206v3 c5206v32) {
        synchronized (p42) {
            try {
                if (p42.f29803s != c5206v3) {
                    return false;
                }
                p42.f29803s = c5206v32;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean d(P4 p42, Object obj, Object obj2) {
        synchronized (p42) {
            try {
                if (p42.f29802o != obj) {
                    return false;
                }
                p42.f29802o = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean e(P4 p42, N4 n42, N4 n43) {
        synchronized (p42) {
            try {
                if (p42.f29804t != n42) {
                    return false;
                }
                p42.f29804t = n43;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
