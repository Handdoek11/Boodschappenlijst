package N2;

import C2.v;
import D2.A;
import G2.D0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.adadapted.android.sdk.core.ad.AdActionType;
import com.google.android.gms.internal.ads.AbstractC2207bf;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.AbstractC3187kg0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4091a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4092b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4093c;

    public a(Context context, H2.a aVar) {
        this.f4091a = context;
        this.f4092b = context.getPackageName();
        this.f4093c = aVar.f2914o;
    }

    public void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        v.t();
        map.put("device", D0.X());
        map.put("app", this.f4092b);
        v.t();
        map.put("is_lite_sdk", true != D0.f(this.f4091a) ? "0" : "1");
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.f23838a;
        List b8 = A.a().b();
        if (((Boolean) A.c().a(AbstractC3184kf.f23701I6)).booleanValue()) {
            b8.addAll(v.s().j().g().d());
        }
        map.put(AdActionType.EXTERNAL_LINK, TextUtils.join(",", b8));
        map.put("sdkVersion", this.f4093c);
        if (((Boolean) A.c().a(AbstractC3184kf.jb)).booleanValue()) {
            v.t();
            map.put("is_bstar", true != D0.c(this.f4091a) ? "0" : "1");
        }
        if (((Boolean) A.c().a(AbstractC3184kf.o9)).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.f24012t2)).booleanValue()) {
                map.put("plugin", AbstractC3187kg0.c(v.s().o()));
            }
        }
    }
}
