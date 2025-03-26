package com.google.android.gms.internal.ads;

import java.util.Set;
import w2.w;

/* loaded from: classes.dex */
public final class MG extends AbstractC2714gF {

    /* renamed from: s, reason: collision with root package name */
    private boolean f17311s;

    protected MG(Set set) {
        super(set);
    }

    public final synchronized void a() {
        try {
            if (!this.f17311s) {
                l1(new KG());
                this.f17311s = true;
            }
            l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.LG
                @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
                public final void a(Object obj) {
                    ((w.a) obj).d();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void m1() {
        l1(new KG());
        this.f17311s = true;
    }

    public final void zza() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.JG
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((w.a) obj).a();
            }
        });
    }

    public final void zzb() {
        l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.IG
            @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
            public final void a(Object obj) {
                ((w.a) obj).c();
            }
        });
    }
}
