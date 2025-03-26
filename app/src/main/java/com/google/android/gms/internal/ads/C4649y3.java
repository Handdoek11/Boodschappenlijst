package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4649y3 implements InterfaceC3880r0 {

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f27981J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K, reason: collision with root package name */
    private static final D f27982K;

    /* renamed from: A, reason: collision with root package name */
    private int f27983A;

    /* renamed from: B, reason: collision with root package name */
    private int f27984B;

    /* renamed from: C, reason: collision with root package name */
    private int f27985C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f27986D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f27987E;

    /* renamed from: I, reason: collision with root package name */
    private boolean f27991I;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3344m4 f27992a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27993b;

    /* renamed from: c, reason: collision with root package name */
    private final List f27994c;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f27999h;

    /* renamed from: i, reason: collision with root package name */
    private final UQ f28000i;

    /* renamed from: p, reason: collision with root package name */
    private int f28007p;

    /* renamed from: q, reason: collision with root package name */
    private int f28008q;

    /* renamed from: r, reason: collision with root package name */
    private long f28009r;

    /* renamed from: s, reason: collision with root package name */
    private int f28010s;

    /* renamed from: t, reason: collision with root package name */
    private UQ f28011t;

    /* renamed from: u, reason: collision with root package name */
    private long f28012u;

    /* renamed from: v, reason: collision with root package name */
    private int f28013v;

    /* renamed from: z, reason: collision with root package name */
    private C4540x3 f28017z;

    /* renamed from: j, reason: collision with root package name */
    private final R1 f28001j = new R1();

    /* renamed from: k, reason: collision with root package name */
    private final UQ f28002k = new UQ(16);

    /* renamed from: e, reason: collision with root package name */
    private final UQ f27996e = new UQ(AbstractC1366Ha0.f15750a);

    /* renamed from: f, reason: collision with root package name */
    private final UQ f27997f = new UQ(5);

    /* renamed from: g, reason: collision with root package name */
    private final UQ f27998g = new UQ();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayDeque f28003l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque f28004m = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray f27995d = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    private AbstractC4169th0 f28006o = AbstractC4169th0.w();

    /* renamed from: x, reason: collision with root package name */
    private long f28015x = -9223372036854775807L;

    /* renamed from: w, reason: collision with root package name */
    private long f28014w = -9223372036854775807L;

    /* renamed from: y, reason: collision with root package name */
    private long f28016y = -9223372036854775807L;

    /* renamed from: F, reason: collision with root package name */
    private InterfaceC4207u0 f27988F = InterfaceC4207u0.f26985g;

    /* renamed from: G, reason: collision with root package name */
    private Y0[] f27989G = new Y0[0];

    /* renamed from: H, reason: collision with root package name */
    private Y0[] f27990H = new Y0[0];

    /* renamed from: n, reason: collision with root package name */
    private final C1442Jc0 f28005n = new C1442Jc0(new InterfaceC1404Ib0() { // from class: com.google.android.gms.internal.ads.v3
        @Override // com.google.android.gms.internal.ads.InterfaceC1404Ib0
        public final void a(long j8, UQ uq) {
            this.f27172a.b(j8, uq);
        }
    });

    static {
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.B("application/x-emsg");
        f27982K = c2723gJ0.H();
    }

    public C4649y3(InterfaceC3344m4 interfaceC3344m4, int i8, BU bu, K3 k32, List list, Y0 y02) {
        this.f27992a = interfaceC3344m4;
        this.f27993b = i8;
        this.f27994c = DesugarCollections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f27999h = bArr;
        this.f28000i = new UQ(bArr);
    }

    private static int c(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw zzbc.a("Unexpected negative value: " + i8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.C4785zG0 e(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4649y3.e(java.util.List):com.google.android.gms.internal.ads.zG0");
    }

    private final void j() {
        this.f28007p = 0;
        this.f28010s = 0;
    }

    private static void k(UQ uq, int i8, M3 m32) {
        uq.l(i8 + 8);
        int w7 = uq.w();
        int i9 = AbstractC3995s3.f26535b;
        if ((w7 & 1) != 0) {
            throw zzbc.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (w7 & 2) != 0;
        int F7 = uq.F();
        if (F7 == 0) {
            Arrays.fill(m32.f17207l, 0, m32.f17200e, false);
            return;
        }
        int i10 = m32.f17200e;
        if (F7 != i10) {
            throw zzbc.a("Senc sample count " + F7 + " is different from fragment sample count" + i10, null);
        }
        Arrays.fill(m32.f17207l, 0, F7, z7);
        m32.a(uq.r());
        UQ uq2 = m32.f17209n;
        uq.h(uq2.n(), 0, uq2.u());
        m32.f17209n.l(0);
        m32.f17210o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(long r54) {
        /*
            Method dump skipped, instructions count: 1895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4649y3.l(long):void");
    }

    private static final C4104t3 m(SparseArray sparseArray, int i8) {
        if (sparseArray.size() == 1) {
            return (C4104t3) sparseArray.valueAt(0);
        }
        C4104t3 c4104t3 = (C4104t3) sparseArray.get(i8);
        c4104t3.getClass();
        return c4104t3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    final /* synthetic */ void b(long j8, UQ uq) {
        AbstractC2358d0.a(j8, uq, this.f27990H);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return this.f28006o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        int size = this.f27995d.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((C4540x3) this.f27995d.valueAt(i8)).i();
        }
        this.f28004m.clear();
        this.f28013v = 0;
        this.f28005n.c();
        this.f28014w = j9;
        this.f28003l.clear();
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f0, code lost:
    
        r26.f27998g.i(r13);
        r1.H(r26.f27998g.n(), 0, r26.f27985C);
        r6.a(r26.f27998g, r26.f27985C);
        r9 = r26.f27985C;
        r10 = r26.f27998g;
        r10 = com.google.android.gms.internal.ads.AbstractC1366Ha0.b(r10.n(), r10.u());
        r26.f27998g.l("video/hevc".equals(r2.f16513g.f14334o) ? 1 : 0);
        r26.f27998g.k(r10);
        r5 = r2.f16513g.f14336q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022f, code lost:
    
        if (r5 == (-1)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0237, code lost:
    
        if (r5 == r26.f28005n.a()) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0239, code lost:
    
        r26.f28005n.d(r2.f16513g.f14336q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0242, code lost:
    
        r26.f28005n.b(r7, r26.f27998g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024f, code lost:
    
        if ((r4.a() & 5) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0251, code lost:
    
        r26.f28005n.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0257, code lost:
    
        r9 = r6.e(r1, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x025c, code lost:
    
        r26.f27984B += r9;
        r26.f27985C -= r9;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0269, code lost:
    
        r22 = r4.a();
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0271, code lost:
    
        if (r1 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0273, code lost:
    
        r25 = r1.f16748c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0278, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027a, code lost:
    
        r6.b(r7, r22, r26.f27983A, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028d, code lost:
    
        if (r26.f28004m.isEmpty() != false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028f, code lost:
    
        r1 = (com.google.android.gms.internal.ads.C4431w3) r26.f28004m.removeFirst();
        r26.f28013v -= r1.f27432c;
        r5 = r1.f27430a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a2, code lost:
    
        if (r1.f27431b == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a4, code lost:
    
        r5 = r5 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a5, code lost:
    
        r2 = r26.f27989G;
        r15 = r2.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a9, code lost:
    
        if (r14 >= r15) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ab, code lost:
    
        r2[r14].b(r5, 1, r1.f27432c, r26.f28013v, null);
        r14 = r14 + 1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ce, code lost:
    
        if (r4.k() != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d0, code lost:
    
        r26.f28017z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d3, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02d4, code lost:
    
        r26.f28007p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r26.f28007p != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        r2 = r4.b();
        r26.f27983A = r2;
        r26.f27986D = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        if (r4.f27719f >= r4.f27722i) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        r1.D(r2);
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r2 = r4.f27715b.f17209n;
        r1 = r1.f16749d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        r2.m(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        if (r4.f27715b.b(r4.f27719f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        r2.m(r2.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        if (r4.k() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        r26.f28017z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        if (r4.f27717d.f17458a.f16514h != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
    
        r26.f27983A = r2 - 8;
        r1.D(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
    
        if ("audio/ac4".equals(r4.f27717d.f17458a.f16513g.f14334o) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        r26.f27984B = r4.c(r26.f27983A, 7);
        com.google.android.gms.internal.ads.U.b(r26.f27983A, r26.f28000i);
        r4.f27714a.a(r26.f28000i, 7);
        r2 = r26.f27984B + 7;
        r26.f27984B = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        r2 = r4.c(r26.f27983A, 0);
        r26.f27984B = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011d, code lost:
    
        r26.f27983A += r2;
        r26.f28007p = 4;
        r26.f27985C = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        r2 = r4.f27717d.f17458a;
        r6 = r4.f27714a;
        r7 = r4.e();
        r11 = r2.f16517k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        if (r11 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r2 = r26.f27984B;
        r5 = r26.f27983A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        if (r2 >= r5) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
    
        r26.f27984B += r6.e(r1, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        r12 = r26.f27997f.n();
        r12[0] = 0;
        r12[r3 ? 1 : 0] = 0;
        r12[2] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015c, code lost:
    
        if (r26.f27984B >= r26.f27983A) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015e, code lost:
    
        r13 = r26.f27985C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        if (r13 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0164, code lost:
    
        r1.H(r12, r11, r14);
        r26.f27997f.l(r10);
        r13 = r26.f27997f.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        if (r13 <= 0) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        r26.f27985C = r13 - 1;
        r26.f27996e.l(r10);
        r6.a(r26.f27996e, 4);
        r6.a(r26.f27997f, r3 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        if (r26.f27990H.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        r13 = r2.f16513g;
        r17 = r12[4];
        r10 = com.google.android.gms.internal.ads.AbstractC1366Ha0.f15750a;
        r10 = r13.f14334o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019d, code lost:
    
        if ("video/avc".equals(r10) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a1, code lost:
    
        if ((r17 & 31) == r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
    
        r10 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:
    
        if ("video/hevc".equals(r10) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b1, code lost:
    
        if (((r17 & 126) >> (r3 ? 1 : 0)) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b4, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        r26.f27987E = r10;
        r26.f27984B += 5;
        r26.f27983A += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r26.f27986D != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d2, code lost:
    
        if (j$.util.Objects.equals(r4.f27717d.f17458a.f16513g.f14334o, "video/avc") == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01db, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1366Ha0.i(r12[4]) == false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dd, code lost:
    
        r26.f27986D = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01df, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01eb, code lost:
    
        throw com.google.android.gms.internal.ads.zzbc.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
    
        if (r26.f27987E == false) goto L108;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r27, com.google.android.gms.internal.ads.O0 r28) {
        /*
            Method dump skipped, instructions count: 1909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4649y3.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        V0 a8 = J3.a(interfaceC3989s0);
        this.f28006o = a8 != null ? AbstractC4169th0.x(a8) : AbstractC4169th0.w();
        return a8 == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        int i8;
        if ((this.f27993b & 32) == 0) {
            interfaceC4207u0 = new C3671p4(interfaceC4207u0, this.f27992a);
        }
        this.f27988F = interfaceC4207u0;
        j();
        Y0[] y0Arr = new Y0[2];
        this.f27989G = y0Arr;
        int i9 = 100;
        int i10 = 0;
        if ((this.f27993b & 4) != 0) {
            y0Arr[0] = this.f27988F.R(100, 5);
            i8 = 1;
            i9 = 101;
        } else {
            i8 = 0;
        }
        Y0[] y0Arr2 = (Y0[]) AbstractC2301cW.n(this.f27989G, i8);
        this.f27989G = y0Arr2;
        for (Y0 y02 : y0Arr2) {
            y02.c(f27982K);
        }
        this.f27990H = new Y0[this.f27994c.size()];
        while (i10 < this.f27990H.length) {
            Y0 R7 = this.f27988F.R(i9, 3);
            R7.c((D) this.f27994c.get(i10));
            this.f27990H[i10] = R7;
            i10++;
            i9++;
        }
    }
}
