package f7;

import A3.AbstractC0376j;
import A3.C0368b;
import A3.InterfaceC0371e;
import A6.d;
import I6.l;
import J6.s;
import U6.C0733p;
import U6.InterfaceC0731o;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import x6.C6916E;
import x6.C6934p;
import x6.q;

/* loaded from: classes2.dex */
public abstract class b {

    static final class a implements InterfaceC0371e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0731o f35897a;

        a(InterfaceC0731o interfaceC0731o) {
            this.f35897a = interfaceC0731o;
        }

        @Override // A3.InterfaceC0371e
        public final void a(AbstractC0376j abstractC0376j) {
            Exception n8 = abstractC0376j.n();
            if (n8 != null) {
                InterfaceC0731o interfaceC0731o = this.f35897a;
                C6934p.a aVar = C6934p.f44487s;
                interfaceC0731o.resumeWith(C6934p.b(q.a(n8)));
            } else {
                if (abstractC0376j.q()) {
                    InterfaceC0731o.a.a(this.f35897a, null, 1, null);
                    return;
                }
                InterfaceC0731o interfaceC0731o2 = this.f35897a;
                C6934p.a aVar2 = C6934p.f44487s;
                interfaceC0731o2.resumeWith(C6934p.b(abstractC0376j.o()));
            }
        }
    }

    /* renamed from: f7.b$b, reason: collision with other inner class name */
    static final class C0257b extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C0368b f35898o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0257b(C0368b c0368b) {
            super(1);
            this.f35898o = c0368b;
        }

        public final void b(Throwable th) {
            this.f35898o.a();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    public static final Object a(AbstractC0376j abstractC0376j, d dVar) {
        return b(abstractC0376j, null, dVar);
    }

    private static final Object b(AbstractC0376j abstractC0376j, C0368b c0368b, d dVar) {
        if (!abstractC0376j.r()) {
            C0733p c0733p = new C0733p(B6.b.c(dVar), 1);
            c0733p.C();
            abstractC0376j.d(f7.a.f35896o, new a(c0733p));
            if (c0368b != null) {
                c0733p.q(new C0257b(c0368b));
            }
            Object z7 = c0733p.z();
            if (z7 == B6.b.e()) {
                h.c(dVar);
            }
            return z7;
        }
        Exception n8 = abstractC0376j.n();
        if (n8 != null) {
            throw n8;
        }
        if (!abstractC0376j.q()) {
            return abstractC0376j.o();
        }
        throw new CancellationException("Task " + abstractC0376j + " was cancelled normally.");
    }
}
