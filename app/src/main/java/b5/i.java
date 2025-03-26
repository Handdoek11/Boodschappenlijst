package B5;

import v5.C6841a;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final N5.a f577a = new N5.a("ApplicationPluginRegistry");

    public static final N5.a a() {
        return f577a;
    }

    public static final Object b(C6841a c6841a, h hVar) {
        J6.r.e(c6841a, "<this>");
        J6.r.e(hVar, "plugin");
        Object c8 = c(c6841a, hVar);
        if (c8 != null) {
            return c8;
        }
        throw new IllegalStateException("Plugin " + hVar + " is not installed. Consider using `install(" + hVar.getKey() + ")` in client config first.");
    }

    public static final Object c(C6841a c6841a, h hVar) {
        J6.r.e(c6841a, "<this>");
        J6.r.e(hVar, "plugin");
        N5.b bVar = (N5.b) c6841a.G().c(f577a);
        if (bVar != null) {
            return bVar.c(hVar.getKey());
        }
        return null;
    }
}
