package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5071z1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ C4889d1.b f29658v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29659w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5071z1(C4889d1 c4889d1, C4889d1.b bVar) {
        super(c4889d1);
        this.f29658v = bVar;
        this.f29659w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29659w.f29262i)).registerOnMeasurementEventListener(this.f29658v);
    }
}
