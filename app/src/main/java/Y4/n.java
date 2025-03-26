package Y4;

import Y4.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes2.dex */
final class n extends PhantomReference implements a.InterfaceC0125a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f6113a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f6114b;

    /* synthetic */ n(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, m mVar) {
        super(obj, referenceQueue);
        this.f6113a = set;
        this.f6114b = runnable;
    }

    @Override // Y4.a.InterfaceC0125a
    public final void a() {
        if (this.f6113a.remove(this)) {
            clear();
            this.f6114b.run();
        }
    }
}
