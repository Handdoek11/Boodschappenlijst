package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;

/* loaded from: classes.dex */
final class A1 extends C4889d1.a {

    /* renamed from: A, reason: collision with root package name */
    private final /* synthetic */ boolean f28790A;

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f28791B;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Long f28792v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f28793w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ String f28794x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ Bundle f28795y;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ boolean f28796z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A1(C4889d1 c4889d1, Long l8, String str, String str2, Bundle bundle, boolean z7, boolean z8) {
        super(c4889d1);
        this.f28792v = l8;
        this.f28793w = str;
        this.f28794x = str2;
        this.f28795y = bundle;
        this.f28796z = z7;
        this.f28790A = z8;
        this.f28791B = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        Long l8 = this.f28792v;
        ((O0) Z2.r.l(this.f28791B.f29262i)).logEvent(this.f28793w, this.f28794x, this.f28795y, this.f28796z, this.f28790A, l8 == null ? this.f29263o : l8.longValue());
    }
}
