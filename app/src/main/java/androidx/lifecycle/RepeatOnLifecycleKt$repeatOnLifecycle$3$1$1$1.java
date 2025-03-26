package androidx.lifecycle;

import U6.AbstractC0723k;
import U6.InterfaceC0731o;
import U6.InterfaceC0745v0;
import androidx.lifecycle.AbstractC0922h;
import x6.C6916E;
import x6.C6934p;

/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0922h.a f10273o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ J6.G f10274s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ U6.M f10275t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ AbstractC0922h.a f10276u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ InterfaceC0731o f10277v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ e7.a f10278w;

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ I6.p f10279x;

    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        Object f10280o;

        /* renamed from: s, reason: collision with root package name */
        Object f10281s;

        /* renamed from: t, reason: collision with root package name */
        int f10282t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ e7.a f10283u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ I6.p f10284v;

        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a, reason: collision with other inner class name */
        static final class C0169a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f10285o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f10286s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ I6.p f10287t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0169a(I6.p pVar, A6.d dVar) {
                super(2, dVar);
                this.f10287t = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                C0169a c0169a = new C0169a(this.f10287t, dVar);
                c0169a.f10286s = obj;
                return c0169a;
            }

            @Override // I6.p
            public final Object invoke(U6.M m8, A6.d dVar) {
                return ((C0169a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f10285o;
                if (i8 == 0) {
                    x6.q.b(obj);
                    U6.M m8 = (U6.M) this.f10286s;
                    I6.p pVar = this.f10287t;
                    this.f10285o = 1;
                    if (pVar.invoke(m8, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e7.a aVar, I6.p pVar, A6.d dVar) {
            super(2, dVar);
            this.f10283u = aVar;
            this.f10284v = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return new a(this.f10283u, this.f10284v, dVar);
        }

        @Override // I6.p
        public final Object invoke(U6.M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e7.a aVar;
            I6.p pVar;
            e7.a aVar2;
            Throwable th;
            Object e8 = B6.b.e();
            int i8 = this.f10282t;
            try {
                if (i8 == 0) {
                    x6.q.b(obj);
                    aVar = this.f10283u;
                    pVar = this.f10284v;
                    this.f10280o = aVar;
                    this.f10281s = pVar;
                    this.f10282t = 1;
                    if (aVar.a(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (e7.a) this.f10280o;
                        try {
                            x6.q.b(obj);
                            C6916E c6916e = C6916E.f44463a;
                            aVar2.c(null);
                            return C6916E.f44463a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.c(null);
                            throw th;
                        }
                    }
                    pVar = (I6.p) this.f10281s;
                    e7.a aVar3 = (e7.a) this.f10280o;
                    x6.q.b(obj);
                    aVar = aVar3;
                }
                C0169a c0169a = new C0169a(pVar, null);
                this.f10280o = aVar;
                this.f10281s = null;
                this.f10282t = 2;
                if (U6.N.e(c0169a, this) == e8) {
                    return e8;
                }
                aVar2 = aVar;
                C6916E c6916e2 = C6916E.f44463a;
                aVar2.c(null);
                return C6916E.f44463a;
            } catch (Throwable th3) {
                aVar2 = aVar;
                th = th3;
                aVar2.c(null);
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public final void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "<anonymous parameter 0>");
        J6.r.e(aVar, "event");
        if (aVar == this.f10273o) {
            this.f10274s.f3547o = AbstractC0723k.d(this.f10275t, null, null, new a(this.f10278w, this.f10279x, null), 3, null);
            return;
        }
        if (aVar == this.f10276u) {
            InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) this.f10274s.f3547o;
            if (interfaceC0745v0 != null) {
                InterfaceC0745v0.a.a(interfaceC0745v0, null, 1, null);
            }
            this.f10274s.f3547o = null;
        }
        if (aVar == AbstractC0922h.a.ON_DESTROY) {
            InterfaceC0731o interfaceC0731o = this.f10277v;
            C6934p.a aVar2 = C6934p.f44487s;
            interfaceC0731o.resumeWith(C6934p.b(C6916E.f44463a));
        }
    }
}
