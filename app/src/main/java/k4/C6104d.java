package k4;

import android.os.Bundle;
import j4.g;
import l4.InterfaceC6173a;
import l4.InterfaceC6174b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6104d implements InterfaceC6102b, InterfaceC6174b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6173a f38528a;

    private static String c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // l4.InterfaceC6174b
    public void a(InterfaceC6173a interfaceC6173a) {
        this.f38528a = interfaceC6173a;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // k4.InterfaceC6102b
    public void b(String str, Bundle bundle) {
        InterfaceC6173a interfaceC6173a = this.f38528a;
        if (interfaceC6173a != null) {
            try {
                interfaceC6173a.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
