package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4943j1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Activity f29355v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29356w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ String f29357x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29358y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4943j1(C4889d1 c4889d1, Activity activity, String str, String str2) {
        super(c4889d1);
        this.f29355v = activity;
        this.f29356w = str;
        this.f29357x = str2;
        this.f29358y = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29358y.f29262i)).setCurrentScreen(BinderC5853b.p2(this.f29355v), this.f29356w, this.f29357x, this.f29263o);
    }
}
