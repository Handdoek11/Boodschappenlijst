package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class T4 extends AbstractC5416t {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F4 f30721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T4(F4 f42, InterfaceC5455y3 interfaceC5455y3) {
        super(interfaceC5455y3);
        this.f30721e = f42;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5416t
    public final void d() {
        this.f30721e.h().J().a("Tasks have been queued for a long time");
    }
}
