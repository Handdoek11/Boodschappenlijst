package z0;

import android.view.View;
import android.view.ViewGroup;
import x6.C6916E;

/* renamed from: z0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7020d0 {

    /* renamed from: z0.d0$a */
    static final class a extends kotlin.coroutines.jvm.internal.k implements I6.p {

        /* renamed from: s, reason: collision with root package name */
        int f44754s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f44755t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f44756u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, A6.d dVar) {
            super(2, dVar);
            this.f44756u = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            a aVar = new a(this.f44756u, dVar);
            aVar.f44755t = obj;
            return aVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(R6.f fVar, A6.d dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            R6.f fVar;
            Object e8 = B6.b.e();
            int i8 = this.f44754s;
            if (i8 == 0) {
                x6.q.b(obj);
                fVar = (R6.f) this.f44755t;
                View view = this.f44756u;
                this.f44755t = fVar;
                this.f44754s = 1;
                if (fVar.a(view, this) == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x6.q.b(obj);
                    return C6916E.f44463a;
                }
                fVar = (R6.f) this.f44755t;
                x6.q.b(obj);
            }
            View view2 = this.f44756u;
            if (view2 instanceof ViewGroup) {
                R6.d b8 = AbstractC7018c0.b((ViewGroup) view2);
                this.f44755t = null;
                this.f44754s = 2;
                if (fVar.d(b8, this) == e8) {
                    return e8;
                }
            }
            return C6916E.f44463a;
        }
    }

    public static final R6.d a(View view) {
        return R6.g.b(new a(view, null));
    }
}
