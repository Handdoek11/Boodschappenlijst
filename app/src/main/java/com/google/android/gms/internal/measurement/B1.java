package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* loaded from: classes.dex */
final class B1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ Bundle f28800v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ Activity f28801w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ C4889d1.c f28802x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B1(C4889d1.c cVar, Bundle bundle, Activity activity) {
        super(C4889d1.this);
        this.f28800v = bundle;
        this.f28801w = activity;
        this.f28802x = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        Bundle bundle;
        if (this.f28800v != null) {
            bundle = new Bundle();
            if (this.f28800v.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f28800v.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((O0) Z2.r.l(C4889d1.this.f29262i)).onActivityCreated(BinderC5853b.p2(this.f28801w), bundle, this.f29264s);
    }
}
