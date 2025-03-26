package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3083jj implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23340a;

    public C3083jj(Context context) {
        this.f23340a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        AbstractC0608p0.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            C2.v.t();
            G2.D0.t(this.f23340a, intent);
        } catch (RuntimeException e8) {
            H2.p.h("Failed to open Share Sheet", e8);
            C2.v.s().x(e8, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
