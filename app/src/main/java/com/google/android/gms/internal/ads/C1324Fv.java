package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1324Fv implements InterfaceC4000s50 {

    /* renamed from: a, reason: collision with root package name */
    private final C3107jv f15219a;

    /* renamed from: b, reason: collision with root package name */
    private Context f15220b;

    /* renamed from: c, reason: collision with root package name */
    private String f15221c;

    /* renamed from: d, reason: collision with root package name */
    private D2.c2 f15222d;

    /* synthetic */ C1324Fv(C3107jv c3107jv, AbstractC1676Pv abstractC1676Pv) {
        this.f15219a = c3107jv;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4000s50
    public final /* bridge */ /* synthetic */ InterfaceC4000s50 a(Context context) {
        context.getClass();
        this.f15220b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4000s50
    public final /* bridge */ /* synthetic */ InterfaceC4000s50 b(D2.c2 c2Var) {
        c2Var.getClass();
        this.f15222d = c2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4000s50
    public final InterfaceC4109t50 d() {
        AbstractC3332ly0.c(this.f15220b, Context.class);
        AbstractC3332ly0.c(this.f15221c, String.class);
        AbstractC3332ly0.c(this.f15222d, D2.c2.class);
        return new C1360Gv(this.f15219a, this.f15220b, this.f15221c, this.f15222d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4000s50
    public final /* bridge */ /* synthetic */ InterfaceC4000s50 v(String str) {
        str.getClass();
        this.f15221c = str;
        return this;
    }
}
