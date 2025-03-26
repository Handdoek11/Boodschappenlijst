package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2587f6 implements InterfaceC3880r0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21932a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21933b;

    /* renamed from: c, reason: collision with root package name */
    private final UQ f21934c = new UQ(new byte[9400], 0);

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f21935d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2914i6 f21936e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3344m4 f21937f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseArray f21938g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f21939h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseBooleanArray f21940i;

    /* renamed from: j, reason: collision with root package name */
    private final C2261c6 f21941j;

    /* renamed from: k, reason: collision with root package name */
    private C2153b6 f21942k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC4207u0 f21943l;

    /* renamed from: m, reason: collision with root package name */
    private int f21944m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21945n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21946o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21947p;

    /* renamed from: q, reason: collision with root package name */
    private int f21948q;

    /* renamed from: r, reason: collision with root package name */
    private int f21949r;

    public C2587f6(int i8, int i9, InterfaceC3344m4 interfaceC3344m4, BU bu, InterfaceC2914i6 interfaceC2914i6, int i10) {
        this.f21936e = interfaceC2914i6;
        this.f21932a = i9;
        this.f21937f = interfaceC3344m4;
        this.f21933b = Collections.singletonList(bu);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f21939h = sparseBooleanArray;
        this.f21940i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f21938g = sparseArray;
        this.f21935d = new SparseIntArray();
        this.f21941j = new C2261c6(112800);
        this.f21943l = InterfaceC4207u0.f26985g;
        this.f21949r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = interfaceC2914i6.zza();
        int size = zza.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f21938g.put(zza.keyAt(i11), (InterfaceC3130k6) zza.valueAt(i11));
        }
        this.f21938g.put(0, new X5(new C2370d6(this)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ InterfaceC3880r0 a() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final /* synthetic */ List d() {
        return AbstractC4169th0.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r9, long r11) {
        /*
            r8 = this;
            java.util.List r9 = r8.f21933b
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        L8:
            r1 = 0
            if (r0 >= r9) goto L37
            java.util.List r3 = r8.f21933b
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.BU r3 = (com.google.android.gms.internal.ads.BU) r3
            long r4 = r3.f()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r3.d()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L34
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.i(r11)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L42
            com.google.android.gms.internal.ads.b6 r9 = r8.f21942k
            if (r9 == 0) goto L42
            r9.d(r11)
        L42:
            com.google.android.gms.internal.ads.UQ r9 = r8.f21934c
            r9.i(r10)
            android.util.SparseIntArray r9 = r8.f21935d
            r9.clear()
            r9 = r10
        L4d:
            android.util.SparseArray r11 = r8.f21938g
            int r11 = r11.size()
            if (r9 >= r11) goto L63
            android.util.SparseArray r11 = r8.f21938g
            java.lang.Object r11 = r11.valueAt(r9)
            com.google.android.gms.internal.ads.k6 r11 = (com.google.android.gms.internal.ads.InterfaceC3130k6) r11
            r11.a()
            int r9 = r9 + 1
            goto L4d
        L63:
            r8.f21948q = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2587f6.f(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC3989s0 r19, com.google.android.gms.internal.ads.O0 r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2587f6.g(com.google.android.gms.internal.ads.s0, com.google.android.gms.internal.ads.O0):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(com.google.android.gms.internal.ads.InterfaceC3989s0 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.UQ r0 = r6.f21934c
            byte[] r0 = r0.n()
            com.google.android.gms.internal.ads.g0 r7 = (com.google.android.gms.internal.ads.C2684g0) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.G(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.i(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2587f6.h(com.google.android.gms.internal.ads.s0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3880r0
    public final void i(InterfaceC4207u0 interfaceC4207u0) {
        if (this.f21932a == 0) {
            interfaceC4207u0 = new C3671p4(interfaceC4207u0, this.f21937f);
        }
        this.f21943l = interfaceC4207u0;
    }
}
