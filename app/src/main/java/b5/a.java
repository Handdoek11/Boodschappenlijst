package B5;

import J6.AbstractC0650j;
import v5.C6841a;
import x5.C6911a;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0009a f493a = new C0009a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final N5.a f494b = new N5.a("BodyProgress");

    /* renamed from: B5.a$a, reason: collision with other inner class name */
    public static final class C0009a implements h {
        public /* synthetic */ C0009a(AbstractC0650j abstractC0650j) {
            this();
        }

        @Override // B5.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a aVar, C6841a c6841a) {
            J6.r.e(aVar, "plugin");
            J6.r.e(c6841a, "scope");
            aVar.c(c6841a);
        }

        @Override // B5.h
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(I6.l lVar) {
            J6.r.e(lVar, "block");
            return new a();
        }

        @Override // B5.h
        public N5.a getKey() {
            return a.f494b;
        }

        private C0009a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        int f495o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f496s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f497t;

        b(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, Object obj, A6.d dVar) {
            b bVar = new b(dVar);
            bVar.f496s = eVar;
            bVar.f497t = obj;
            return bVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f495o;
            if (i8 == 0) {
                x6.q.b(obj);
                T5.e eVar = (T5.e) this.f496s;
                Object obj2 = this.f497t;
                I6.q qVar = (I6.q) ((E5.c) eVar.b()).c().c(B5.b.f501a);
                if (qVar == null) {
                    return C6916E.f44463a;
                }
                J6.r.c(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                C6911a c6911a = new C6911a((J5.b) obj2, ((E5.c) eVar.b()).g(), qVar);
                this.f496s = null;
                this.f495o = 1;
                if (eVar.e(c6911a, this) == e8) {
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        int f498o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f499s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f500t;

        c(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, F5.c cVar, A6.d dVar) {
            c cVar2 = new c(dVar);
            cVar2.f499s = eVar;
            cVar2.f500t = cVar;
            return cVar2.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f498o;
            if (i8 == 0) {
                x6.q.b(obj);
                T5.e eVar = (T5.e) this.f499s;
                F5.c cVar = (F5.c) this.f500t;
                I6.q qVar = (I6.q) cVar.M().d().G().c(B5.b.f502b);
                if (qVar == null) {
                    return C6916E.f44463a;
                }
                F5.c c8 = B5.b.c(cVar, qVar);
                this.f499s = null;
                this.f498o = 1;
                if (eVar.e(c8, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C6841a c6841a) {
        T5.h hVar = new T5.h("ObservableContent");
        c6841a.j().j(E5.f.f2186g.b(), hVar);
        c6841a.j().l(hVar, new b(null));
        c6841a.i().l(F5.b.f2391g.a(), new c(null));
    }
}
