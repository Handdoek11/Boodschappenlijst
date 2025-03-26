package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class LZ implements InterfaceC2462dy0 {
    public static LZ a() {
        return JZ.f16269a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        AbstractC2207bf abstractC2207bf = AbstractC3184kf.Eb;
        if (!((String) D2.A.c().a(abstractC2207bf)).isEmpty()) {
            arrayList = Arrays.asList(((String) D2.A.c().a(abstractC2207bf)).split(","));
        }
        AbstractC3332ly0.b(arrayList);
        return arrayList;
    }
}
