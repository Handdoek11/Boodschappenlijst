package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4976n1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29473v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4976n1(C4889d1 c4889d1, String str) {
        super(c4889d1);
        this.f29473v = str;
        this.f29474w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29474w.f29262i)).endAdUnitExposure(this.f29473v, this.f29264s);
    }
}
