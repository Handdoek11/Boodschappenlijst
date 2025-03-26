package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.lA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3248lA0 implements RG0, NE0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3466nA0 f24281a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3793qA0 f24282b;

    public C3248lA0(C3793qA0 c3793qA0, C3466nA0 c3466nA0) {
        this.f24282b = c3793qA0;
        this.f24281a = c3466nA0;
    }

    private final Pair a(int i8, GG0 gg0) {
        GG0 gg02;
        GG0 gg03 = null;
        if (gg0 != null) {
            C3466nA0 c3466nA0 = this.f24281a;
            int i9 = 0;
            while (true) {
                if (i9 >= c3466nA0.f24896c.size()) {
                    gg02 = null;
                    break;
                }
                if (((GG0) c3466nA0.f24896c.get(i9)).f15343d == gg0.f15343d) {
                    gg02 = gg0.a(Pair.create(c3466nA0.f24895b, gg0.f15340a));
                    break;
                }
                i9++;
            }
            if (gg02 == null) {
                return null;
            }
            gg03 = gg02;
        }
        return Pair.create(Integer.valueOf(this.f24281a.f24897d), gg03);
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void A(int i8, GG0 gg0, final C4458wG0 c4458wG0, final CG0 cg0) {
        final Pair a8 = a(0, gg0);
        if (a8 != null) {
            this.f24282b.f25864i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.kA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = a8;
                    this.f23520o.f24282b.f25863h.A(((Integer) pair.first).intValue(), (GG0) pair.second, c4458wG0, cg0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void C(int i8, GG0 gg0, final CG0 cg0) {
        final Pair a8 = a(0, gg0);
        if (a8 != null) {
            this.f24282b.f25864i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.jA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = a8;
                    this.f23202o.f24282b.f25863h.C(((Integer) pair.first).intValue(), (GG0) pair.second, cg0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void H(int i8, GG0 gg0, final C4458wG0 c4458wG0, final CG0 cg0, final IOException iOException, final boolean z7) {
        final Pair a8 = a(0, gg0);
        if (a8 != null) {
            this.f24282b.f25864i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.gA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = a8;
                    this.f22256o.f24282b.f25863h.H(((Integer) pair.first).intValue(), (GG0) pair.second, c4458wG0, cg0, iOException, z7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void i(int i8, GG0 gg0, final C4458wG0 c4458wG0, final CG0 cg0) {
        final Pair a8 = a(0, gg0);
        if (a8 != null) {
            this.f24282b.f25864i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.hA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = a8;
                    this.f22500o.f24282b.f25863h.i(((Integer) pair.first).intValue(), (GG0) pair.second, c4458wG0, cg0);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.RG0
    public final void t(int i8, GG0 gg0, final C4458wG0 c4458wG0, final CG0 cg0) {
        final Pair a8 = a(0, gg0);
        if (a8 != null) {
            this.f24282b.f25864i.j(new Runnable() { // from class: com.google.android.gms.internal.ads.iA0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = a8;
                    this.f22925o.f24282b.f25863h.t(((Integer) pair.first).intValue(), (GG0) pair.second, c4458wG0, cg0);
                }
            });
        }
    }
}
