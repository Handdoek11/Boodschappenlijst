package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private static final H f9308a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final H f9309b = new I();

    static H a() {
        return f9308a;
    }

    static H b() {
        return f9309b;
    }

    private static H c() {
        try {
            return (H) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
