package k7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class P extends C6151s0 {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f38643m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(String str, K k8) {
        super(str, k8, 1);
        J6.r.e(str, "name");
        J6.r.e(k8, "generatedSerializer");
        this.f38643m = true;
    }

    @Override // k7.C6151s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P) {
            i7.f fVar = (i7.f) obj;
            if (J6.r.a(a(), fVar.a())) {
                P p8 = (P) obj;
                if (p8.i() && Arrays.equals(r(), p8.r()) && g() == fVar.g()) {
                    int g8 = g();
                    for (int i8 = 0; i8 < g8; i8++) {
                        if (J6.r.a(k(i8).a(), fVar.k(i8).a()) && J6.r.a(k(i8).e(), fVar.k(i8).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k7.C6151s0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // k7.C6151s0, i7.f
    public boolean i() {
        return this.f38643m;
    }
}
