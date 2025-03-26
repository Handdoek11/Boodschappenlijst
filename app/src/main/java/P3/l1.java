package p3;

import a4.C0817a;
import a4.C0820d;
import a4.InterfaceC0819c;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.gms.internal.consent_sdk.zzg;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40339a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f40340b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f40341c;

    /* renamed from: d, reason: collision with root package name */
    private final C6354n f40342d;

    /* renamed from: e, reason: collision with root package name */
    private final M f40343e;

    /* renamed from: f, reason: collision with root package name */
    private final a1 f40344f;

    /* renamed from: g, reason: collision with root package name */
    private final o1 f40345g;

    /* renamed from: h, reason: collision with root package name */
    private final U0 f40346h;

    l1(Application application, C6332c c6332c, Handler handler, Executor executor, C6354n c6354n, M m8, a1 a1Var, o1 o1Var, U0 u02) {
        this.f40339a = application;
        this.f40340b = handler;
        this.f40341c = executor;
        this.f40342d = c6354n;
        this.f40343e = m8;
        this.f40344f = a1Var;
        this.f40345g = o1Var;
        this.f40346h = u02;
    }

    private final C6351l0 d(C6347j0 c6347j0) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.f40339a));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = c6347j0.f40310a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    C6339f0 c6339f0 = c6347j0.f40311b;
                    if (c6339f0 != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i8 = c6339f0.f40272c;
                        if (i8 != 1) {
                            jsonWriter.name("os_type");
                            int i9 = i8 - 1;
                            if (i9 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i9 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str2 = c6339f0.f40270a;
                        if (str2 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str2);
                        }
                        Integer num = c6339f0.f40271b;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str3 = c6347j0.f40312c;
                    if (str3 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str3);
                    }
                    Boolean bool = c6347j0.f40313d;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = c6347j0.f40314e;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    C6343h0 c6343h0 = c6347j0.f40315f;
                    if (c6343h0 != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = c6343h0.f40294a;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = c6343h0.f40295b;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d8 = c6343h0.f40296c;
                        if (d8 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d8);
                        }
                        List<C6341g0> list = c6343h0.f40297d;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (C6341g0 c6341g0 : list) {
                                jsonWriter.beginObject();
                                Integer num4 = c6341g0.f40287a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = c6341g0.f40288b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = c6341g0.f40289c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = c6341g0.f40290d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    C6333c0 c6333c0 = c6347j0.f40316g;
                    if (c6333c0 != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str4 = c6333c0.f40250a;
                        if (str4 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str4);
                        }
                        String str5 = c6333c0.f40251b;
                        if (str5 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = c6333c0.f40252c;
                        if (str6 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str6);
                        }
                        jsonWriter.endObject();
                    }
                    C6345i0 c6345i0 = c6347j0.f40317h;
                    if (c6345i0 != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str7 = c6345i0.f40302a;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = c6347j0.f40318i;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((EnumC6337e0) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C6351l0 a8 = C6351l0.a(new JsonReader(new StringReader(headerField)));
                        a8.f40332a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return a8;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C6351l0 a9 = C6351l0.a(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return a9;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e8) {
            throw new zzg(4, "The server timed out.", e8);
        } catch (IOException e9) {
            throw new zzg(2, "Error making request.", e9);
        }
    }

    final /* synthetic */ void a(final InterfaceC0819c.b bVar, q1 q1Var) {
        Objects.requireNonNull(bVar);
        this.f40340b.post(new Runnable() { // from class: p3.i1
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        if (q1Var.f40377b != InterfaceC0819c.EnumC0131c.NOT_REQUIRED) {
            this.f40343e.c();
        }
    }

    final /* synthetic */ void b(Activity activity, C0820d c0820d, final InterfaceC0819c.b bVar, final InterfaceC0819c.a aVar) {
        try {
            C0817a a8 = c0820d.a();
            if (a8 == null || !a8.b()) {
                Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + AbstractC6353m0.a(this.f40339a) + "\") to set this as a debug device.");
            }
            final q1 a9 = new n1(this.f40345g, d(this.f40344f.c(activity, c0820d))).a();
            this.f40342d.f(a9.f40376a);
            this.f40342d.h(a9.f40377b);
            this.f40343e.d(a9.f40378c);
            this.f40346h.a().execute(new Runnable() { // from class: p3.j1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40319o.a(bVar, a9);
                }
            });
        } catch (zzg e8) {
            this.f40340b.post(new Runnable() { // from class: p3.g1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(e8.a());
                }
            });
        } catch (RuntimeException e9) {
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e9))));
            this.f40340b.post(new Runnable() { // from class: p3.h1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(zzgVar.a());
                }
            });
        }
    }

    final void c(final Activity activity, final C0820d c0820d, final InterfaceC0819c.b bVar, final InterfaceC0819c.a aVar) {
        this.f40341c.execute(new Runnable() { // from class: p3.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f40324o.b(activity, c0820d, bVar, aVar);
            }
        });
    }
}
