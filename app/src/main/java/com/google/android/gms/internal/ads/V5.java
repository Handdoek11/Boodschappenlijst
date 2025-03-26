package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.List;

/* loaded from: classes.dex */
public final class V5 implements InterfaceC3880r0 {

    /* renamed from: e, reason: collision with root package name */
    private boolean f19529e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19530f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19531g;

    /* renamed from: h, reason: collision with root package name */
    private long f19532h;

    /* renamed from: i, reason: collision with root package name */
    private S5 f19533i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4207u0 f19534j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19535k;

    /* renamed from: a, reason: collision with root package name */
    private final BU f19525a = new BU(0);

    /* renamed from: c, reason: collision with root package name */
    private final UQ f19527c = new UQ(4096);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f19526b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final T5 f19528d = new T5();

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.BU r5 = r4.f19525a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            com.google.android.gms.internal.ads.S5 r5 = r4.f19533i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.f19526b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.f19526b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.U5 r5 = (com.google.android.gms.internal.ads.U5) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V5.f(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r17, com.google.android.gms.internal.ads.O0 r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V5.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        byte[] bArr = new byte[14];
        C2684g0 c2684g0 = (C2684g0) interfaceC3989s0;
        c2684g0.G(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c2684g0.g(bArr[13] & 7, false);
        c2684g0.G(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f19534j = interfaceC4207u0;
    }
}
