package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC5428u4 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final URL f31211o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC5407r4 f31212s;

    /* renamed from: t, reason: collision with root package name */
    private final String f31213t;

    /* renamed from: u, reason: collision with root package name */
    private final Map f31214u;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C5414s4 f31215v;

    public RunnableC5428u4(C5414s4 c5414s4, String str, URL url, byte[] bArr, Map map, InterfaceC5407r4 interfaceC5407r4) {
        this.f31215v = c5414s4;
        Z2.r.f(str);
        Z2.r.l(url);
        Z2.r.l(interfaceC5407r4);
        this.f31211o = url;
        this.f31212s = interfaceC5407r4;
        this.f31213t = str;
        this.f31214u = null;
    }

    private final void b(final int i8, final Exception exc, final byte[] bArr, final Map map) {
        this.f31215v.j().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.t4
            @Override // java.lang.Runnable
            public final void run() {
                this.f31195o.a(i8, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i8, Exception exc, byte[] bArr, Map map) {
        this.f31212s.a(this.f31213t, i8, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        this.f31215v.i();
        int i8 = 0;
        try {
            URLConnection b8 = com.google.android.gms.internal.measurement.C0.a().b(this.f31211o, "client-measurement");
            if (!(b8 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) b8;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i8 = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
            } catch (IOException e8) {
                e = e8;
                map = null;
            } catch (Throwable th) {
                th = th;
                map = null;
            }
            try {
                C5414s4 c5414s4 = this.f31215v;
                byte[] t7 = C5414s4.t(httpURLConnection);
                httpURLConnection.disconnect();
                b(i8, null, t7, map);
            } catch (IOException e9) {
                e = e9;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i8, e, null, map);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                b(i8, null, null, map);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
