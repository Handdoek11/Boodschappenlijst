package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.sW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4041sW implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26681a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2138az f26682b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1303Ff f26683c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f26684d;

    /* renamed from: e, reason: collision with root package name */
    private final S80 f26685e;

    public C4041sW(Context context, AbstractC2138az abstractC2138az, S80 s80, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceC1303Ff interfaceC1303Ff) {
        this.f26681a = context;
        this.f26682b = abstractC2138az;
        this.f26685e = s80;
        this.f26684d = interfaceExecutorServiceC3522nk0;
        this.f26683c = interfaceC1303Ff;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60;
        return (this.f26683c == null || (c4220u60 = c3785q60.f25814s) == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(C60 c60, C3785q60 c3785q60) {
        C3824qW c3824qW = new C3824qW(this, new View(this.f26681a), null, new InterfaceC1436Iz() { // from class: com.google.android.gms.internal.ads.oW
            @Override // com.google.android.gms.internal.ads.InterfaceC1436Iz
            public final D2.Y0 zza() {
                return null;
            }
        }, (C3893r60) c3785q60.f25818u.get(0));
        AbstractC4529wy a8 = this.f26682b.a(new C2161bA(c60, c3785q60, null), c3824qW);
        C3932rW l8 = a8.l();
        C4220u60 c4220u60 = c3785q60.f25814s;
        final BinderC1123Af binderC1123Af = new BinderC1123Af(l8, c4220u60.f26997b, c4220u60.f26996a);
        M80 m80 = M80.CUSTOM_RENDER_SYN;
        return B80.d(new InterfaceC4442w80() { // from class: com.google.android.gms.internal.ads.pW
            @Override // com.google.android.gms.internal.ads.InterfaceC4442w80
            public final void zza() {
                this.f25458a.c(binderC1123Af);
            }
        }, this.f26684d, m80, this.f26685e).b(M80.CUSTOM_RENDER_ACK).d(AbstractC2326ck0.h(a8.h())).a();
    }

    final /* synthetic */ void c(BinderC1123Af binderC1123Af) {
        this.f26683c.e1(binderC1123Af);
    }
}
