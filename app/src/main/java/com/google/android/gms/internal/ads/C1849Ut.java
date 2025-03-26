package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1849Ut implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1919Wt f19479a;

    C1849Ut(ViewTreeObserverOnGlobalLayoutListenerC1919Wt viewTreeObserverOnGlobalLayoutListenerC1919Wt) {
        this.f19479a = viewTreeObserverOnGlobalLayoutListenerC1919Wt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.f19479a) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC1919Wt viewTreeObserverOnGlobalLayoutListenerC1919Wt = this.f19479a;
                        if (viewTreeObserverOnGlobalLayoutListenerC1919Wt.f19880b0 != parseInt) {
                            viewTreeObserverOnGlobalLayoutListenerC1919Wt.f19880b0 = parseInt;
                            this.f19479a.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e8) {
                H2.p.h("Exception occurred while getting webview content height", e8);
            }
        }
    }
}
