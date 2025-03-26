package h5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g5.AbstractC5808a;

/* loaded from: classes2.dex */
public abstract class h extends AbstractC5842b {
    public h(AbstractC5808a abstractC5808a) {
        super(abstractC5808a);
    }

    @Override // h5.AbstractC5842b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void g(j jVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemRemoveAnimMgr", "dispatchRemoveStarting(" + f8 + ")");
        }
        this.f36240a.H(f8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.AbstractC5842b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean l(j jVar, RecyclerView.F f8) {
        RecyclerView.F f9 = jVar.f36261a;
        if (f9 == null) {
            return false;
        }
        if (f8 != null && f9 != f8) {
            return false;
        }
        r(jVar, f9);
        e(jVar, jVar.f36261a);
        jVar.a(jVar.f36261a);
        return true;
    }

    public long C() {
        return this.f36240a.o();
    }

    public abstract boolean y(RecyclerView.F f8);

    @Override // h5.AbstractC5842b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(j jVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemRemoveAnimMgr", "dispatchRemoveFinished(" + f8 + ")");
        }
        this.f36240a.G(f8);
    }
}
