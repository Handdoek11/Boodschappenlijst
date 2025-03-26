package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3894r7 extends AbstractC2480e7 {
    public C3894r7(InterfaceC3786q7 interfaceC3786q7, SSLSocketFactory sSLSocketFactory) {
    }

    static List b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new O6((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2480e7
    public final C3568o7 a(U6 u62, Map map) {
        String p8 = u62.p();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(u62.q());
        URL url = new URL(p8);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int a8 = u62.a();
        httpURLConnection.setConnectTimeout(a8);
        httpURLConnection.setReadTimeout(a8);
        boolean z7 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (u62.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] C7 = u62.C();
                if (C7 != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(C7);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            u62.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                C3568o7 c3568o7 = new C3568o7(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return c3568o7;
            }
            try {
                return new C3568o7(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C3677p7(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z7 = true;
                if (!z7) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
