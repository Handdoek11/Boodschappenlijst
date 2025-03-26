package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.dE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387dE0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21480a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21482c;

    /* renamed from: f, reason: collision with root package name */
    private C2604fE0 f21485f;

    /* renamed from: g, reason: collision with root package name */
    private UD0 f21486g;

    /* renamed from: b, reason: collision with root package name */
    private final C3254lD0 f21481b = C3254lD0.f24287c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2061aE0 f21483d = InterfaceC2061aE0.f20671a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2170bE0 f21484e = InterfaceC2170bE0.f20839a;

    public C2387dE0(Context context) {
        this.f21480a = context;
    }

    public final C4781zE0 d() {
        AbstractC3796qC.f(!this.f21482c);
        this.f21482c = true;
        if (this.f21485f == null) {
            this.f21485f = new C2604fE0(new InterfaceC1143Au[0]);
        }
        if (this.f21486g == null) {
            this.f21486g = new UD0(this.f21480a);
        }
        return new C4781zE0(this, null);
    }
}
