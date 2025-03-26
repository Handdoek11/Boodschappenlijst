package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2686g1 implements InterfaceC3880r0 {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f22191p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f22192q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    private static final byte[] f22193r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[] f22194s;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f22196b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22197c;

    /* renamed from: d, reason: collision with root package name */
    private long f22198d;

    /* renamed from: e, reason: collision with root package name */
    private int f22199e;

    /* renamed from: f, reason: collision with root package name */
    private int f22200f;

    /* renamed from: h, reason: collision with root package name */
    private int f22202h;

    /* renamed from: i, reason: collision with root package name */
    private long f22203i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC4207u0 f22204j;

    /* renamed from: k, reason: collision with root package name */
    private Y0 f22205k;

    /* renamed from: l, reason: collision with root package name */
    private Y0 f22206l;

    /* renamed from: m, reason: collision with root package name */
    private R0 f22207m;

    /* renamed from: n, reason: collision with root package name */
    private long f22208n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22209o;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22195a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    private int f22201g = -1;

    static {
        int i8 = AbstractC2301cW.f21206a;
        Charset charset = StandardCharsets.UTF_8;
        f22193r = "#!AMR\n".getBytes(charset);
        f22194s = "#!AMR-WB\n".getBytes(charset);
    }

    public C2686g1(int i8) {
        C3336m0 c3336m0 = new C3336m0();
        this.f22196b = c3336m0;
        this.f22206l = c3336m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: EOFException -> 0x008d, TryCatch #0 {EOFException -> 0x008d, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0059, B:32:0x0076, B:33:0x0077, B:34:0x008c), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(com.google.android.gms.internal.ads.InterfaceC3989s0 r12) {
        /*
            r11 = this;
            int r0 = r11.f22200f
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L8e
            r12.h()     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f22195a     // Catch: java.io.EOFException -> L8d
            r12.I(r0, r3, r2)     // Catch: java.io.EOFException -> L8d
            byte[] r0 = r11.f22195a     // Catch: java.io.EOFException -> L8d
            r0 = r0[r3]     // Catch: java.io.EOFException -> L8d
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L77
            int r0 = r0 >> 3
            boolean r4 = r11.f22197c     // Catch: java.io.EOFException -> L8d
            r0 = r0 & 15
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = com.google.android.gms.internal.ads.C2686g1.f22192q     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
            goto L3f
        L3b:
            int[] r4 = com.google.android.gms.internal.ads.C2686g1.f22191p     // Catch: java.io.EOFException -> L8d
            r0 = r4[r0]     // Catch: java.io.EOFException -> L8d
        L3f:
            r11.f22199e = r0     // Catch: java.io.EOFException -> L8d
            r11.f22200f = r0
            int r4 = r11.f22201g
            if (r4 != r1) goto L4a
            r11.f22201g = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L8e
            int r4 = r11.f22202h
            int r4 = r4 + r2
            r11.f22202h = r4
            goto L8e
        L52:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L59
            r12 = r3
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r2.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> L8d
            r2.append(r12)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L8d
            r2.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbc r12 = com.google.android.gms.internal.ads.zzbc.a(r12, r5)     // Catch: java.io.EOFException -> L8d
            throw r12     // Catch: java.io.EOFException -> L8d
        L77:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L8d
            r12.<init>()     // Catch: java.io.EOFException -> L8d
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L8d
            r12.append(r0)     // Catch: java.io.EOFException -> L8d
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L8d
            com.google.android.gms.internal.ads.zzbc r12 = com.google.android.gms.internal.ads.zzbc.a(r12, r5)     // Catch: java.io.EOFException -> L8d
            throw r12     // Catch: java.io.EOFException -> L8d
        L8d:
            return r1
        L8e:
            com.google.android.gms.internal.ads.Y0 r4 = r11.f22206l
            int r12 = r4.e(r12, r0, r2)
            if (r12 != r1) goto L97
            return r1
        L97:
            int r0 = r11.f22200f
            int r0 = r0 - r12
            r11.f22200f = r0
            if (r0 <= 0) goto L9f
            return r3
        L9f:
            com.google.android.gms.internal.ads.Y0 r4 = r11.f22206l
            long r5 = r11.f22198d
            int r8 = r11.f22199e
            r9 = 0
            r10 = 0
            r7 = 1
            r4.b(r5, r7, r8, r9, r10)
            long r0 = r11.f22198d
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f22198d = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2686g1.b(com.google.android.gms.internal.ads.s0):int");
    }

    private static boolean c(InterfaceC3989s0 interfaceC3989s0, byte[] bArr) {
        interfaceC3989s0.h();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        interfaceC3989s0.I(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean e(InterfaceC3989s0 interfaceC3989s0) {
        byte[] bArr = f22193r;
        if (c(interfaceC3989s0, bArr)) {
            this.f22197c = false;
            interfaceC3989s0.D(bArr.length);
            return true;
        }
        byte[] bArr2 = f22194s;
        if (!c(interfaceC3989s0, bArr2)) {
            return false;
        }
        this.f22197c = true;
        interfaceC3989s0.D(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f22198d = 0L;
        this.f22199e = 0;
        this.f22200f = 0;
        this.f22208n = j9;
        this.f22203i = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final int g(InterfaceC3989s0 interfaceC3989s0, O0 o02) {
        AbstractC3796qC.b(this.f22205k);
        int i8 = AbstractC2301cW.f21206a;
        if (interfaceC3989s0.c() == 0 && !e(interfaceC3989s0)) {
            throw zzbc.a("Could not find AMR header.", null);
        }
        if (!this.f22209o) {
            this.f22209o = true;
            boolean z7 = this.f22197c;
            String str = true != z7 ? "audio/3gpp" : "audio/amr-wb";
            int i9 = true != z7 ? 8000 : 16000;
            int i10 = z7 ? f22192q[8] : f22191p[7];
            Y0 y02 = this.f22206l;
            C2723gJ0 c2723gJ0 = new C2723gJ0();
            c2723gJ0.B(str);
            c2723gJ0.r(i10);
            c2723gJ0.r0(1);
            c2723gJ0.C(i9);
            y02.c(c2723gJ0.H());
        }
        int b8 = b(interfaceC3989s0);
        if (this.f22207m == null) {
            Q0 q02 = new Q0(-9223372036854775807L, 0L);
            this.f22207m = q02;
            this.f22204j.Q(q02);
        }
        return b8 == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        return e(interfaceC3989s0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        this.f22204j = interfaceC4207u0;
        Y0 R7 = interfaceC4207u0.R(0, 1);
        this.f22205k = R7;
        this.f22206l = R7;
        interfaceC4207u0.P();
    }
}
