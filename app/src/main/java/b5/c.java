package B5;

import B5.f;
import v5.C6842b;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final N5.a f503a = new N5.a("ValidateMark");

    /* renamed from: b, reason: collision with root package name */
    private static final q7.a f504b = S5.a.a("io.ktor.client.plugins.DefaultResponseValidation");

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C6842b f505o;

        /* renamed from: B5.c$a$a, reason: collision with other inner class name */
        static final class C0010a extends kotlin.coroutines.jvm.internal.l implements I6.p {

            /* renamed from: o, reason: collision with root package name */
            Object f506o;

            /* renamed from: s, reason: collision with root package name */
            int f507s;

            /* renamed from: t, reason: collision with root package name */
            int f508t;

            /* renamed from: u, reason: collision with root package name */
            /* synthetic */ Object f509u;

            C0010a(A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                C0010a c0010a = new C0010a(dVar);
                c0010a.f509u = obj;
                return c0010a;
            }

            @Override // I6.p
            public final Object invoke(F5.c cVar, A6.d dVar) {
                return ((C0010a) create(cVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(8:6|54|7|30|34|(2:39|(1:(1:48)(1:47))(1:43))(1:38)|49|50)(2:9|10))(1:11))(2:12|(2:14|15)(2:16|(2:51|52)(2:21|(1:23)(1:24))))|25|56|26|(1:28)(6:29|30|34|(2:39|(1:(2:45|48)(0))(0))(0)|49|50)|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
            
                r0 = r1;
                r3 = r5;
                r1 = r11;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: B5.c.a.C0010a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6842b c6842b) {
            super(1);
            this.f505o = c6842b;
        }

        public final void b(f.b bVar) {
            J6.r.e(bVar, "$this$HttpResponseValidator");
            bVar.d(this.f505o.d());
            bVar.e(new C0010a(null));
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((f.b) obj);
            return C6916E.f44463a;
        }
    }

    public static final void c(C6842b c6842b) {
        J6.r.e(c6842b, "<this>");
        g.b(c6842b, new a(c6842b));
    }
}
