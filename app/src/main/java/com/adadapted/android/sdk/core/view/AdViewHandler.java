package com.adadapted.android.sdk.core.view;

import J6.r;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.adadapted.android.sdk.constants.Config;
import com.adadapted.android.sdk.core.ad.Ad;

/* loaded from: classes.dex */
public final class AdViewHandler {
    public static final int $stable = 8;
    private final Context context;

    public AdViewHandler(Context context) {
        r.e(context, "context");
        this.context = context;
    }

    private final Uri buildReportAdUri(String str, String str2) {
        Uri build = Uri.parse(Config.INSTANCE.getAdReportingHost()).buildUpon().appendQueryParameter(Config.AD_ID_PARAM, str).appendQueryParameter(Config.UDID_PARAM, str2).build();
        r.d(build, "build(...)");
        return build;
    }

    public final void handleLink(Ad ad) {
        r.e(ad, "ad");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(Uri.parse(ad.getActionPath()));
        this.context.startActivity(intent);
    }

    public final void handlePopup(Ad ad) {
        r.e(ad, "ad");
        this.context.startActivity(new AaWebViewPopupActivity().createActivity(this.context, ad));
    }

    public final void handleReportAd(String str, String str2) {
        r.e(str, "adId");
        r.e(str2, "udid");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(buildReportAdUri(str, str2));
        this.context.startActivity(intent);
    }
}
