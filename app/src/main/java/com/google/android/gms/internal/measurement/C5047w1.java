package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5047w1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29615v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ P0 f29616w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5047w1(C4889d1 c4889d1, String str, P0 p02) {
        super(c4889d1);
        this.f29615v = str;
        this.f29616w = p02;
        this.f29617x = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29617x.f29262i)).getMaxUserProperties(this.f29615v, this.f29616w);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29616w.R(null);
    }
}
