package h5;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import g5.AbstractC5808a;

/* loaded from: classes2.dex */
public abstract class d extends AbstractC5842b {
    public d(AbstractC5808a abstractC5808a) {
        super(abstractC5808a);
    }

    @Override // h5.AbstractC5842b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void g(C5841a c5841a, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemAddAnimMgr", "dispatchAddStarting(" + f8 + ")");
        }
        this.f36240a.B(f8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.AbstractC5842b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean l(C5841a c5841a, RecyclerView.F f8) {
        RecyclerView.F f9 = c5841a.f36238a;
        if (f9 == null) {
            return false;
        }
        if (f8 != null && f9 != f8) {
            return false;
        }
        r(c5841a, f9);
        e(c5841a, c5841a.f36238a);
        c5841a.a(c5841a.f36238a);
        return true;
    }

    public long C() {
        return this.f36240a.l();
    }

    public abstract boolean y(RecyclerView.F f8);

    @Override // h5.AbstractC5842b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void e(C5841a c5841a, RecyclerView.F f8) {
        if (d()) {
            Log.d("ARVItemAddAnimMgr", "dispatchAddFinished(" + f8 + ")");
        }
        this.f36240a.A(f8);
    }
}
