package com.google.android.gms.common.api.internal;

import A3.AbstractC0376j;
import A3.InterfaceC0371e;
import X2.C0754b;
import Z2.AbstractC0765d;
import Z2.C0767f;
import Z2.C0776o;
import Z2.C0779s;
import Z2.C0780t;
import android.os.SystemClock;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import f3.AbstractC5778b;

/* loaded from: classes.dex */
final class x implements InterfaceC0371e {

    /* renamed from: a, reason: collision with root package name */
    private final C1091c f13375a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13376b;

    /* renamed from: c, reason: collision with root package name */
    private final C0754b f13377c;

    /* renamed from: d, reason: collision with root package name */
    private final long f13378d;

    /* renamed from: e, reason: collision with root package name */
    private final long f13379e;

    x(C1091c c1091c, int i8, C0754b c0754b, long j8, long j9, String str, String str2) {
        this.f13375a = c1091c;
        this.f13376b = i8;
        this.f13377c = c0754b;
        this.f13378d = j8;
        this.f13379e = j9;
    }

    static x b(C1091c c1091c, int i8, C0754b c0754b) {
        boolean z7;
        if (!c1091c.d()) {
            return null;
        }
        C0780t a8 = C0779s.b().a();
        if (a8 == null) {
            z7 = true;
        } else {
            if (!a8.C0()) {
                return null;
            }
            z7 = a8.D0();
            s s8 = c1091c.s(c0754b);
            if (s8 != null) {
                if (!(s8.s() instanceof AbstractC0765d)) {
                    return null;
                }
                AbstractC0765d abstractC0765d = (AbstractC0765d) s8.s();
                if (abstractC0765d.J() && !abstractC0765d.e()) {
                    C0767f c8 = c(s8, abstractC0765d, i8);
                    if (c8 == null) {
                        return null;
                    }
                    s8.D();
                    z7 = c8.E0();
                }
            }
        }
        return new x(c1091c, i8, c0754b, z7 ? System.currentTimeMillis() : 0L, z7 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C0767f c(s sVar, AbstractC0765d abstractC0765d, int i8) {
        int[] B02;
        int[] C02;
        C0767f H7 = abstractC0765d.H();
        if (H7 == null || !H7.D0() || ((B02 = H7.B0()) != null ? !AbstractC5778b.a(B02, i8) : !((C02 = H7.C0()) == null || !AbstractC5778b.a(C02, i8))) || sVar.q() >= H7.A0()) {
            return null;
        }
        return H7;
    }

    @Override // A3.InterfaceC0371e
    public final void a(AbstractC0376j abstractC0376j) {
        s s8;
        int i8;
        int i9;
        int i10;
        int A02;
        long j8;
        long j9;
        int i11;
        if (this.f13375a.d()) {
            C0780t a8 = C0779s.b().a();
            if ((a8 == null || a8.C0()) && (s8 = this.f13375a.s(this.f13377c)) != null && (s8.s() instanceof AbstractC0765d)) {
                AbstractC0765d abstractC0765d = (AbstractC0765d) s8.s();
                int i12 = 0;
                boolean z7 = this.f13378d > 0;
                int z8 = abstractC0765d.z();
                int i13 = 100;
                if (a8 != null) {
                    z7 &= a8.D0();
                    int A03 = a8.A0();
                    int B02 = a8.B0();
                    i8 = a8.E0();
                    if (abstractC0765d.J() && !abstractC0765d.e()) {
                        C0767f c8 = c(s8, abstractC0765d, this.f13376b);
                        if (c8 == null) {
                            return;
                        }
                        boolean z9 = c8.E0() && this.f13378d > 0;
                        B02 = c8.A0();
                        z7 = z9;
                    }
                    i10 = A03;
                    i9 = B02;
                } else {
                    i8 = 0;
                    i9 = 100;
                    i10 = 5000;
                }
                C1091c c1091c = this.f13375a;
                if (abstractC0376j.s()) {
                    A02 = 0;
                } else if (abstractC0376j.q()) {
                    i12 = i13;
                    A02 = -1;
                } else {
                    Exception n8 = abstractC0376j.n();
                    if (n8 instanceof ApiException) {
                        Status a9 = ((ApiException) n8).a();
                        i13 = a9.B0();
                        C1103b A04 = a9.A0();
                        if (A04 != null) {
                            A02 = A04.A0();
                            i12 = i13;
                        }
                        i12 = i13;
                        A02 = -1;
                    } else {
                        i12 = 101;
                        A02 = -1;
                    }
                }
                if (z7) {
                    long j10 = this.f13378d;
                    long j11 = this.f13379e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i11 = (int) (SystemClock.elapsedRealtime() - j11);
                    j9 = currentTimeMillis;
                    j8 = j10;
                } else {
                    j8 = 0;
                    j9 = 0;
                    i11 = -1;
                }
                c1091c.D(new C0776o(this.f13376b, i12, A02, j8, j9, null, null, z8, i11), i8, i10, i9);
            }
        }
    }
}
