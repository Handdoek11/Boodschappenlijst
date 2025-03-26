package T0;

import J6.r;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.I;

/* loaded from: classes.dex */
public final class b implements H.b {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f5163a;

    public b(f... fVarArr) {
        r.e(fVarArr, "initializers");
        this.f5163a = fVarArr;
    }

    @Override // androidx.lifecycle.H.b
    public /* synthetic */ G a(Class cls) {
        return I.a(this, cls);
    }

    @Override // androidx.lifecycle.H.b
    public G b(Class cls, a aVar) {
        r.e(cls, "modelClass");
        r.e(aVar, "extras");
        G g8 = null;
        for (f fVar : this.f5163a) {
            if (r.a(fVar.a(), cls)) {
                Object invoke = fVar.b().invoke(aVar);
                g8 = invoke instanceof G ? (G) invoke : null;
            }
        }
        if (g8 != null) {
            return g8;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
