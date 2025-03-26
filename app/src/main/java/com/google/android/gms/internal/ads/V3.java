package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class V3 {

    /* renamed from: a, reason: collision with root package name */
    private final W3 f19518a = new W3();

    /* renamed from: b, reason: collision with root package name */
    private final UQ f19519b = new UQ(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f19520c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f19521d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19522e;

    V3() {
    }

    private final int f(int i8) {
        int i9;
        int i10 = 0;
        this.f19521d = 0;
        do {
            int i11 = this.f19521d;
            int i12 = i8 + i11;
            W3 w32 = this.f19518a;
            if (i12 >= w32.f19703c) {
                break;
            }
            this.f19521d = i11 + 1;
            i9 = w32.f19706f[i12];
            i10 += i9;
        } while (i9 == 255);
        return i10;
    }

    public final UQ a() {
        return this.f19519b;
    }

    public final W3 b() {
        return this.f19518a;
    }

    public final void c() {
        this.f19518a.a();
        this.f19519b.i(0);
        this.f19520c = -1;
        this.f19522e = false;
    }

    public final void d() {
        UQ uq = this.f19519b;
        if (uq.n().length == 65025) {
            return;
        }
        uq.j(Arrays.copyOf(uq.n(), Math.max(65025, uq.u())), this.f19519b.u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.internal.ads.InterfaceC3989s0 r7) {
        /*
            r6 = this;
            boolean r0 = r6.f19522e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f19522e = r1
            com.google.android.gms.internal.ads.UQ r0 = r6.f19519b
            r0.i(r1)
        Ld:
            boolean r0 = r6.f19522e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.f19520c
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.W3 r0 = r6.f19518a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.W3 r0 = r6.f19518a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.W3 r0 = r6.f19518a
            int r3 = r0.f19704d
            int r0 = r0.f19701a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.UQ r0 = r6.f19519b
            int r0 = r0.u()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.f19521d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = com.google.android.gms.internal.ads.AbstractC4316v0.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f19520c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.f19520c
            int r4 = r6.f19521d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.UQ r4 = r6.f19519b
            int r5 = r4.u()
            int r5 = r5 + r0
            r4.f(r5)
            com.google.android.gms.internal.ads.UQ r4 = r6.f19519b
            byte[] r5 = r4.n()
            int r4 = r4.u()
            boolean r4 = com.google.android.gms.internal.ads.AbstractC4316v0.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.UQ r4 = r6.f19519b
            int r5 = r4.u()
            int r5 = r5 + r0
            r4.k(r5)
            com.google.android.gms.internal.ads.W3 r0 = r6.f19518a
            int r4 = r3 + (-1)
            int[] r0 = r0.f19706f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = r1
        L8c:
            r6.f19522e = r2
        L8e:
            com.google.android.gms.internal.ads.W3 r0 = r6.f19518a
            int r0 = r0.f19703c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.f19520c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V3.e(com.google.android.gms.internal.ads.s0):boolean");
    }
}
