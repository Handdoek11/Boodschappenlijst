package Z2;

import android.os.Bundle;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
public final class i0 extends T {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC0765d f6366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(AbstractC0765d abstractC0765d, int i8, Bundle bundle) {
        super(abstractC0765d, i8, null);
        this.f6366g = abstractC0765d;
    }

    @Override // Z2.T
    protected final void f(C1103b c1103b) {
        if (this.f6366g.t() && AbstractC0765d.h0(this.f6366g)) {
            AbstractC0765d.d0(this.f6366g, 16);
        } else {
            this.f6366g.f6299p.a(c1103b);
            this.f6366g.L(c1103b);
        }
    }

    @Override // Z2.T
    protected final boolean g() {
        this.f6366g.f6299p.a(C1103b.f13385v);
        return true;
    }
}
