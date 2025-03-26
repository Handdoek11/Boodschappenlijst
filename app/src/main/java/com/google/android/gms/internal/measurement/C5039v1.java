package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5039v1 extends C4889d1.a {

    /* renamed from: A, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29598A;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29600w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ Object f29601x;

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ int f29599v = 5;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ Object f29602y = null;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ Object f29603z = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5039v1(C4889d1 c4889d1, boolean z7, int i8, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f29600w = str;
        this.f29601x = obj;
        this.f29598A = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29598A.f29262i)).logHealthData(this.f29599v, this.f29600w, BinderC5853b.p2(this.f29601x), BinderC5853b.p2(null), BinderC5853b.p2(null));
    }
}
