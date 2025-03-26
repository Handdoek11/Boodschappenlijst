package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4984o1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29484v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29485w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4984o1(C4889d1 c4889d1, String str) {
        super(c4889d1);
        this.f29484v = str;
        this.f29485w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29485w.f29262i)).beginAdUnitExposure(this.f29484v, this.f29264s);
    }
}
