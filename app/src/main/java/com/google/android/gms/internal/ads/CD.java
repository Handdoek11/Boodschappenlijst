package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class CD implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f14117o;

    @Override // java.lang.Runnable
    public final void run() {
        ED ed = (ED) this.f14117o.get();
        if (ed != null) {
            ed.l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.AD
                @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
                public final void a(Object obj) {
                    ((InterfaceC4669yD) obj).zzb();
                }
            });
        }
    }
}
