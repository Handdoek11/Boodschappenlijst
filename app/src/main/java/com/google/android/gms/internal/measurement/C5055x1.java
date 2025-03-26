package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5055x1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Bundle f29631v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ P0 f29632w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5055x1(C4889d1 c4889d1, Bundle bundle, P0 p02) {
        super(c4889d1);
        this.f29631v = bundle;
        this.f29632w = p02;
        this.f29633x = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29633x.f29262i)).performAction(this.f29631v, this.f29632w, this.f29263o);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29632w.R(null);
    }
}
