package B5;

import I5.C0628b;
import I5.C0638l;
import J5.b;
import J6.H;
import U6.A;
import U6.N;
import java.util.concurrent.CancellationException;
import v5.C6841a;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final q7.a f510a = S5.a.a("io.ktor.client.plugins.defaultTransformers");

    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        int f511o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f512s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f513t;

        /* renamed from: B5.d$a$a, reason: collision with other inner class name */
        public static final class C0011a extends b.a {

            /* renamed from: a, reason: collision with root package name */
            private final C0628b f514a;

            /* renamed from: b, reason: collision with root package name */
            private final long f515b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f516c;

            C0011a(C0628b c0628b, Object obj) {
                this.f516c = obj;
                this.f514a = c0628b == null ? C0628b.a.f3225a.b() : c0628b;
                this.f515b = ((byte[]) obj).length;
            }

            @Override // J5.b
            public Long a() {
                return Long.valueOf(this.f515b);
            }

            @Override // J5.b
            public C0628b b() {
                return this.f514a;
            }

            @Override // J5.b.a
            public byte[] d() {
                return (byte[]) this.f516c;
            }
        }

        public static final class b extends b.c {

            /* renamed from: a, reason: collision with root package name */
            private final Long f517a;

            /* renamed from: b, reason: collision with root package name */
            private final C0628b f518b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f519c;

            b(T5.e eVar, C0628b c0628b, Object obj) {
                this.f519c = obj;
                String i8 = ((E5.c) eVar.b()).a().i(I5.o.f3324a.g());
                this.f517a = i8 != null ? Long.valueOf(Long.parseLong(i8)) : null;
                this.f518b = c0628b == null ? C0628b.a.f3225a.b() : c0628b;
            }

            @Override // J5.b
            public Long a() {
                return this.f517a;
            }

            @Override // J5.b
            public C0628b b() {
                return this.f518b;
            }

            @Override // J5.b.c
            public io.ktor.utils.io.f d() {
                return (io.ktor.utils.io.f) this.f519c;
            }
        }

        a(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, Object obj, A6.d dVar) {
            a aVar = new a(dVar);
            aVar.f512s = eVar;
            aVar.f513t = obj;
            return aVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            J5.b c0011a;
            Object e8 = B6.b.e();
            int i8 = this.f511o;
            if (i8 == 0) {
                x6.q.b(obj);
                T5.e eVar = (T5.e) this.f512s;
                Object obj2 = this.f513t;
                C0638l a8 = ((E5.c) eVar.b()).a();
                I5.o oVar = I5.o.f3324a;
                if (a8.i(oVar.c()) == null) {
                    ((E5.c) eVar.b()).a().g(oVar.c(), "*/*");
                }
                C0628b d8 = I5.s.d((I5.r) eVar.b());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (d8 == null) {
                        d8 = C0628b.c.f3248a.a();
                    }
                    c0011a = new J5.c(str, d8, null, 4, null);
                } else {
                    c0011a = obj2 instanceof byte[] ? new C0011a(d8, obj2) : obj2 instanceof io.ktor.utils.io.f ? new b(eVar, d8, obj2) : obj2 instanceof J5.b ? (J5.b) obj2 : e.a(d8, (E5.c) eVar.b(), obj2);
                }
                if ((c0011a != null ? c0011a.b() : null) != null) {
                    ((E5.c) eVar.b()).a().k(oVar.h());
                    d.f510a.b("Transformed with default transformers request body for " + ((E5.c) eVar.b()).i() + " from " + H.b(obj2.getClass()));
                    this.f512s = null;
                    this.f511o = 1;
                    if (eVar.e(c0011a, this) == e8) {
                        return e8;
                    }
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

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        Object f520o;

        /* renamed from: s, reason: collision with root package name */
        Object f521s;

        /* renamed from: t, reason: collision with root package name */
        int f522t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f523u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f524v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            int f525o;

            /* renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f526s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f527t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ F5.c f528u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, F5.c cVar, A6.d dVar) {
                super(2, dVar);
                this.f527t = obj;
                this.f528u = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                a aVar = new a(this.f527t, this.f528u, dVar);
                aVar.f526s = obj;
                return aVar;
            }

            @Override // I6.p
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.utils.io.q qVar, A6.d dVar) {
                return ((a) create(qVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f525o;
                try {
                    if (i8 != 0) {
                        try {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            x6.q.b(obj);
                        } catch (Throwable th) {
                            F5.e.c(this.f528u);
                            throw th;
                        }
                    } else {
                        x6.q.b(obj);
                        io.ktor.utils.io.q qVar = (io.ktor.utils.io.q) this.f526s;
                        io.ktor.utils.io.f fVar = (io.ktor.utils.io.f) this.f527t;
                        io.ktor.utils.io.i g8 = qVar.g();
                        this.f525o = 1;
                        if (io.ktor.utils.io.g.b(fVar, g8, Long.MAX_VALUE, this) == e8) {
                            return e8;
                        }
                    }
                    F5.e.c(this.f528u);
                    return C6916E.f44463a;
                } catch (CancellationException e9) {
                    N.c(this.f528u, e9);
                    throw e9;
                } catch (Throwable th2) {
                    N.b(this.f528u, "Receive failed", th2);
                    throw th2;
                }
            }
        }

        /* renamed from: B5.d$b$b, reason: collision with other inner class name */
        static final class C0012b extends J6.s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ A f529o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0012b(A a8) {
                super(1);
                this.f529o = a8;
            }

            public final void b(Throwable th) {
                this.f529o.T();
            }

            @Override // I6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return C6916E.f44463a;
            }
        }

        b(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
            b bVar = new b(dVar2);
            bVar.f523u = eVar;
            bVar.f524v = dVar;
            return bVar.invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x015e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x024a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x02dd  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 810
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: B5.d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void b(C6841a c6841a) {
        J6.r.e(c6841a, "<this>");
        c6841a.j().l(E5.f.f2186g.b(), new a(null));
        c6841a.l().l(F5.f.f2401g.a(), new b(null));
        e.b(c6841a);
    }
}
