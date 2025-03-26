package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5000q1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ P0 f29510v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5000q1(C4889d1 c4889d1, P0 p02) {
        super(c4889d1);
        this.f29510v = p02;
        this.f29511w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29511w.f29262i)).getGmpAppId(this.f29510v);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29510v.R(null);
    }
}
