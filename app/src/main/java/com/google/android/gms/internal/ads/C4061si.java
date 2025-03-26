package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.si, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4061si implements InterfaceC1662Pi {
    C4061si() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        WindowManager windowManager = (WindowManager) interfaceC4410vt.getContext().getSystemService("window");
        C2.v.t();
        DisplayMetrics Z7 = G2.D0.Z(windowManager);
        int i8 = Z7.widthPixels;
        int i9 = Z7.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) interfaceC4410vt).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i8));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i9));
        interfaceC4410vt.D0("locationReady", hashMap);
        H2.p.g("GET LOCATION COMPILED");
    }
}
