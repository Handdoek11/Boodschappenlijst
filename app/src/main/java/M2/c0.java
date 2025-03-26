package M2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1794Te;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3857a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f3858b;

    /* renamed from: c, reason: collision with root package name */
    private final List f3859c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f3860d;

    /* renamed from: e, reason: collision with root package name */
    private final JSONObject f3861e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f3862f = new AtomicBoolean(false);

    c0(Context context, C1794Te c1794Te, List list, H2.a aVar) {
        this.f3857a = context;
        this.f3858b = context.getApplicationInfo();
        this.f3859c = list;
        this.f3860d = aVar;
    }

    public final JSONObject a() {
        if (!this.f3862f.get()) {
            b();
        }
        return this.f3861e;
    }

    public final void b() {
        if (this.f3862f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            if (this.f3858b != null) {
                packageInfo = h3.e.a(this.f3857a).f(this.f3858b.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                this.f3861e.put("vc", packageInfo.versionCode);
                this.f3861e.put("vnm", packageInfo.versionName);
            } catch (JSONException e8) {
                C2.v.s().x(e8, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        ApplicationInfo applicationInfo = this.f3858b;
        if (applicationInfo != null) {
            this.f3861e.put("pn", applicationInfo.packageName);
        }
        JSONObject jSONObject = this.f3861e;
        List list = this.f3859c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) D2.A.c().a(AbstractC3184kf.H9)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        this.f3861e.put("js", this.f3860d.f2914o);
        Iterator<String> keys = this.f3861e.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = this.f3861e.get(next);
            if (obj != null) {
                this.f3861e.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
