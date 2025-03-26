package k0;

import k0.C6091f;

/* renamed from: k0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6092g extends C6091f {

    /* renamed from: m, reason: collision with root package name */
    public int f38438m;

    C6092g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f38421e = C6091f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f38421e = C6091f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // k0.C6091f
    public void d(int i8) {
        if (this.f38426j) {
            return;
        }
        this.f38426j = true;
        this.f38423g = i8;
        for (InterfaceC6089d interfaceC6089d : this.f38427k) {
            interfaceC6089d.a(interfaceC6089d);
        }
    }
}
