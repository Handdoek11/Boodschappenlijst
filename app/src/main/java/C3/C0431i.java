package C3;

import A3.AbstractC0376j;
import A3.C0377k;
import B3.AbstractC0383b;
import B3.InterfaceC0382a;
import Z2.AbstractC0764c;
import Z2.AbstractC0778q;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC1093e;
import com.google.android.gms.common.api.internal.C1092d;
import com.google.android.gms.common.api.internal.C1095g;

/* renamed from: C3.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0431i extends AbstractC0383b {

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC0382a f977k;

    public C0431i(Context context, b.a aVar) {
        super(context, aVar);
        this.f977k = new C0416d();
    }

    private final AbstractC0376j A(final C1092d c1092d, final AbstractC0383b.a aVar, final IntentFilter[] intentFilterArr) {
        return l(C1095g.a().g(c1092d).b(new X2.j() { // from class: C3.f
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((Z1) obj).l0(new O1((C0377k) obj2), aVar, c1092d, intentFilterArr);
            }
        }).f(new X2.j() { // from class: C3.g
            @Override // X2.j
            public final void accept(Object obj, Object obj2) {
                ((Z1) obj).n0(new N1((C0377k) obj2), aVar);
            }
        }).e(24013).a());
    }

    @Override // B3.AbstractC0383b
    public final AbstractC0376j y(AbstractC0383b.a aVar, String str) {
        AbstractC0764c.a(aVar, "listener must not be null");
        AbstractC0764c.a(str, "capability must not be null");
        IntentFilter a8 = P1.a("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        a8.addDataPath(str, 0);
        return A(AbstractC1093e.a(aVar, r(), "CapabilityListener:".concat(String.valueOf(str))), new C0428h(aVar, str), new IntentFilter[]{a8});
    }

    @Override // B3.AbstractC0383b
    public final AbstractC0376j z(String str, int i8) {
        AbstractC0764c.a(str, "capability must not be null");
        com.google.android.gms.common.api.c g8 = g();
        boolean z7 = true;
        if (i8 != 0) {
            if (i8 == 1) {
                i8 = 1;
            } else {
                z7 = false;
            }
        }
        InterfaceC0382a interfaceC0382a = this.f977k;
        Z2.r.a(z7);
        return AbstractC0778q.a(g8.a(new v2((C0416d) interfaceC0382a, g8, str, i8)), new AbstractC0778q.a() { // from class: C3.e
            @Override // Z2.AbstractC0778q.a
            public final Object a(W2.f fVar) {
                return ((InterfaceC0382a.b) fVar).b0();
            }
        });
    }
}
