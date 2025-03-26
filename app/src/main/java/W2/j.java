package w2;

import D2.W0;
import D2.g2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final g2 f44290a;

    /* renamed from: b, reason: collision with root package name */
    private final C6876b f44291b;

    private j(g2 g2Var) {
        this.f44290a = g2Var;
        W0 w02 = g2Var.f1271t;
        this.f44291b = w02 == null ? null : w02.A0();
    }

    public static j e(g2 g2Var) {
        if (g2Var != null) {
            return new j(g2Var);
        }
        return null;
    }

    public String a() {
        return this.f44290a.f1274w;
    }

    public String b() {
        return this.f44290a.f1276y;
    }

    public String c() {
        return this.f44290a.f1275x;
    }

    public String d() {
        return this.f44290a.f1273v;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f44290a.f1269o);
        jSONObject.put("Latency", this.f44290a.f1270s);
        String d8 = d();
        if (d8 == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", d8);
        }
        String a8 = a();
        if (a8 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", a8);
        }
        String c8 = c();
        if (c8 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", c8);
        }
        String b8 = b();
        if (b8 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", b8);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f44290a.f1272u.keySet()) {
            jSONObject2.put(str, this.f44290a.f1272u.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C6876b c6876b = this.f44291b;
        if (c6876b == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", c6876b.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
