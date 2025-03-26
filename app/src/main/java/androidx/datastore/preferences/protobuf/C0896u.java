package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0896u implements L {

    /* renamed from: a, reason: collision with root package name */
    private static final C0896u f9578a = new C0896u();

    private C0896u() {
    }

    public static C0896u c() {
        return f9578a;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public K a(Class cls) {
        if (!AbstractC0897v.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (K) AbstractC0897v.u(cls.asSubclass(AbstractC0897v.class)).n();
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e8);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public boolean b(Class cls) {
        return AbstractC0897v.class.isAssignableFrom(cls);
    }
}
