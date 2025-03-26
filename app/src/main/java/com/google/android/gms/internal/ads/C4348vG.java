package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4348vG {

    /* renamed from: a, reason: collision with root package name */
    private final List f27216a;

    /* renamed from: b, reason: collision with root package name */
    private final C2959ia0 f27217b;

    /* renamed from: c, reason: collision with root package name */
    private final H2.v f27218c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27219d;

    public C4348vG(C3785q60 c3785q60, C2959ia0 c2959ia0) {
        this.f27216a = c3785q60.f25808p;
        this.f27217b = c2959ia0;
        this.f27218c = c3785q60.f25825x0;
    }

    public final void a() {
        if (this.f27219d) {
            return;
        }
        this.f27217b.e(this.f27216a, this.f27218c);
        this.f27219d = true;
    }
}
