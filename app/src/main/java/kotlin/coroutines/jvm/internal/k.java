package kotlin.coroutines.jvm.internal;

import J6.H;
import J6.InterfaceC0653m;
import J6.r;

/* loaded from: classes2.dex */
public abstract class k extends j implements InterfaceC0653m {

    /* renamed from: o, reason: collision with root package name */
    private final int f38759o;

    public k(int i8, A6.d dVar) {
        super(dVar);
        this.f38759o = i8;
    }

    @Override // J6.InterfaceC0653m
    public int getArity() {
        return this.f38759o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String g8 = H.g(this);
        r.d(g8, "renderLambdaToString(...)");
        return g8;
    }
}
