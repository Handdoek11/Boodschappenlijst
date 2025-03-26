package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;
import i3.BinderC5853b;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4916g1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29302v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29303w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ Object f29304x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ boolean f29305y;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29306z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4916g1(C4889d1 c4889d1, String str, String str2, Object obj, boolean z7) {
        super(c4889d1);
        this.f29302v = str;
        this.f29303w = str2;
        this.f29304x = obj;
        this.f29305y = z7;
        this.f29306z = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29306z.f29262i)).setUserProperty(this.f29302v, this.f29303w, BinderC5853b.p2(this.f29304x), this.f29305y, this.f29263o);
    }
}
