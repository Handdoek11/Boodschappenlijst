package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Ah0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1128Ah0 extends AbstractC4058sg0 {

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Iterator f13618t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ InterfaceC1797Tf0 f13619u;

    C1128Ah0(Iterator it, InterfaceC1797Tf0 interfaceC1797Tf0) {
        this.f13618t = it;
        this.f13619u = interfaceC1797Tf0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4058sg0
    protected final Object zza() {
        while (this.f13618t.hasNext()) {
            Iterator it = this.f13618t;
            InterfaceC1797Tf0 interfaceC1797Tf0 = this.f13619u;
            Object next = it.next();
            if (interfaceC1797Tf0.a(next)) {
                return next;
            }
        }
        a();
        return null;
    }
}
