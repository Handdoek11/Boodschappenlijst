package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* loaded from: classes.dex */
final class D1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Activity f28845v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ C4889d1.c f28846w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D1(C4889d1.c cVar, Activity activity) {
        super(C4889d1.this);
        this.f28845v = activity;
        this.f28846w = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(C4889d1.this.f29262i)).onActivityStarted(BinderC5853b.p2(this.f28845v), this.f29264s);
    }
}
