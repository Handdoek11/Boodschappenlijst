package H2;

import android.util.JsonWriter;
import f3.AbstractC5779c;
import f3.InterfaceC5781e;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2942c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2943d = false;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2946g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final List f2947a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2941b = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final InterfaceC5781e f2944e = f3.h.d();

    /* renamed from: f, reason: collision with root package name */
    private static final Set f2945f = new HashSet(Arrays.asList(new String[0]));

    public m(String str) {
        this.f2947a = !k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(AbstractC5779c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i8, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i8);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f2941b) {
            f2942c = false;
            f2943d = false;
            p.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z7) {
        synchronized (f2941b) {
            f2942c = true;
            f2943d = z7;
        }
    }

    public static boolean k() {
        boolean z7;
        synchronized (f2941b) {
            try {
                z7 = false;
                if (f2942c && f2943d) {
                    z7 = true;
                }
            } finally {
            }
        }
        return z7;
    }

    public static boolean l() {
        boolean z7;
        synchronized (f2941b) {
            z7 = f2942c;
        }
        return z7;
    }

    private static synchronized void m(String str) {
        synchronized (m.class) {
            try {
                p.f("GMA Debug BEGIN");
                int i8 = 0;
                while (i8 < str.length()) {
                    int i9 = i8 + 4000;
                    p.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i8, Math.min(i9, str.length())))));
                    i8 = i9;
                }
                p.f("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void n(String str, l lVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f2944e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f2947a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            lVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            p.e("unable to log", e8);
        }
        m(stringWriter.toString());
    }

    private final void o(final String str) {
        n("onNetworkRequestError", new l() { // from class: H2.j
            @Override // H2.l
            public final void a(JsonWriter jsonWriter) {
                int i8 = m.f2946g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final String str, final String str2, final Map map, final byte[] bArr) {
        n("onNetworkRequest", new l() { // from class: H2.h
            @Override // H2.l
            public final void a(JsonWriter jsonWriter) {
                m.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final Map map, final int i8) {
        n("onNetworkResponse", new l() { // from class: H2.k
            @Override // H2.l
            public final void a(JsonWriter jsonWriter) {
                m.b(i8, map, jsonWriter);
            }
        });
    }

    private static void r(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f2945f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        p.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (k()) {
            p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i8) {
        if (k()) {
            String str = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i8);
            if (i8 < 200 || i8 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e8) {
                    p.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
                }
                o(str);
            }
        }
    }

    public final void f(Map map, int i8) {
        if (k()) {
            q(map, i8);
            if (i8 < 200 || i8 >= 300) {
                o(null);
            }
        }
    }

    public final void g(String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new l() { // from class: H2.i
            @Override // H2.l
            public final void a(JsonWriter jsonWriter) {
                int i8 = m.f2946g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String a8 = AbstractC5779c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(a8);
                } else {
                    String j8 = g.j(a8);
                    if (j8 != null) {
                        jsonWriter.name("bodydigest").value(j8);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
