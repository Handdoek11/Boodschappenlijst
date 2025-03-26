package l3;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.InterfaceC0369c;
import android.content.Context;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.api.ApiException;

/* loaded from: classes.dex */
public final class r implements S2.b {

    /* renamed from: a, reason: collision with root package name */
    private final S2.b f38803a;

    /* renamed from: b, reason: collision with root package name */
    private final S2.b f38804b;

    public r(Context context) {
        this.f38803a = new p(context, C1109h.f());
        this.f38804b = l.d(context);
    }

    public static /* synthetic */ AbstractC0376j b(r rVar, AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s() || abstractC0376j.q()) {
            return abstractC0376j;
        }
        Exception n8 = abstractC0376j.n();
        if (!(n8 instanceof ApiException)) {
            return abstractC0376j;
        }
        int b8 = ((ApiException) n8).b();
        return (b8 == 43001 || b8 == 43002 || b8 == 43003 || b8 == 17) ? rVar.f38804b.a() : b8 == 43000 ? AbstractC0379m.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : b8 != 15 ? abstractC0376j : AbstractC0379m.d(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // S2.b
    public final AbstractC0376j a() {
        return this.f38803a.a().l(new InterfaceC0369c() { // from class: l3.q
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j) {
                return r.b(this.f38802a, abstractC0376j);
            }
        });
    }
}
