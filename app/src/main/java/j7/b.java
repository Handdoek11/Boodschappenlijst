package j7;

import J6.r;
import g7.h;
import j7.d;
import j7.f;
import k7.C6134j0;

/* loaded from: classes2.dex */
public abstract class b implements f, d {
    @Override // j7.d
    public final void A(i7.f fVar, int i8, boolean z7) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            m(z7);
        }
    }

    @Override // j7.d
    public final f B(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return F(fVar, i8) ? D(fVar.k(i8)) : C6134j0.f38695a;
    }

    @Override // j7.f
    public abstract void C(long j8);

    @Override // j7.f
    public f D(i7.f fVar) {
        r.e(fVar, "descriptor");
        return this;
    }

    @Override // j7.f
    public abstract void E(String str);

    public boolean F(i7.f fVar, int i8) {
        r.e(fVar, "descriptor");
        return true;
    }

    @Override // j7.d
    public void c(i7.f fVar) {
        r.e(fVar, "descriptor");
    }

    @Override // j7.f
    public d d(i7.f fVar) {
        r.e(fVar, "descriptor");
        return this;
    }

    @Override // j7.d
    public boolean e(i7.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    @Override // j7.d
    public final void g(i7.f fVar, int i8, String str) {
        r.e(fVar, "descriptor");
        r.e(str, "value");
        if (F(fVar, i8)) {
            E(str);
        }
    }

    @Override // j7.d
    public final void h(i7.f fVar, int i8, int i9) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            z(i9);
        }
    }

    @Override // j7.f
    public abstract void i(double d8);

    @Override // j7.f
    public abstract void j(short s8);

    @Override // j7.f
    public abstract void l(byte b8);

    @Override // j7.f
    public abstract void m(boolean z7);

    @Override // j7.f
    public void n(h hVar, Object obj) {
        f.a.c(this, hVar, obj);
    }

    @Override // j7.f
    public abstract void o(float f8);

    @Override // j7.d
    public void p(i7.f fVar, int i8, h hVar, Object obj) {
        r.e(fVar, "descriptor");
        r.e(hVar, "serializer");
        if (F(fVar, i8)) {
            n(hVar, obj);
        }
    }

    @Override // j7.f
    public abstract void q(char c8);

    @Override // j7.d
    public final void r(i7.f fVar, int i8, char c8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            q(c8);
        }
    }

    @Override // j7.f
    public void s() {
        f.a.b(this);
    }

    @Override // j7.d
    public final void t(i7.f fVar, int i8, double d8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            i(d8);
        }
    }

    @Override // j7.d
    public final void u(i7.f fVar, int i8, long j8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            C(j8);
        }
    }

    @Override // j7.d
    public final void v(i7.f fVar, int i8, byte b8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            l(b8);
        }
    }

    @Override // j7.d
    public final void w(i7.f fVar, int i8, float f8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            o(f8);
        }
    }

    @Override // j7.f
    public d x(i7.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // j7.d
    public final void y(i7.f fVar, int i8, short s8) {
        r.e(fVar, "descriptor");
        if (F(fVar, i8)) {
            j(s8);
        }
    }

    @Override // j7.f
    public abstract void z(int i8);
}
