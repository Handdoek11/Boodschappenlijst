package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class P2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f18104a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f18105b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final W2 f18106c = new W2();

    /* renamed from: d, reason: collision with root package name */
    private Q2 f18107d;

    /* renamed from: e, reason: collision with root package name */
    private int f18108e;

    /* renamed from: f, reason: collision with root package name */
    private int f18109f;

    /* renamed from: g, reason: collision with root package name */
    private long f18110g;

    private final long d(InterfaceC3989s0 interfaceC3989s0, int i8) {
        interfaceC3989s0.H(this.f18104a, 0, i8);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = (j8 << 8) | (this.f18104a[i9] & 255);
        }
        return j8;
    }

    public final void a(Q2 q22) {
        this.f18107d = q22;
    }

    public final void b() {
        this.f18108e = 0;
        this.f18105b.clear();
        this.f18106c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.InterfaceC3989s0 r14) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P2.c(com.google.android.gms.internal.ads.s0):boolean");
    }
}
