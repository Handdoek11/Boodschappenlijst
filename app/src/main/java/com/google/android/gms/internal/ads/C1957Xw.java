package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957Xw implements InterfaceC1325Fw {

    /* renamed from: a, reason: collision with root package name */
    private final C3676p60 f20159a;

    public C1957Xw(C3676p60 c3676p60) {
        this.f20159a = c3676p60;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1325Fw
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f20159a.b(Boolean.parseBoolean(str));
        } catch (Exception e8) {
            throw new IllegalStateException("Invalid render_in_browser state", e8);
        }
    }
}
