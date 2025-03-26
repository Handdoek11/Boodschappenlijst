package L0;

import I6.p;
import J6.r;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public final class b implements I0.e {

    /* renamed from: a, reason: collision with root package name */
    private final I0.e f3679a;

    static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f3680o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3681s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ p f3682t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, A6.d dVar) {
            super(2, dVar);
            this.f3682t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            a aVar = new a(this.f3682t, dVar);
            aVar.f3681s = obj;
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
            int i8 = this.f3680o;
            if (i8 == 0) {
                q.b(obj);
                d dVar = (d) this.f3681s;
                p pVar = this.f3682t;
                this.f3680o = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            d dVar2 = (d) obj;
            ((L0.a) dVar2).f();
            return dVar2;
        }
    }

    public b(I0.e eVar) {
        r.e(eVar, "delegate");
        this.f3679a = eVar;
    }

    @Override // I0.e
    public Object a(p pVar, A6.d dVar) {
        return this.f3679a.a(new a(pVar, null), dVar);
    }

    @Override // I0.e
    public X6.b getData() {
        return this.f3679a.getData();
    }
}
