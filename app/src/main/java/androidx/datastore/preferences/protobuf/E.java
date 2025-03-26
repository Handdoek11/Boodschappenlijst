package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class E implements d0 {

    /* renamed from: b, reason: collision with root package name */
    private static final L f9295b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final L f9296a;

    static class a implements L {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public K a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements L {

        /* renamed from: a, reason: collision with root package name */
        private L[] f9297a;

        b(L... lArr) {
            this.f9297a = lArr;
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public K a(Class cls) {
            for (L l8 : this.f9297a) {
                if (l8.b(cls)) {
                    return l8.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.L
        public boolean b(Class cls) {
            for (L l8 : this.f9297a) {
                if (l8.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public E() {
        this(b());
    }

    private static L b() {
        return new b(C0896u.c(), c());
    }

    private static L c() {
        try {
            return (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f9295b;
        }
    }

    private static boolean d(K k8) {
        return k8.c() == X.PROTO2;
    }

    private static c0 e(Class cls, K k8) {
        return AbstractC0897v.class.isAssignableFrom(cls) ? d(k8) ? P.M(cls, k8, U.b(), C.b(), e0.L(), AbstractC0893q.b(), J.b()) : P.M(cls, k8, U.b(), C.b(), e0.L(), null, J.b()) : d(k8) ? P.M(cls, k8, U.a(), C.a(), e0.G(), AbstractC0893q.a(), J.a()) : P.M(cls, k8, U.a(), C.a(), e0.H(), null, J.a());
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public c0 a(Class cls) {
        e0.I(cls);
        K a8 = this.f9296a.a(cls);
        return a8.a() ? AbstractC0897v.class.isAssignableFrom(cls) ? Q.l(e0.L(), AbstractC0893q.b(), a8.b()) : Q.l(e0.G(), AbstractC0893q.a(), a8.b()) : e(cls, a8);
    }

    private E(L l8) {
        this.f9296a = (L) AbstractC0899x.b(l8, "messageInfoFactory");
    }
}
