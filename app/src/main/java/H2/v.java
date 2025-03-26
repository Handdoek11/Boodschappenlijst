package H2;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final x f2962a;

    private v(x xVar) {
        this.f2962a = xVar;
    }

    public static v a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new v(optJSONObject == null ? new o(1, 0, 1.0d, false) : new o(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final x b() {
        return this.f2962a;
    }
}
