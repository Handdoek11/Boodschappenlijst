package G2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C3490nP;
import com.google.android.gms.internal.ads.EnumC3381mP;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: G2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624z {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2733a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private String f2734b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f2735c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f2736d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2737e = false;

    /* renamed from: f, reason: collision with root package name */
    protected String f2738f = "";

    /* renamed from: g, reason: collision with root package name */
    private C3490nP f2739g;

    protected static final String o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C2.v.t().H(context, str2));
        com.google.common.util.concurrent.d b8 = new P(context).b(0, str, hashMap, null);
        try {
            return (String) b8.get(((Integer) D2.A.c().a(AbstractC3184kf.f23747O4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            H2.p.e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e8);
            b8.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            H2.p.e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e9);
            b8.cancel(true);
            return null;
        } catch (Exception e10) {
            H2.p.e("Error retrieving a response from: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri p(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.f2733a
            monitor-enter(r0)
            java.lang.String r1 = r4.f2734b     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            C2.v.t()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = f3.k.d(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L32
        L29:
            r5 = move-exception
            goto L7d
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            H2.p.b(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L32:
            r4.f2734b = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            C2.v.t()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.f2734b = r1     // Catch: java.lang.Throwable -> L29
            C2.v.t()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.f2734b     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            goto L66
        L60:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            H2.p.e(r1, r5)     // Catch: java.lang.Throwable -> L29
        L66:
            java.lang.String r5 = r4.f2734b     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.C0624z.p(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final C3490nP a() {
        return this.f2739g;
    }

    public final String b() {
        String str;
        synchronized (this.f2733a) {
            str = this.f2735c;
        }
        return str;
    }

    public final void c(Context context) {
        C3490nP c3490nP;
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue() || (c3490nP = this.f2739g) == null) {
            return;
        }
        c3490nP.i(new BinderC0620w(this, context), EnumC3381mP.DEBUG_MENU);
    }

    public final void d(Context context, String str, String str2) {
        C2.v.t();
        D0.u(context, p(context, (String) D2.A.c().a(AbstractC3184kf.f23715K4), str, str2));
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = p(context, (String) D2.A.c().a(AbstractC3184kf.f23739N4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        C2.v.t();
        D0.m(context, str, buildUpon.build().toString());
    }

    public final void f(boolean z7) {
        synchronized (this.f2733a) {
            try {
                this.f2737e = z7;
                if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
                    C2.v.s().j().U(z7);
                    C3490nP c3490nP = this.f2739g;
                    if (c3490nP != null) {
                        c3490nP.m(z7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(C3490nP c3490nP) {
        this.f2739g = c3490nP;
    }

    public final void h(boolean z7) {
        synchronized (this.f2733a) {
            this.f2736d = z7;
        }
    }

    protected final void i(Context context, String str, boolean z7, boolean z8) {
        if (context instanceof Activity) {
            D0.f2566l.post(new RunnableC0623y(this, context, str, z7, z8));
        } else {
            H2.p.f("Can not create dialog without Activity Context");
        }
    }

    public final boolean j(Context context, String str, String str2) {
        String o8 = o(context, p(context, (String) D2.A.c().a(AbstractC3184kf.f23731M4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o8)) {
            H2.p.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o8.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
                InterfaceC0611r0 j8 = C2.v.s().j();
                if (true != equals) {
                    str = "";
                }
                j8.b0(str);
            }
            return equals;
        } catch (JSONException e8) {
            H2.p.h("Fail to get debug mode response json.", e8);
            return false;
        }
    }

    final boolean k(Context context, String str, String str2) {
        String o8 = o(context, p(context, (String) D2.A.c().a(AbstractC3184kf.f23723L4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o8)) {
            H2.p.b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(o8.trim());
            String optString = jSONObject.optString("gct");
            this.f2738f = jSONObject.optString("status");
            if (((Boolean) D2.A.c().a(AbstractC3184kf.d9)).booleanValue()) {
                boolean z7 = "0".equals(this.f2738f) || "2".equals(this.f2738f);
                f(z7);
                InterfaceC0611r0 j8 = C2.v.s().j();
                if (!z7) {
                    str = "";
                }
                j8.b0(str);
            }
            synchronized (this.f2733a) {
                this.f2735c = optString;
            }
            return true;
        } catch (JSONException e8) {
            H2.p.h("Fail to get in app preview response json.", e8);
            return false;
        }
    }

    public final boolean l() {
        boolean z7;
        synchronized (this.f2733a) {
            z7 = this.f2737e;
        }
        return z7;
    }

    public final boolean m() {
        boolean z7;
        synchronized (this.f2733a) {
            z7 = this.f2736d;
        }
        return z7;
    }

    public final boolean n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m()) {
            return false;
        }
        H2.p.b("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }
}
