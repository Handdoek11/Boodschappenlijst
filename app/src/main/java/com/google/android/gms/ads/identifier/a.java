package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class a extends Thread {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Map f13061o;

    a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f13061o = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f13061o;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        c.a(buildUpon.build().toString());
    }
}
