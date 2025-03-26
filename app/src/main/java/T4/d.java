package T4;

import I6.p;
import J6.AbstractC0650j;
import J6.G;
import J6.r;
import R4.C0694b;
import U6.AbstractC0719i;
import U6.M;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONObject;
import x6.C6916E;
import x6.q;

/* loaded from: classes2.dex */
public final class d implements T4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f5218d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C0694b f5219a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.g f5220b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5221c;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f5222o;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f5224t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ p f5225u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ p f5226v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Map map, p pVar, p pVar2, A6.d dVar) {
            super(2, dVar);
            this.f5224t = map;
            this.f5225u = pVar;
            this.f5226v = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return d.this.new b(this.f5224t, this.f5225u, this.f5226v, dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f5222o;
            try {
                if (i8 == 0) {
                    q.b(obj);
                    URLConnection openConnection = d.this.c().openConnection();
                    r.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry entry : this.f5224t.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        G g8 = new G();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            g8.f3547o = readLine;
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p pVar = this.f5225u;
                        this.f5222o = 1;
                        if (pVar.invoke(jSONObject, this) == e8) {
                            return e8;
                        }
                    } else {
                        p pVar2 = this.f5226v;
                        String str = "Bad response code: " + responseCode;
                        this.f5222o = 2;
                        if (pVar2.invoke(str, this) == e8) {
                            return e8;
                        }
                    }
                } else {
                    if (i8 != 1 && i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
            } catch (Exception e9) {
                p pVar3 = this.f5226v;
                String message = e9.getMessage();
                if (message == null) {
                    message = e9.toString();
                }
                this.f5222o = 3;
                if (pVar3.invoke(message, this) == e8) {
                    return e8;
                }
            }
            return C6916E.f44463a;
        }
    }

    public d(C0694b c0694b, A6.g gVar, String str) {
        r.e(c0694b, "appInfo");
        r.e(gVar, "blockingDispatcher");
        r.e(str, "baseUrl");
        this.f5219a = c0694b;
        this.f5220b = gVar;
        this.f5221c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f5221c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f5219a.b()).appendPath("settings").appendQueryParameter("build_version", this.f5219a.a().a()).appendQueryParameter("display_version", this.f5219a.a().f()).build().toString());
    }

    @Override // T4.a
    public Object a(Map map, p pVar, p pVar2, A6.d dVar) {
        Object g8 = AbstractC0719i.g(this.f5220b, new b(map, pVar, pVar2, null), dVar);
        return g8 == B6.b.e() ? g8 : C6916E.f44463a;
    }

    public /* synthetic */ d(C0694b c0694b, A6.g gVar, String str, int i8, AbstractC0650j abstractC0650j) {
        this(c0694b, gVar, (i8 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
