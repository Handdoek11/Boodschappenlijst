package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class F9 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ G9 f15093o;

    F9(G9 g9) {
        this.f15093o = g9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        if (this.f15093o.f15318b != null) {
            return;
        }
        synchronized (G9.f15314c) {
            if (this.f15093o.f15318b != null) {
                return;
            }
            boolean z8 = false;
            try {
                z7 = ((Boolean) AbstractC3184kf.f23673F2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                z7 = false;
            }
            if (z7) {
                try {
                    G9.f15315d = C4052sd0.b(this.f15093o.f15317a.f25209a, "ADSHIELD", null);
                    z8 = z7;
                } catch (Throwable unused2) {
                }
            } else {
                z8 = z7;
            }
            this.f15093o.f15318b = Boolean.valueOf(z8);
            G9.f15314c.open();
        }
    }
}
