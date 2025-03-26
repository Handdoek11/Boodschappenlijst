package k0;

import j0.C6049a;
import java.util.Iterator;
import k0.C6091f;

/* loaded from: classes.dex */
class k extends p {
    k(j0.e eVar) {
        super(eVar);
    }

    private void q(C6091f c6091f) {
        this.f38476h.f38427k.add(c6091f);
        c6091f.f38428l.add(this.f38476h);
    }

    @Override // k0.p, k0.InterfaceC6089d
    public void a(InterfaceC6089d interfaceC6089d) {
        C6049a c6049a = (C6049a) this.f38470b;
        int w12 = c6049a.w1();
        Iterator it = this.f38476h.f38428l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C6091f) it.next()).f38423g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (w12 == 0 || w12 == 2) {
            this.f38476h.d(i9 + c6049a.x1());
        } else {
            this.f38476h.d(i8 + c6049a.x1());
        }
    }

    @Override // k0.p
    void d() {
        j0.e eVar = this.f38470b;
        if (eVar instanceof C6049a) {
            this.f38476h.f38418b = true;
            C6049a c6049a = (C6049a) eVar;
            int w12 = c6049a.w1();
            boolean v12 = c6049a.v1();
            int i8 = 0;
            if (w12 == 0) {
                this.f38476h.f38421e = C6091f.a.LEFT;
                while (i8 < c6049a.f38083M0) {
                    j0.e eVar2 = c6049a.f38082L0[i8];
                    if (v12 || eVar2.V() != 8) {
                        C6091f c6091f = eVar2.f37950e.f38476h;
                        c6091f.f38427k.add(this.f38476h);
                        this.f38476h.f38428l.add(c6091f);
                    }
                    i8++;
                }
                q(this.f38470b.f37950e.f38476h);
                q(this.f38470b.f37950e.f38477i);
                return;
            }
            if (w12 == 1) {
                this.f38476h.f38421e = C6091f.a.RIGHT;
                while (i8 < c6049a.f38083M0) {
                    j0.e eVar3 = c6049a.f38082L0[i8];
                    if (v12 || eVar3.V() != 8) {
                        C6091f c6091f2 = eVar3.f37950e.f38477i;
                        c6091f2.f38427k.add(this.f38476h);
                        this.f38476h.f38428l.add(c6091f2);
                    }
                    i8++;
                }
                q(this.f38470b.f37950e.f38476h);
                q(this.f38470b.f37950e.f38477i);
                return;
            }
            if (w12 == 2) {
                this.f38476h.f38421e = C6091f.a.TOP;
                while (i8 < c6049a.f38083M0) {
                    j0.e eVar4 = c6049a.f38082L0[i8];
                    if (v12 || eVar4.V() != 8) {
                        C6091f c6091f3 = eVar4.f37952f.f38476h;
                        c6091f3.f38427k.add(this.f38476h);
                        this.f38476h.f38428l.add(c6091f3);
                    }
                    i8++;
                }
                q(this.f38470b.f37952f.f38476h);
                q(this.f38470b.f37952f.f38477i);
                return;
            }
            if (w12 != 3) {
                return;
            }
            this.f38476h.f38421e = C6091f.a.BOTTOM;
            while (i8 < c6049a.f38083M0) {
                j0.e eVar5 = c6049a.f38082L0[i8];
                if (v12 || eVar5.V() != 8) {
                    C6091f c6091f4 = eVar5.f37952f.f38477i;
                    c6091f4.f38427k.add(this.f38476h);
                    this.f38476h.f38428l.add(c6091f4);
                }
                i8++;
            }
            q(this.f38470b.f37952f.f38476h);
            q(this.f38470b.f37952f.f38477i);
        }
    }

    @Override // k0.p
    public void e() {
        j0.e eVar = this.f38470b;
        if (eVar instanceof C6049a) {
            int w12 = ((C6049a) eVar).w1();
            if (w12 == 0 || w12 == 1) {
                this.f38470b.n1(this.f38476h.f38423g);
            } else {
                this.f38470b.o1(this.f38476h.f38423g);
            }
        }
    }

    @Override // k0.p
    void f() {
        this.f38471c = null;
        this.f38476h.c();
    }

    @Override // k0.p
    boolean m() {
        return false;
    }
}
