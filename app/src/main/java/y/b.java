package y;

import J6.r;
import androidx.appcompat.app.E;
import java.util.List;
import t.InterfaceC6766d;

/* loaded from: classes.dex */
public final class b implements InterfaceC6935a {

    /* renamed from: o, reason: collision with root package name */
    private final int f44513o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f44514s;

    /* renamed from: t, reason: collision with root package name */
    private Object f44515t;

    /* renamed from: u, reason: collision with root package name */
    private List f44516u;

    public b(int i8, boolean z7, Object obj) {
        this.f44513o = i8;
        this.f44514s = z7;
        this.f44515t = obj;
    }

    private final void f(InterfaceC6766d interfaceC6766d) {
        if (this.f44514s) {
            interfaceC6766d.b();
        }
    }

    private final void g() {
        List list;
        if (!this.f44514s || (list = this.f44516u) == null) {
            return;
        }
        if (list.size() <= 0) {
            list.clear();
        } else {
            E.a(list.get(0));
            throw null;
        }
    }

    public Object b(Object obj, InterfaceC6766d interfaceC6766d, int i8) {
        interfaceC6766d.f(this.f44513o);
        f(null);
        throw null;
    }

    public Object c(InterfaceC6766d interfaceC6766d, int i8) {
        interfaceC6766d.f(this.f44513o);
        f(null);
        throw null;
    }

    @Override // I6.q
    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        E.a(obj2);
        return b(obj, null, ((Number) obj3).intValue());
    }

    public final void h(Object obj) {
        if (r.a(this.f44515t, obj)) {
            return;
        }
        boolean z7 = this.f44515t == null;
        this.f44515t = obj;
        if (z7) {
            return;
        }
        g();
    }

    @Override // I6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        E.a(obj);
        return c(null, ((Number) obj2).intValue());
    }
}
