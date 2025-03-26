package p3;

import android.app.Application;
import java.util.concurrent.Executor;

/* renamed from: p3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6350l implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40329a;

    /* renamed from: b, reason: collision with root package name */
    private final C6354n f40330b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f40331c;

    public C6350l(Application application, C6354n c6354n, Executor executor) {
        this.f40329a = application;
        this.f40330b = c6354n;
        this.f40331c = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // p3.E0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            int r0 = r9.hashCode()
            r1 = 94746189(0x5a5b64d, float:1.5583492E-35)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1b
            r1 = 113399775(0x6c257df, float:7.3103804E-35)
            if (r0 == r1) goto L11
            goto L25
        L11:
            java.lang.String r0 = "write"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L25
            r9 = r2
            goto L26
        L1b:
            java.lang.String r0 = "clear"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L25
            r9 = r3
            goto L26
        L25:
            r9 = -1
        L26:
            java.lang.String r0 = "UserMessagingPlatform"
            if (r9 == 0) goto L84
            if (r9 == r3) goto L2d
            return r2
        L2d:
            java.lang.String r9 = "keys"
            org.json.JSONArray r9 = r10.optJSONArray(r9)
            if (r9 == 0) goto L72
            int r1 = r9.length()
            if (r1 != 0) goto L3c
            goto L72
        L3c:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r1 = r9.length()
        L45:
            if (r2 >= r1) goto L6c
            java.lang.String r4 = r9.optString(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L66
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Action[clear]: empty key at index: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r0, r4)
            goto L69
        L66:
            r10.add(r4)
        L69:
            int r2 = r2 + 1
            goto L45
        L6c:
            android.app.Application r9 = r8.f40329a
            p3.AbstractC6359p0.b(r9, r10)
            goto L83
        L72:
            java.lang.String r9 = r10.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Action[clear]: wrong args."
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.d(r0, r9)
        L83:
            return r3
        L84:
            android.app.Application r9 = r8.f40329a
            p3.o0 r1 = new p3.o0
            r1.<init>(r9)
            java.util.Iterator r9 = r10.keys()
        L8f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ldd
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r10.opt(r2)
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Writing to storage: ["
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = "] "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r0, r5)
            boolean r4 = r1.c(r2, r4)
            if (r4 == 0) goto Lcf
            p3.n r4 = r8.f40330b
            java.util.Set r4 = r4.d()
            r4.add(r2)
            goto L8f
        Lcf:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed writing key: "
            java.lang.String r2 = r4.concat(r2)
            android.util.Log.d(r0, r2)
            goto L8f
        Ldd:
            p3.n r9 = r8.f40330b
            r9.e()
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C6350l.a(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // p3.E0
    public final Executor zza() {
        return this.f40331c;
    }
}
