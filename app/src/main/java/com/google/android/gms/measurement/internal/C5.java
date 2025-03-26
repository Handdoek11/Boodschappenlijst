package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class C5 extends AbstractC5416t {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ D5 f30309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5(D5 d52, InterfaceC5455y3 interfaceC5455y3) {
        super(interfaceC5455y3);
        this.f30309e = d52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5416t
    public final void d() {
        this.f30309e.x();
        this.f30309e.h().I().a("Starting upload from DelayedRunnable");
        this.f30309e.f30369b.C0();
    }
}
