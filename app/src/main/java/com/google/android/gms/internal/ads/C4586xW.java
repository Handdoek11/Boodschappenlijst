package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4586xW implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1303Ff f27866a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f27867b;

    /* renamed from: c, reason: collision with root package name */
    private final S80 f27868c;

    /* renamed from: d, reason: collision with root package name */
    private final HW f27869d;

    public C4586xW(S80 s80, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceC1303Ff interfaceC1303Ff, HW hw) {
        this.f27868c = s80;
        this.f27867b = interfaceExecutorServiceC3522nk0;
        this.f27866a = interfaceC1303Ff;
        this.f27869d = hw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        C4220u60 c4220u60;
        return (this.f27866a == null || (c4220u60 = c3785q60.f25814s) == null || c4220u60.f26996a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(C60 c60, C3785q60 c3785q60) {
        C1811Tq c1811Tq = new C1811Tq();
        CW cw = new CW();
        cw.c(new C4477wW(this, c1811Tq, c60, c3785q60, cw));
        C4220u60 c4220u60 = c3785q60.f25814s;
        final BinderC1123Af binderC1123Af = new BinderC1123Af(cw, c4220u60.f26997b, c4220u60.f26996a);
        M80 m80 = M80.CUSTOM_RENDER_SYN;
        return B80.d(new InterfaceC4442w80() { // from class: com.google.android.gms.internal.ads.vW
            @Override // com.google.android.gms.internal.ads.InterfaceC4442w80
            public final void zza() {
                this.f27272a.c(binderC1123Af);
            }
        }, this.f27867b, m80, this.f27868c).b(M80.CUSTOM_RENDER_ACK).d(c1811Tq).a();
    }

    final /* synthetic */ void c(BinderC1123Af binderC1123Af) {
        this.f27866a.e1(binderC1123Af);
    }
}
