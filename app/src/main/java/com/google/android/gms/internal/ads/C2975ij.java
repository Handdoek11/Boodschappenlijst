package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2975ij implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2867hj f23049a;

    public C2975ij(InterfaceC2867hj interfaceC2867hj) {
        this.f23049a = interfaceC2867hj;
    }

    public static void b(InterfaceC4410vt interfaceC4410vt, InterfaceC2867hj interfaceC2867hj) {
        interfaceC4410vt.Z0("/reward", new C2975ij(interfaceC2867hj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f23049a.a();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.f23049a.zzb();
                    return;
                }
                return;
            }
        }
        C1914Wo c1914Wo = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                c1914Wo = new C1914Wo(str2, parseInt);
            }
        } catch (NumberFormatException e8) {
            H2.p.h("Unable to parse reward amount.", e8);
        }
        this.f23049a.P0(c1914Wo);
    }
}
