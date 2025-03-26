package Q;

import c0.InterfaceC0973e;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC0973e f4597a = c0.g.b(1.0f, 0.0f, 2, null);

    public static final H b(p pVar) {
        H D7 = pVar.D();
        if (D7 != null) {
            return D7;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
