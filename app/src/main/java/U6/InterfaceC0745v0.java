package U6;

import A6.g;
import java.util.concurrent.CancellationException;

/* renamed from: U6.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0745v0 extends g.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5485d = b.f5486o;

    /* renamed from: U6.v0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC0745v0 interfaceC0745v0, CancellationException cancellationException, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i8 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0745v0.l0(cancellationException);
        }

        public static Object b(InterfaceC0745v0 interfaceC0745v0, Object obj, I6.p pVar) {
            return g.b.a.a(interfaceC0745v0, obj, pVar);
        }

        public static g.b c(InterfaceC0745v0 interfaceC0745v0, g.c cVar) {
            return g.b.a.b(interfaceC0745v0, cVar);
        }

        public static /* synthetic */ InterfaceC0708c0 d(InterfaceC0745v0 interfaceC0745v0, boolean z7, boolean z8, I6.l lVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i8 & 1) != 0) {
                z7 = false;
            }
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return interfaceC0745v0.c0(z7, z8, lVar);
        }

        public static A6.g e(InterfaceC0745v0 interfaceC0745v0, g.c cVar) {
            return g.b.a.c(interfaceC0745v0, cVar);
        }

        public static A6.g f(InterfaceC0745v0 interfaceC0745v0, A6.g gVar) {
            return g.b.a.d(interfaceC0745v0, gVar);
        }
    }

    /* renamed from: U6.v0$b */
    public static final class b implements g.c {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ b f5486o = new b();

        private b() {
        }
    }

    CancellationException A();

    InterfaceC0708c0 D(I6.l lVar);

    Object I(A6.d dVar);

    InterfaceC0742u K(InterfaceC0746w interfaceC0746w);

    InterfaceC0708c0 c0(boolean z7, boolean z8, I6.l lVar);

    InterfaceC0745v0 getParent();

    boolean h();

    boolean isCancelled();

    boolean j();

    void l0(CancellationException cancellationException);

    boolean start();
}
