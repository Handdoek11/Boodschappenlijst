package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3646os implements InterfaceC1662Pi {
    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC1567Mr interfaceC1567Mr = (InterfaceC1567Mr) obj;
        BinderC2024Zt q8 = interfaceC1567Mr.q();
        if (q8 == null) {
            try {
                BinderC2024Zt binderC2024Zt = new BinderC2024Zt(interfaceC1567Mr, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC1567Mr.B(binderC2024Zt);
                q8 = binderC2024Zt;
            } catch (NullPointerException e8) {
                e = e8;
                H2.p.e("Unable to parse videoMeta message.", e);
                C2.v.s().x(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e9) {
                e = e9;
                H2.p.e("Unable to parse videoMeta message.", e);
                C2.v.s().x(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i8 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i8 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (H2.p.j(3)) {
            H2.p.b("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i8 + " , aspectRatio : " + str);
        }
        q8.u7(parseFloat2, parseFloat, i8, equals, parseFloat3);
    }
}
