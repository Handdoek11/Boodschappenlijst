package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class BD implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final WeakReference f13755o;

    @Override // java.lang.Runnable
    public final void run() {
        ED ed = (ED) this.f13755o.get();
        if (ed != null) {
            ed.l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.zD
                @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
                public final void a(Object obj) {
                    ((InterfaceC4669yD) obj).zza();
                }
            });
        }
    }
}
