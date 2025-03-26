package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810Tp implements InterfaceC4701yb {

    /* renamed from: o, reason: collision with root package name */
    private final Context f19176o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f19177s;

    /* renamed from: t, reason: collision with root package name */
    private final String f19178t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f19179u;

    public C1810Tp(Context context, String str) {
        this.f19176o = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f19178t = str;
        this.f19179u = false;
        this.f19177s = new Object();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4701yb
    public final void A0(C4592xb c4592xb) {
        b(c4592xb.f27883j);
    }

    public final String a() {
        return this.f19178t;
    }

    public final void b(boolean z7) {
        if (C2.v.r().p(this.f19176o)) {
            synchronized (this.f19177s) {
                try {
                    if (this.f19179u == z7) {
                        return;
                    }
                    this.f19179u = z7;
                    if (TextUtils.isEmpty(this.f19178t)) {
                        return;
                    }
                    if (this.f19179u) {
                        C2.v.r().f(this.f19176o, this.f19178t);
                    } else {
                        C2.v.r().g(this.f19176o, this.f19178t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
