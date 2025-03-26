package M2;

import com.google.android.gms.internal.ads.AbstractC3840qg;
import com.google.android.gms.internal.ads.C1831Uf;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class Y extends O2.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0654a f3830b;

    Y(C0654a c0654a, String str) {
        this.f3829a = str;
        this.f3830b = c0654a;
    }

    @Override // O2.b
    public final void a(String str) {
        H2.p.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String concat = ((Boolean) AbstractC3840qg.f25979a.e()).booleanValue() ? ",\"as\":".concat(this.f3830b.f3846k.a().toString()) : "";
        String str2 = this.f3829a;
        Locale locale = Locale.getDefault();
        C1831Uf c1831Uf = AbstractC3840qg.f25981c;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c1831Uf.e()).booleanValue() ? ((Long) AbstractC3840qg.f25984f.e()).longValue() : 0L), concat);
        if (((Boolean) c1831Uf.e()).booleanValue()) {
            try {
                this.f3830b.f3843h.execute(new Runnable() { // from class: M2.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3825o.f3830b.f3837b.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                C2.v.s().w(e8, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f3830b.f3837b.evaluateJavascript(format, null);
        }
        if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue() && ((Boolean) AbstractC3840qg.f25980b.e()).booleanValue()) {
            this.f3830b.f3847l.c();
        }
    }

    @Override // O2.b
    public final void b(O2.a aVar) {
        final String format;
        String b8 = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f3829a);
            jSONObject.put("signal", b8);
            jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC3840qg.f25981c.e()).booleanValue() ? ((Long) AbstractC3840qg.f25984f.e()).longValue() : 0L);
            if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue()) {
                jSONObject.put("as", this.f3830b.f3846k.a());
            }
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String concat = ((Boolean) AbstractC3840qg.f25979a.e()).booleanValue() ? ",\"as\":".concat(this.f3830b.f3846k.a().toString()) : "";
            format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f3829a, aVar.b(), Long.valueOf(((Boolean) AbstractC3840qg.f25981c.e()).booleanValue() ? ((Long) AbstractC3840qg.f25984f.e()).longValue() : 0L), concat);
        }
        if (((Boolean) AbstractC3840qg.f25981c.e()).booleanValue()) {
            try {
                this.f3830b.f3843h.execute(new Runnable() { // from class: M2.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3827o.f3830b.f3837b.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e8) {
                C2.v.s().w(e8, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f3830b.f3837b.evaluateJavascript(format, null);
        }
        if (((Boolean) AbstractC3840qg.f25979a.e()).booleanValue() && ((Boolean) AbstractC3840qg.f25980b.e()).booleanValue()) {
            this.f3830b.f3847l.c();
        }
    }
}
