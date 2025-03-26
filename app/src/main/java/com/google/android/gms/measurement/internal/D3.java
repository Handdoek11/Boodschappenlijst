package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4871b1;

/* loaded from: classes2.dex */
public final class D3 {

    /* renamed from: a, reason: collision with root package name */
    final Context f30316a;

    /* renamed from: b, reason: collision with root package name */
    String f30317b;

    /* renamed from: c, reason: collision with root package name */
    String f30318c;

    /* renamed from: d, reason: collision with root package name */
    String f30319d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f30320e;

    /* renamed from: f, reason: collision with root package name */
    long f30321f;

    /* renamed from: g, reason: collision with root package name */
    C4871b1 f30322g;

    /* renamed from: h, reason: collision with root package name */
    boolean f30323h;

    /* renamed from: i, reason: collision with root package name */
    Long f30324i;

    /* renamed from: j, reason: collision with root package name */
    String f30325j;

    public D3(Context context, C4871b1 c4871b1, Long l8) {
        this.f30323h = true;
        Z2.r.l(context);
        Context applicationContext = context.getApplicationContext();
        Z2.r.l(applicationContext);
        this.f30316a = applicationContext;
        this.f30324i = l8;
        if (c4871b1 != null) {
            this.f30322g = c4871b1;
            this.f30317b = c4871b1.f29227w;
            this.f30318c = c4871b1.f29226v;
            this.f30319d = c4871b1.f29225u;
            this.f30323h = c4871b1.f29224t;
            this.f30321f = c4871b1.f29223s;
            this.f30325j = c4871b1.f29229y;
            Bundle bundle = c4871b1.f29228x;
            if (bundle != null) {
                this.f30320e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
