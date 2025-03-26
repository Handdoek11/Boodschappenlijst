package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5015s1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ P0 f29561v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5015s1(C4889d1 c4889d1, P0 p02) {
        super(c4889d1);
        this.f29561v = p02;
        this.f29562w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29562w.f29262i)).generateEventId(this.f29561v);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29561v.R(null);
    }
}
