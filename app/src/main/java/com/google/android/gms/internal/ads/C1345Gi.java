package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1345Gi implements InterfaceC1662Pi {
    C1345Gi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        if (interfaceC4410vt.G() != null) {
            interfaceC4410vt.G().zza();
        }
        F2.x O7 = interfaceC4410vt.O();
        if (O7 != null) {
            O7.zzb();
            return;
        }
        F2.x J7 = interfaceC4410vt.J();
        if (J7 != null) {
            J7.zzb();
        } else {
            H2.p.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
