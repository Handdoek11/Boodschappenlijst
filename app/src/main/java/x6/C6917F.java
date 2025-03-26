package x6;

import java.io.Serializable;

/* renamed from: x6.F, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6917F implements InterfaceC6928j, Serializable {

    /* renamed from: o, reason: collision with root package name */
    private I6.a f44464o;

    /* renamed from: s, reason: collision with root package name */
    private Object f44465s;

    public C6917F(I6.a aVar) {
        J6.r.e(aVar, "initializer");
        this.f44464o = aVar;
        this.f44465s = C6913B.f44457a;
    }

    @Override // x6.InterfaceC6928j
    public boolean c() {
        return this.f44465s != C6913B.f44457a;
    }

    @Override // x6.InterfaceC6928j
    public Object getValue() {
        if (this.f44465s == C6913B.f44457a) {
            I6.a aVar = this.f44464o;
            J6.r.b(aVar);
            this.f44465s = aVar.invoke();
            this.f44464o = null;
        }
        return this.f44465s;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
