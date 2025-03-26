package y4;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: y4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6948c {

    /* renamed from: a, reason: collision with root package name */
    private final C6946a f44581a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f44582b;

    public C6948c(C6946a c6946a) {
        this.f44581a = c6946a;
        this.f44582b = b(c6946a);
    }

    private static void a(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    private static Bundle b(C6946a c6946a) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (c6946a == null || c6946a.D0() == null || (bundle = c6946a.D0().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        a("medium", "utm_medium", bundle2, bundle3);
        a("source", "utm_source", bundle2, bundle3);
        a("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }
}
