package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Y00 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20176a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20177b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20178c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20179d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20180e;

    public Y00(String str, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f20176a = str;
        this.f20177b = z7;
        this.f20178c = z8;
        this.f20179d = z9;
        this.f20180e = z10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = ((KB) obj).f16552b;
        if (!this.f20176a.isEmpty()) {
            bundle.putString("inspector_extras", this.f20176a);
        }
        bundle.putInt("test_mode", this.f20177b ? 1 : 0);
        bundle.putInt("linked_device", this.f20178c ? 1 : 0);
        if (this.f20177b || this.f20178c) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f20180e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void c(Object obj) {
        Bundle bundle = ((KB) obj).f16551a;
        if (!this.f20176a.isEmpty()) {
            bundle.putString("inspector_extras", this.f20176a);
        }
        bundle.putInt("test_mode", this.f20177b ? 1 : 0);
        bundle.putInt("linked_device", this.f20178c ? 1 : 0);
        if (this.f20177b || this.f20178c) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.e9)).booleanValue()) {
                bundle.putInt("risd", !this.f20179d ? 1 : 0);
            }
            if (((Boolean) D2.A.c().a(AbstractC3184kf.i9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f20180e);
            }
        }
    }
}
