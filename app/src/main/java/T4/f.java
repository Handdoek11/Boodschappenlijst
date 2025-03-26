package T4;

import I6.l;
import J6.AbstractC0650j;
import J6.B;
import J6.H;
import J6.r;
import J6.s;
import Q6.j;
import R4.A;
import R4.C0694b;
import R4.v;
import R4.w;
import T6.a;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.m;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5232c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final M6.a f5233d = K0.a.b(w.f4903a.b(), new J0.b(a.f5236o), null, null, 12, null);

    /* renamed from: a, reason: collision with root package name */
    private final h f5234a;

    /* renamed from: b, reason: collision with root package name */
    private final h f5235b;

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5236o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final L0.d invoke(CorruptionException corruptionException) {
            r.e(corruptionException, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f4902a.e() + '.', corruptionException);
            return L0.e.a();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ j[] f5237a = {H.f(new B(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final I0.e b(Context context) {
            return (I0.e) f.f5233d.a(context, f5237a[0]);
        }

        public final f c() {
            Object j8 = m.a(com.google.firebase.c.f32721a).j(f.class);
            r.d(j8, "Firebase.app[SessionsSettings::class.java]");
            return (f) j8;
        }

        private b() {
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f5238o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5239s;

        /* renamed from: u, reason: collision with root package name */
        int f5241u;

        c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5239s = obj;
            this.f5241u |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(h hVar, h hVar2) {
        r.e(hVar, "localOverrideSettings");
        r.e(hVar2, "remoteSettings");
        this.f5234a = hVar;
        this.f5235b = hVar2;
    }

    private final boolean e(double d8) {
        return 0.0d <= d8 && d8 <= 1.0d;
    }

    private final boolean f(long j8) {
        return T6.a.H(j8) && T6.a.C(j8);
    }

    public final double b() {
        Double c8 = this.f5234a.c();
        if (c8 != null) {
            double doubleValue = c8.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c9 = this.f5235b.c();
        if (c9 == null) {
            return 1.0d;
        }
        double doubleValue2 = c9.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        T6.a b8 = this.f5234a.b();
        if (b8 != null) {
            long N7 = b8.N();
            if (f(N7)) {
                return N7;
            }
        }
        T6.a b9 = this.f5235b.b();
        if (b9 != null) {
            long N8 = b9.N();
            if (f(N8)) {
                return N8;
            }
        }
        a.C0107a c0107a = T6.a.f5296s;
        return T6.c.s(30, T6.d.f5308w);
    }

    public final boolean d() {
        Boolean a8 = this.f5234a.a();
        if (a8 != null) {
            return a8.booleanValue();
        }
        Boolean a9 = this.f5235b.a();
        if (a9 != null) {
            return a9.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(A6.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof T4.f.c
            if (r0 == 0) goto L13
            r0 = r6
            T4.f$c r0 = (T4.f.c) r0
            int r1 = r0.f5241u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5241u = r1
            goto L18
        L13:
            T4.f$c r0 = new T4.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5239s
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5241u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            x6.q.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f5238o
            T4.f r2 = (T4.f) r2
            x6.q.b(r6)
            goto L4d
        L3c:
            x6.q.b(r6)
            T4.h r6 = r5.f5234a
            r0.f5238o = r5
            r0.f5241u = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            T4.h r6 = r2.f5235b
            r2 = 0
            r0.f5238o = r2
            r0.f5241u = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            x6.E r6 = x6.C6916E.f44463a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.f.g(A6.d):java.lang.Object");
    }

    private f(Context context, A6.g gVar, A6.g gVar2, I4.e eVar, C0694b c0694b) {
        this(new T4.b(context), new T4.c(gVar2, eVar, c0694b, new d(c0694b, gVar, null, 4, null), f5232c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(com.google.firebase.f fVar, A6.g gVar, A6.g gVar2, I4.e eVar) {
        r.e(fVar, "firebaseApp");
        r.e(gVar, "blockingDispatcher");
        r.e(gVar2, "backgroundDispatcher");
        r.e(eVar, "firebaseInstallationsApi");
        Context k8 = fVar.k();
        r.d(k8, "firebaseApp.applicationContext");
        this(k8, gVar, gVar2, eVar, A.f4763a.b(fVar));
    }
}
