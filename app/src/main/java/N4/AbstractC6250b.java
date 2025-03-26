package n4;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0368b;
import A3.C0377k;
import A3.InterfaceC0369c;
import Z0.m;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6250b {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f39578a = new m();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC0376j b(C0377k c0377k, AtomicBoolean atomicBoolean, C0368b c0368b, AbstractC0376j abstractC0376j) {
        if (abstractC0376j.s()) {
            c0377k.e(abstractC0376j.o());
        } else if (abstractC0376j.n() != null) {
            c0377k.d(abstractC0376j.n());
        } else if (atomicBoolean.getAndSet(true)) {
            c0368b.a();
        }
        return AbstractC0379m.e(null);
    }

    public static AbstractC0376j c(AbstractC0376j abstractC0376j, AbstractC0376j abstractC0376j2) {
        final C0368b c0368b = new C0368b();
        final C0377k c0377k = new C0377k(c0368b.b());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        InterfaceC0369c interfaceC0369c = new InterfaceC0369c() { // from class: n4.a
            @Override // A3.InterfaceC0369c
            public final Object a(AbstractC0376j abstractC0376j3) {
                return AbstractC6250b.b(c0377k, atomicBoolean, c0368b, abstractC0376j3);
            }
        };
        Executor executor = f39578a;
        abstractC0376j.m(executor, interfaceC0369c);
        abstractC0376j2.m(executor, interfaceC0369c);
        return c0377k.a();
    }
}
