package com.adadapted.android.sdk.core.view;

import J6.s;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.device.DeviceInfo;
import com.adadapted.android.sdk.core.device.DeviceInfoClient;
import x6.C6916E;

/* loaded from: classes.dex */
final class AdadaptedComposable$InternalZoneView$1$2 extends s implements I6.a {
    final /* synthetic */ AdadaptedComposable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdadaptedComposable$InternalZoneView$1$2(AdadaptedComposable adadaptedComposable) {
        super(0);
        this.this$0 = adadaptedComposable;
    }

    @Override // I6.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m21invoke();
        return C6916E.f44463a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m21invoke() {
        String udid;
        String id;
        DeviceInfo cachedDeviceInfo = DeviceInfoClient.INSTANCE.getCachedDeviceInfo();
        if (cachedDeviceInfo == null || (udid = cachedDeviceInfo.getUdid()) == null) {
            return;
        }
        AdadaptedComposable adadaptedComposable = this.this$0;
        Ad currentAd = adadaptedComposable.webView.getCurrentAd();
        if (currentAd == null || (id = currentAd.getId()) == null) {
            return;
        }
        adadaptedComposable.presenter.onReportAdClicked(id, udid);
    }
}
