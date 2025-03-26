package j0;

import g0.C5797c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: L0, reason: collision with root package name */
    public ArrayList f38098L0 = new ArrayList();

    public void a(e eVar) {
        this.f38098L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).u1(eVar);
        }
        eVar.d1(this);
    }

    public ArrayList s1() {
        return this.f38098L0;
    }

    @Override // j0.e
    public void t0() {
        this.f38098L0.clear();
        super.t0();
    }

    public abstract void t1();

    public void u1(e eVar) {
        this.f38098L0.remove(eVar);
        eVar.t0();
    }

    public void v1() {
        this.f38098L0.clear();
    }

    @Override // j0.e
    public void w0(C5797c c5797c) {
        super.w0(c5797c);
        int size = this.f38098L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((e) this.f38098L0.get(i8)).w0(c5797c);
        }
    }
}
