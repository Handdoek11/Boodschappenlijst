package m7;

import java.util.Set;
import x6.C6914C;
import y6.P;

/* loaded from: classes2.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f39431a = P.e(h7.a.F(x6.x.f44506s).getDescriptor(), h7.a.G(x6.z.f44511s).getDescriptor(), h7.a.E(x6.v.f44501s).getDescriptor(), h7.a.H(C6914C.f44458s).getDescriptor());

    public static final boolean a(i7.f fVar) {
        J6.r.e(fVar, "<this>");
        return fVar.i() && f39431a.contains(fVar);
    }
}
