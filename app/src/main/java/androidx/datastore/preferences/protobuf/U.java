package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class U {

    /* renamed from: a, reason: collision with root package name */
    private static final S f9333a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final S f9334b = new T();

    static S a() {
        return f9333a;
    }

    static S b() {
        return f9334b;
    }

    private static S c() {
        try {
            return (S) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
