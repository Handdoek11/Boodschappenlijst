package com.google.android.gms.internal.ads;

import D2.C0555y;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.q20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3777q20 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25702a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25703b;

    C3777q20(int i8, int i9) {
        this.f25702a = i8;
        this.f25703b = i9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        int i8 = this.f25702a;
        if (i8 == -1 || this.f25703b == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i8);
        bundle.putInt("crashes_without_flags", this.f25703b);
        int i9 = C0555y.f1364g;
        if (D2.A.c().e()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
