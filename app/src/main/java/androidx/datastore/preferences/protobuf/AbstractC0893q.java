package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0893q {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0891o f9503a = new C0892p();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC0891o f9504b = c();

    static AbstractC0891o a() {
        AbstractC0891o abstractC0891o = f9504b;
        if (abstractC0891o != null) {
            return abstractC0891o;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC0891o b() {
        return f9503a;
    }

    private static AbstractC0891o c() {
        try {
            return (AbstractC0891o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
