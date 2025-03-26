package x6;

import J6.AbstractC0650j;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class r implements InterfaceC6928j, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final a f44490u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f44491v = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "s");

    /* renamed from: o, reason: collision with root package name */
    private volatile I6.a f44492o;

    /* renamed from: s, reason: collision with root package name */
    private volatile Object f44493s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f44494t;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public r(I6.a aVar) {
        J6.r.e(aVar, "initializer");
        this.f44492o = aVar;
        C6913B c6913b = C6913B.f44457a;
        this.f44493s = c6913b;
        this.f44494t = c6913b;
    }

    @Override // x6.InterfaceC6928j
    public boolean c() {
        return this.f44493s != C6913B.f44457a;
    }

    @Override // x6.InterfaceC6928j
    public Object getValue() {
        Object obj = this.f44493s;
        C6913B c6913b = C6913B.f44457a;
        if (obj != c6913b) {
            return obj;
        }
        I6.a aVar = this.f44492o;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            if (androidx.concurrent.futures.b.a(f44491v, this, c6913b, invoke)) {
                this.f44492o = null;
                return invoke;
            }
        }
        return this.f44493s;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
