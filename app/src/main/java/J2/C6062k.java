package j2;

import java.util.concurrent.Executor;
import l2.InterfaceC6171b;

/* renamed from: j2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6062k implements InterfaceC6171b {

    /* renamed from: j2.k$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C6062k f38208a = new C6062k();
    }

    public static C6062k a() {
        return a.f38208a;
    }

    public static Executor b() {
        return (Executor) l2.d.d(AbstractC6061j.a());
    }

    @Override // w6.InterfaceC6894a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
