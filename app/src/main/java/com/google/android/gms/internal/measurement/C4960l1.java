package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4960l1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Bundle f29392v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29393w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4960l1(C4889d1 c4889d1, Bundle bundle) {
        super(c4889d1);
        this.f29392v = bundle;
        this.f29393w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29393w.f29262i)).setConsent(this.f29392v, this.f29263o);
    }
}
