package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class M20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final AdvertisingIdClient.Info f17193a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17194b;

    /* renamed from: c, reason: collision with root package name */
    private final C2423de0 f17195c;

    public M20(AdvertisingIdClient.Info info, String str, C2423de0 c2423de0) {
        this.f17193a = info;
        this.f17194b = str;
        this.f17195c = c2423de0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            JSONObject g8 = G2.U.g((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f17193a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f17194b;
                if (str != null) {
                    g8.put("pdid", str);
                    g8.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            g8.put("rdid", this.f17193a.getId());
            g8.put("is_lat", this.f17193a.isLimitAdTrackingEnabled());
            g8.put("idtype", "adid");
            C2423de0 c2423de0 = this.f17195c;
            if (c2423de0.c()) {
                g8.put("paidv1_id_android_3p", c2423de0.b());
                g8.put("paidv1_creation_time_android_3p", this.f17195c.a());
            }
        } catch (JSONException e8) {
            AbstractC0608p0.l("Failed putting Ad ID.", e8);
        }
    }
}
