package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4031sM {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26650a = new HashMap();

    C4031sM() {
    }

    public final synchronized C3922rM a(String str) {
        return (C3922rM) this.f26650a.get(str);
    }

    public final String b(String str) {
        C1667Pm c1667Pm;
        C3922rM a8 = a(str);
        return (a8 == null || (c1667Pm = a8.f26162b) == null) ? "" : c1667Pm.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void c(java.lang.String r6, com.google.android.gms.internal.ads.C3024j70 r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.f26650a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.rM r0 = new com.google.android.gms.internal.ads.rM     // Catch: java.lang.Throwable -> L17
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L19
        L12:
            com.google.android.gms.internal.ads.Pm r2 = r7.j()     // Catch: com.google.android.gms.internal.ads.zzfcq -> L10 java.lang.Throwable -> L17
            goto L19
        L17:
            r6 = move-exception
            goto L46
        L19:
            if (r7 != 0) goto L1c
            goto L20
        L1c:
            com.google.android.gms.internal.ads.Pm r1 = r7.k()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L20
        L20:
            com.google.android.gms.internal.ads.bf r3 = com.google.android.gms.internal.ads.AbstractC3184kf.l9     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.internal.ads.if r4 = D2.A.c()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L17
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L34
            goto L3c
        L34:
            r3 = 0
            if (r7 != 0) goto L39
        L37:
            r4 = r3
            goto L3c
        L39:
            r7.c()     // Catch: java.lang.Throwable -> L17 com.google.android.gms.internal.ads.zzfcq -> L37
        L3c:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L17
            java.util.Map r7 = r5.f26650a     // Catch: java.lang.Throwable -> L17
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4031sM.c(java.lang.String, com.google.android.gms.internal.ads.j70):void");
    }

    final synchronized void d(String str, InterfaceC1171Bm interfaceC1171Bm) {
        if (this.f26650a.containsKey(str)) {
            return;
        }
        try {
            this.f26650a.put(str, new C3922rM(str, interfaceC1171Bm.c(), interfaceC1171Bm.g(), true));
        } catch (Throwable unused) {
        }
    }
}
