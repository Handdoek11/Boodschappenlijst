package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2459dx implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final C3490nP f21702a;

    C2459dx(C3490nP c3490nP) {
        this.f21702a = c3490nP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21702a.p(str.equals("true"));
    }
}
