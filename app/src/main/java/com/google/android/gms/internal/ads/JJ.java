package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class JJ implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ KJ f16229a;

    JJ(KJ kj) {
        this.f16229a = kj;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23952m5)).booleanValue()) {
            C2.v.s().x(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void c(List list) {
        try {
            InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) list.get(0);
            if (interfaceC4410vt != null) {
                this.f16229a.b(interfaceC4410vt);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e8) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.f23952m5)).booleanValue()) {
                C2.v.s().x(e8, "omid native display exp");
            }
        }
    }
}
