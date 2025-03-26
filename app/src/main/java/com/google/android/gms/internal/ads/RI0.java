package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class RI0 {

    /* renamed from: a, reason: collision with root package name */
    private int f18630a;

    /* renamed from: b, reason: collision with root package name */
    private int f18631b;

    /* renamed from: c, reason: collision with root package name */
    private int f18632c = 0;

    /* renamed from: d, reason: collision with root package name */
    private KI0[] f18633d = new KI0[100];

    public RI0(boolean z7, int i8) {
    }

    public final synchronized int a() {
        return this.f18631b * 65536;
    }

    public final synchronized KI0 b() {
        KI0 ki0;
        try {
            this.f18631b++;
            int i8 = this.f18632c;
            if (i8 > 0) {
                KI0[] ki0Arr = this.f18633d;
                int i9 = i8 - 1;
                this.f18632c = i9;
                ki0 = ki0Arr[i9];
                if (ki0 == null) {
                    throw null;
                }
                ki0Arr[i9] = null;
            } else {
                ki0 = new KI0(new byte[65536], 0);
                int i10 = this.f18631b;
                KI0[] ki0Arr2 = this.f18633d;
                int length = ki0Arr2.length;
                if (i10 > length) {
                    this.f18633d = (KI0[]) Arrays.copyOf(ki0Arr2, length + length);
                    return ki0;
                }
            }
            return ki0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(KI0 ki0) {
        KI0[] ki0Arr = this.f18633d;
        int i8 = this.f18632c;
        this.f18632c = i8 + 1;
        ki0Arr[i8] = ki0;
        this.f18631b--;
        notifyAll();
    }

    public final synchronized void d(LI0 li0) {
        while (li0 != null) {
            try {
                KI0[] ki0Arr = this.f18633d;
                int i8 = this.f18632c;
                this.f18632c = i8 + 1;
                ki0Arr[i8] = li0.a();
                this.f18631b--;
                li0 = li0.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i8) {
        int i9 = this.f18630a;
        this.f18630a = i8;
        if (i8 < i9) {
            g();
        }
    }

    public final synchronized void g() {
        int i8 = this.f18630a;
        int i9 = AbstractC2301cW.f21206a;
        int max = Math.max(0, ((i8 + 65535) / 65536) - this.f18631b);
        int i10 = this.f18632c;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f18633d, max, i10, (Object) null);
        this.f18632c = max;
    }
}
