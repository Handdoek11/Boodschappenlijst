package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3487nM implements FC {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC4410vt f24925o;

    C3487nM(InterfaceC4410vt interfaceC4410vt) {
        this.f24925o = interfaceC4410vt;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void e(Context context) {
        InterfaceC4410vt interfaceC4410vt = this.f24925o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void i(Context context) {
        InterfaceC4410vt interfaceC4410vt = this.f24925o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final void p(Context context) {
        InterfaceC4410vt interfaceC4410vt = this.f24925o;
        if (interfaceC4410vt != null) {
            interfaceC4410vt.onResume();
        }
    }
}
