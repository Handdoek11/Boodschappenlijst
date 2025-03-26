package L0;

import I6.p;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public abstract class g {

    static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f3686o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3687s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ p f3688t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, A6.d dVar) {
            super(2, dVar);
            this.f3688t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            a aVar = new a(this.f3688t, dVar);
            aVar.f3687s = obj;
            return aVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, A6.d dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f3686o;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L0.a aVar = (L0.a) this.f3687s;
                q.b(obj);
                return aVar;
            }
            q.b(obj);
            L0.a c8 = ((d) this.f3687s).c();
            p pVar = this.f3688t;
            this.f3687s = c8;
            this.f3686o = 1;
            return pVar.invoke(c8, this) == e8 ? e8 : c8;
        }
    }

    public static final Object a(I0.e eVar, p pVar, A6.d dVar) {
        return eVar.a(new a(pVar, null), dVar);
    }
}
