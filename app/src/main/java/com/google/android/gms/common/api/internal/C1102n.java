package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1089a;

/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1102n implements ComponentCallbacks2C1089a.InterfaceC0228a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1091c f13344a;

    C1102n(C1091c c1091c) {
        this.f13344a = c1091c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1089a.InterfaceC0228a
    public final void a(boolean z7) {
        C1091c c1091c = this.f13344a;
        c1091c.f13298E.sendMessage(c1091c.f13298E.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
