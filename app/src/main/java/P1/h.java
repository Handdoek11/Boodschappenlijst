package P1;

import android.net.Uri;
import android.text.TextUtils;
import d2.AbstractC5709k;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class h implements J1.e {

    /* renamed from: b, reason: collision with root package name */
    private final i f4323b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f4324c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4325d;

    /* renamed from: e, reason: collision with root package name */
    private String f4326e;

    /* renamed from: f, reason: collision with root package name */
    private URL f4327f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f4328g;

    /* renamed from: h, reason: collision with root package name */
    private int f4329h;

    public h(URL url) {
        this(url, i.f4331b);
    }

    private byte[] d() {
        if (this.f4328g == null) {
            this.f4328g = c().getBytes(J1.e.f3470a);
        }
        return this.f4328g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f4326e)) {
            String str = this.f4325d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) AbstractC5709k.d(this.f4324c)).toString();
            }
            this.f4326e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f4326e;
    }

    private URL g() {
        if (this.f4327f == null) {
            this.f4327f = new URL(f());
        }
        return this.f4327f;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f4325d;
        return str != null ? str : ((URL) AbstractC5709k.d(this.f4324c)).toString();
    }

    public Map e() {
        return this.f4323b.a();
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f4323b.equals(hVar.f4323b);
    }

    public URL h() {
        return g();
    }

    @Override // J1.e
    public int hashCode() {
        if (this.f4329h == 0) {
            int hashCode = c().hashCode();
            this.f4329h = hashCode;
            this.f4329h = (hashCode * 31) + this.f4323b.hashCode();
        }
        return this.f4329h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f4331b);
    }

    public h(URL url, i iVar) {
        this.f4324c = (URL) AbstractC5709k.d(url);
        this.f4325d = null;
        this.f4323b = (i) AbstractC5709k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f4324c = null;
        this.f4325d = AbstractC5709k.b(str);
        this.f4323b = (i) AbstractC5709k.d(iVar);
    }
}
