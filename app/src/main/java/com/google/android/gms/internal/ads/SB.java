package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class SB {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18841a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f18842b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f18843c;

    /* renamed from: d, reason: collision with root package name */
    private final D60 f18844d;

    /* renamed from: e, reason: collision with root package name */
    private final IB f18845e;

    /* renamed from: f, reason: collision with root package name */
    private final BT f18846f;

    /* renamed from: g, reason: collision with root package name */
    private final int f18847g;

    /* synthetic */ SB(QB qb, RB rb) {
        this.f18841a = qb.f18387a;
        this.f18842b = qb.f18388b;
        this.f18843c = qb.f18389c;
        this.f18844d = qb.f18390d;
        this.f18845e = qb.f18391e;
        this.f18846f = qb.f18392f;
        this.f18847g = qb.f18393g;
    }

    final int a() {
        return this.f18847g;
    }

    final Context b(Context context) {
        return this.f18841a;
    }

    final Bundle c() {
        return this.f18843c;
    }

    final IB d() {
        return this.f18845e;
    }

    final QB e() {
        QB qb = new QB();
        qb.f(this.f18841a);
        qb.k(this.f18842b);
        qb.g(this.f18843c);
        qb.h(this.f18845e);
        qb.e(this.f18846f);
        return qb;
    }

    final BT f(String str) {
        BT bt = this.f18846f;
        return bt != null ? bt : new BT(str);
    }

    final D60 g() {
        return this.f18844d;
    }

    final L60 h() {
        return this.f18842b;
    }
}
