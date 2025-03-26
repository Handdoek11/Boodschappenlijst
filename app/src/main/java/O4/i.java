package o4;

import org.json.JSONObject;
import p4.AbstractC6384F;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final A4.a f39862a = new C4.d().j(C6288a.f39816a).i();

    static i a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static i b(String str, String str2, String str3, String str4, long j8) {
        return new C6289b(str, str2, i(str3), str4, j8);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public AbstractC6384F.e.d.AbstractC0318e h() {
        return AbstractC6384F.e.d.AbstractC0318e.a().d(AbstractC6384F.e.d.AbstractC0318e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
