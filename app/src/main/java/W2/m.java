package w2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends C6876b {

    /* renamed from: e, reason: collision with root package name */
    private final u f44293e;

    public m(int i8, String str, String str2, C6876b c6876b, u uVar) {
        super(i8, str, str2, c6876b);
        this.f44293e = uVar;
    }

    @Override // w2.C6876b
    public final JSONObject e() {
        JSONObject e8 = super.e();
        u f8 = f();
        if (f8 == null) {
            e8.put("Response Info", "null");
        } else {
            e8.put("Response Info", f8.g());
        }
        return e8;
    }

    public u f() {
        return this.f44293e;
    }

    @Override // w2.C6876b
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
