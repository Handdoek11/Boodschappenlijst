package g0;

import g0.i;
import j0.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f35921s = false;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f35922t = true;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f35923u = true;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f35924v = true;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f35925w = false;

    /* renamed from: x, reason: collision with root package name */
    public static long f35926x;

    /* renamed from: y, reason: collision with root package name */
    public static long f35927y;

    /* renamed from: e, reason: collision with root package name */
    private a f35932e;

    /* renamed from: o, reason: collision with root package name */
    final C5797c f35942o;

    /* renamed from: r, reason: collision with root package name */
    private a f35945r;

    /* renamed from: a, reason: collision with root package name */
    private int f35928a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35929b = false;

    /* renamed from: c, reason: collision with root package name */
    int f35930c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f35931d = null;

    /* renamed from: f, reason: collision with root package name */
    private int f35933f = 32;

    /* renamed from: g, reason: collision with root package name */
    private int f35934g = 32;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35936i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35937j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean[] f35938k = new boolean[32];

    /* renamed from: l, reason: collision with root package name */
    int f35939l = 1;

    /* renamed from: m, reason: collision with root package name */
    int f35940m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f35941n = 32;

    /* renamed from: p, reason: collision with root package name */
    private i[] f35943p = new i[1000];

    /* renamed from: q, reason: collision with root package name */
    private int f35944q = 0;

    /* renamed from: h, reason: collision with root package name */
    C5796b[] f35935h = new C5796b[32];

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    static class b extends C5796b {
        b(C5797c c5797c) {
            this.f35915e = new j(this, c5797c);
        }
    }

    public d() {
        D();
        C5797c c5797c = new C5797c();
        this.f35942o = c5797c;
        this.f35932e = new h(c5797c);
        if (f35925w) {
            this.f35945r = new b(c5797c);
        } else {
            this.f35945r = new C5796b(c5797c);
        }
    }

    private int C(a aVar, boolean z7) {
        for (int i8 = 0; i8 < this.f35939l; i8++) {
            this.f35938k[i8] = false;
        }
        boolean z8 = false;
        int i9 = 0;
        while (!z8) {
            i9++;
            if (i9 >= this.f35939l * 2) {
                return i9;
            }
            if (aVar.getKey() != null) {
                this.f35938k[aVar.getKey().f35969t] = true;
            }
            i a8 = aVar.a(this, this.f35938k);
            if (a8 != null) {
                boolean[] zArr = this.f35938k;
                int i10 = a8.f35969t;
                if (zArr[i10]) {
                    return i9;
                }
                zArr[i10] = true;
            }
            if (a8 != null) {
                float f8 = Float.MAX_VALUE;
                int i11 = -1;
                for (int i12 = 0; i12 < this.f35940m; i12++) {
                    C5796b c5796b = this.f35935h[i12];
                    if (c5796b.f35911a.f35959A != i.a.UNRESTRICTED && !c5796b.f35916f && c5796b.t(a8)) {
                        float j8 = c5796b.f35915e.j(a8);
                        if (j8 < 0.0f) {
                            float f9 = (-c5796b.f35912b) / j8;
                            if (f9 < f8) {
                                i11 = i12;
                                f8 = f9;
                            }
                        }
                    }
                }
                if (i11 > -1) {
                    C5796b c5796b2 = this.f35935h[i11];
                    c5796b2.f35911a.f35970u = -1;
                    c5796b2.x(a8);
                    i iVar = c5796b2.f35911a;
                    iVar.f35970u = i11;
                    iVar.l(this, c5796b2);
                }
            } else {
                z8 = true;
            }
        }
        return i9;
    }

    private void D() {
        int i8 = 0;
        if (f35925w) {
            while (i8 < this.f35940m) {
                C5796b c5796b = this.f35935h[i8];
                if (c5796b != null) {
                    this.f35942o.f35917a.a(c5796b);
                }
                this.f35935h[i8] = null;
                i8++;
            }
            return;
        }
        while (i8 < this.f35940m) {
            C5796b c5796b2 = this.f35935h[i8];
            if (c5796b2 != null) {
                this.f35942o.f35918b.a(c5796b2);
            }
            this.f35935h[i8] = null;
            i8++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f35942o.f35919c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.k(aVar, str);
        } else {
            iVar.h();
            iVar.k(aVar, str);
        }
        int i8 = this.f35944q;
        int i9 = this.f35928a;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            this.f35928a = i10;
            this.f35943p = (i[]) Arrays.copyOf(this.f35943p, i10);
        }
        i[] iVarArr = this.f35943p;
        int i11 = this.f35944q;
        this.f35944q = i11 + 1;
        iVarArr[i11] = iVar;
        return iVar;
    }

    private void l(C5796b c5796b) {
        int i8;
        if (f35923u && c5796b.f35916f) {
            c5796b.f35911a.i(this, c5796b.f35912b);
        } else {
            C5796b[] c5796bArr = this.f35935h;
            int i9 = this.f35940m;
            c5796bArr[i9] = c5796b;
            i iVar = c5796b.f35911a;
            iVar.f35970u = i9;
            this.f35940m = i9 + 1;
            iVar.l(this, c5796b);
        }
        if (f35923u && this.f35929b) {
            int i10 = 0;
            while (i10 < this.f35940m) {
                if (this.f35935h[i10] == null) {
                    System.out.println("WTF");
                }
                C5796b c5796b2 = this.f35935h[i10];
                if (c5796b2 != null && c5796b2.f35916f) {
                    c5796b2.f35911a.i(this, c5796b2.f35912b);
                    if (f35925w) {
                        this.f35942o.f35917a.a(c5796b2);
                    } else {
                        this.f35942o.f35918b.a(c5796b2);
                    }
                    this.f35935h[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i8 = this.f35940m;
                        if (i11 >= i8) {
                            break;
                        }
                        C5796b[] c5796bArr2 = this.f35935h;
                        int i13 = i11 - 1;
                        C5796b c5796b3 = c5796bArr2[i11];
                        c5796bArr2[i13] = c5796b3;
                        i iVar2 = c5796b3.f35911a;
                        if (iVar2.f35970u == i11) {
                            iVar2.f35970u = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i8) {
                        this.f35935h[i12] = null;
                    }
                    this.f35940m = i8 - 1;
                    i10--;
                }
                i10++;
            }
            this.f35929b = false;
        }
    }

    private void n() {
        for (int i8 = 0; i8 < this.f35940m; i8++) {
            C5796b c5796b = this.f35935h[i8];
            c5796b.f35911a.f35972w = c5796b.f35912b;
        }
    }

    public static C5796b s(d dVar, i iVar, i iVar2, float f8) {
        return dVar.r().j(iVar, iVar2, f8);
    }

    private int u(a aVar) {
        for (int i8 = 0; i8 < this.f35940m; i8++) {
            C5796b c5796b = this.f35935h[i8];
            if (c5796b.f35911a.f35959A != i.a.UNRESTRICTED && c5796b.f35912b < 0.0f) {
                boolean z7 = false;
                int i9 = 0;
                while (!z7) {
                    i9++;
                    float f8 = Float.MAX_VALUE;
                    int i10 = 0;
                    int i11 = -1;
                    int i12 = -1;
                    int i13 = 0;
                    while (true) {
                        if (i10 >= this.f35940m) {
                            break;
                        }
                        C5796b c5796b2 = this.f35935h[i10];
                        if (c5796b2.f35911a.f35959A != i.a.UNRESTRICTED && !c5796b2.f35916f && c5796b2.f35912b < 0.0f) {
                            int i14 = 9;
                            if (f35924v) {
                                int b8 = c5796b2.f35915e.b();
                                int i15 = 0;
                                while (i15 < b8) {
                                    i e8 = c5796b2.f35915e.e(i15);
                                    float j8 = c5796b2.f35915e.j(e8);
                                    if (j8 > 0.0f) {
                                        int i16 = 0;
                                        while (i16 < i14) {
                                            float f9 = e8.f35974y[i16] / j8;
                                            if ((f9 < f8 && i16 == i13) || i16 > i13) {
                                                i13 = i16;
                                                i12 = e8.f35969t;
                                                i11 = i10;
                                                f8 = f9;
                                            }
                                            i16++;
                                            i14 = 9;
                                        }
                                    }
                                    i15++;
                                    i14 = 9;
                                }
                            } else {
                                for (int i17 = 1; i17 < this.f35939l; i17++) {
                                    i iVar = this.f35942o.f35920d[i17];
                                    float j9 = c5796b2.f35915e.j(iVar);
                                    if (j9 > 0.0f) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f10 = iVar.f35974y[i18] / j9;
                                            if ((f10 < f8 && i18 == i13) || i18 > i13) {
                                                i11 = i10;
                                                i12 = i17;
                                                i13 = i18;
                                                f8 = f10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i10++;
                    }
                    if (i11 != -1) {
                        C5796b c5796b3 = this.f35935h[i11];
                        c5796b3.f35911a.f35970u = -1;
                        c5796b3.x(this.f35942o.f35920d[i12]);
                        i iVar2 = c5796b3.f35911a;
                        iVar2.f35970u = i11;
                        iVar2.l(this, c5796b3);
                    } else {
                        z7 = true;
                    }
                    if (i9 > this.f35939l / 2) {
                        z7 = true;
                    }
                }
                return i9;
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i8 = this.f35933f * 2;
        this.f35933f = i8;
        this.f35935h = (C5796b[]) Arrays.copyOf(this.f35935h, i8);
        C5797c c5797c = this.f35942o;
        c5797c.f35920d = (i[]) Arrays.copyOf(c5797c.f35920d, this.f35933f);
        int i9 = this.f35933f;
        this.f35938k = new boolean[i9];
        this.f35934g = i9;
        this.f35941n = i9;
    }

    public void A() {
        if (this.f35932e.isEmpty()) {
            n();
            return;
        }
        if (!this.f35936i && !this.f35937j) {
            B(this.f35932e);
            return;
        }
        for (int i8 = 0; i8 < this.f35940m; i8++) {
            if (!this.f35935h[i8].f35916f) {
                B(this.f35932e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        C5797c c5797c;
        int i8 = 0;
        while (true) {
            c5797c = this.f35942o;
            i[] iVarArr = c5797c.f35920d;
            if (i8 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i8];
            if (iVar != null) {
                iVar.h();
            }
            i8++;
        }
        c5797c.f35919c.c(this.f35943p, this.f35944q);
        this.f35944q = 0;
        Arrays.fill(this.f35942o.f35920d, (Object) null);
        HashMap hashMap = this.f35931d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f35930c = 0;
        this.f35932e.clear();
        this.f35939l = 1;
        for (int i9 = 0; i9 < this.f35940m; i9++) {
            C5796b c5796b = this.f35935h[i9];
            if (c5796b != null) {
                c5796b.f35913c = false;
            }
        }
        D();
        this.f35940m = 0;
        if (f35925w) {
            this.f35945r = new b(this.f35942o);
        } else {
            this.f35945r = new C5796b(this.f35942o);
        }
    }

    public void b(j0.e eVar, j0.e eVar2, float f8, int i8) {
        d.a aVar = d.a.LEFT;
        i q8 = q(eVar.o(aVar));
        d.a aVar2 = d.a.TOP;
        i q9 = q(eVar.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        i q10 = q(eVar.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        i q11 = q(eVar.o(aVar4));
        i q12 = q(eVar2.o(aVar));
        i q13 = q(eVar2.o(aVar2));
        i q14 = q(eVar2.o(aVar3));
        i q15 = q(eVar2.o(aVar4));
        C5796b r8 = r();
        double d8 = f8;
        double d9 = i8;
        r8.q(q9, q11, q13, q15, (float) (Math.sin(d8) * d9));
        d(r8);
        C5796b r9 = r();
        r9.q(q8, q10, q12, q14, (float) (Math.cos(d8) * d9));
        d(r9);
    }

    public void c(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9, int i10) {
        C5796b r8 = r();
        r8.h(iVar, iVar2, i8, f8, iVar3, iVar4, i9);
        if (i10 != 8) {
            r8.d(this, i10);
        }
        d(r8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(g0.C5796b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f35940m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f35941n
            if (r0 >= r2) goto L12
            int r0 = r5.f35939l
            int r0 = r0 + r1
            int r2 = r5.f35934g
            if (r0 < r2) goto L15
        L12:
            r5.z()
        L15:
            boolean r0 = r6.f35916f
            r2 = 0
            if (r0 != 0) goto L84
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7b
            g0.i r0 = r5.p()
            r6.f35911a = r0
            int r3 = r5.f35940m
            r5.l(r6)
            int r4 = r5.f35940m
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            g0.d$a r2 = r5.f35945r
            r2.b(r6)
            g0.d$a r2 = r5.f35945r
            r5.C(r2, r1)
            int r2 = r0.f35970u
            r3 = -1
            if (r2 != r3) goto L7c
            g0.i r2 = r6.f35911a
            if (r2 != r0) goto L59
            g0.i r0 = r6.v(r0)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f35916f
            if (r0 != 0) goto L62
            g0.i r0 = r6.f35911a
            r0.l(r5, r6)
        L62:
            boolean r0 = g0.d.f35925w
            if (r0 == 0) goto L6e
            g0.c r0 = r5.f35942o
            g0.f r0 = r0.f35917a
            r0.a(r6)
            goto L75
        L6e:
            g0.c r0 = r5.f35942o
            g0.f r0 = r0.f35918b
            r0.a(r6)
        L75:
            int r0 = r5.f35940m
            int r0 = r0 - r1
            r5.f35940m = r0
            goto L7c
        L7b:
            r1 = r2
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r2 = r1
        L84:
            if (r2 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.d(g0.b):void");
    }

    public C5796b e(i iVar, i iVar2, int i8, int i9) {
        if (f35922t && i9 == 8 && iVar2.f35973x && iVar.f35970u == -1) {
            iVar.i(this, iVar2.f35972w + i8);
            return null;
        }
        C5796b r8 = r();
        r8.n(iVar, iVar2, i8);
        if (i9 != 8) {
            r8.d(this, i9);
        }
        d(r8);
        return r8;
    }

    public void f(i iVar, int i8) {
        if (f35922t && iVar.f35970u == -1) {
            float f8 = i8;
            iVar.i(this, f8);
            for (int i9 = 0; i9 < this.f35930c + 1; i9++) {
                i iVar2 = this.f35942o.f35920d[i9];
                if (iVar2 != null && iVar2.f35963E && iVar2.f35964F == iVar.f35969t) {
                    iVar2.i(this, iVar2.f35965G + f8);
                }
            }
            return;
        }
        int i10 = iVar.f35970u;
        if (i10 == -1) {
            C5796b r8 = r();
            r8.i(iVar, i8);
            d(r8);
            return;
        }
        C5796b c5796b = this.f35935h[i10];
        if (c5796b.f35916f) {
            c5796b.f35912b = i8;
            return;
        }
        if (c5796b.f35915e.b() == 0) {
            c5796b.f35916f = true;
            c5796b.f35912b = i8;
        } else {
            C5796b r9 = r();
            r9.m(iVar, i8);
            d(r9);
        }
    }

    public void g(i iVar, i iVar2, int i8, boolean z7) {
        C5796b r8 = r();
        i t7 = t();
        t7.f35971v = 0;
        r8.o(iVar, iVar2, t7, i8);
        d(r8);
    }

    public void h(i iVar, i iVar2, int i8, int i9) {
        C5796b r8 = r();
        i t7 = t();
        t7.f35971v = 0;
        r8.o(iVar, iVar2, t7, i8);
        if (i9 != 8) {
            m(r8, (int) (r8.f35915e.j(t7) * (-1.0f)), i9);
        }
        d(r8);
    }

    public void i(i iVar, i iVar2, int i8, boolean z7) {
        C5796b r8 = r();
        i t7 = t();
        t7.f35971v = 0;
        r8.p(iVar, iVar2, t7, i8);
        d(r8);
    }

    public void j(i iVar, i iVar2, int i8, int i9) {
        C5796b r8 = r();
        i t7 = t();
        t7.f35971v = 0;
        r8.p(iVar, iVar2, t7, i8);
        if (i9 != 8) {
            m(r8, (int) (r8.f35915e.j(t7) * (-1.0f)), i9);
        }
        d(r8);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f8, int i8) {
        C5796b r8 = r();
        r8.k(iVar, iVar2, iVar3, iVar4, f8);
        if (i8 != 8) {
            r8.d(this, i8);
        }
        d(r8);
    }

    void m(C5796b c5796b, int i8, int i9) {
        c5796b.e(o(i9, null), i8);
    }

    public i o(int i8, String str) {
        if (this.f35939l + 1 >= this.f35934g) {
            z();
        }
        i a8 = a(i.a.ERROR, str);
        int i9 = this.f35930c + 1;
        this.f35930c = i9;
        this.f35939l++;
        a8.f35969t = i9;
        a8.f35971v = i8;
        this.f35942o.f35920d[i9] = a8;
        this.f35932e.c(a8);
        return a8;
    }

    public i p() {
        if (this.f35939l + 1 >= this.f35934g) {
            z();
        }
        i a8 = a(i.a.SLACK, null);
        int i8 = this.f35930c + 1;
        this.f35930c = i8;
        this.f35939l++;
        a8.f35969t = i8;
        this.f35942o.f35920d[i8] = a8;
        return a8;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f35939l + 1 >= this.f35934g) {
            z();
        }
        if (obj instanceof j0.d) {
            j0.d dVar = (j0.d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f35942o);
                iVar = dVar.i();
            }
            int i8 = iVar.f35969t;
            if (i8 == -1 || i8 > this.f35930c || this.f35942o.f35920d[i8] == null) {
                if (i8 != -1) {
                    iVar.h();
                }
                int i9 = this.f35930c + 1;
                this.f35930c = i9;
                this.f35939l++;
                iVar.f35969t = i9;
                iVar.f35959A = i.a.UNRESTRICTED;
                this.f35942o.f35920d[i9] = iVar;
            }
        }
        return iVar;
    }

    public C5796b r() {
        C5796b c5796b;
        if (f35925w) {
            c5796b = (C5796b) this.f35942o.f35917a.b();
            if (c5796b == null) {
                c5796b = new b(this.f35942o);
                f35927y++;
            } else {
                c5796b.y();
            }
        } else {
            c5796b = (C5796b) this.f35942o.f35918b.b();
            if (c5796b == null) {
                c5796b = new C5796b(this.f35942o);
                f35926x++;
            } else {
                c5796b.y();
            }
        }
        i.f();
        return c5796b;
    }

    public i t() {
        if (this.f35939l + 1 >= this.f35934g) {
            z();
        }
        i a8 = a(i.a.SLACK, null);
        int i8 = this.f35930c + 1;
        this.f35930c = i8;
        this.f35939l++;
        a8.f35969t = i8;
        this.f35942o.f35920d[i8] = a8;
        return a8;
    }

    public C5797c w() {
        return this.f35942o;
    }

    public int y(Object obj) {
        i i8 = ((j0.d) obj).i();
        if (i8 != null) {
            return (int) (i8.f35972w + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
