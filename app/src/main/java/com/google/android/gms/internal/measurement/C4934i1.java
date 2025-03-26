package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4934i1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29332v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29333w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ Bundle f29334x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29335y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4934i1(C4889d1 c4889d1, String str, String str2, Bundle bundle) {
        super(c4889d1);
        this.f29332v = str;
        this.f29333w = str2;
        this.f29334x = bundle;
        this.f29335y = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29335y.f29262i)).clearConditionalUserProperty(this.f29332v, this.f29333w, this.f29334x);
    }
}
