package androidx.lifecycle;

import androidx.lifecycle.H;

/* loaded from: classes.dex */
public abstract /* synthetic */ class I {
    public static G a(H.b bVar, Class cls) {
        J6.r.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static G b(H.b bVar, Class cls, T0.a aVar) {
        J6.r.e(cls, "modelClass");
        J6.r.e(aVar, "extras");
        return bVar.a(cls);
    }
}
