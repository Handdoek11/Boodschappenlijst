package J6;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class s implements InterfaceC0653m, Serializable {
    private final int arity;

    public s(int i8) {
        this.arity = i8;
    }

    @Override // J6.InterfaceC0653m
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String h8 = H.h(this);
        r.d(h8, "renderLambdaToString(...)");
        return h8;
    }
}
