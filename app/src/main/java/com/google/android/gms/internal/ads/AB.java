package com.google.android.gms.internal.ads;

import G2.C0618v;
import android.content.Context;

/* loaded from: classes.dex */
public final class AB implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f13527a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f13528b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4203ty0 f13529c;

    public AB(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02, InterfaceC4203ty0 interfaceC4203ty03) {
        this.f13527a = interfaceC4203ty0;
        this.f13528b = interfaceC4203ty02;
        this.f13529c = interfaceC4203ty03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f13527a.zzb();
        final H2.a a8 = ((C1815Tu) this.f13528b).a();
        final L60 a9 = ((C2056aC) this.f13529c).a();
        return new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.zB
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                C3785q60 c3785q60 = (C3785q60) obj;
                C0618v c0618v = new C0618v(context);
                c0618v.p(c3785q60.f25753B);
                c0618v.q(c3785q60.f25754C.toString());
                c0618v.o(a8.f2914o);
                c0618v.n(a9.f16768f);
                return c0618v;
            }
        };
    }
}
