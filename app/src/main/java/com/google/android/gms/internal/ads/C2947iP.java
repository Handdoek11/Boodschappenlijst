package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.iP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2947iP {

    /* renamed from: a, reason: collision with root package name */
    private final SO f22967a;

    /* renamed from: b, reason: collision with root package name */
    private final C4031sM f22968b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22969c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final List f22970d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private boolean f22971e;

    C2947iP(SO so, C4031sM c4031sM) {
        this.f22967a = so;
        this.f22968b = c4031sM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list) {
        C3922rM a8;
        C3922rM a9;
        C1667Pm c1667Pm;
        synchronized (this.f22969c) {
            try {
                if (this.f22971e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C1455Jj c1455Jj = (C1455Jj) it.next();
                    String str = (!((Boolean) D2.A.c().a(AbstractC3184kf.k9)).booleanValue() || (a9 = this.f22968b.a(c1455Jj.f16293o)) == null || (c1667Pm = a9.f26163c) == null) ? "" : c1667Pm.toString();
                    String str2 = str;
                    boolean z7 = ((Boolean) D2.A.c().a(AbstractC3184kf.l9)).booleanValue() && (a8 = this.f22968b.a(c1455Jj.f16293o)) != null && a8.f26164d;
                    List list2 = this.f22970d;
                    String str3 = c1455Jj.f16293o;
                    list2.add(new C2838hP(str3, str2, this.f22968b.b(str3), c1455Jj.f16294s ? 1 : 0, c1455Jj.f16296u, c1455Jj.f16295t, z7));
                }
                this.f22971e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[Catch: all -> 0x001e, LOOP:0: B:15:0x002b->B:17:0x0031, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x0020, B:12:0x0023, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:18:0x003f), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONArray a() {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.f22969c
            monitor-enter(r1)
            boolean r2 = r4.f22971e     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L25
            com.google.android.gms.internal.ads.SO r2 = r4.f22967a     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.t()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            com.google.android.gms.internal.ads.SO r2 = r4.f22967a     // Catch: java.lang.Throwable -> L1e
            java.util.List r2 = r2.g()     // Catch: java.lang.Throwable -> L1e
            r4.d(r2)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r0 = move-exception
            goto L41
        L20:
            r4.c()     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            goto L40
        L25:
            java.util.List r2 = r4.f22970d     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
        L2b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1e
            com.google.android.gms.internal.ads.hP r3 = (com.google.android.gms.internal.ads.C2838hP) r3     // Catch: java.lang.Throwable -> L1e
            org.json.JSONObject r3 = r3.a()     // Catch: java.lang.Throwable -> L1e
            r0.put(r3)     // Catch: java.lang.Throwable -> L1e
            goto L2b
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
        L40:
            return r0
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2947iP.a():org.json.JSONArray");
    }

    public final void c() {
        this.f22967a.s(new BinderC2729gP(this));
    }
}
