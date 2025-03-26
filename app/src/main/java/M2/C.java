package M2;

import D2.X1;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C2423de0;
import com.google.android.gms.internal.ads.C2858he0;
import com.google.android.gms.internal.ads.C2967ie0;
import com.google.android.gms.internal.ads.C3533nq;
import com.google.android.gms.internal.ads.EnumC3706pN;
import i3.BinderC5853b;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3775a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f3776b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3777c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f3778d;

    /* renamed from: e, reason: collision with root package name */
    private final PackageInfo f3779e;

    C(Context context, long j8, PackageInfo packageInfo, a0 a0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f3775a = context;
        this.f3777c = j8;
        this.f3779e = packageInfo;
        this.f3776b = a0Var;
        this.f3778d = scheduledExecutorService;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            charArray[i8] = (char) (charArray[i8] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i8 % 555));
        }
        return new String(charArray);
    }

    private final boolean e() {
        return this.f3776b.f().size() >= ((Integer) D2.A.c().a(AbstractC3184kf.v7)).intValue();
    }

    private static final void f(Bundle bundle, EnumC3706pN enumC3706pN) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.w7)).booleanValue()) {
            bundle.putLong(enumC3706pN.a(), C2.v.c().a());
        }
    }

    private static final void g(Bundle bundle, int i8) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i8 - 1);
    }

    public final N a(C3533nq c3533nq, final BinderC0675w binderC0675w, Bundle bundle) {
        long j8;
        f(bundle, EnumC3706pN.SIGNAL_ON_DISK_VALIDATION_START);
        if (C2.v.s().j().L()) {
            this.f3776b.g();
            g(bundle, 7);
        } else {
            if (this.f3779e != null) {
                a0 a0Var = this.f3776b;
                Context context = this.f3775a;
                String e8 = a0Var.e();
                int b8 = a0Var.b();
                String d8 = a0Var.d();
                int a8 = a0Var.a();
                if (TextUtils.equals(context.getApplicationInfo().packageName, e8) && b8 == this.f3779e.versionCode && TextUtils.equals(Build.MODEL, d8) && a8 == Build.VERSION.SDK_INT) {
                    for (Map.Entry entry : this.f3776b.f().entrySet()) {
                        try {
                            j8 = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                        } catch (IOException | JSONException unused) {
                        }
                        if (C2.v.c().a() - j8 <= ((Long) D2.A.c().a(AbstractC3184kf.u7)).longValue()) {
                            C2423de0 i8 = C2858he0.k(this.f3775a).i(((Long) D2.A.c().a(AbstractC3184kf.f23977p3)).longValue(), C2.v.s().j().L());
                            C2423de0 i9 = C2967ie0.j(this.f3775a).i(((Long) D2.A.c().a(AbstractC3184kf.f23986q3)).longValue(), C2.v.s().j().L());
                            if ((i8.a() == -1 || i8.a() <= j8) && (i9.a() == -1 || i9.a() <= j8)) {
                            }
                        }
                        this.f3776b.c((String) entry.getKey());
                    }
                } else {
                    this.f3776b.g();
                    this.f3776b.i(this.f3775a.getApplicationInfo().packageName, this.f3779e.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                }
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_VALIDATION_END);
                if (C2.v.c().a() - this.f3777c > ((Long) D2.A.c().a(AbstractC3184kf.f23999r7)).longValue()) {
                    g(bundle, 2);
                    return null;
                }
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = c3533nq.f25039o;
                String str2 = c3533nq.f25040s;
                String bundle2 = c3533nq.f25042u.f1173E.toString();
                String bundle3 = c3533nq.f25042u.f1188t.toString();
                X1 x12 = c3533nq.f25042u;
                final String k8 = H2.g.k(str + str2 + bundle2 + bundle3 + x12.f1194z + x12.f1175G + String.valueOf(x12.f1174F));
                if (TextUtils.isEmpty(k8)) {
                    g(bundle, 3);
                    return null;
                }
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_CACHE_KEY_END);
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String c8 = this.f3776b.c(k8);
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!e()) {
                    final C3533nq c3533nq2 = new C3533nq(c3533nq.f25039o, c3533nq.f25040s, c3533nq.f25041t, c3533nq.f25042u, 2, k8);
                    this.f3778d.schedule(new Runnable() { // from class: M2.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3852o.c(k8, binderC0675w, c3533nq2);
                        }
                    }, ((Long) D2.A.c().a(AbstractC3184kf.t7)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(c8)) {
                    g(bundle, 4);
                    return null;
                }
                f(bundle, EnumC3706pN.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(c8);
                    String string = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string)) {
                        g(bundle, 8);
                        return null;
                    }
                    String string2 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string2)) {
                        g(bundle, 9);
                        return null;
                    }
                    String b9 = b(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                    f(bundle, EnumC3706pN.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        N n8 = new N(new JsonReader(new StringReader(string)), null);
                        n8.f3803c = b9;
                        n8.f3805e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return n8;
                    } catch (IOException e9) {
                        g(bundle, 6);
                        C2.v.s().x(e9, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e10) {
                    g(bundle, 5);
                    C2.v.s().x(e10, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
            this.f3776b.g();
            g(bundle, 10);
        }
        return null;
    }

    final /* synthetic */ void c(String str, BinderC0675w binderC0675w, C3533nq c3533nq) {
        if (this.f3776b.j(str) || e()) {
            return;
        }
        binderC0675w.u2(BinderC5853b.p2(this.f3775a), c3533nq, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r6, M2.N r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7a
            boolean r0 = r5.e()
            if (r0 == 0) goto Ld
            goto L7a
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>()     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.f3801a     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "signal_dictionary"
            H2.g r3 = D2.C0555y.b()     // Catch: org.json.JSONException -> L3d
            android.os.Bundle r4 = r7.f3806f     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r3.m(r4)     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = r7.f3803c     // Catch: org.json.JSONException -> L3d
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r7 = ""
            goto L6f
        L3d:
            r7 = move-exception
            goto L62
        L3f:
            java.lang.String r7 = b(r7)     // Catch: org.json.JSONException -> L3d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L3d
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L3d
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "ts_ms"
            f3.e r1 = C2.v.c()     // Catch: org.json.JSONException -> L3d
            long r1 = r1.a()     // Catch: org.json.JSONException -> L3d
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L3d
            goto L6b
        L62:
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.Bq r2 = C2.v.s()
            r2.x(r7, r1)
        L6b:
            java.lang.String r7 = r0.toString()
        L6f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7a
            M2.a0 r0 = r5.f3776b
            r0.h(r6, r7)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.C.d(java.lang.String, M2.N):void");
    }
}
