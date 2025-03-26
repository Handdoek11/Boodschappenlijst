package com.google.android.gms.internal.ads;

import A3.AbstractC0376j;
import A3.C0368b;
import A3.InterfaceC0371e;

/* renamed from: com.google.android.gms.internal.ads.me0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3401me0 {
    public static com.google.common.util.concurrent.d a(AbstractC0376j abstractC0376j, C0368b c0368b) {
        final C3292le0 c3292le0 = new C3292le0(abstractC0376j, null);
        abstractC0376j.d(AbstractC4284uk0.c(), new InterfaceC0371e() { // from class: com.google.android.gms.internal.ads.ke0
            @Override // A3.InterfaceC0371e
            public final void a(AbstractC0376j abstractC0376j2) {
                C3292le0 c3292le02 = c3292le0;
                if (abstractC0376j2.q()) {
                    c3292le02.cancel(false);
                    return;
                }
                if (abstractC0376j2.s()) {
                    c3292le02.e(abstractC0376j2.o());
                    return;
                }
                Exception n8 = abstractC0376j2.n();
                if (n8 == null) {
                    throw new IllegalStateException();
                }
                c3292le02.h(n8);
            }
        });
        return c3292le0;
    }
}
