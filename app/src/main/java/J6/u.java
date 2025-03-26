package J6;

import Q6.h;

/* loaded from: classes2.dex */
public abstract class u extends w implements Q6.f {
    public u(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // Q6.h
    public h.a a() {
        ((Q6.f) j()).a();
        return null;
    }

    @Override // J6.AbstractC0645e
    protected Q6.a c() {
        return H.d(this);
    }

    @Override // I6.l
    public Object invoke(Object obj) {
        return get(obj);
    }
}
