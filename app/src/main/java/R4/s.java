package R4;

import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4885c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f4886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4887b;

    public static final class a {

        /* renamed from: R4.s$a$a, reason: collision with other inner class name */
        static final class C0096a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f4888o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f4889s;

            /* renamed from: u, reason: collision with root package name */
            int f4891u;

            C0096a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f4889s = obj;
                this.f4891u |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(I4.e r9, A6.d r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof R4.s.a.C0096a
                if (r0 == 0) goto L13
                r0 = r10
                R4.s$a$a r0 = (R4.s.a.C0096a) r0
                int r1 = r0.f4891u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4891u = r1
                goto L18
            L13:
                R4.s$a$a r0 = new R4.s$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f4889s
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f4891u
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L48
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.f4888o
                java.lang.String r9 = (java.lang.String) r9
                x6.q.b(r10)     // Catch: java.lang.Exception -> L34
                goto L8a
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f4888o
                I4.e r9 = (I4.e) r9
                x6.q.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6f
            L48:
                x6.q.b(r10)
                r10 = 0
                A3.j r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                J6.r.d(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f4888o = r9     // Catch: java.lang.Exception -> L46
                r0.f4891u = r6     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = f7.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                return r1
            L60:
                com.google.firebase.installations.f r10 = (com.google.firebase.installations.f) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                J6.r.d(r10, r2)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L76
            L6f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L76:
                A3.j r10 = r10.d()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                J6.r.d(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f4888o = r9     // Catch: java.lang.Exception -> L34
                r0.f4891u = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = f7.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L8a
                return r1
            L8a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                J6.r.d(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L98
            L93:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L98:
                R4.s r10 = new R4.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: R4.s.a.a(I4.e, A6.d):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ s(String str, String str2, AbstractC0650j abstractC0650j) {
        this(str, str2);
    }

    public final String a() {
        return this.f4887b;
    }

    public final String b() {
        return this.f4886a;
    }

    private s(String str, String str2) {
        this.f4886a = str;
        this.f4887b = str2;
    }
}
