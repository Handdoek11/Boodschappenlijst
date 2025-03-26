package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3543nv implements K30 {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f25050a;

    /* renamed from: b, reason: collision with root package name */
    private Context f25051b;

    /* renamed from: c, reason: collision with root package name */
    private String f25052c;

    /* synthetic */ C3543nv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f25050a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.K30
    public final L30 a() {
        AbstractC3332ly0.c(this.f25051b, Context.class);
        AbstractC3332ly0.c(this.f25052c, String.class);
        return new C3652ov(this.f25050a, this.f25051b, this.f25052c, null);
    }

    @Override // com.google.android.gms.internal.ads.K30
    public final /* bridge */ /* synthetic */ K30 b(Context context) {
        context.getClass();
        this.f25051b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K30
    public final /* bridge */ /* synthetic */ K30 n(String str) {
        str.getClass();
        this.f25052c = str;
        return this;
    }
}
