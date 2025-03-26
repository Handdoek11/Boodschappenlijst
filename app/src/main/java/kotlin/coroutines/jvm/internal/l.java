package kotlin.coroutines.jvm.internal;

import J6.H;
import J6.InterfaceC0653m;
import J6.r;

/* loaded from: classes2.dex */
public abstract class l extends d implements InterfaceC0653m {
    private final int arity;

    public l(int i8, A6.d dVar) {
        super(dVar);
        this.arity = i8;
    }

    @Override // J6.InterfaceC0653m
    public int getArity() {
        return this.arity;
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
