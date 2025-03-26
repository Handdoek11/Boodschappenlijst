package x6;

import J6.AbstractC0650j;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class s implements InterfaceC6928j, Serializable {

    /* renamed from: o, reason: collision with root package name */
    private I6.a f44495o;

    /* renamed from: s, reason: collision with root package name */
    private volatile Object f44496s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f44497t;

    public s(I6.a aVar, Object obj) {
        J6.r.e(aVar, "initializer");
        this.f44495o = aVar;
        this.f44496s = C6913B.f44457a;
        this.f44497t = obj == null ? this : obj;
    }

    @Override // x6.InterfaceC6928j
    public boolean c() {
        return this.f44496s != C6913B.f44457a;
    }

    @Override // x6.InterfaceC6928j
    public Object getValue() {
        Object obj;
        Object obj2 = this.f44496s;
        C6913B c6913b = C6913B.f44457a;
        if (obj2 != c6913b) {
            return obj2;
        }
        synchronized (this.f44497t) {
            obj = this.f44496s;
            if (obj == c6913b) {
                I6.a aVar = this.f44495o;
                J6.r.b(aVar);
                obj = aVar.invoke();
                this.f44496s = obj;
                this.f44495o = null;
            }
        }
        return obj;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ s(I6.a aVar, Object obj, int i8, AbstractC0650j abstractC0650j) {
        this(aVar, (i8 & 2) != 0 ? null : obj);
    }
}
