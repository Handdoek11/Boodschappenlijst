package g0;

import g0.d;
import g0.i;
import java.util.ArrayList;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5796b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f35915e;

    /* renamed from: a, reason: collision with root package name */
    i f35911a = null;

    /* renamed from: b, reason: collision with root package name */
    float f35912b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f35913c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f35914d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f35916f = false;

    /* renamed from: g0.b$a */
    public interface a {
        void a(i iVar, float f8);

        int b();

        float c(i iVar, boolean z7);

        void clear();

        boolean d(i iVar);

        i e(int i8);

        void f(i iVar, float f8, boolean z7);

        void g();

        float h(int i8);

        float i(C5796b c5796b, boolean z7);

        float j(i iVar);

        void k(float f8);
    }

    public C5796b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f35962D <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int b8 = this.f35915e.b();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < b8; i8++) {
            float h8 = this.f35915e.h(i8);
            if (h8 < 0.0f) {
                i e8 = this.f35915e.e(i8);
                if ((zArr == null || !zArr[e8.f35969t]) && e8 != iVar && (((aVar = e8.f35959A) == i.a.SLACK || aVar == i.a.ERROR) && h8 < f8)) {
                    f8 = h8;
                    iVar2 = e8;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f35973x) {
            return;
        }
        this.f35912b += iVar.f35972w * this.f35915e.j(iVar);
        this.f35915e.c(iVar, z7);
        if (z7) {
            iVar.g(this);
        }
        if (d.f35923u && this.f35915e.b() == 0) {
            this.f35916f = true;
            dVar.f35929b = true;
        }
    }

    public void B(d dVar, C5796b c5796b, boolean z7) {
        this.f35912b += c5796b.f35912b * this.f35915e.i(c5796b, z7);
        if (z7) {
            c5796b.f35911a.g(this);
        }
        if (d.f35923u && this.f35911a != null && this.f35915e.b() == 0) {
            this.f35916f = true;
            dVar.f35929b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f35963E) {
            return;
        }
        float j8 = this.f35915e.j(iVar);
        this.f35912b += iVar.f35965G * j8;
        this.f35915e.c(iVar, z7);
        if (z7) {
            iVar.g(this);
        }
        this.f35915e.f(dVar.f35942o.f35920d[iVar.f35964F], j8, z7);
        if (d.f35923u && this.f35915e.b() == 0) {
            this.f35916f = true;
            dVar.f35929b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f35935h.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int b8 = this.f35915e.b();
            for (int i8 = 0; i8 < b8; i8++) {
                i e8 = this.f35915e.e(i8);
                if (e8.f35970u != -1 || e8.f35973x || e8.f35963E) {
                    this.f35914d.add(e8);
                }
            }
            int size = this.f35914d.size();
            if (size > 0) {
                for (int i9 = 0; i9 < size; i9++) {
                    i iVar = (i) this.f35914d.get(i9);
                    if (iVar.f35973x) {
                        A(dVar, iVar, true);
                    } else if (iVar.f35963E) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f35935h[iVar.f35970u], true);
                    }
                }
                this.f35914d.clear();
            } else {
                z7 = true;
            }
        }
        if (d.f35923u && this.f35911a != null && this.f35915e.b() == 0) {
            this.f35916f = true;
            dVar.f35929b = true;
        }
    }

    @Override // g0.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // g0.d.a
    public void b(d.a aVar) {
        if (aVar instanceof C5796b) {
            C5796b c5796b = (C5796b) aVar;
            this.f35911a = null;
            this.f35915e.clear();
            for (int i8 = 0; i8 < c5796b.f35915e.b(); i8++) {
                this.f35915e.f(c5796b.f35915e.e(i8), c5796b.f35915e.h(i8), true);
            }
        }
    }

    @Override // g0.d.a
    public void c(i iVar) {
        int i8 = iVar.f35971v;
        float f8 = 1.0f;
        if (i8 != 1) {
            if (i8 == 2) {
                f8 = 1000.0f;
            } else if (i8 == 3) {
                f8 = 1000000.0f;
            } else if (i8 == 4) {
                f8 = 1.0E9f;
            } else if (i8 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.f35915e.a(iVar, f8);
    }

    @Override // g0.d.a
    public void clear() {
        this.f35915e.clear();
        this.f35911a = null;
        this.f35912b = 0.0f;
    }

    public C5796b d(d dVar, int i8) {
        this.f35915e.a(dVar.o(i8, "ep"), 1.0f);
        this.f35915e.a(dVar.o(i8, "em"), -1.0f);
        return this;
    }

    C5796b e(i iVar, int i8) {
        this.f35915e.a(iVar, i8);
        return this;
    }

    boolean f(d dVar) {
        boolean z7;
        i g8 = g(dVar);
        if (g8 == null) {
            z7 = true;
        } else {
            x(g8);
            z7 = false;
        }
        if (this.f35915e.b() == 0) {
            this.f35916f = true;
        }
        return z7;
    }

    i g(d dVar) {
        int b8 = this.f35915e.b();
        i iVar = null;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        i iVar2 = null;
        for (int i8 = 0; i8 < b8; i8++) {
            float h8 = this.f35915e.h(i8);
            i e8 = this.f35915e.e(i8);
            if (e8.f35959A == i.a.UNRESTRICTED) {
                if (iVar == null || f8 > h8) {
                    boolean u7 = u(e8, dVar);
                    z7 = u7;
                    f8 = h8;
                    iVar = e8;
                } else if (!z7 && u(e8, dVar)) {
                    f8 = h8;
                    iVar = e8;
                    z7 = true;
                }
            } else if (iVar == null && h8 < 0.0f) {
                if (iVar2 == null || f9 > h8) {
                    boolean u8 = u(e8, dVar);
                    z8 = u8;
                    f9 = h8;
                    iVar2 = e8;
                } else if (!z8 && u(e8, dVar)) {
                    f9 = h8;
                    iVar2 = e8;
                    z8 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // g0.d.a
    public i getKey() {
        return this.f35911a;
    }

    C5796b h(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9) {
        if (iVar2 == iVar3) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar4, 1.0f);
            this.f35915e.a(iVar2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
            this.f35915e.a(iVar3, -1.0f);
            this.f35915e.a(iVar4, 1.0f);
            if (i8 > 0 || i9 > 0) {
                this.f35912b = (-i8) + i9;
            }
        } else if (f8 <= 0.0f) {
            this.f35915e.a(iVar, -1.0f);
            this.f35915e.a(iVar2, 1.0f);
            this.f35912b = i8;
        } else if (f8 >= 1.0f) {
            this.f35915e.a(iVar4, -1.0f);
            this.f35915e.a(iVar3, 1.0f);
            this.f35912b = -i9;
        } else {
            float f9 = 1.0f - f8;
            this.f35915e.a(iVar, f9 * 1.0f);
            this.f35915e.a(iVar2, f9 * (-1.0f));
            this.f35915e.a(iVar3, (-1.0f) * f8);
            this.f35915e.a(iVar4, 1.0f * f8);
            if (i8 > 0 || i9 > 0) {
                this.f35912b = ((-i8) * f9) + (i9 * f8);
            }
        }
        return this;
    }

    C5796b i(i iVar, int i8) {
        this.f35911a = iVar;
        float f8 = i8;
        iVar.f35972w = f8;
        this.f35912b = f8;
        this.f35916f = true;
        return this;
    }

    @Override // g0.d.a
    public boolean isEmpty() {
        return this.f35911a == null && this.f35912b == 0.0f && this.f35915e.b() == 0;
    }

    C5796b j(i iVar, i iVar2, float f8) {
        this.f35915e.a(iVar, -1.0f);
        this.f35915e.a(iVar2, f8);
        return this;
    }

    public C5796b k(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f35915e.a(iVar, -1.0f);
        this.f35915e.a(iVar2, 1.0f);
        this.f35915e.a(iVar3, f8);
        this.f35915e.a(iVar4, -f8);
        return this;
    }

    public C5796b l(float f8, float f9, float f10, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f35912b = 0.0f;
        if (f9 == 0.0f || f8 == f10) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
            this.f35915e.a(iVar4, 1.0f);
            this.f35915e.a(iVar3, -1.0f);
        } else if (f8 == 0.0f) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
        } else if (f10 == 0.0f) {
            this.f35915e.a(iVar3, 1.0f);
            this.f35915e.a(iVar4, -1.0f);
        } else {
            float f11 = (f8 / f9) / (f10 / f9);
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
            this.f35915e.a(iVar4, f11);
            this.f35915e.a(iVar3, -f11);
        }
        return this;
    }

    public C5796b m(i iVar, int i8) {
        if (i8 < 0) {
            this.f35912b = i8 * (-1);
            this.f35915e.a(iVar, 1.0f);
        } else {
            this.f35912b = i8;
            this.f35915e.a(iVar, -1.0f);
        }
        return this;
    }

    public C5796b n(i iVar, i iVar2, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f35912b = i8;
        }
        if (z7) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
        } else {
            this.f35915e.a(iVar, -1.0f);
            this.f35915e.a(iVar2, 1.0f);
        }
        return this;
    }

    public C5796b o(i iVar, i iVar2, i iVar3, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f35912b = i8;
        }
        if (z7) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
            this.f35915e.a(iVar3, -1.0f);
        } else {
            this.f35915e.a(iVar, -1.0f);
            this.f35915e.a(iVar2, 1.0f);
            this.f35915e.a(iVar3, 1.0f);
        }
        return this;
    }

    public C5796b p(i iVar, i iVar2, i iVar3, int i8) {
        boolean z7 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z7 = true;
            }
            this.f35912b = i8;
        }
        if (z7) {
            this.f35915e.a(iVar, 1.0f);
            this.f35915e.a(iVar2, -1.0f);
            this.f35915e.a(iVar3, 1.0f);
        } else {
            this.f35915e.a(iVar, -1.0f);
            this.f35915e.a(iVar2, 1.0f);
            this.f35915e.a(iVar3, -1.0f);
        }
        return this;
    }

    public C5796b q(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f35915e.a(iVar3, 0.5f);
        this.f35915e.a(iVar4, 0.5f);
        this.f35915e.a(iVar, -0.5f);
        this.f35915e.a(iVar2, -0.5f);
        this.f35912b = -f8;
        return this;
    }

    void r() {
        float f8 = this.f35912b;
        if (f8 < 0.0f) {
            this.f35912b = f8 * (-1.0f);
            this.f35915e.g();
        }
    }

    boolean s() {
        i iVar = this.f35911a;
        return iVar != null && (iVar.f35959A == i.a.UNRESTRICTED || this.f35912b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f35915e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f35911a;
        if (iVar2 != null) {
            this.f35915e.a(iVar2, -1.0f);
            this.f35911a.f35970u = -1;
            this.f35911a = null;
        }
        float c8 = this.f35915e.c(iVar, true) * (-1.0f);
        this.f35911a = iVar;
        if (c8 == 1.0f) {
            return;
        }
        this.f35912b /= c8;
        this.f35915e.k(c8);
    }

    public void y() {
        this.f35911a = null;
        this.f35915e.clear();
        this.f35912b = 0.0f;
        this.f35916f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C5796b.z():java.lang.String");
    }

    public C5796b(C5797c c5797c) {
        this.f35915e = new C5795a(this, c5797c);
    }
}
