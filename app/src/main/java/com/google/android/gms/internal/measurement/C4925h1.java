package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4925h1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29315v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29316w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ P0 f29317x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29318y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4925h1(C4889d1 c4889d1, String str, String str2, P0 p02) {
        super(c4889d1);
        this.f29315v = str;
        this.f29316w = str2;
        this.f29317x = p02;
        this.f29318y = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29318y.f29262i)).getConditionalUserProperties(this.f29315v, this.f29316w, this.f29317x);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29317x.R(null);
    }
}
