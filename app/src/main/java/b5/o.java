package B5;

import U6.A;
import U6.AbstractC0751y0;
import U6.InterfaceC0708c0;
import U6.InterfaceC0745v0;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final q7.a f628a = S5.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC0708c0 f629o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0708c0 interfaceC0708c0) {
            super(1);
            this.f629o = interfaceC0708c0;
        }

        public final void b(Throwable th) {
            this.f629o.c();
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ A f630o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A a8) {
            super(1);
            this.f630o = a8;
        }

        public final void b(Throwable th) {
            if (th == null) {
                o.f628a.b("Cancelling request because engine Job completed");
                this.f630o.T();
                return;
            }
            o.f628a.b("Cancelling request because engine Job failed with error: " + th);
            AbstractC0751y0.d(this.f630o, "Engine failed", th);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(A a8, InterfaceC0745v0 interfaceC0745v0) {
        a8.D(new a(interfaceC0745v0.D(new b(a8))));
    }
}
