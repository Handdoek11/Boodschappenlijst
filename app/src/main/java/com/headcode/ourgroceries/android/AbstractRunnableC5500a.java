package com.headcode.ourgroceries.android;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.HttpsURLConnection;
import q5.AbstractC6635a;

/* renamed from: com.headcode.ourgroceries.android.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC5500a implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractRunnableC5500a f34637u = new C0245a(null);

    /* renamed from: v, reason: collision with root package name */
    private static URL f34638v;

    /* renamed from: o, reason: collision with root package name */
    private final s5.h0 f34639o;

    /* renamed from: s, reason: collision with root package name */
    private s5.o0 f34640s = s5.o0.RS_UNKNOWN_ERROR;

    /* renamed from: t, reason: collision with root package name */
    private s5.n0 f34641t = null;

    /* renamed from: com.headcode.ourgroceries.android.a$a, reason: collision with other inner class name */
    class C0245a extends AbstractRunnableC5500a {
        C0245a(s5.h0 h0Var) {
            super(h0Var);
        }

        @Override // com.headcode.ourgroceries.android.AbstractRunnableC5500a
        public void h(AbstractRunnableC5500a abstractRunnableC5500a) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.a$b */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34642a;

        static {
            int[] iArr = new int[s5.o0.values().length];
            f34642a = iArr;
            try {
                iArr[s5.o0.RS_TRANSPORT_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34642a[s5.o0.RS_REQUEST_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34642a[s5.o0.RS_INTERNAL_SERVER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34642a[s5.o0.RS_RESPONSE_PARSING_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractRunnableC5500a(s5.h0 h0Var) {
        this.f34639o = h0Var;
    }

    public static String a(Context context) {
        String a8 = V.a(context);
        return a8 == null ? "https://api.ourgroceries.com/mobile/v1/" : a8;
    }

    public static void e(Context context) {
        try {
            f34638v = new URL(a(context));
        } catch (MalformedURLException e8) {
            AbstractC6635a.c("OG-APIRequest", e8);
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:104), block:B:15:0x0067 */
    private void i() {
        HttpURLConnection httpURLConnection;
        ClassCastException e8;
        IOException e9;
        HttpURLConnection httpURLConnection2;
        byte[] d8;
        if (f()) {
            this.f34640s = s5.o0.RS_REQUEST_CANCELLED;
            return;
        }
        HttpURLConnection httpURLConnection3 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                d8 = this.f34639o.d();
                httpURLConnection = (HttpURLConnection) f34638v.openConnection();
            } catch (ConnectException | UnknownHostException unused) {
            } catch (IOException e10) {
                httpURLConnection = null;
                e9 = e10;
            } catch (ClassCastException e11) {
                httpURLConnection = null;
                e8 = e11;
            }
            try {
                try {
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                    httpURLConnection.setRequestProperty("Content-Length", Integer.toString(d8.length));
                    httpURLConnection.setFixedLengthStreamingMode(d8.length);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                        OurApplication ourApplication = OurApplication.f34286H;
                        if (ourApplication != null) {
                            httpsURLConnection.setSSLSocketFactory(SSLCertificateSocketFactory.getDefault(30000, ourApplication.m()));
                        }
                    }
                } catch (IOException e12) {
                    e9 = e12;
                    AbstractC6635a.f("OG-APIRequest", e9.toString());
                    if (e9 instanceof InvalidProtocolBufferException) {
                        this.f34640s = s5.o0.RS_RESPONSE_PARSING_FAILED;
                    } else {
                        this.f34640s = s5.o0.RS_TRANSPORT_ERROR;
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                } catch (ClassCastException e13) {
                    e8 = e13;
                    com.google.firebase.crashlytics.a.b().e(e8);
                    AbstractC6635a.b("OG-APIRequest", e8.toString());
                    this.f34640s = s5.o0.RS_TRANSPORT_ERROR;
                    if (httpURLConnection == null) {
                        return;
                    }
                    httpURLConnection.disconnect();
                }
                if (f()) {
                    this.f34640s = s5.o0.RS_REQUEST_CANCELLED;
                    httpURLConnection.disconnect();
                    return;
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(d8);
                outputStream.close();
                if (f()) {
                    this.f34640s = s5.o0.RS_REQUEST_CANCELLED;
                    httpURLConnection.disconnect();
                    return;
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 4096);
                    try {
                        if (f()) {
                            this.f34640s = s5.o0.RS_REQUEST_CANCELLED;
                            httpURLConnection.disconnect();
                            return;
                        }
                        this.f34641t = s5.n0.M(bufferedInputStream);
                        bufferedInputStream.close();
                        this.f34640s = this.f34641t.w();
                        AbstractC6635a.a("OG-APIRequest", "Received response " + this.f34641t.t() + ", status " + this.f34641t.w());
                    } finally {
                        bufferedInputStream.close();
                    }
                } else {
                    AbstractC6635a.f("OG-APIRequest", "HTTP post failed, response code " + httpURLConnection.getResponseCode() + ": " + httpURLConnection.getResponseMessage());
                    this.f34640s = s5.o0.RS_TRANSPORT_ERROR;
                }
                httpURLConnection.disconnect();
            } catch (ConnectException | UnknownHostException unused2) {
                httpURLConnection3 = httpURLConnection;
                this.f34640s = s5.o0.RS_TRANSPORT_ERROR;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection3 = httpURLConnection2;
            if (httpURLConnection3 != null) {
                httpURLConnection3.disconnect();
            }
            throw th;
        }
    }

    public s5.h0 b() {
        return this.f34639o;
    }

    public s5.n0 c() {
        return this.f34641t;
    }

    public s5.o0 d() {
        return this.f34640s;
    }

    protected boolean f() {
        return false;
    }

    public boolean g() {
        int i8 = b.f34642a[this.f34640s.ordinal()];
        return i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4;
    }

    public abstract void h(AbstractRunnableC5500a abstractRunnableC5500a);

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
        } catch (Exception e8) {
            com.google.firebase.crashlytics.a.b().e(e8);
            AbstractC6635a.c("OG-APIRequest", e8);
        }
        h(this);
    }
}
