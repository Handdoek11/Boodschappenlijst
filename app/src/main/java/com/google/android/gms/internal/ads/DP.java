package com.google.android.gms.internal.ads;

import y2.AbstractC6943a;

/* loaded from: classes.dex */
final class DP extends AbstractC6943a.AbstractC0349a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14485a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f14486b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LP f14487c;

    DP(LP lp, String str, String str2) {
        this.f14485a = str;
        this.f14486b = str2;
        this.f14487c = lp;
    }

    @Override // w2.AbstractC6879e
    public final void a(w2.m mVar) {
        this.f14487c.D7(LP.C7(mVar), this.f14486b);
    }

    @Override // w2.AbstractC6879e
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = this.f14486b;
        this.f14487c.x7(this.f14485a, (AbstractC6943a) obj, str);
    }
}
