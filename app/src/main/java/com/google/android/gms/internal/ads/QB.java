package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class QB {

    /* renamed from: a, reason: collision with root package name */
    private Context f18387a;

    /* renamed from: b, reason: collision with root package name */
    private L60 f18388b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f18389c;

    /* renamed from: d, reason: collision with root package name */
    private D60 f18390d;

    /* renamed from: e, reason: collision with root package name */
    private IB f18391e;

    /* renamed from: f, reason: collision with root package name */
    private BT f18392f;

    /* renamed from: g, reason: collision with root package name */
    private int f18393g = 0;

    public final QB e(BT bt) {
        this.f18392f = bt;
        return this;
    }

    public final QB f(Context context) {
        this.f18387a = context;
        return this;
    }

    public final QB g(Bundle bundle) {
        this.f18389c = bundle;
        return this;
    }

    public final QB h(IB ib) {
        this.f18391e = ib;
        return this;
    }

    public final QB i(int i8) {
        this.f18393g = i8;
        return this;
    }

    public final QB j(D60 d60) {
        this.f18390d = d60;
        return this;
    }

    public final QB k(L60 l60) {
        this.f18388b = l60;
        return this;
    }

    public final SB l() {
        return new SB(this, null);
    }
}
