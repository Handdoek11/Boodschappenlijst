package m6;

import a6.AbstractC0829f;
import java.util.concurrent.Callable;
import m6.p;

/* loaded from: classes2.dex */
public final class m extends AbstractC0829f implements Callable {

    /* renamed from: o, reason: collision with root package name */
    private final Object f39339o;

    public m(Object obj) {
        this.f39339o = obj;
    }

    @Override // a6.AbstractC0829f
    protected void G(a6.i iVar) {
        p.a aVar = new p.a(iVar, this.f39339o);
        iVar.d(aVar);
        aVar.run();
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f39339o;
    }
}
