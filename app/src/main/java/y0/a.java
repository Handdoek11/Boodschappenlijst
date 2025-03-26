package Y0;

import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.AbstractC0723k;
import U6.C0706b0;
import U6.M;
import U6.N;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.d;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6040a = new b(null);

    /* renamed from: Y0.a$a, reason: collision with other inner class name */
    private static final class C0122a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final d f6041b;

        /* renamed from: Y0.a$a$a, reason: collision with other inner class name */
        static final class C0123a extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f6042o;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f6044t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0123a(androidx.privacysandbox.ads.adservices.topics.a aVar, A6.d dVar) {
                super(2, dVar);
                this.f6044t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0122a.this.new C0123a(this.f6044t, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((C0123a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f6042o;
                if (i8 == 0) {
                    q.b(obj);
                    d dVar = C0122a.this.f6041b;
                    androidx.privacysandbox.ads.adservices.topics.a aVar = this.f6044t;
                    this.f6042o = 1;
                    obj = dVar.a(aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return obj;
            }
        }

        public C0122a(d dVar) {
            r.e(dVar, "mTopicsManager");
            this.f6041b = dVar;
        }

        @Override // Y0.a
        public com.google.common.util.concurrent.d b(androidx.privacysandbox.ads.adservices.topics.a aVar) {
            r.e(aVar, "request");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.c()), null, null, new C0123a(aVar, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final a a(Context context) {
            r.e(context, "context");
            d a8 = d.f10699a.a(context);
            if (a8 != null) {
                return new C0122a(a8);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f6040a.a(context);
    }

    public abstract com.google.common.util.concurrent.d b(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
