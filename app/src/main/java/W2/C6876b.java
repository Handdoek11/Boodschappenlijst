package w2;

import D2.W0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6876b {

    /* renamed from: a, reason: collision with root package name */
    private final int f44253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44254b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44255c;

    /* renamed from: d, reason: collision with root package name */
    private final C6876b f44256d;

    public C6876b(int i8, String str, String str2, C6876b c6876b) {
        this.f44253a = i8;
        this.f44254b = str;
        this.f44255c = str2;
        this.f44256d = c6876b;
    }

    public int a() {
        return this.f44253a;
    }

    public String b() {
        return this.f44255c;
    }

    public String c() {
        return this.f44254b;
    }

    public final W0 d() {
        W0 w02;
        C6876b c6876b = this.f44256d;
        if (c6876b == null) {
            w02 = null;
        } else {
            String str = c6876b.f44255c;
            w02 = new W0(c6876b.f44253a, c6876b.f44254b, str, null, null);
        }
        return new W0(this.f44253a, this.f44254b, this.f44255c, w02, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f44253a);
        jSONObject.put("Message", this.f44254b);
        jSONObject.put("Domain", this.f44255c);
        C6876b c6876b = this.f44256d;
        if (c6876b == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", c6876b.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public C6876b(int i8, String str, String str2) {
        this(i8, str, str2, null);
    }
}
