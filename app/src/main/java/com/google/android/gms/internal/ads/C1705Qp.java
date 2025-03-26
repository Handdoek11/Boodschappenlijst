package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import f3.InterfaceC5781e;

/* renamed from: com.google.android.gms.internal.ads.Qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1705Qp {

    /* renamed from: a, reason: collision with root package name */
    private Context f18537a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5781e f18538b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0611r0 f18539c;

    /* renamed from: d, reason: collision with root package name */
    private C1950Xp f18540d;

    /* synthetic */ C1705Qp(AbstractC1775Sp abstractC1775Sp) {
    }

    public final C1705Qp a(InterfaceC0611r0 interfaceC0611r0) {
        this.f18539c = interfaceC0611r0;
        return this;
    }

    public final C1705Qp b(Context context) {
        context.getClass();
        this.f18537a = context;
        return this;
    }

    public final C1705Qp c(InterfaceC5781e interfaceC5781e) {
        interfaceC5781e.getClass();
        this.f18538b = interfaceC5781e;
        return this;
    }

    public final C1705Qp d(C1950Xp c1950Xp) {
        this.f18540d = c1950Xp;
        return this;
    }

    public final AbstractC1985Yp e() {
        AbstractC3332ly0.c(this.f18537a, Context.class);
        AbstractC3332ly0.c(this.f18538b, InterfaceC5781e.class);
        AbstractC3332ly0.c(this.f18539c, InterfaceC0611r0.class);
        AbstractC3332ly0.c(this.f18540d, C1950Xp.class);
        return new C1740Rp(this.f18537a, this.f18538b, this.f18539c, this.f18540d, null);
    }
}
