package com.google.android.gms.internal.ads;

import G2.AbstractC0602m0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class H30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f15610a;

    public H30(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f15610a = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f15610a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.G30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) D2.A.c().a(AbstractC3184kf.f23806W);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) D2.A.c().a(AbstractC3184kf.f23814X)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, AbstractC0602m0.a(str2));
                        }
                    }
                }
                return new I30(hashMap);
            }
        });
    }
}
