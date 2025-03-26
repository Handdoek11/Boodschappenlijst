package A6;

import A6.g;
import I6.p;
import J6.r;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final h f250o = new h();

    private h() {
    }

    @Override // A6.g
    public g.b d(g.c cVar) {
        r.e(cVar, "key");
        return null;
    }

    @Override // A6.g
    public Object e(Object obj, p pVar) {
        r.e(pVar, "operation");
        return obj;
    }

    @Override // A6.g
    public g f(g.c cVar) {
        r.e(cVar, "key");
        return this;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // A6.g
    public g u(g gVar) {
        r.e(gVar, "context");
        return gVar;
    }
}
