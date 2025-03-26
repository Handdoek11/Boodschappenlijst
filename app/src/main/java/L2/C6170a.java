package l2;

import w6.InterfaceC6894a;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6170a implements InterfaceC6894a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38779c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC6894a f38780a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38781b = f38779c;

    private C6170a(InterfaceC6894a interfaceC6894a) {
        this.f38780a = interfaceC6894a;
    }

    public static InterfaceC6894a a(InterfaceC6894a interfaceC6894a) {
        d.b(interfaceC6894a);
        return interfaceC6894a instanceof C6170a ? interfaceC6894a : new C6170a(interfaceC6894a);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f38779c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // w6.InterfaceC6894a
    public Object get() {
        Object obj = this.f38781b;
        Object obj2 = f38779c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38781b;
                    if (obj == obj2) {
                        obj = this.f38780a.get();
                        this.f38781b = b(this.f38781b, obj);
                        this.f38780a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
