package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.adadapted.android.sdk.core.ad.AdActionType;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2865hi implements InterfaceC1662Pi {
    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                H2.p.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                H2.p.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long b8 = C2.v.c().b() + (Long.parseLong(str4) - C2.v.c().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                interfaceC4410vt.k().c(str2, str3, b8);
                return;
            } catch (NumberFormatException e8) {
                H2.p.h("Malformed timestamp for CSI tick.", e8);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                H2.p.g("No value given for CSI experiment.");
                return;
            } else {
                interfaceC4410vt.k().a().d(AdActionType.EXTERNAL_LINK, str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                H2.p.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                H2.p.g("No name given for CSI extra.");
            } else {
                interfaceC4410vt.k().a().d(str6, str7);
            }
        }
    }
}
