package B5;

import I5.t;
import I5.v;
import java.util.Set;
import y6.P;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f621a;

    /* renamed from: b, reason: collision with root package name */
    private static final q7.a f622b;

    static {
        t.a aVar = I5.t.f3376b;
        f621a = P.e(aVar.a(), aVar.b());
        f622b = S5.a.a("io.ktor.client.plugins.HttpRedirect");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(v vVar) {
        int b02 = vVar.b0();
        v.a aVar = v.f3423c;
        return b02 == aVar.s().b0() || b02 == aVar.k().b0() || b02 == aVar.S().b0() || b02 == aVar.F().b0() || b02 == aVar.O().b0();
    }
}
