package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2669ft extends AbstractC2314ce0 implements Ds0 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f22140v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f22141e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22142f;

    /* renamed from: g, reason: collision with root package name */
    private final String f22143g;

    /* renamed from: h, reason: collision with root package name */
    private final C2342cs0 f22144h;

    /* renamed from: i, reason: collision with root package name */
    private C4393vk0 f22145i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f22146j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f22147k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f22148l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f22149m;

    /* renamed from: n, reason: collision with root package name */
    private int f22150n;

    /* renamed from: o, reason: collision with root package name */
    private long f22151o;

    /* renamed from: p, reason: collision with root package name */
    private long f22152p;

    /* renamed from: q, reason: collision with root package name */
    private long f22153q;

    /* renamed from: r, reason: collision with root package name */
    private long f22154r;

    /* renamed from: s, reason: collision with root package name */
    private long f22155s;

    /* renamed from: t, reason: collision with root package name */
    private final long f22156t;

    /* renamed from: u, reason: collision with root package name */
    private final long f22157u;

    C2669ft(String str, Wu0 wu0, int i8, int i9, long j8, long j9) {
        super(true);
        AbstractC3796qC.c(str);
        this.f22143g = str;
        this.f22144h = new C2342cs0();
        this.f22141e = i8;
        this.f22142f = i9;
        this.f22147k = new ArrayDeque();
        this.f22156t = j8;
        this.f22157u = j9;
        if (wu0 != null) {
            f(wu0);
        }
    }

    private final void l() {
        while (!this.f22147k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f22147k.remove()).disconnect();
            } catch (Exception e8) {
                H2.p.e("Unexpected error while disconnecting", e8);
            }
        }
        this.f22146j = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        try {
            long j8 = this.f22151o;
            long j9 = this.f22152p;
            if (j8 - j9 == 0) {
                return -1;
            }
            long j10 = this.f22153q + j9;
            long j11 = i9;
            long j12 = j10 + j11 + this.f22157u;
            long j13 = this.f22155s;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.f22154r;
                if (j13 < j15) {
                    long min = Math.min(j15, Math.max(((this.f22156t + j14) - r3) - 1, (-1) + j14 + j11));
                    k(j14, min, 2);
                    this.f22155s = min;
                    j13 = min;
                }
            }
            int read = this.f22148l.read(bArr, i8, (int) Math.min(j11, ((j13 + 1) - this.f22153q) - this.f22152p));
            if (read == -1) {
                throw new EOFException();
            }
            this.f22152p += read;
            z(read);
            return read;
        } catch (IOException e8) {
            throw new zzgp(e8, this.f22145i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f22146j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2314ce0, com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        HttpURLConnection httpURLConnection = this.f22146j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        try {
            InputStream inputStream = this.f22148l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    throw new zzgp(e8, this.f22145i, 2000, 3);
                }
            }
        } finally {
            this.f22148l = null;
            l();
            if (this.f22149m) {
                this.f22149m = false;
                g();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        this.f22145i = c4393vk0;
        this.f22152p = 0L;
        long j8 = c4393vk0.f27335e;
        long j9 = c4393vk0.f27336f;
        long min = j9 == -1 ? this.f22156t : Math.min(this.f22156t, j9);
        this.f22153q = j8;
        HttpURLConnection k8 = k(j8, (min + j8) - 1, 1);
        this.f22146j = k8;
        String headerField = k8.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f22140v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j10 = c4393vk0.f27336f;
                    if (j10 != -1) {
                        this.f22151o = j10;
                        this.f22154r = Math.max(parseLong, (this.f22153q + j10) - 1);
                    } else {
                        this.f22151o = parseLong2 - this.f22153q;
                        this.f22154r = parseLong2 - 1;
                    }
                    this.f22155s = parseLong;
                    this.f22149m = true;
                    j(c4393vk0);
                    return this.f22151o;
                } catch (NumberFormatException unused) {
                    H2.p.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C2451dt(headerField, c4393vk0);
    }

    final HttpURLConnection k(long j8, long j9, int i8) {
        String uri = this.f22145i.f27331a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.f22141e);
            httpURLConnection.setReadTimeout(this.f22142f);
            for (Map.Entry entry : this.f22144h.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j8 + "-" + j9);
            httpURLConnection.setRequestProperty("User-Agent", this.f22143g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f22147k.add(httpURLConnection);
            String uri2 = this.f22145i.f27331a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f22150n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    l();
                    throw new C2560et(this.f22150n, headerFields, this.f22145i, i8);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f22148l != null) {
                        inputStream = new SequenceInputStream(this.f22148l, inputStream);
                    }
                    this.f22148l = inputStream;
                    return httpURLConnection;
                } catch (IOException e8) {
                    l();
                    throw new zzgp(e8, this.f22145i, 2000, i8);
                }
            } catch (IOException e9) {
                l();
                throw new zzgp("Unable to connect to ".concat(String.valueOf(uri2)), e9, this.f22145i, 2000, i8);
            }
        } catch (IOException e10) {
            throw new zzgp("Unable to connect to ".concat(String.valueOf(uri)), e10, this.f22145i, 2000, i8);
        }
    }
}
