package S4;

import J6.AbstractC0650j;
import J6.r;
import S4.b;
import android.util.Log;
import e7.a;
import e7.c;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5111a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f5112b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* renamed from: S4.a$a, reason: collision with other inner class name */
    private static final class C0101a {

        /* renamed from: a, reason: collision with root package name */
        private final e7.a f5113a;

        /* renamed from: b, reason: collision with root package name */
        private S4.b f5114b;

        public C0101a(e7.a aVar, S4.b bVar) {
            r.e(aVar, "mutex");
            this.f5113a = aVar;
            this.f5114b = bVar;
        }

        public final e7.a a() {
            return this.f5113a;
        }

        public final S4.b b() {
            return this.f5114b;
        }

        public final void c(S4.b bVar) {
            this.f5114b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0101a)) {
                return false;
            }
            C0101a c0101a = (C0101a) obj;
            return r.a(this.f5113a, c0101a.f5113a) && r.a(this.f5114b, c0101a.f5114b);
        }

        public int hashCode() {
            int hashCode = this.f5113a.hashCode() * 31;
            S4.b bVar = this.f5114b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f5113a + ", subscriber=" + this.f5114b + ')';
        }

        public /* synthetic */ C0101a(e7.a aVar, S4.b bVar, int i8, AbstractC0650j abstractC0650j) {
            this(aVar, (i8 & 2) != 0 ? null : bVar);
        }
    }

    static final class b extends d {

        /* renamed from: o, reason: collision with root package name */
        Object f5115o;

        /* renamed from: s, reason: collision with root package name */
        Object f5116s;

        /* renamed from: t, reason: collision with root package name */
        Object f5117t;

        /* renamed from: u, reason: collision with root package name */
        Object f5118u;

        /* renamed from: v, reason: collision with root package name */
        Object f5119v;

        /* renamed from: w, reason: collision with root package name */
        Object f5120w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f5121x;

        /* renamed from: z, reason: collision with root package name */
        int f5123z;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5121x = obj;
            this.f5123z |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    public static final void a(b.a aVar) {
        r.e(aVar, "subscriberName");
        if (aVar == b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map map = f5112b;
        if (map.containsKey(aVar)) {
            Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
            return;
        }
        r.d(map, "dependencies");
        map.put(aVar, new C0101a(c.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
    }

    private final C0101a b(b.a aVar) {
        Map map = f5112b;
        r.d(map, "dependencies");
        Object obj = map.get(aVar);
        if (obj != null) {
            r.d(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0101a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(S4.b bVar) {
        r.e(bVar, "subscriber");
        b.a c8 = bVar.c();
        C0101a b8 = f5111a.b(c8);
        if (b8.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + c8 + " already registered.");
            return;
        }
        b8.c(bVar);
        Log.d("SessionsDependencies", "Subscriber " + c8 + " registered.");
        a.C0253a.a(b8.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(A6.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof S4.a.b
            if (r0 == 0) goto L13
            r0 = r11
            S4.a$b r0 = (S4.a.b) r0
            int r1 = r0.f5123z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5123z = r1
            goto L18
        L13:
            S4.a$b r0 = new S4.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5121x
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f5123z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f5120w
            java.lang.Object r5 = r0.f5119v
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f5118u
            e7.a r6 = (e7.a) r6
            java.lang.Object r7 = r0.f5117t
            S4.b$a r7 = (S4.b.a) r7
            java.lang.Object r8 = r0.f5116s
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f5115o
            java.util.Map r9 = (java.util.Map) r9
            x6.q.b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            x6.q.b(r11)
            java.util.Map r11 = S4.a.f5112b
            java.lang.String r2 = "dependencies"
            J6.r.d(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = y6.AbstractC6971J.b(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            S4.b$a r7 = (S4.b.a) r7
            java.lang.Object r11 = r11.getValue()
            S4.a$a r11 = (S4.a.C0101a) r11
            e7.a r6 = r11.a()
            r0.f5115o = r5
            r0.f5116s = r8
            r0.f5117t = r7
            r0.f5118u = r6
            r0.f5119v = r5
            r0.f5120w = r2
            r0.f5123z = r3
            java.lang.Object r11 = r6.a(r4, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            S4.a r11 = S4.a.f5111a     // Catch: java.lang.Throwable -> Lae
            S4.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.c(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.c(r4)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.c(A6.d):java.lang.Object");
    }

    public final S4.b d(b.a aVar) {
        r.e(aVar, "subscriberName");
        S4.b b8 = b(aVar).b();
        if (b8 != null) {
            return b8;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
