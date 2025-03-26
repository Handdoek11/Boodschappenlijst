package r4;

import j4.g;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import n4.f;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6705a {

    /* renamed from: a, reason: collision with root package name */
    private final String f42606a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f42607b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f42608c = new HashMap();

    public C6705a(String str, Map map) {
        this.f42606a = str;
        this.f42607b = map;
    }

    private String a(Map map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        return sb.toString();
    }

    private String b(String str, Map map) {
        String a8 = a(map);
        if (a8.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + a8;
        }
        if (!str.endsWith("&")) {
            a8 = "&" + a8;
        }
        return str + a8;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public C6707c c() {
        HttpsURLConnection httpsURLConnection;
        f.d();
        InputStream inputStream = null;
        String e8 = null;
        inputStream = null;
        try {
            String b8 = b(this.f42606a, this.f42607b);
            g.f().i("GET Request URL: " + b8);
            httpsURLConnection = (HttpsURLConnection) new URL(b8).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.f42608c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e8 = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C6707c(responseCode, e8);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public C6705a d(String str, String str2) {
        this.f42608c.put(str, str2);
        return this;
    }
}
