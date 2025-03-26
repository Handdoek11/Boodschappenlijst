package t2;

import l2.InterfaceC6171b;

/* loaded from: classes.dex */
public final class c implements InterfaceC6171b {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f43868a = new c();
    }

    public static c a() {
        return a.f43868a;
    }

    public static InterfaceC6791a b() {
        return (InterfaceC6791a) l2.d.d(b.a());
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6791a get() {
        return b();
    }
}
