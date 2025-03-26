package h5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g5.AbstractC5808a;

/* loaded from: classes2.dex */
public abstract class g extends AbstractC5842b {
    public g(AbstractC5808a abstractC5808a) {
        super(abstractC5808a);
    }

    @Override // h5.AbstractC5842b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void g(i iVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemMoveAnimMgr", "dispatchMoveStarting(" + f8 + ")");
        }
        this.f36240a.F(f8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.AbstractC5842b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean l(i iVar, RecyclerView.F f8) {
        RecyclerView.F f9 = iVar.f36256a;
        if (f9 == null) {
            return false;
        }
        if (f8 != null && f9 != f8) {
            return false;
        }
        r(iVar, f9);
        e(iVar, iVar.f36256a);
        iVar.a(iVar.f36256a);
        return true;
    }

    public long C() {
        return this.f36240a.n();
    }

    public abstract boolean y(RecyclerView.F f8, int i8, int i9, int i10, int i11);

    @Override // h5.AbstractC5842b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(i iVar, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemMoveAnimMgr", "dispatchMoveFinished(" + f8 + ")");
        }
        this.f36240a.E(f8);
    }
}
