package w0;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f44198a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44199b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44200c;

    /* renamed from: d, reason: collision with root package name */
    private final List f44201d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44202e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f44203f;

    public f(String str, String str2, String str3, List list) {
        this.f44198a = (String) y0.i.g(str);
        this.f44199b = (String) y0.i.g(str2);
        this.f44200c = (String) y0.i.g(str3);
        this.f44201d = (List) y0.i.g(list);
        this.f44203f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f44201d;
    }

    public int c() {
        return this.f44202e;
    }

    String d() {
        return this.f44203f;
    }

    public String e() {
        return this.f44198a;
    }

    public String f() {
        return this.f44199b;
    }

    public String g() {
        return this.f44200c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f44198a + ", mProviderPackage: " + this.f44199b + ", mQuery: " + this.f44200c + ", mCertificates:");
        for (int i8 = 0; i8 < this.f44201d.size(); i8++) {
            sb.append(" [");
            List list = (List) this.f44201d.get(i8);
            for (int i9 = 0; i9 < list.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f44202e);
        return sb.toString();
    }
}
