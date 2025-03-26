package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4952k1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29380v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29381w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4952k1(C4889d1 c4889d1, String str) {
        super(c4889d1);
        this.f29380v = str;
        this.f29381w = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29381w.f29262i)).setUserId(this.f29380v, this.f29263o);
    }
}
