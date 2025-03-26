package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.aY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2086aY implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    final L60 f20714a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20715b;

    public C2086aY(L60 l60, long j8) {
        this.f20714a = l60;
        this.f20715b = j8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((KB) obj).f16552b;
        L60 l60 = this.f20714a;
        bundle.putString("slotname", l60.f16768f);
        D2.X1 x12 = l60.f16766d;
        if (x12.f1191w) {
            bundle.putBoolean("test_request", true);
        }
        int i8 = x12.f1192x;
        Y60.e(bundle, "tag_for_child_directed_treatment", i8, i8 != -1);
        if (x12.f1186o >= 8) {
            int i9 = x12.f1179K;
            Y60.e(bundle, "tag_for_under_age_of_consent", i9, i9 != -1);
        }
        Y60.c(bundle, "url", x12.f1171C);
        Y60.d(bundle, "neighboring_content_urls", x12.f1181M);
        Bundle bundle2 = (Bundle) x12.f1188t.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) D2.A.c().a(AbstractC3184kf.f24008s7)).split(",", -1)));
        for (String str : x12.f1188t.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        Y60.b(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        D2.X1 x12 = this.f20714a.f16766d;
        bundle.putInt("http_timeout_millis", x12.f1182N);
        bundle.putString("slotname", this.f20714a.f16768f);
        int i8 = this.f20714a.f16777o.f27749a;
        if (i8 == 0) {
            throw null;
        }
        int i9 = i8 - 1;
        if (i9 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i9 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f20715b);
        Y60.g(bundle, "is_sdk_preload", true, x12.B0());
        Y60.f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(x12.f1187s)), x12.f1187s != -1);
        Y60.b(bundle, "extras", x12.f1188t);
        int i10 = x12.f1189u;
        Y60.e(bundle, "cust_gender", i10, i10 != -1);
        Y60.d(bundle, "kw", x12.f1190v);
        int i11 = x12.f1192x;
        Y60.e(bundle, "tag_for_child_directed_treatment", i11, i11 != -1);
        if (x12.f1191w) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", x12.f1184P);
        Y60.e(bundle, "d_imp_hdr", 1, x12.f1186o >= 2 && x12.f1193y);
        String str = x12.f1194z;
        Y60.f(bundle, "ppid", str, x12.f1186o >= 2 && !TextUtils.isEmpty(str));
        Location location = x12.f1170B;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong("lat", (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        Y60.c(bundle, "url", x12.f1171C);
        Y60.d(bundle, "neighboring_content_urls", x12.f1181M);
        Y60.b(bundle, "custom_targeting", x12.f1173E);
        Y60.d(bundle, "category_exclusions", x12.f1174F);
        Y60.c(bundle, "request_agent", x12.f1175G);
        Y60.c(bundle, "request_pkg", x12.f1176H);
        Y60.g(bundle, "is_designed_for_families", x12.f1177I, x12.f1186o >= 7);
        if (x12.f1186o >= 8) {
            int i12 = x12.f1179K;
            Y60.e(bundle, "tag_for_under_age_of_consent", i12, i12 != -1);
            Y60.c(bundle, "max_ad_content_rating", x12.f1180L);
        }
    }
}
