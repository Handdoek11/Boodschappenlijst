package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2243bx implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f21032a;

    public C2243bx(Context context) {
        this.f21032a = C2.v.u().a(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        String cookie;
        if (this.f21032a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f21032a.setCookie((String) D2.A.c().a(AbstractC3184kf.f23823Y0), str);
            return;
        }
        String str2 = (String) D2.A.c().a(AbstractC3184kf.f23823Y0);
        CookieManager cookieManager = this.f21032a;
        if (cookieManager == null || (cookie = cookieManager.getCookie(str2)) == null) {
            return;
        }
        List f8 = C2970ig0.b(AbstractC1232Df0.c(';')).f(cookie);
        for (int i8 = 0; i8 < f8.size(); i8++) {
            CookieManager cookieManager2 = this.f21032a;
            Iterator it = C2970ig0.b(AbstractC1232Df0.c('=')).d((String) f8.get(i8)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager2.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) D2.A.c().a(AbstractC3184kf.f23711K0))));
        }
    }
}
