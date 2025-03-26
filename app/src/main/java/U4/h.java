package u4;

import m4.D;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final D f44000a;

    h(D d8) {
        this.f44000a = d8;
    }

    private static i a(int i8) {
        if (i8 == 3) {
            return new m();
        }
        j4.g.f().d("Could not determine SettingsJsonTransform for settings version " + i8 + ". Using default settings values.");
        return new C6815b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f44000a, jSONObject);
    }
}
