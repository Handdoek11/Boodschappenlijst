package R4;

import J6.AbstractC0650j;
import U6.AbstractC0723k;
import U6.M;
import U6.N;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4877c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f4878a;

    /* renamed from: b, reason: collision with root package name */
    private final T4.f f4879b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        int f4880o;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ A6.g f4882t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ F f4883u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(A6.g gVar, F f8, A6.d dVar) {
            super(2, dVar);
            this.f4882t = gVar;
            this.f4883u = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return k.this.new a(this.f4882t, this.f4883u, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = B6.b.e()
                int r1 = r5.f4880o
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                x6.q.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                x6.q.b(r6)
                goto L2e
            L20:
                x6.q.b(r6)
                S4.a r6 = S4.a.f5111a
                r5.f4880o = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L9b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9b
                java.lang.Object r1 = r6.next()
                S4.b r1 = (S4.b) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L48
                R4.k r6 = R4.k.this
                T4.f r6 = R4.k.b(r6)
                r5.f4880o = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                R4.k r6 = R4.k.this
                T4.f r6 = R4.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La0
            L7b:
                R4.D r6 = new R4.D
                A6.g r0 = r5.f4882t
                r6.<init>(r0)
                R4.F r0 = r5.f4883u
                r6.i(r0)
                R4.H r0 = R4.H.f4807o
                r0.a(r6)
                R4.k r6 = R4.k.this
                com.google.firebase.f r6 = R4.k.a(r6)
                R4.j r0 = new R4.j
                r0.<init>()
                r6.h(r0)
                goto La0
            L9b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La0:
                x6.E r6 = x6.C6916E.f44463a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: R4.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    public k(com.google.firebase.f fVar, T4.f fVar2, A6.g gVar, F f8) {
        J6.r.e(fVar, "firebaseApp");
        J6.r.e(fVar2, "settings");
        J6.r.e(gVar, "backgroundDispatcher");
        J6.r.e(f8, "lifecycleServiceBinder");
        this.f4878a = fVar;
        this.f4879b = fVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = fVar.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f4807o);
            AbstractC0723k.d(N.a(gVar), null, null, new a(gVar, f8, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
