package Y6;

import I6.q;
import J6.L;
import J6.o;
import J6.r;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final q f6154a;

    /* synthetic */ class a extends o implements q {

        /* renamed from: A, reason: collision with root package name */
        public static final a f6155A = new a();

        a() {
            super(3, X6.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // I6.q
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final Object d(X6.c cVar, Object obj, A6.d dVar) {
            return cVar.c(obj, dVar);
        }
    }

    static {
        a aVar = a.f6155A;
        r.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f6154a = (q) L.d(aVar, 3);
    }
}
