package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class Bo0 extends AbstractC2314ce0 implements Ds0 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f13876e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13877f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13878g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13879h;

    /* renamed from: i, reason: collision with root package name */
    private final C2342cs0 f13880i;

    /* renamed from: j, reason: collision with root package name */
    private final C2342cs0 f13881j;

    /* renamed from: k, reason: collision with root package name */
    private C4393vk0 f13882k;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f13883l;

    /* renamed from: m, reason: collision with root package name */
    private InputStream f13884m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13885n;

    /* renamed from: o, reason: collision with root package name */
    private int f13886o;

    /* renamed from: p, reason: collision with root package name */
    private long f13887p;

    /* renamed from: q, reason: collision with root package name */
    private long f13888q;

    /* synthetic */ Bo0(String str, int i8, int i9, boolean z7, boolean z8, C2342cs0 c2342cs0, InterfaceC1797Tf0 interfaceC1797Tf0, boolean z9, AbstractC2117ao0 abstractC2117ao0) {
        super(true);
        this.f13879h = str;
        this.f13877f = i8;
        this.f13878g = i9;
        this.f13876e = z7;
        this.f13880i = c2342cs0;
        this.f13881j = new C2342cs0();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection k(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f13877f
            r3.setConnectTimeout(r4)
            int r4 = r2.f13878g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.cs0 r5 = r2.f13880i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.cs0 r5 = r2.f13881j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.f13879h
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r4 = "identity"
            goto L94
        L92:
            java.lang.String r4 = "gzip"
        L94:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.C4393vk0.f27330h
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Bo0.k(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL l(URL url, String str, C4393vk0 c4393vk0) {
        if (str == null) {
            throw new zzgp("Null location redirect", c4393vk0, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), c4393vk0, 2001, 1);
            }
            if (this.f13876e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c4393vk0, 2001, 1);
        } catch (MalformedURLException e8) {
            throw new zzgp(e8, c4393vk0, 2001, 1);
        }
    }

    private final void m() {
        HttpURLConnection httpURLConnection = this.f13883l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                HL.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:12:0x0021, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f13887p     // Catch: java.io.IOException -> L1f
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L21
            long r4 = r6.f13888q     // Catch: java.io.IOException -> L1f
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r7 = r3
            goto L35
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1f
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1f
            int r9 = (int) r0     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r7 = move-exception
            goto L36
        L21:
            java.io.InputStream r0 = r6.f13884m     // Catch: java.io.IOException -> L1f
            int r1 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a     // Catch: java.io.IOException -> L1f
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1f
            if (r7 != r3) goto L2c
            goto L16
        L2c:
            long r8 = r6.f13888q     // Catch: java.io.IOException -> L1f
            long r0 = (long) r7     // Catch: java.io.IOException -> L1f
            long r8 = r8 + r0
            r6.f13888q = r8     // Catch: java.io.IOException -> L1f
            r6.z(r7)     // Catch: java.io.IOException -> L1f
        L35:
            return r7
        L36:
            com.google.android.gms.internal.ads.vk0 r8 = r6.f13882k
            int r9 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r9 = 2
            com.google.android.gms.internal.ads.zzgp r7 = com.google.android.gms.internal.ads.zzgp.a(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Bo0.C(byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f13883l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C4393vk0 c4393vk0 = this.f13882k;
        if (c4393vk0 != null) {
            return c4393vk0.f27331a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2314ce0, com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f13883l;
        return httpURLConnection == null ? AbstractC4496wh0.e() : new C4835zn0(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        try {
            InputStream inputStream = this.f13884m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    C4393vk0 c4393vk0 = this.f13882k;
                    int i8 = AbstractC2301cW.f21206a;
                    throw new zzgp(e8, c4393vk0, 2000, 3);
                }
            }
        } finally {
            this.f13884m = null;
            m();
            if (this.f13885n) {
                this.f13885n = false;
                g();
            }
            this.f13883l = null;
            this.f13882k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(com.google.android.gms.internal.ads.C4393vk0 r27) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Bo0.e(com.google.android.gms.internal.ads.vk0):long");
    }
}
