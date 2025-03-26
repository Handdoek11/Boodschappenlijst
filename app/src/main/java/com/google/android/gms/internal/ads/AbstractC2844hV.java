package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2844hV implements InterfaceC4474wT {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        return !TextUtils.isEmpty(c3785q60.f25820v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(C60 c60, C3785q60 c3785q60) {
        String optString = c3785q60.f25820v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        L60 l60 = c60.f14100a.f28044a;
        J60 j60 = new J60();
        j60.M(l60);
        j60.P(optString);
        Bundle d8 = d(l60.f16766d.f1172D);
        Bundle d9 = d(d8.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d9.putInt("gw", 1);
        String optString2 = c3785q60.f25820v.optString("mad_hac", null);
        if (optString2 != null) {
            d9.putString("mad_hac", optString2);
        }
        String optString3 = c3785q60.f25820v.optString("adJson", null);
        if (optString3 != null) {
            d9.putString("_ad", optString3);
        }
        d9.putBoolean("_noRefresh", true);
        Iterator<String> keys = c3785q60.f25755D.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = c3785q60.f25755D.optString(next, null);
            if (next != null) {
                d9.putString(next, optString4);
            }
        }
        d8.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d9);
        D2.X1 x12 = l60.f16766d;
        j60.h(new D2.X1(x12.f1186o, x12.f1187s, d9, x12.f1189u, x12.f1190v, x12.f1191w, x12.f1192x, x12.f1193y, x12.f1194z, x12.f1169A, x12.f1170B, x12.f1171C, d8, x12.f1173E, x12.f1174F, x12.f1175G, x12.f1176H, x12.f1177I, x12.f1178J, x12.f1179K, x12.f1180L, x12.f1181M, x12.f1182N, x12.f1183O, x12.f1184P, x12.f1185Q));
        L60 j8 = j60.j();
        Bundle bundle = new Bundle();
        C4111t60 c4111t60 = c60.f14101b.f13520b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(c4111t60.f26831a));
        bundle2.putInt("refresh_interval", c4111t60.f26833c);
        bundle2.putString("gws_query_id", c4111t60.f26832b);
        bundle.putBundle("parent_common_config", bundle2);
        L60 l602 = c60.f14100a.f28044a;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", l602.f16768f);
        bundle3.putString("allocation_id", c3785q60.f25822w);
        bundle3.putString("ad_source_name", c3785q60.f25757F);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(c3785q60.f25782c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(c3785q60.f25784d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(c3785q60.f25808p));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(c3785q60.f25802m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(c3785q60.f25790g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(c3785q60.f25792h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(c3785q60.f25794i));
        bundle3.putString("transaction_id", c3785q60.f25796j);
        bundle3.putString("valid_from_timestamp", c3785q60.f25798k);
        bundle3.putBoolean("is_closable_area_disabled", c3785q60.f25767P);
        bundle3.putString("recursive_server_response_data", c3785q60.f25807o0);
        bundle3.putBoolean("is_analytics_logging_enabled", c3785q60.f25774W);
        if (c3785q60.f25800l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", c3785q60.f25800l.f19843s);
            bundle4.putString("rb_type", c3785q60.f25800l.f19842o);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(j8, bundle, c3785q60, c60);
    }

    protected abstract com.google.common.util.concurrent.d c(L60 l60, Bundle bundle, C3785q60 c3785q60, C60 c60);
}
