package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4889d1;

/* renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5023t1 extends C4889d1.a {

    /* renamed from: v, reason: collision with root package name */
    private final /* synthetic */ String f29574v;

    /* renamed from: w, reason: collision with root package name */
    private final /* synthetic */ String f29575w;

    /* renamed from: x, reason: collision with root package name */
    private final /* synthetic */ boolean f29576x;

    /* renamed from: y, reason: collision with root package name */
    private final /* synthetic */ P0 f29577y;

    /* renamed from: z, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f29578z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5023t1(C4889d1 c4889d1, String str, String str2, boolean z7, P0 p02) {
        super(c4889d1);
        this.f29574v = str;
        this.f29575w = str2;
        this.f29576x = z7;
        this.f29577y = p02;
        this.f29578z = c4889d1;
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    final void a() {
        ((O0) Z2.r.l(this.f29578z.f29262i)).getUserProperties(this.f29574v, this.f29575w, this.f29576x, this.f29577y);
    }

    @Override // com.google.android.gms.internal.measurement.C4889d1.a
    protected final void b() {
        this.f29577y.R(null);
    }
}
