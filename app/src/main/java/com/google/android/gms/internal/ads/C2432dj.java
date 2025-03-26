package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2432dj implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final LP f21638a;

    public C2432dj(LP lp) {
        this.f21638a = lp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.m9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f21638a.y7(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f21638a.z7(str2, str3);
            }
        }
    }
}
