package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1165Bi implements InterfaceC1662Pi {
    C1165Bi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        try {
            C2858he0.k(interfaceC4410vt.getContext()).l();
            C2967ie0.j(interfaceC4410vt.getContext()).k();
            C3074je0.a(interfaceC4410vt.getContext()).b(null);
        } catch (IOException e8) {
            C2.v.s().x(e8, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
