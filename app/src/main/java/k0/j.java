package k0;

/* loaded from: classes.dex */
class j extends p {
    j(j0.e eVar) {
        super(eVar);
        eVar.f37950e.f();
        eVar.f37952f.f();
        this.f38474f = ((j0.h) eVar).t1();
    }

    private void q(C6091f c6091f) {
        this.f38476h.f38427k.add(c6091f);
        c6091f.f38428l.add(this.f38476h);
    }

    @Override // k0.p, k0.InterfaceC6089d
    public void a(InterfaceC6089d interfaceC6089d) {
        C6091f c6091f = this.f38476h;
        if (c6091f.f38419c && !c6091f.f38426j) {
            this.f38476h.d((int) ((((C6091f) c6091f.f38428l.get(0)).f38423g * ((j0.h) this.f38470b).w1()) + 0.5f));
        }
    }

    @Override // k0.p
    void d() {
        j0.h hVar = (j0.h) this.f38470b;
        int u12 = hVar.u1();
        int v12 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (u12 != -1) {
                this.f38476h.f38428l.add(this.f38470b.f37943a0.f37950e.f38476h);
                this.f38470b.f37943a0.f37950e.f38476h.f38427k.add(this.f38476h);
                this.f38476h.f38422f = u12;
            } else if (v12 != -1) {
                this.f38476h.f38428l.add(this.f38470b.f37943a0.f37950e.f38477i);
                this.f38470b.f37943a0.f37950e.f38477i.f38427k.add(this.f38476h);
                this.f38476h.f38422f = -v12;
            } else {
                C6091f c6091f = this.f38476h;
                c6091f.f38418b = true;
                c6091f.f38428l.add(this.f38470b.f37943a0.f37950e.f38477i);
                this.f38470b.f37943a0.f37950e.f38477i.f38427k.add(this.f38476h);
            }
            q(this.f38470b.f37950e.f38476h);
            q(this.f38470b.f37950e.f38477i);
            return;
        }
        if (u12 != -1) {
            this.f38476h.f38428l.add(this.f38470b.f37943a0.f37952f.f38476h);
            this.f38470b.f37943a0.f37952f.f38476h.f38427k.add(this.f38476h);
            this.f38476h.f38422f = u12;
        } else if (v12 != -1) {
            this.f38476h.f38428l.add(this.f38470b.f37943a0.f37952f.f38477i);
            this.f38470b.f37943a0.f37952f.f38477i.f38427k.add(this.f38476h);
            this.f38476h.f38422f = -v12;
        } else {
            C6091f c6091f2 = this.f38476h;
            c6091f2.f38418b = true;
            c6091f2.f38428l.add(this.f38470b.f37943a0.f37952f.f38477i);
            this.f38470b.f37943a0.f37952f.f38477i.f38427k.add(this.f38476h);
        }
        q(this.f38470b.f37952f.f38476h);
        q(this.f38470b.f37952f.f38477i);
    }

    @Override // k0.p
    public void e() {
        if (((j0.h) this.f38470b).t1() == 1) {
            this.f38470b.n1(this.f38476h.f38423g);
        } else {
            this.f38470b.o1(this.f38476h.f38423g);
        }
    }

    @Override // k0.p
    void f() {
        this.f38476h.c();
    }

    @Override // k0.p
    boolean m() {
        return false;
    }
}
