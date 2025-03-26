package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4583xT implements InterfaceC4474wT {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4474wT f27862a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1376Hf0 f27863b;

    public C4583xT(InterfaceC4474wT interfaceC4474wT, InterfaceC1376Hf0 interfaceC1376Hf0) {
        this.f27862a = interfaceC4474wT;
        this.f27863b = interfaceC1376Hf0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final boolean a(C60 c60, C3785q60 c3785q60) {
        return this.f27862a.a(c60, c3785q60);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4474wT
    public final com.google.common.util.concurrent.d b(C60 c60, C3785q60 c3785q60) {
        return AbstractC2326ck0.m(this.f27862a.b(c60, c3785q60), this.f27863b, AbstractC1497Kq.f16644a);
    }
}
