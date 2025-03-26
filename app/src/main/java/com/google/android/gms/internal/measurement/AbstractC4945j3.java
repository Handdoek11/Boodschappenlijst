package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4945j3 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f29359h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static volatile AbstractC5033u3 f29360i;

    /* renamed from: j, reason: collision with root package name */
    private static C5065y3 f29361j;

    /* renamed from: k, reason: collision with root package name */
    private static final AtomicInteger f29362k;

    /* renamed from: a, reason: collision with root package name */
    private final C5009r3 f29363a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29364b;

    /* renamed from: c, reason: collision with root package name */
    private Object f29365c;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f29366d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f29367e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29368f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f29369g;

    static {
        new AtomicReference();
        f29361j = new C5065y3(new InterfaceC5057x3() { // from class: com.google.android.gms.internal.measurement.o3
            @Override // com.google.android.gms.internal.measurement.InterfaceC5057x3
            public final boolean zza() {
                return AbstractC4945j3.n();
            }
        });
        f29362k = new AtomicInteger();
    }

    static /* synthetic */ AbstractC4945j3 b(C5009r3 c5009r3, String str, Boolean bool, boolean z7) {
        return new C5002q3(c5009r3, str, bool, true);
    }

    static /* synthetic */ AbstractC4945j3 c(C5009r3 c5009r3, String str, Double d8, boolean z7) {
        return new C4994p3(c5009r3, str, d8, true);
    }

    static /* synthetic */ AbstractC4945j3 d(C5009r3 c5009r3, String str, Long l8, boolean z7) {
        return new C4978n3(c5009r3, str, l8, true);
    }

    static /* synthetic */ AbstractC4945j3 e(C5009r3 c5009r3, String str, String str2, boolean z7) {
        return new C5017s3(c5009r3, str, str2, true);
    }

    private final Object g(AbstractC5033u3 abstractC5033u3) {
        b4.c cVar;
        C5009r3 c5009r3 = this.f29363a;
        if (!c5009r3.f29533e && ((cVar = c5009r3.f29537i) == null || ((Boolean) cVar.apply(abstractC5033u3.a())).booleanValue())) {
            C4882c3 a8 = C4882c3.a(abstractC5033u3.a());
            C5009r3 c5009r32 = this.f29363a;
            Object n8 = a8.n(c5009r32.f29533e ? null : i(c5009r32.f29531c));
            if (n8 != null) {
                return h(n8);
            }
        }
        return null;
    }

    private final String i(String str) {
        if (str != null && str.isEmpty()) {
            return this.f29364b;
        }
        return str + this.f29364b;
    }

    private final Object j(AbstractC5033u3 abstractC5033u3) {
        Object n8;
        InterfaceC4873b3 a8 = this.f29363a.f29530b != null ? AbstractC4936i3.b(abstractC5033u3.a(), this.f29363a.f29530b) ? this.f29363a.f29536h ? U2.a(abstractC5033u3.a().getContentResolver(), AbstractC4954k3.a(AbstractC4954k3.b(abstractC5033u3.a(), this.f29363a.f29530b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.m3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4945j3.m();
            }
        }) : U2.a(abstractC5033u3.a().getContentResolver(), this.f29363a.f29530b, new Runnable() { // from class: com.google.android.gms.internal.measurement.m3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4945j3.m();
            }
        }) : null : C5049w3.b(abstractC5033u3.a(), this.f29363a.f29529a, new Runnable() { // from class: com.google.android.gms.internal.measurement.m3
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4945j3.m();
            }
        });
        if (a8 == null || (n8 = a8.n(k())) == null) {
            return null;
        }
        return h(n8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.u3 r0 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29360i
            if (r0 != 0) goto L4e
            if (r3 != 0) goto L7
            goto L4e
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29359h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.u3 r1 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29360i     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L4a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.measurement.u3 r1 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29360i     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r2 == r3) goto L44
            goto L24
        L22:
            r3 = move-exception
            goto L46
        L24:
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.measurement.U2.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C5049w3.c()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C4882c3.b()     // Catch: java.lang.Throwable -> L22
        L2f:
            com.google.android.gms.internal.measurement.l3 r1 = new com.google.android.gms.internal.measurement.l3     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            b4.k r1 = b4.l.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.V2 r2 = new com.google.android.gms.internal.measurement.V2     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.AbstractC4945j3.f29360i = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29362k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L4a
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L48
        L48:
            r3 = move-exception
            goto L4c
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            return
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4945j3.l(android.content.Context):void");
    }

    public static void m() {
        f29362k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final Object o() {
        return this.f29365c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f() {
        /*
            r8 = this;
            boolean r0 = r8.f29368f
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.y3 r0 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29361j
            java.lang.String r1 = r8.f29364b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            b4.h.o(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29362k
            int r0 = r0.get()
            int r1 = r8.f29366d
            if (r1 >= r0) goto L99
            monitor-enter(r8)
            int r1 = r8.f29366d     // Catch: java.lang.Throwable -> L4e
            if (r1 >= r0) goto L95
            com.google.android.gms.internal.measurement.u3 r1 = com.google.android.gms.internal.measurement.AbstractC4945j3.f29360i     // Catch: java.lang.Throwable -> L4e
            b4.g r2 = b4.g.a()     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L50
            b4.k r2 = r1.b()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L4e
            b4.g r2 = (b4.g) r2     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r2.c()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L50
            java.lang.Object r3 = r2.b()     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.h3 r3 = (com.google.android.gms.internal.measurement.InterfaceC4927h3) r3     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.r3 r4 = r8.f29363a     // Catch: java.lang.Throwable -> L4e
            android.net.Uri r5 = r4.f29530b     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = r4.f29529a     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.f29532d     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = r8.f29364b     // Catch: java.lang.Throwable -> L4e
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r0 = move-exception
            goto L97
        L50:
            if (r1 == 0) goto L54
            r4 = 1
            goto L55
        L54:
            r4 = 0
        L55:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            b4.h.o(r4, r5)     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.measurement.r3 r4 = r8.f29363a     // Catch: java.lang.Throwable -> L4e
            boolean r4 = r4.f29534f     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r8.g(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L67
            goto L80
        L67:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L7c
            goto L80
        L6e:
            java.lang.Object r4 = r8.j(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L75
            goto L80
        L75:
            java.lang.Object r4 = r8.g(r1)     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L7c
            goto L80
        L7c:
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L4e
        L80:
            boolean r1 = r2.c()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L91
            if (r3 != 0) goto L8d
            java.lang.Object r4 = r8.o()     // Catch: java.lang.Throwable -> L4e
            goto L91
        L8d:
            java.lang.Object r4 = r8.h(r3)     // Catch: java.lang.Throwable -> L4e
        L91:
            r8.f29367e = r4     // Catch: java.lang.Throwable -> L4e
            r8.f29366d = r0     // Catch: java.lang.Throwable -> L4e
        L95:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            goto L99
        L97:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r0
        L99:
            java.lang.Object r0 = r8.f29367e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4945j3.f():java.lang.Object");
    }

    abstract Object h(Object obj);

    public final String k() {
        return i(this.f29363a.f29532d);
    }

    private AbstractC4945j3(C5009r3 c5009r3, String str, Object obj, boolean z7) {
        this.f29366d = -1;
        String str2 = c5009r3.f29529a;
        if (str2 == null && c5009r3.f29530b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c5009r3.f29530b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f29363a = c5009r3;
        this.f29364b = str;
        this.f29365c = obj;
        this.f29368f = z7;
        this.f29369g = false;
    }
}
