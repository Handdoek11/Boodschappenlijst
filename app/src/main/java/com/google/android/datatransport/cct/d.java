package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import h2.C5829c;
import i2.AbstractC5849a;
import i2.n;
import i2.o;
import i2.p;
import i2.q;
import i2.r;
import i2.s;
import i2.t;
import i2.u;
import i2.v;
import i2.w;
import i2.x;
import j2.AbstractC6060i;
import j2.C6059h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k2.f;
import k2.g;
import k2.m;
import n2.AbstractC6247a;
import o2.AbstractC6284b;
import o2.InterfaceC6283a;
import o2.InterfaceC6285c;
import t2.InterfaceC6791a;

/* loaded from: classes.dex */
final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final A4.a f13046a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f13047b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13048c;

    /* renamed from: d, reason: collision with root package name */
    final URL f13049d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6791a f13050e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6791a f13051f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13052g;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f13053a;

        /* renamed from: b, reason: collision with root package name */
        final n f13054b;

        /* renamed from: c, reason: collision with root package name */
        final String f13055c;

        a(URL url, n nVar, String str) {
            this.f13053a = url;
            this.f13054b = nVar;
            this.f13055c = str;
        }

        a a(URL url) {
            return new a(url, this.f13054b, this.f13055c);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f13056a;

        /* renamed from: b, reason: collision with root package name */
        final URL f13057b;

        /* renamed from: c, reason: collision with root package name */
        final long f13058c;

        b(int i8, URL url, long j8) {
            this.f13056a = i8;
            this.f13057b = url;
            this.f13058c = j8;
        }
    }

    d(Context context, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, int i8) {
        this.f13046a = n.b();
        this.f13048c = context;
        this.f13047b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f13049d = o(com.google.android.datatransport.cct.a.f13037c);
        this.f13050e = interfaceC6791a2;
        this.f13051f = interfaceC6791a;
        this.f13052g = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        AbstractC6247a.f("CctTransportBackend", "Making request to: %s", aVar.f13053a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f13053a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f13052g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f13055c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f13046a.a(aVar.f13054b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC6247a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC6247a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC6247a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream n8 = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(n8))).c());
                            if (n8 != null) {
                                n8.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e8) {
            e = e8;
            AbstractC6247a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            AbstractC6247a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            AbstractC6247a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            AbstractC6247a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.c();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.c();
        }
        if (w.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.c() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            AbstractC6247a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a l8;
        HashMap hashMap = new HashMap();
        for (AbstractC6060i abstractC6060i : fVar.b()) {
            String n8 = abstractC6060i.n();
            if (hashMap.containsKey(n8)) {
                ((List) hashMap.get(n8)).add(abstractC6060i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC6060i);
                hashMap.put(n8, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            AbstractC6060i abstractC6060i2 = (AbstractC6060i) ((List) entry.getValue()).get(0);
            u.a b8 = u.a().f(x.DEFAULT).g(this.f13051f.a()).h(this.f13050e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(AbstractC5849a.a().m(Integer.valueOf(abstractC6060i2.i("sdk-version"))).j(abstractC6060i2.b("model")).f(abstractC6060i2.b("hardware")).d(abstractC6060i2.b("device")).l(abstractC6060i2.b("product")).k(abstractC6060i2.b("os-uild")).h(abstractC6060i2.b("manufacturer")).e(abstractC6060i2.b("fingerprint")).c(abstractC6060i2.b("country")).g(abstractC6060i2.b("locale")).i(abstractC6060i2.b("mcc_mnc")).b(abstractC6060i2.b("application_build")).a()).a());
            try {
                b8.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b8.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC6060i abstractC6060i3 : (List) entry.getValue()) {
                C6059h e8 = abstractC6060i3.e();
                C5829c b9 = e8.b();
                if (b9.equals(C5829c.b("proto"))) {
                    l8 = t.l(e8.a());
                } else if (b9.equals(C5829c.b("json"))) {
                    l8 = t.k(new String(e8.a(), Charset.forName("UTF-8")));
                } else {
                    AbstractC6247a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b9);
                }
                l8.d(abstractC6060i3.f()).e(abstractC6060i3.o()).j(abstractC6060i3.j("tz-offset")).g(w.a().c(w.c.a(abstractC6060i3.i("net-type"))).b(w.b.a(abstractC6060i3.i("mobile-subtype"))).a());
                if (abstractC6060i3.d() != null) {
                    l8.c(abstractC6060i3.d());
                }
                if (abstractC6060i3.l() != null) {
                    l8.b(p.a().b(s.a().b(r.a().b(abstractC6060i3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (abstractC6060i3.g() != null || abstractC6060i3.h() != null) {
                    q.a a8 = q.a();
                    if (abstractC6060i3.g() != null) {
                        a8.b(abstractC6060i3.g());
                    }
                    if (abstractC6060i3.h() != null) {
                        a8.c(abstractC6060i3.h());
                    }
                    l8.f(a8.a());
                }
                arrayList3.add(l8.a());
            }
            b8.c(arrayList3);
            arrayList2.add(b8.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f13057b;
        if (url == null) {
            return null;
        }
        AbstractC6247a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f13057b);
    }

    private static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // k2.m
    public g a(f fVar) {
        n j8 = j(fVar);
        URL url = this.f13049d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a d8 = com.google.android.datatransport.cct.a.d(fVar.c());
                r3 = d8.e() != null ? d8.e() : null;
                if (d8.f() != null) {
                    url = o(d8.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC6284b.a(5, new a(url, j8, r3), new InterfaceC6283a() { // from class: com.google.android.datatransport.cct.b
                @Override // o2.InterfaceC6283a
                public final Object apply(Object obj) {
                    return this.f13045a.e((d.a) obj);
                }
            }, new InterfaceC6285c() { // from class: com.google.android.datatransport.cct.c
                @Override // o2.InterfaceC6285c
                public final Object a(Object obj, Object obj2) {
                    return d.m((d.a) obj, (d.b) obj2);
                }
            });
            int i8 = bVar.f13056a;
            if (i8 == 200) {
                return g.e(bVar.f13058c);
            }
            if (i8 < 500 && i8 != 404) {
                return i8 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e8) {
            AbstractC6247a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }

    @Override // k2.m
    public AbstractC6060i b(AbstractC6060i abstractC6060i) {
        NetworkInfo activeNetworkInfo = this.f13047b.getActiveNetworkInfo();
        return abstractC6060i.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f13048c)).c("application_build", Integer.toString(i(this.f13048c))).d();
    }

    d(Context context, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2) {
        this(context, interfaceC6791a, interfaceC6791a2, 130000);
    }
}
