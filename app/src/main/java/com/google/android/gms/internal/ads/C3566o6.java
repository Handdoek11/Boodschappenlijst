package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3566o6 implements InterfaceC3675p6 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f25105m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f25106n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4207u0 f25107a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f25108b;

    /* renamed from: c, reason: collision with root package name */
    private final C4001s6 f25109c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25110d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f25111e;

    /* renamed from: f, reason: collision with root package name */
    private final UQ f25112f;

    /* renamed from: g, reason: collision with root package name */
    private final int f25113g;

    /* renamed from: h, reason: collision with root package name */
    private final D f25114h;

    /* renamed from: i, reason: collision with root package name */
    private int f25115i;

    /* renamed from: j, reason: collision with root package name */
    private long f25116j;

    /* renamed from: k, reason: collision with root package name */
    private int f25117k;

    /* renamed from: l, reason: collision with root package name */
    private long f25118l;

    public C3566o6(InterfaceC4207u0 interfaceC4207u0, Y0 y02, C4001s6 c4001s6) {
        this.f25107a = interfaceC4207u0;
        this.f25108b = y02;
        this.f25109c = c4001s6;
        int max = Math.max(1, c4001s6.f26567c / 10);
        this.f25113g = max;
        UQ uq = new UQ(c4001s6.f26570f);
        uq.A();
        int A7 = uq.A();
        this.f25110d = A7;
        int i8 = c4001s6.f26566b;
        int i9 = c4001s6.f26568d;
        int i10 = (((i9 - (i8 * 4)) * 8) / (c4001s6.f26569e * i8)) + 1;
        if (A7 != i10) {
            throw zzbc.a("Expected frames per block: " + i10 + "; got: " + A7, null);
        }
        int i11 = AbstractC2301cW.f21206a;
        int i12 = ((max + A7) - 1) / A7;
        this.f25111e = new byte[i9 * i12];
        this.f25112f = new UQ(i12 * (A7 + A7) * i8);
        int i13 = ((c4001s6.f26567c * c4001s6.f26568d) * 8) / A7;
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("audio/raw");
        c2723gJ0.q0(i13);
        c2723gJ0.v(i13);
        c2723gJ0.r((max + max) * i8);
        c2723gJ0.r0(c4001s6.f26566b);
        c2723gJ0.C(c4001s6.f26567c);
        c2723gJ0.u(2);
        this.f25114h = c2723gJ0.H();
    }

    private final int a(int i8) {
        int i9 = this.f25109c.f26566b;
        return i8 / (i9 + i9);
    }

    private final int b(int i8) {
        return (i8 + i8) * this.f25109c.f26566b;
    }

    private final void f(int i8) {
        long M7 = this.f25116j + AbstractC2301cW.M(this.f25118l, 1000000L, this.f25109c.f26567c, RoundingMode.DOWN);
        int b8 = b(i8);
        this.f25108b.b(M7, 1, b8, this.f25117k - b8, null);
        this.f25118l += i8;
        this.f25117k -= b8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    public final void c(long j8) {
        this.f25115i = 0;
        this.f25116j = j8;
        this.f25117k = 0;
        this.f25118l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    public final void d(int i8, long j8) {
        this.f25107a.Q(new C4328v6(this.f25109c, this.f25110d, i8, j8));
        this.f25108b.c(this.f25114h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC3675p6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.internal.ads.InterfaceC3989s0 r21, long r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3566o6.e(com.google.android.gms.internal.ads.s0, long):boolean");
    }
}
