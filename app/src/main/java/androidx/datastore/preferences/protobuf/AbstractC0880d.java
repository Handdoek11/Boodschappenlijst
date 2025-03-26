package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0880d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f9351a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f9352b;

    static {
        f9352b = a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f9351a;
    }

    static boolean c() {
        return (f9351a == null || f9352b) ? false : true;
    }
}
