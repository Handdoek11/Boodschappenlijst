package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class D3 implements InterfaceC3880r0, R0 {

    /* renamed from: A, reason: collision with root package name */
    private int f14360A;

    /* renamed from: B, reason: collision with root package name */
    private C2 f14361B;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3344m4 f14362a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14363b;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f14364c;

    /* renamed from: d, reason: collision with root package name */
    private final UQ f14365d;

    /* renamed from: e, reason: collision with root package name */
    private final UQ f14366e;

    /* renamed from: f, reason: collision with root package name */
    private final UQ f14367f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f14368g;

    /* renamed from: h, reason: collision with root package name */
    private final H3 f14369h;

    /* renamed from: i, reason: collision with root package name */
    private final List f14370i;

    /* renamed from: j, reason: collision with root package name */
    private AbstractC4169th0 f14371j;

    /* renamed from: k, reason: collision with root package name */
    private int f14372k;

    /* renamed from: l, reason: collision with root package name */
    private int f14373l;

    /* renamed from: m, reason: collision with root package name */
    private long f14374m;

    /* renamed from: n, reason: collision with root package name */
    private int f14375n;

    /* renamed from: o, reason: collision with root package name */
    private UQ f14376o;

    /* renamed from: p, reason: collision with root package name */
    private int f14377p;

    /* renamed from: q, reason: collision with root package name */
    private int f14378q;

    /* renamed from: r, reason: collision with root package name */
    private int f14379r;

    /* renamed from: s, reason: collision with root package name */
    private int f14380s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14381t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14382u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC4207u0 f14383v;

    /* renamed from: w, reason: collision with root package name */
    private C3[] f14384w;

    /* renamed from: x, reason: collision with root package name */
    private long[][] f14385x;

    /* renamed from: y, reason: collision with root package name */
    private int f14386y;

    /* renamed from: z, reason: collision with root package name */
    private long f14387z;

    public D3() {
        this(InterfaceC3344m4.f24432a, 16);
    }

    private static int j(int i8) {
        if (i8 != 1751476579) {
            return i8 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int k(N3 n32, long j8) {
        int a8 = n32.a(j8);
        return a8 == -1 ? n32.b(j8) : a8;
    }

    private static long l(N3 n32, long j8, long j9) {
        int k8 = k(n32, j8);
        return k8 == -1 ? j9 : Math.min(n32.f17460c[k8], j9);
    }

    private final void m() {
        this.f14372k = 0;
        this.f14375n = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(long j8) {
        C3503nb c3503nb;
        long j9;
        List list;
        G0 g02;
        C3503nb c3503nb2;
        int i8;
        ArrayList arrayList;
        int i9;
        int i10;
        C3503nb c8;
        int i11;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        while (!this.f14368g.isEmpty() && ((IY) this.f14368g.peek()).f15960b == j8) {
            IY iy = (IY) this.f14368g.pop();
            if (iy.f24245a == 1836019574) {
                IY b8 = iy.b(1835365473);
                new ArrayList();
                C3503nb b9 = b8 != null ? AbstractC3995s3.b(b8) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z7 = this.f14360A == i14 ? i14 : i13;
                G0 g03 = new G0();
                C3064jZ c9 = iy.c(1969517665);
                if (c9 != null) {
                    C3503nb c10 = AbstractC3995s3.c(c9);
                    g03.b(c10);
                    c3503nb = c10;
                } else {
                    c3503nb = null;
                }
                C3064jZ c11 = iy.c(1836476516);
                c11.getClass();
                InterfaceC1541Ma[] interfaceC1541MaArr = new InterfaceC1541Ma[i14];
                interfaceC1541MaArr[i13] = AbstractC3995s3.d(c11.f23275b);
                C3503nb c3503nb3 = new C3503nb(-9223372036854775807L, interfaceC1541MaArr);
                ArrayList arrayList3 = arrayList2;
                long j10 = -9223372036854775807L;
                G0 g04 = g03;
                List f8 = AbstractC3995s3.f(iy, g03, -9223372036854775807L, null, i14 != (this.f14363b & i14) ? i13 : i14, z7, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.B3
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        return (K3) obj;
                    }
                });
                int i15 = i13;
                int i16 = i15;
                long j11 = -9223372036854775807L;
                int i17 = -1;
                while (true) {
                    j9 = 0;
                    if (i15 >= f8.size()) {
                        break;
                    }
                    N3 n32 = (N3) f8.get(i15);
                    if (n32.f17459b == 0) {
                        i9 = i14;
                        list = f8;
                        g02 = g04;
                        arrayList = arrayList3;
                    } else {
                        K3 k32 = n32.f17458a;
                        int i18 = i16 + 1;
                        C3 c32 = new C3(k32, n32, this.f14383v.R(i16, k32.f16508b));
                        list = f8;
                        long j12 = k32.f16511e;
                        if (j12 == j10) {
                            j12 = n32.f17465h;
                        }
                        c32.f14076c.d(j12);
                        long max = Math.max(j11, j12);
                        int i19 = "audio/true-hd".equals(k32.f16513g.f14334o) ? n32.f17462e * 16 : n32.f17462e + 30;
                        C2723gJ0 b10 = k32.f16513g.b();
                        b10.r(i19);
                        if (k32.f16508b == i12) {
                            D d8 = k32.f16513g;
                            int i20 = this.f14363b;
                            int i21 = d8.f14325f;
                            if ((i20 & 8) != 0) {
                                i21 |= i17 == -1 ? 1 : 2;
                            }
                            if (d8.f14343x == -1.0f && j12 > 0 && (i11 = n32.f17459b) > 0) {
                                b10.i(i11 / (j12 / 1000000.0f));
                            }
                            b10.y(i21);
                        }
                        if (k32.f16508b == 1 && g04.a()) {
                            g02 = g04;
                            b10.g(g02.f15234a);
                            b10.h(g02.f15235b);
                        } else {
                            g02 = g04;
                        }
                        int i22 = k32.f16508b;
                        if (this.f14370i.isEmpty()) {
                            i8 = 3;
                            c3503nb2 = null;
                        } else {
                            c3503nb2 = new C3503nb(this.f14370i);
                            i8 = 3;
                        }
                        C3503nb[] c3503nbArr = new C3503nb[i8];
                        c3503nbArr[0] = c3503nb2;
                        c3503nbArr[1] = c3503nb;
                        c3503nbArr[2] = c3503nb3;
                        C3503nb c3503nb4 = new C3503nb(-9223372036854775807L, new InterfaceC1541Ma[0]);
                        if (b9 != null) {
                            int i23 = 0;
                            while (i23 < b9.a()) {
                                InterfaceC1541Ma b11 = b9.b(i23);
                                if (b11 instanceof C2847hY) {
                                    C2847hY c2847hY = (C2847hY) b11;
                                    if (c2847hY.f22560o.equals("com.android.capture.fps")) {
                                        if (i22 == 2) {
                                            i10 = 1;
                                            c8 = c3503nb4.c(c2847hY);
                                        }
                                        i10 = 1;
                                    } else {
                                        i10 = 1;
                                        c8 = c3503nb4.c(c2847hY);
                                    }
                                    c3503nb4 = c8;
                                } else {
                                    i10 = 1;
                                }
                                i23 += i10;
                            }
                        }
                        for (int i24 = 0; i24 < 3; i24++) {
                            c3503nb4 = c3503nb4.d(c3503nbArr[i24]);
                        }
                        if (c3503nb4.a() > 0) {
                            b10.t(c3503nb4);
                        }
                        c32.f14076c.c(b10.H());
                        if (k32.f16508b == 2 && i17 == -1) {
                            i17 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(c32);
                        i16 = i18;
                        j11 = max;
                        i9 = 1;
                    }
                    i15 += i9;
                    g04 = g02;
                    arrayList3 = arrayList;
                    f8 = list;
                    i12 = 2;
                    j10 = -9223372036854775807L;
                    i14 = i9;
                }
                this.f14386y = i17;
                this.f14387z = j11;
                C3[] c3Arr = (C3[]) arrayList3.toArray(new C3[0]);
                this.f14384w = c3Arr;
                int length = c3Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i25 = 0; i25 < c3Arr.length; i25++) {
                    jArr[i25] = new long[c3Arr[i25].f14075b.f17459b];
                    jArr2[i25] = c3Arr[i25].f14075b.f17463f[0];
                }
                int i26 = 0;
                int i27 = 0;
                while (i27 < c3Arr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i28 = -1;
                    for (int i29 = i26; i29 < c3Arr.length; i29++) {
                        if (!zArr[i29]) {
                            long j14 = jArr2[i29];
                            if (j14 <= j13) {
                                i28 = i29;
                                j13 = j14;
                            }
                        }
                    }
                    int i30 = iArr[i28];
                    long[] jArr3 = jArr[i28];
                    jArr3[i30] = j9;
                    N3 n33 = c3Arr[i28].f14075b;
                    j9 += n33.f17461d[i30];
                    int i31 = i30 + 1;
                    iArr[i28] = i31;
                    if (i31 < jArr3.length) {
                        jArr2[i28] = n33.f17463f[i31];
                    } else {
                        zArr[i28] = true;
                        i27++;
                    }
                    i26 = 0;
                }
                this.f14385x = jArr;
                this.f14383v.P();
                this.f14383v.Q(this);
                this.f14368g.clear();
                this.f14372k = 2;
                i12 = 2;
                i14 = 1;
            } else {
                int i32 = i14;
                if (!this.f14368g.isEmpty()) {
                    ((IY) this.f14368g.peek()).d(iy);
                }
                i14 = i32;
                i12 = 2;
            }
            i13 = 0;
        }
        if (this.f14372k != 2) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final P0 c(long j8) {
        long j9;
        long j10;
        int b8;
        C3[] c3Arr = this.f14384w;
        if (c3Arr.length == 0) {
            S0 s02 = S0.f18728c;
            return new P0(s02, s02);
        }
        int i8 = this.f14386y;
        long j11 = -1;
        if (i8 != -1) {
            N3 n32 = c3Arr[i8].f14075b;
            int k8 = k(n32, j8);
            if (k8 == -1) {
                S0 s03 = S0.f18728c;
                return new P0(s03, s03);
            }
            long j12 = n32.f17463f[k8];
            j9 = n32.f17460c[k8];
            if (j12 >= j8 || k8 >= n32.f17459b - 1 || (b8 = n32.b(j8)) == -1 || b8 == k8) {
                j10 = -9223372036854775807L;
            } else {
                j10 = n32.f17463f[b8];
                j11 = n32.f17460c[b8];
            }
            j8 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            C3[] c3Arr2 = this.f14384w;
            if (i9 >= c3Arr2.length) {
                break;
            }
            if (i9 != this.f14386y) {
                N3 n33 = c3Arr2[i9].f14075b;
                long l8 = l(n33, j8, j9);
                if (j10 != -9223372036854775807L) {
                    j11 = l(n33, j10, j11);
                }
                j9 = l8;
            }
            i9++;
        }
        S0 s04 = new S0(j8, j9);
        return j10 == -9223372036854775807L ? new P0(s04, s04) : new P0(s04, new S0(j10, j11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return this.f14371j;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void f(long j8, long j9) {
        this.f14368g.clear();
        this.f14375n = 0;
        this.f14377p = -1;
        this.f14378q = 0;
        this.f14379r = 0;
        this.f14380s = 0;
        this.f14381t = true;
        if (j8 == 0) {
            if (this.f14372k != 3) {
                m();
                return;
            } else {
                this.f14369h.b();
                this.f14370i.clear();
                return;
            }
        }
        for (C3 c32 : this.f14384w) {
            N3 n32 = c32.f14075b;
            int a8 = n32.a(j9);
            if (a8 == -1) {
                a8 = n32.b(j9);
            }
            c32.f14078e = a8;
            Z0 z02 = c32.f14077d;
            if (z02 != null) {
                z02.b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0214, code lost:
    
        r33.f17813a = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0217, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0218, code lost:
    
        r5 = r31.f14374m - r31.f14375n;
        r9 = r32.c() + r5;
        r3 = r31.f14376o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0226, code lost:
    
        if (r3 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0228, code lost:
    
        r32.H(r3.n(), r31.f14375n, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0234, code lost:
    
        if (r31.f14373l != 1718909296) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0236, code lost:
    
        r31.f14382u = true;
        r3.l(8);
        r5 = j(r3.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r5 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0247, code lost:
    
        r3.m(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r33.f17813a != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024f, code lost:
    
        if (r3.r() <= 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0251, code lost:
    
        r5 = j(r3.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0259, code lost:
    
        if (r5 == 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025d, code lost:
    
        r31.f14360A = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025f, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0267, code lost:
    
        if (r31.f14368g.isEmpty() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0269, code lost:
    
        ((com.google.android.gms.internal.ads.IY) r31.f14368g.peek()).e(new com.google.android.gms.internal.ads.C3064jZ(r31.f14373l, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027e, code lost:
    
        if (r31.f14382u != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0285, code lost:
    
        if (r31.f14373l != 1835295092) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0287, code lost:
    
        r31.f14360A = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x028c, code lost:
    
        if (r5 >= 262144) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x028e, code lost:
    
        r32.D((int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0293, code lost:
    
        r33.f17813a = r32.c() + r5;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x029b, code lost:
    
        n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029e, code lost:
    
        if (r3 == false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a3, code lost:
    
        if (r31.f14372k == 2) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a5, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r7 = r32.c();
        r14 = r31.f14377p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r14 != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r26 = r5;
        r27 = r26;
        r21 = r6;
        r28 = r21;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r3 = r31.f14384w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r14 >= r3.length) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r3 = r3[r14];
        r9 = r3.f14078e;
        r3 = r3.f14075b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r9 != r3.f17459b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r29 = r3.f17460c[r9];
        r3 = r31.f14385x;
        r10 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a;
        r9 = r3[r14][r9];
        r29 = r29 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r29 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r29 < 262144) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (r3 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r28 != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r3 != r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        if (r29 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        r28 = r3;
        r22 = r9;
        r27 = r14;
        r24 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r9 >= r19) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r21 = r3;
        r19 = r9;
        r26 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        if (r21 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r22 < (r19 + 10485760)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ab, code lost:
    
        r31.f14377p = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        if (r14 != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b2, code lost:
    
        r3 = r31.f14384w[r14];
        r9 = r3.f14076c;
        r10 = r3.f14078e;
        r13 = r3.f14075b;
        r4 = r13.f17460c[r10];
        r13 = r13.f17461d[r10];
        r14 = r3.f14077d;
        r7 = (r4 - r7) + r31.f14378q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        if (r7 < 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        if (r7 < 262144) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (r3.f14074a.f16514h != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        r7 = r7 + 8;
        r13 = r13 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
    
        r32.D((int) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        if (j$.util.Objects.equals(r3.f14074a.f16513g.f14334o, "video/avc") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        r2 = 1;
        r31.f14381t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fc, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r4 = r3.f14074a;
        r5 = r4.f16517k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r5 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        r4 = r31.f14365d.n();
        r4[0] = 0;
        r4[r2] = 0;
        r4[2] = 0;
        r6 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        if (r31.f14379r >= r13) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        r2 = r31.f14380s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011c, code lost:
    
        if (r2 != 0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        r32.H(r4, r5, r6);
        r31.f14378q += r6;
        r31.f14365d.l(0);
        r2 = r31.f14365d.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        if (r2 <= 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        r31.f14380s = r2 - 1;
        r31.f14364c.l(0);
        r9.a(r31.f14364c, 4);
        r9.a(r31.f14365d, 1);
        r31.f14379r += 5;
        r13 = r13 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        if (r31.f14381t != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1366Ha0.i(r4[4]) == false) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
    
        r31.f14381t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0166, code lost:
    
        throw com.google.android.gms.internal.ads.zzbc.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
    
        r2 = r9.e(r32, r2, false);
        r31.f14378q += r2;
        r31.f14379r += r2;
        r31.f14380s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7 == r6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0186, code lost:
    
        if ("audio/ac4".equals(r4.f16513g.f14334o) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018a, code lost:
    
        if (r31.f14379r != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
    
        com.google.android.gms.internal.ads.U.b(r13, r31.f14366e);
        r4 = 7;
        r9.a(r31.f14366e, 7);
        r31.f14379r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019d, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019e, code lost:
    
        r13 = r13 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (r14 == null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        r14.d(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a5, code lost:
    
        r2 = r31.f14379r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a7, code lost:
    
        if (r2 >= r13) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r7 == 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a9, code lost:
    
        r2 = r9.e(r32, r13 - r2, false);
        r31.f14378q += r2;
        r31.f14379r += r2;
        r31.f14380s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c0, code lost:
    
        r1 = r3.f14075b;
        r4 = r1.f17463f[r10];
        r1 = r1.f17464g[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        if (r31.f14381t != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d1, code lost:
    
        if (r14 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        r14.c(r9, r4, r1, r13, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ea, code lost:
    
        if ((r10 + 1) != r3.f14075b.f17459b) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ec, code lost:
    
        r14.a(r9, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        r9.b(r4, r1, r13, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0200, code lost:
    
        r3.f14078e++;
        r31.f14377p = -1;
        r31.f14378q = 0;
        r31.f14379r = 0;
        r31.f14380s = 0;
        r31.f14381t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r31.f14369h.a(r32, r33, r31.f14370i);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r32, com.google.android.gms.internal.ads.O0 r33) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D3.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final boolean h(InterfaceC3989s0 interfaceC3989s0) {
        V0 b8 = J3.b(interfaceC3989s0, (this.f14363b & 2) != 0);
        this.f14371j = b8 != null ? AbstractC4169th0.x(b8) : AbstractC4169th0.w();
        return b8 == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        if ((this.f14363b & 16) == 0) {
            interfaceC4207u0 = new C3671p4(interfaceC4207u0, this.f14362a);
        }
        this.f14383v = interfaceC4207u0;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public final long zza() {
        return this.f14387z;
    }

    public D3(InterfaceC3344m4 interfaceC3344m4, int i8) {
        this.f14362a = interfaceC3344m4;
        this.f14363b = i8;
        this.f14371j = AbstractC4169th0.w();
        this.f14372k = (i8 & 4) != 0 ? 3 : 0;
        this.f14369h = new H3();
        this.f14370i = new ArrayList();
        this.f14367f = new UQ(16);
        this.f14368g = new ArrayDeque();
        this.f14364c = new UQ(AbstractC1366Ha0.f15750a);
        this.f14365d = new UQ(5);
        this.f14366e = new UQ();
        this.f14377p = -1;
        this.f14383v = InterfaceC4207u0.f26985g;
        this.f14384w = new C3[0];
        this.f14381t = true;
    }
}
