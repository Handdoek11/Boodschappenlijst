package R4;

import J6.AbstractC0650j;
import U6.AbstractC0723k;
import U6.M;
import U6.N;
import android.util.Log;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class B implements com.google.firebase.sessions.b {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4765g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private static final double f4766h = Math.random();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f4767b;

    /* renamed from: c, reason: collision with root package name */
    private final I4.e f4768c;

    /* renamed from: d, reason: collision with root package name */
    private final T4.f f4769d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC0700h f4770e;

    /* renamed from: f, reason: collision with root package name */
    private final A6.g f4771f;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        Object f4772o;

        /* renamed from: s, reason: collision with root package name */
        Object f4773s;

        /* renamed from: t, reason: collision with root package name */
        Object f4774t;

        /* renamed from: u, reason: collision with root package name */
        Object f4775u;

        /* renamed from: v, reason: collision with root package name */
        Object f4776v;

        /* renamed from: w, reason: collision with root package name */
        Object f4777w;

        /* renamed from: x, reason: collision with root package name */
        int f4778x;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ y f4780z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y yVar, A6.d dVar) {
            super(2, dVar);
            this.f4780z = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return B.this.new b(this.f4780z, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = B6.b.e()
                int r1 = r10.f4778x
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f4777w
                T4.f r0 = (T4.f) r0
                java.lang.Object r1 = r10.f4776v
                R4.y r1 = (R4.y) r1
                java.lang.Object r2 = r10.f4775u
                com.google.firebase.f r2 = (com.google.firebase.f) r2
                java.lang.Object r3 = r10.f4774t
                R4.A r3 = (R4.A) r3
                java.lang.Object r4 = r10.f4773s
                R4.B r4 = (R4.B) r4
                java.lang.Object r5 = r10.f4772o
                R4.s r5 = (R4.s) r5
                x6.q.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                x6.q.b(r11)
                goto L6c
            L41:
                x6.q.b(r11)
                goto L53
            L45:
                x6.q.b(r11)
                R4.B r11 = R4.B.this
                r10.f4778x = r4
                java.lang.Object r11 = R4.B.f(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                R4.s$a r11 = R4.s.f4885c
                R4.B r1 = R4.B.this
                I4.e r1 = R4.B.d(r1)
                r10.f4778x = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                R4.s r5 = (R4.s) r5
                R4.B r4 = R4.B.this
                R4.A r3 = R4.A.f4763a
                com.google.firebase.f r11 = R4.B.c(r4)
                R4.y r1 = r10.f4780z
                R4.B r6 = R4.B.this
                T4.f r6 = R4.B.e(r6)
                S4.a r7 = S4.a.f5111a
                r10.f4772o = r5
                r10.f4773s = r4
                r10.f4774t = r3
                r10.f4775u = r11
                r10.f4776v = r1
                r10.f4777w = r6
                r10.f4778x = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                R4.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                R4.B.b(r7, r11)
            Lb0:
                x6.E r11 = x6.C6916E.f44463a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: R4.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f4781o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4782s;

        /* renamed from: u, reason: collision with root package name */
        int f4784u;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4782s = obj;
            this.f4784u |= Integer.MIN_VALUE;
            return B.this.i(this);
        }
    }

    public B(com.google.firebase.f fVar, I4.e eVar, T4.f fVar2, InterfaceC0700h interfaceC0700h, A6.g gVar) {
        J6.r.e(fVar, "firebaseApp");
        J6.r.e(eVar, "firebaseInstallations");
        J6.r.e(fVar2, "sessionSettings");
        J6.r.e(interfaceC0700h, "eventGDTLogger");
        J6.r.e(gVar, "backgroundDispatcher");
        this.f4767b = fVar;
        this.f4768c = eVar;
        this.f4769d = fVar2;
        this.f4770e = interfaceC0700h;
        this.f4771f = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f4770e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e8) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e8);
        }
    }

    private final boolean h() {
        return f4766h <= this.f4769d.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(A6.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof R4.B.c
            if (r0 == 0) goto L13
            r0 = r6
            R4.B$c r0 = (R4.B.c) r0
            int r1 = r0.f4784u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4784u = r1
            goto L18
        L13:
            R4.B$c r0 = new R4.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4782s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f4784u
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f4781o
            R4.B r0 = (R4.B) r0
            x6.q.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            x6.q.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            T4.f r6 = r5.f4769d
            r0.f4781o = r5
            r0.f4784u = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            T4.f r6 = r0.f4769d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.B.i(A6.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(y yVar) {
        J6.r.e(yVar, "sessionDetails");
        AbstractC0723k.d(N.a(this.f4771f), null, null, new b(yVar, null), 3, null);
    }
}
