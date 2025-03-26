package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0889m {

    /* renamed from: a, reason: collision with root package name */
    static final Class f9430a = c();

    public static C0890n a() {
        if (f9430a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0890n.f9459e;
    }

    private static final C0890n b(String str) {
        return (C0890n) f9430a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
