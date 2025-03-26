package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4342vD extends AbstractC2714gF implements EC, InterfaceC3144kD {

    /* renamed from: s, reason: collision with root package name */
    private final C3785q60 f27210s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicBoolean f27211t;

    public C4342vD(Set set, C3785q60 c3785q60) {
        super(set);
        this.f27211t = new AtomicBoolean();
        this.f27210s = c3785q60;
    }

    private final void zza() {
        final D2.e2 e2Var;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.I7)).booleanValue() && this.f27211t.compareAndSet(false, true) && (e2Var = this.f27210s.f25787e0) != null && e2Var.f1246o == 3) {
            l1(new InterfaceC2605fF() { // from class: com.google.android.gms.internal.ads.uD
                @Override // com.google.android.gms.internal.ads.InterfaceC2605fF
                public final void a(Object obj) {
                    ((InterfaceC4560xD) obj).p(e2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3144kD
    public final void g() {
        if (this.f27210s.f25780b == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void r() {
        int i8 = this.f27210s.f25780b;
        if (i8 == 2 || i8 == 5 || i8 == 4 || i8 == 6 || i8 == 7) {
            zza();
        }
    }
}
