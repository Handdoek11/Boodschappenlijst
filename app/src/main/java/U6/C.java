package U6;

import J6.AbstractC0650j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class C {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f5373b = AtomicIntegerFieldUpdater.newUpdater(C.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5374a;

    public C(Throwable th, boolean z7) {
        this.f5374a = th;
        this._handled = z7 ? 1 : 0;
    }

    public final boolean a() {
        return f5373b.get(this) != 0;
    }

    public final boolean b() {
        return f5373b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return Q.a(this) + '[' + this.f5374a + ']';
    }

    public /* synthetic */ C(Throwable th, boolean z7, int i8, AbstractC0650j abstractC0650j) {
        this(th, (i8 & 2) != 0 ? false : z7);
    }
}
