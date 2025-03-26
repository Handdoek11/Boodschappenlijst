package h5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g5.AbstractC5808a;

/* loaded from: classes2.dex */
public abstract class f extends AbstractC5842b {
    public f(AbstractC5808a abstractC5808a) {
        super(abstractC5808a);
    }

    @Override // h5.AbstractC5842b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void g(c cVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemChangeAnimMgr", "dispatchChangeStarting(" + f8 + ")");
        }
        this.f36240a.D(f8, f8 == cVar.f36251b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.AbstractC5842b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean l(c cVar, RecyclerView.F f8) {
        RecyclerView.F f9 = cVar.f36251b;
        if (f9 != null && (f8 == null || f9 == f8)) {
            r(cVar, f9);
            e(cVar, cVar.f36251b);
            cVar.a(cVar.f36251b);
        }
        RecyclerView.F f10 = cVar.f36250a;
        if (f10 != null && (f8 == null || f10 == f8)) {
            r(cVar, f10);
            e(cVar, cVar.f36250a);
            cVar.a(cVar.f36250a);
        }
        return cVar.f36251b == null && cVar.f36250a == null;
    }

    public long C() {
        return this.f36240a.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.AbstractC5842b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void t(c cVar) {
        if (cVar.f36251b != null) {
            F(cVar);
        }
        if (cVar.f36250a != null) {
            E(cVar);
        }
    }

    protected abstract void E(c cVar);

    protected abstract void F(c cVar);

    public abstract boolean y(RecyclerView.F f8, RecyclerView.F f9, int i8, int i9, int i10, int i11);

    @Override // h5.AbstractC5842b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(c cVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemChangeAnimMgr", "dispatchChangeFinished(" + f8 + ")");
        }
        this.f36240a.C(f8, f8 == cVar.f36251b);
    }
}
