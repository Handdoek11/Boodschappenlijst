package C2;

import D2.X1;
import G2.AbstractC0585e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC1901Wf;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Context f800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f801b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f802c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    private String f803d;

    /* renamed from: e, reason: collision with root package name */
    private String f804e;

    /* renamed from: f, reason: collision with root package name */
    private final String f805f;

    public s(Context context, String str) {
        String concat;
        this.f800a = context.getApplicationContext();
        this.f801b = str;
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + h3.e.a(context).f(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            H2.p.e("Unable to get package version name for reporting", e8);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f805f = concat;
    }

    public final String a() {
        return this.f805f;
    }

    public final String b() {
        return this.f804e;
    }

    public final String c() {
        return this.f801b;
    }

    public final String d() {
        return this.f803d;
    }

    public final Map e() {
        return this.f802c;
    }

    public final void f(X1 x12, H2.a aVar) {
        this.f803d = x12.f1169A.f1153o;
        Bundle bundle = x12.f1172D;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) AbstractC1901Wf.f19824c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f804e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f802c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        this.f802c.put("SDKVersion", aVar.f2914o);
        if (((Boolean) AbstractC1901Wf.f19822a.e()).booleanValue()) {
            Bundle b8 = AbstractC0585e.b(this.f800a, (String) AbstractC1901Wf.f19823b.e());
            for (String str3 : b8.keySet()) {
                this.f802c.put(str3, b8.get(str3).toString());
            }
        }
    }
}
