package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3782q5 implements InterfaceC4217u5 {

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f25712w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25713a;

    /* renamed from: b, reason: collision with root package name */
    private final C4144tQ f25714b = new C4144tQ(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    private final UQ f25715c = new UQ(Arrays.copyOf(f25712w, 10));

    /* renamed from: d, reason: collision with root package name */
    private final String f25716d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25717e;

    /* renamed from: f, reason: collision with root package name */
    private String f25718f;

    /* renamed from: g, reason: collision with root package name */
    private Y0 f25719g;

    /* renamed from: h, reason: collision with root package name */
    private Y0 f25720h;

    /* renamed from: i, reason: collision with root package name */
    private int f25721i;

    /* renamed from: j, reason: collision with root package name */
    private int f25722j;

    /* renamed from: k, reason: collision with root package name */
    private int f25723k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25724l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25725m;

    /* renamed from: n, reason: collision with root package name */
    private int f25726n;

    /* renamed from: o, reason: collision with root package name */
    private int f25727o;

    /* renamed from: p, reason: collision with root package name */
    private int f25728p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25729q;

    /* renamed from: r, reason: collision with root package name */
    private long f25730r;

    /* renamed from: s, reason: collision with root package name */
    private int f25731s;

    /* renamed from: t, reason: collision with root package name */
    private long f25732t;

    /* renamed from: u, reason: collision with root package name */
    private Y0 f25733u;

    /* renamed from: v, reason: collision with root package name */
    private long f25734v;

    public C3782q5(boolean z7, String str, int i8) {
        h();
        this.f25726n = -1;
        this.f25727o = -1;
        this.f25730r = -9223372036854775807L;
        this.f25732t = -9223372036854775807L;
        this.f25713a = z7;
        this.f25716d = str;
        this.f25717e = i8;
    }

    public static boolean f(int i8) {
        return (i8 & 65526) == 65520;
    }

    private final void g() {
        this.f25725m = false;
        h();
    }

    private final void h() {
        this.f25721i = 0;
        this.f25722j = 0;
        this.f25723k = 256;
    }

    private final void i() {
        this.f25721i = 3;
        this.f25722j = 0;
    }

    private final void j(Y0 y02, long j8, int i8, int i9) {
        this.f25721i = 4;
        this.f25722j = i8;
        this.f25733u = y02;
        this.f25734v = j8;
        this.f25731s = i9;
    }

    private final boolean k(UQ uq, byte[] bArr, int i8) {
        int min = Math.min(uq.r(), i8 - this.f25722j);
        uq.h(bArr, this.f25722j, min);
        int i9 = this.f25722j + min;
        this.f25722j = i9;
        return i9 == i8;
    }

    private static final boolean l(byte b8, byte b9) {
        return f((b9 & 255) | 65280);
    }

    private static final boolean m(UQ uq, byte[] bArr, int i8) {
        if (uq.r() < i8) {
            return false;
        }
        uq.h(bArr, 0, i8);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void a(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void b() {
        this.f25732t = -9223372036854775807L;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0273, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0275, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0276, code lost:
    
        r20.f25724l = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027a, code lost:
    
        if (r20.f25725m != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027c, code lost:
    
        r20.f25721i = 1;
        r20.f25722j = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0282, code lost:
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0285, code lost:
    
        r21.l(r13);
        r8 = 0;
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0268, code lost:
    
        r20.f25728p = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0271, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0268 A[EDGE_INSN: B:146:0x0268->B:98:0x0268 BREAK  A[LOOP:1: B:50:0x01b2->B:172:0x01b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021f  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.UQ r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3782q5.c(com.google.android.gms.internal.ads.UQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void d(InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
        c3021j6.c();
        this.f25718f = c3021j6.b();
        Y0 R7 = interfaceC4207u0.R(c3021j6.a(), 1);
        this.f25719g = R7;
        this.f25733u = R7;
        if (!this.f25713a) {
            this.f25720h = new C3336m0();
            return;
        }
        c3021j6.c();
        Y0 R8 = interfaceC4207u0.R(c3021j6.a(), 5);
        this.f25720h = R8;
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.m(c3021j6.b());
        c2723gJ0.B("application/id3");
        R8.c(c2723gJ0.H());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4217u5
    public final void e(long j8, int i8) {
        this.f25732t = j8;
    }
}
