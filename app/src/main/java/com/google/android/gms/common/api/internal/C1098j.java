package com.google.android.gms.common.api.internal;

import W2.d;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1098j implements d.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f13336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1100l f13337b;

    C1098j(C1100l c1100l, BasePendingResult basePendingResult) {
        this.f13337b = c1100l;
        this.f13336a = basePendingResult;
    }

    @Override // W2.d.a
    public final void a(Status status) {
        this.f13337b.f13340a.remove(this.f13336a);
    }
}
