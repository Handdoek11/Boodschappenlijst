package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4087sv implements A40 {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f26757a;

    /* renamed from: b, reason: collision with root package name */
    private Context f26758b;

    /* renamed from: c, reason: collision with root package name */
    private String f26759c;

    /* renamed from: d, reason: collision with root package name */
    private D2.c2 f26760d;

    /* synthetic */ C4087sv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f26757a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.A40
    public final /* bridge */ /* synthetic */ A40 a(Context context) {
        context.getClass();
        this.f26758b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.A40
    public final /* bridge */ /* synthetic */ A40 b(D2.c2 c2Var) {
        c2Var.getClass();
        this.f26760d = c2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.A40
    public final B40 d() {
        AbstractC3332ly0.c(this.f26758b, Context.class);
        AbstractC3332ly0.c(this.f26759c, String.class);
        AbstractC3332ly0.c(this.f26760d, D2.c2.class);
        return new C4196tv(this.f26757a, this.f26758b, this.f26759c, this.f26760d, null);
    }

    @Override // com.google.android.gms.internal.ads.A40
    public final /* bridge */ /* synthetic */ A40 v(String str) {
        str.getClass();
        this.f26759c = str;
        return this;
    }
}
