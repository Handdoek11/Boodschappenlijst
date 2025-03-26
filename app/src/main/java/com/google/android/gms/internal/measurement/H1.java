package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* loaded from: classes.dex */
final class H1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Activity f28879v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ P0 f28880w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ C4889d1.c f28881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(C4889d1.c cVar, Activity activity, P0 p02) {
        super(C4889d1.this);
        this.f28879v = activity;
        this.f28880w = p02;
        this.f28881x = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(C4889d1.this.f29262i)).onActivitySaveInstanceState(BinderC5853b.p2(this.f28879v), this.f28880w, this.f29264s);
    }
}
