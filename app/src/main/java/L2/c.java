package l2;

/* loaded from: classes.dex */
public final class c implements InterfaceC6171b {

    /* renamed from: b, reason: collision with root package name */
    private static final c f38782b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f38783a;

    private c(Object obj) {
        this.f38783a = obj;
    }

    public static InterfaceC6171b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // w6.InterfaceC6894a
    public Object get() {
        return this.f38783a;
    }
}
