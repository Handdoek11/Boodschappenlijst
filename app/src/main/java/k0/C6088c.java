package k0;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6088c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f38406k;

    /* renamed from: l, reason: collision with root package name */
    private int f38407l;

    public C6088c(j0.e eVar, int i8) {
        super(eVar);
        this.f38406k = new ArrayList();
        this.f38474f = i8;
        q();
    }

    private void q() {
        j0.e eVar;
        j0.e eVar2 = this.f38470b;
        j0.e L7 = eVar2.L(this.f38474f);
        while (true) {
            j0.e eVar3 = L7;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                L7 = eVar2.L(this.f38474f);
            }
        }
        this.f38470b = eVar;
        this.f38406k.add(eVar.N(this.f38474f));
        j0.e J7 = eVar.J(this.f38474f);
        while (J7 != null) {
            this.f38406k.add(J7.N(this.f38474f));
            J7 = J7.J(this.f38474f);
        }
        Iterator it = this.f38406k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i8 = this.f38474f;
            if (i8 == 0) {
                pVar.f38470b.f37946c = this;
            } else if (i8 == 1) {
                pVar.f38470b.f37948d = this;
            }
        }
        if (this.f38474f == 0 && ((j0.f) this.f38470b.K()).R1() && this.f38406k.size() > 1) {
            ArrayList arrayList = this.f38406k;
            this.f38470b = ((p) arrayList.get(arrayList.size() - 1)).f38470b;
        }
        this.f38407l = this.f38474f == 0 ? this.f38470b.z() : this.f38470b.S();
    }

    private j0.e r() {
        for (int i8 = 0; i8 < this.f38406k.size(); i8++) {
            p pVar = (p) this.f38406k.get(i8);
            if (pVar.f38470b.V() != 8) {
                return pVar.f38470b;
            }
        }
        return null;
    }

    private j0.e s() {
        for (int size = this.f38406k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f38406k.get(size);
            if (pVar.f38470b.V() != 8) {
                return pVar.f38470b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    @Override // k0.p, k0.InterfaceC6089d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(k0.InterfaceC6089d r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C6088c.a(k0.d):void");
    }

    @Override // k0.p
    void d() {
        Iterator it = this.f38406k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f38406k.size();
        if (size < 1) {
            return;
        }
        j0.e eVar = ((p) this.f38406k.get(0)).f38470b;
        j0.e eVar2 = ((p) this.f38406k.get(size - 1)).f38470b;
        if (this.f38474f == 0) {
            j0.d dVar = eVar.f37930O;
            j0.d dVar2 = eVar2.f37932Q;
            C6091f i8 = i(dVar, 0);
            int f8 = dVar.f();
            j0.e r8 = r();
            if (r8 != null) {
                f8 = r8.f37930O.f();
            }
            if (i8 != null) {
                b(this.f38476h, i8, f8);
            }
            C6091f i9 = i(dVar2, 0);
            int f9 = dVar2.f();
            j0.e s8 = s();
            if (s8 != null) {
                f9 = s8.f37932Q.f();
            }
            if (i9 != null) {
                b(this.f38477i, i9, -f9);
            }
        } else {
            j0.d dVar3 = eVar.f37931P;
            j0.d dVar4 = eVar2.f37933R;
            C6091f i10 = i(dVar3, 1);
            int f10 = dVar3.f();
            j0.e r9 = r();
            if (r9 != null) {
                f10 = r9.f37931P.f();
            }
            if (i10 != null) {
                b(this.f38476h, i10, f10);
            }
            C6091f i11 = i(dVar4, 1);
            int f11 = dVar4.f();
            j0.e s9 = s();
            if (s9 != null) {
                f11 = s9.f37933R.f();
            }
            if (i11 != null) {
                b(this.f38477i, i11, -f11);
            }
        }
        this.f38476h.f38417a = this;
        this.f38477i.f38417a = this;
    }

    @Override // k0.p
    public void e() {
        for (int i8 = 0; i8 < this.f38406k.size(); i8++) {
            ((p) this.f38406k.get(i8)).e();
        }
    }

    @Override // k0.p
    void f() {
        this.f38471c = null;
        Iterator it = this.f38406k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // k0.p
    public long j() {
        int size = this.f38406k.size();
        long j8 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            j8 = j8 + r4.f38476h.f38422f + ((p) this.f38406k.get(i8)).j() + r4.f38477i.f38422f;
        }
        return j8;
    }

    @Override // k0.p
    boolean m() {
        int size = this.f38406k.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!((p) this.f38406k.get(i8)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f38474f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f38406k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
