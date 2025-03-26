package com.google.android.gms.common.api.internal;

import A3.AbstractC0376j;
import A3.C0377k;
import A3.InterfaceC0371e;

/* renamed from: com.google.android.gms.common.api.internal.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1099k implements InterfaceC0371e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0377k f13338a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1100l f13339b;

    C1099k(C1100l c1100l, C0377k c0377k) {
        this.f13339b = c1100l;
        this.f13338a = c0377k;
    }

    @Override // A3.InterfaceC0371e
    public final void a(AbstractC0376j abstractC0376j) {
        this.f13339b.f13341b.remove(this.f13338a);
    }
}
