package u4;

import m4.D;
import org.json.JSONObject;
import u4.d;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C6815b implements i {
    C6815b() {
    }

    static d b(D d8) {
        return new d(d8.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // u4.i
    public d a(D d8, JSONObject jSONObject) {
        return b(d8);
    }
}
