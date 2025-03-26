package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import d2.AbstractC5705g;
import d2.C5701c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public class j implements d {

    /* renamed from: x, reason: collision with root package name */
    static final b f12631x = new a();

    /* renamed from: o, reason: collision with root package name */
    private final P1.h f12632o;

    /* renamed from: s, reason: collision with root package name */
    private final int f12633s;

    /* renamed from: t, reason: collision with root package name */
    private final b f12634t;

    /* renamed from: u, reason: collision with root package name */
    private HttpURLConnection f12635u;

    /* renamed from: v, reason: collision with root package name */
    private InputStream f12636v;

    /* renamed from: w, reason: collision with root package name */
    private volatile boolean f12637w;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(P1.h hVar, int i8) {
        this(hVar, i8, f12631x);
    }

    private HttpURLConnection c(URL url, Map map) {
        try {
            HttpURLConnection a8 = this.f12634t.a(url);
            for (Map.Entry entry : map.entrySet()) {
                a8.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            a8.setConnectTimeout(this.f12633s);
            a8.setReadTimeout(this.f12633s);
            a8.setUseCaches(false);
            a8.setDoInput(true);
            a8.setInstanceFollowRedirects(false);
            return a8;
        } catch (IOException e8) {
            throw new HttpException("URL.openConnection threw", 0, e8);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e8) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e8);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f12636v = C5701c.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f12636v = httpURLConnection.getInputStream();
            }
            return this.f12636v;
        } catch (IOException e8) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e8);
        }
    }

    private static boolean h(int i8) {
        return i8 / 100 == 2;
    }

    private static boolean i(int i8) {
        return i8 / 100 == 3;
    }

    private InputStream j(URL url, int i8, URL url2, Map map) {
        if (i8 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection c8 = c(url, map);
        this.f12635u = c8;
        try {
            c8.connect();
            this.f12636v = this.f12635u.getInputStream();
            if (this.f12637w) {
                return null;
            }
            int f8 = f(this.f12635u);
            if (h(f8)) {
                return g(this.f12635u);
            }
            if (!i(f8)) {
                if (f8 == -1) {
                    throw new HttpException(f8);
                }
                try {
                    throw new HttpException(this.f12635u.getResponseMessage(), f8);
                } catch (IOException e8) {
                    throw new HttpException("Failed to get a response message", f8, e8);
                }
            }
            String headerField = this.f12635u.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", f8);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i8 + 1, url, map);
            } catch (MalformedURLException e9) {
                throw new HttpException("Bad redirect url: " + headerField, f8, e9);
            }
        } catch (IOException e10) {
            throw new HttpException("Failed to connect or obtain data", f(this.f12635u), e10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f12636v;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f12635u;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f12635u = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f12637w = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public J1.a d() {
        return J1.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        StringBuilder sb;
        long b8 = AbstractC5705g.b();
        try {
            try {
                aVar.f(j(this.f12632o.h(), 0, null, this.f12632o.e()));
            } catch (IOException e8) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e8);
                }
                aVar.c(e8);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(AbstractC5705g.a(b8));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC5705g.a(b8));
            }
            throw th;
        }
    }

    j(P1.h hVar, int i8, b bVar) {
        this.f12632o = hVar;
        this.f12633s = i8;
        this.f12634t = bVar;
    }
}
