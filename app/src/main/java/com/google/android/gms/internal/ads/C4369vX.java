package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.vX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4369vX implements InterfaceC4560xD {

    /* renamed from: o, reason: collision with root package name */
    private final AtomicReference f27274o = new AtomicReference();

    public final void a(D2.N0 n02) {
        this.f27274o.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4560xD
    public final void p(final D2.e2 e2Var) {
        R40.a(this.f27274o, new Q40() { // from class: com.google.android.gms.internal.ads.uX
            @Override // com.google.android.gms.internal.ads.Q40
            public final void a(Object obj) {
                ((D2.N0) obj).O2(e2Var);
            }
        });
    }
}
