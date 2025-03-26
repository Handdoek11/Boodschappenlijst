package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1533Ls extends AbstractC2314ce0 implements Ds0 {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f16910u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReference f16911v = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f16912e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16913f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16914g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16915h;

    /* renamed from: i, reason: collision with root package name */
    private final C2342cs0 f16916i;

    /* renamed from: j, reason: collision with root package name */
    private C4393vk0 f16917j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f16918k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f16919l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16920m;

    /* renamed from: n, reason: collision with root package name */
    private int f16921n;

    /* renamed from: o, reason: collision with root package name */
    private long f16922o;

    /* renamed from: p, reason: collision with root package name */
    private long f16923p;

    /* renamed from: q, reason: collision with root package name */
    private long f16924q;

    /* renamed from: r, reason: collision with root package name */
    private long f16925r;

    /* renamed from: s, reason: collision with root package name */
    private int f16926s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f16927t;

    C1533Ls(String str, Wu0 wu0, int i8, int i9, int i10) {
        super(true);
        this.f16912e = new C1499Ks(this);
        this.f16927t = new HashSet();
        AbstractC3796qC.c(str);
        this.f16915h = str;
        this.f16916i = new C2342cs0();
        this.f16913f = i8;
        this.f16914g = i9;
        this.f16926s = i10;
        if (wu0 != null) {
            f(wu0);
        }
    }

    private final void n() {
        HttpURLConnection httpURLConnection = this.f16918k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e8) {
                H2.p.e("Unexpected error while disconnecting", e8);
            }
            this.f16918k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int C(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            long r0 = r8.f16924q     // Catch: java.io.IOException -> L1b
            long r2 = r8.f16922o     // Catch: java.io.IOException -> L1b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = -1
            if (r0 != 0) goto Lb
            goto L57
        Lb:
            java.util.concurrent.atomic.AtomicReference r0 = com.google.android.gms.internal.ads.C1533Ls.f16911v     // Catch: java.io.IOException -> L1b
            r3 = 0
            java.lang.Object r0 = r0.getAndSet(r3)     // Catch: java.io.IOException -> L1b
            byte[] r0 = (byte[]) r0     // Catch: java.io.IOException -> L1b
            if (r0 != 0) goto L1e
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.io.IOException -> L1b
            goto L1e
        L1b:
            r9 = move-exception
            goto L92
        L1e:
            long r3 = r8.f16924q     // Catch: java.io.IOException -> L1b
            long r5 = r8.f16922o     // Catch: java.io.IOException -> L1b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L52
            int r7 = r0.length     // Catch: java.io.IOException -> L1b
            long r5 = r5 - r3
            long r3 = (long) r7     // Catch: java.io.IOException -> L1b
            long r3 = java.lang.Math.min(r5, r3)     // Catch: java.io.IOException -> L1b
            int r3 = (int) r3     // Catch: java.io.IOException -> L1b
            java.io.InputStream r4 = r8.f16919l     // Catch: java.io.IOException -> L1b
            int r3 = r4.read(r0, r1, r3)     // Catch: java.io.IOException -> L1b
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.io.IOException -> L1b
            if (r4 != 0) goto L4c
            if (r3 == r2) goto L46
            long r4 = r8.f16924q     // Catch: java.io.IOException -> L1b
            long r6 = (long) r3     // Catch: java.io.IOException -> L1b
            long r4 = r4 + r6
            r8.f16924q = r4     // Catch: java.io.IOException -> L1b
            r8.z(r3)     // Catch: java.io.IOException -> L1b
            goto L1e
        L46:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r9.<init>()     // Catch: java.io.IOException -> L1b
            throw r9     // Catch: java.io.IOException -> L1b
        L4c:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.io.IOException -> L1b
            r9.<init>()     // Catch: java.io.IOException -> L1b
            throw r9     // Catch: java.io.IOException -> L1b
        L52:
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.gms.internal.ads.C1533Ls.f16911v     // Catch: java.io.IOException -> L1b
            r3.set(r0)     // Catch: java.io.IOException -> L1b
        L57:
            if (r11 != 0) goto L5a
            goto L91
        L5a:
            long r0 = r8.f16923p     // Catch: java.io.IOException -> L1b
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L73
            long r5 = r8.f16925r     // Catch: java.io.IOException -> L1b
            long r0 = r0 - r5
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L6d
        L6b:
            r1 = r2
            goto L91
        L6d:
            long r5 = (long) r11     // Catch: java.io.IOException -> L1b
            long r0 = java.lang.Math.min(r5, r0)     // Catch: java.io.IOException -> L1b
            int r11 = (int) r0     // Catch: java.io.IOException -> L1b
        L73:
            java.io.InputStream r0 = r8.f16919l     // Catch: java.io.IOException -> L1b
            int r1 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> L1b
            if (r1 != r2) goto L88
            long r9 = r8.f16923p     // Catch: java.io.IOException -> L1b
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L82
            goto L6b
        L82:
            java.io.EOFException r9 = new java.io.EOFException     // Catch: java.io.IOException -> L1b
            r9.<init>()     // Catch: java.io.IOException -> L1b
            throw r9     // Catch: java.io.IOException -> L1b
        L88:
            long r9 = r8.f16925r     // Catch: java.io.IOException -> L1b
            long r2 = (long) r1     // Catch: java.io.IOException -> L1b
            long r9 = r9 + r2
            r8.f16925r = r9     // Catch: java.io.IOException -> L1b
            r8.z(r1)     // Catch: java.io.IOException -> L1b
        L91:
            return r1
        L92:
            com.google.android.gms.internal.ads.zzgp r10 = new com.google.android.gms.internal.ads.zzgp
            com.google.android.gms.internal.ads.vk0 r11 = r8.f16917j
            r0 = 2000(0x7d0, float:2.803E-42)
            r1 = 2
            r10.<init>(r9, r11, r0, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1533Ls.C(byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f16918k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2314ce0, com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f16918k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        try {
            InputStream inputStream = this.f16919l;
            if (inputStream != null) {
                int i8 = AbstractC2301cW.f21206a;
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new zzgp(e8, this.f16917j, 2000, 3);
                }
            }
        } finally {
            this.f16919l = null;
            n();
            if (this.f16920m) {
                this.f16920m = false;
                g();
            }
            this.f16927t.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0239, B:96:0x0244, B:98:0x0255, B:101:0x025e, B:102:0x026d, B:104:0x0275, B:105:0x027c, B:106:0x027d, B:107:0x0293), top: B:118:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0244 A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0239, B:96:0x0244, B:98:0x0255, B:101:0x025e, B:102:0x026d, B:104:0x0275, B:105:0x027c, B:106:0x027d, B:107:0x0293), top: B:118:0x000e }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(com.google.android.gms.internal.ads.C4393vk0 r21) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1533Ls.e(com.google.android.gms.internal.ads.vk0):long");
    }

    final void m(int i8) {
        this.f16926s = i8;
        for (Socket socket : this.f16927t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f16926s);
                } catch (SocketException e8) {
                    H2.p.h("Failed to update receive buffer size.", e8);
                }
            }
        }
    }
}
