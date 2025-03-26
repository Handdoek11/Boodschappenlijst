package T4;

import I6.p;
import J6.AbstractC0650j;
import J6.r;
import L0.d;
import U6.AbstractC0721j;
import U6.M;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f5242c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final d.a f5243d = L0.f.a("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final d.a f5244e = L0.f.b("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final d.a f5245f = L0.f.d("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final d.a f5246g = L0.f.d("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final d.a f5247h = L0.f.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    private final I0.e f5248a;

    /* renamed from: b, reason: collision with root package name */
    private e f5249b;

    static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        Object f5250o;

        /* renamed from: s, reason: collision with root package name */
        int f5251s;

        a(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return g.this.new a(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object e8 = B6.b.e();
            int i8 = this.f5251s;
            if (i8 == 0) {
                q.b(obj);
                g gVar2 = g.this;
                X6.b data = gVar2.f5248a.getData();
                this.f5250o = gVar2;
                this.f5251s = 1;
                Object g8 = X6.d.g(data, this);
                if (g8 == e8) {
                    return e8;
                }
                gVar = gVar2;
                obj = g8;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f5250o;
                q.b(obj);
            }
            gVar.l(((L0.d) obj).d());
            return C6916E.f44463a;
        }
    }

    private static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f5253o;

        /* renamed from: t, reason: collision with root package name */
        int f5255t;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5253o = obj;
            this.f5255t |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    static final class d extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f5256o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5257s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f5258t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ d.a f5259u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ g f5260v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, d.a aVar, g gVar, A6.d dVar) {
            super(2, dVar);
            this.f5258t = obj;
            this.f5259u = aVar;
            this.f5260v = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            d dVar2 = new d(this.f5258t, this.f5259u, this.f5260v, dVar);
            dVar2.f5257s = obj;
            return dVar2;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.a aVar, A6.d dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            B6.b.e();
            if (this.f5256o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            L0.a aVar = (L0.a) this.f5257s;
            Object obj2 = this.f5258t;
            if (obj2 != null) {
                aVar.i(this.f5259u, obj2);
            } else {
                aVar.h(this.f5259u);
            }
            this.f5260v.l(aVar);
            return C6916E.f44463a;
        }
    }

    public g(I0.e eVar) {
        r.e(eVar, "dataStore");
        this.f5248a = eVar;
        AbstractC0721j.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(L0.d.a r6, java.lang.Object r7, A6.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof T4.g.c
            if (r0 == 0) goto L13
            r0 = r8
            T4.g$c r0 = (T4.g.c) r0
            int r1 = r0.f5255t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5255t = r1
            goto L18
        L13:
            T4.g$c r0 = new T4.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5253o
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5255t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            x6.q.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            x6.q.b(r8)
            I0.e r8 = r5.f5248a     // Catch: java.io.IOException -> L29
            T4.g$d r2 = new T4.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f5255t = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = L0.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            x6.E r6 = x6.C6916E.f44463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.g.h(L0.d$a, java.lang.Object, A6.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(L0.d dVar) {
        this.f5249b = new e((Boolean) dVar.b(f5243d), (Double) dVar.b(f5244e), (Integer) dVar.b(f5245f), (Integer) dVar.b(f5246g), (Long) dVar.b(f5247h));
    }

    public final boolean d() {
        e eVar = this.f5249b;
        e eVar2 = null;
        if (eVar == null) {
            r.p("sessionConfigs");
            eVar = null;
        }
        Long b8 = eVar.b();
        e eVar3 = this.f5249b;
        if (eVar3 == null) {
            r.p("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a8 = eVar2.a();
        return b8 == null || a8 == null || (System.currentTimeMillis() - b8.longValue()) / ((long) 1000) >= ((long) a8.intValue());
    }

    public final Integer e() {
        e eVar = this.f5249b;
        if (eVar == null) {
            r.p("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f5249b;
        if (eVar == null) {
            r.p("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f5249b;
        if (eVar == null) {
            r.p("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d8, A6.d dVar) {
        Object h8 = h(f5244e, d8, dVar);
        return h8 == B6.b.e() ? h8 : C6916E.f44463a;
    }

    public final Object j(Integer num, A6.d dVar) {
        Object h8 = h(f5246g, num, dVar);
        return h8 == B6.b.e() ? h8 : C6916E.f44463a;
    }

    public final Object k(Long l8, A6.d dVar) {
        Object h8 = h(f5247h, l8, dVar);
        return h8 == B6.b.e() ? h8 : C6916E.f44463a;
    }

    public final Object m(Integer num, A6.d dVar) {
        Object h8 = h(f5245f, num, dVar);
        return h8 == B6.b.e() ? h8 : C6916E.f44463a;
    }

    public final Object n(Boolean bool, A6.d dVar) {
        Object h8 = h(f5243d, bool, dVar);
        return h8 == B6.b.e() ? h8 : C6916E.f44463a;
    }
}
