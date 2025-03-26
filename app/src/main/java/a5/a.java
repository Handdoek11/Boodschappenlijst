package A5;

import A6.d;
import I6.p;
import J6.r;
import U6.M;
import io.ktor.utils.io.c;
import io.ktor.utils.io.f;
import io.ktor.utils.io.h;
import io.ktor.utils.io.m;
import io.ktor.utils.io.q;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: A5.a$a, reason: collision with other inner class name */
    static final class C0001a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f237o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ f f238s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ c f239t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0001a(f fVar, c cVar, d dVar) {
            super(2, dVar);
            this.f238s = fVar;
            this.f239t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C0001a(this.f238s, this.f239t, dVar);
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q qVar, d dVar) {
            return ((C0001a) create(qVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f237o;
            try {
                if (i8 == 0) {
                    x6.q.b(obj);
                    f fVar = this.f238s;
                    c cVar = this.f239t;
                    this.f237o = 1;
                    if (h.c(fVar, cVar, 0L, this, 2, null) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                }
            } catch (Throwable th) {
                this.f238s.b(th);
            }
            return C6916E.f44463a;
        }
    }

    public static final f a(M m8, f fVar, E5.d dVar) {
        r.e(m8, "<this>");
        r.e(fVar, "input");
        r.e(dVar, "request");
        if (N5.q.f4190a.c()) {
            return fVar;
        }
        c a8 = b.a(dVar);
        m.d(m8, null, a8, new C0001a(fVar, a8, null), 1, null);
        return a8;
    }
}
