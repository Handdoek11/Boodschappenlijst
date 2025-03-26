package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class FJ0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15126a;

    /* renamed from: b, reason: collision with root package name */
    private final C3444n f15127b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1741Rq f15128c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4390vj f15129d;

    /* renamed from: e, reason: collision with root package name */
    private final List f15130e = AbstractC4169th0.w();

    /* renamed from: f, reason: collision with root package name */
    private RC f15131f = RC.f18620a;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15132g;

    public FJ0(Context context, C3444n c3444n) {
        this.f15126a = context.getApplicationContext();
        this.f15127b = c3444n;
    }

    public final FJ0 d(RC rc) {
        this.f15131f = rc;
        return this;
    }

    public final C3008j e() {
        AbstractC3796qC.f(!this.f15132g);
        AbstractC2901i abstractC2901i = null;
        if (this.f15129d == null) {
            if (this.f15128c == null) {
                this.f15128c = new C2683g(null);
            }
            this.f15129d = new C2792h(this.f15128c);
        }
        C3008j c3008j = new C3008j(this, abstractC2901i);
        this.f15132g = true;
        return c3008j;
    }
}
