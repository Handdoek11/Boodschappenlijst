package G2;

/* renamed from: G2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596j0 {

    /* renamed from: b, reason: collision with root package name */
    private static C0596j0 f2633b;

    /* renamed from: a, reason: collision with root package name */
    String f2634a;

    private C0596j0() {
    }

    public static C0596j0 a() {
        if (f2633b == null) {
            f2633b = new C0596j0();
        }
        return f2633b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Updating user agent."
            G2.AbstractC0608p0.k(r0)
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            java.lang.String r1 = r6.f2634a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3e
            android.content.Context r1 = com.google.android.gms.common.AbstractC1110i.getRemoteContext(r7)
            boolean r2 = f3.AbstractC5780d.c()
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L3c
            r1 = 0
        L1e:
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            r3 = 0
            java.lang.String r4 = "admob_user_agent"
            android.content.SharedPreferences r3 = r7.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "user_agent"
            android.content.SharedPreferences$Editor r2 = r3.putString(r5, r2)
            if (r1 != 0) goto L39
            r2.apply()
            goto L3c
        L39:
            f3.p.a(r7, r2, r4)
        L3c:
            r6.f2634a = r0
        L3e:
            java.lang.String r7 = "User agent is updated."
            G2.AbstractC0608p0.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.C0596j0.b(android.content.Context):void");
    }
}
