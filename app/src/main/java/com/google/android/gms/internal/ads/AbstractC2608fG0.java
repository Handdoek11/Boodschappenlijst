package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.fG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2608fG0 implements IG0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f21972a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f21973b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final QG0 f21974c = new QG0();

    /* renamed from: d, reason: collision with root package name */
    private final ME0 f21975d = new ME0();

    /* renamed from: e, reason: collision with root package name */
    private Looper f21976e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC1981Yl f21977f;

    /* renamed from: g, reason: collision with root package name */
    private C2059aD0 f21978g;

    @Override // com.google.android.gms.internal.ads.IG0
    public /* synthetic */ AbstractC1981Yl J() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void a(HG0 hg0) {
        this.f21972a.remove(hg0);
        if (!this.f21972a.isEmpty()) {
            f(hg0);
            return;
        }
        this.f21976e = null;
        this.f21977f = null;
        this.f21978g = null;
        this.f21973b.clear();
        w();
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public abstract /* synthetic */ void c(E7 e72);

    @Override // com.google.android.gms.internal.ads.IG0
    public final void f(HG0 hg0) {
        boolean isEmpty = this.f21973b.isEmpty();
        this.f21973b.remove(hg0);
        if (isEmpty || !this.f21973b.isEmpty()) {
            return;
        }
        r();
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void g(HG0 hg0, Wu0 wu0, C2059aD0 c2059aD0) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21976e;
        boolean z7 = true;
        if (looper != null && looper != myLooper) {
            z7 = false;
        }
        AbstractC3796qC.d(z7);
        this.f21978g = c2059aD0;
        AbstractC1981Yl abstractC1981Yl = this.f21977f;
        this.f21972a.add(hg0);
        if (this.f21976e == null) {
            this.f21976e = myLooper;
            this.f21973b.add(hg0);
            t(wu0);
        } else if (abstractC1981Yl != null) {
            i(hg0);
            hg0.a(this, abstractC1981Yl);
        }
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void h(RG0 rg0) {
        this.f21974c.i(rg0);
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void i(HG0 hg0) {
        this.f21976e.getClass();
        HashSet hashSet = this.f21973b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(hg0);
        if (isEmpty) {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void j(Handler handler, NE0 ne0) {
        this.f21975d.b(handler, ne0);
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void k(NE0 ne0) {
        this.f21975d.c(ne0);
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void l(Handler handler, RG0 rg0) {
        this.f21974c.b(handler, rg0);
    }

    protected final C2059aD0 m() {
        C2059aD0 c2059aD0 = this.f21978g;
        AbstractC3796qC.b(c2059aD0);
        return c2059aD0;
    }

    protected final ME0 n(GG0 gg0) {
        return this.f21975d.a(0, gg0);
    }

    protected final ME0 o(int i8, GG0 gg0) {
        return this.f21975d.a(0, gg0);
    }

    protected final QG0 p(GG0 gg0) {
        return this.f21974c.a(0, gg0);
    }

    protected final QG0 q(int i8, GG0 gg0) {
        return this.f21974c.a(0, gg0);
    }

    protected void r() {
    }

    protected void s() {
    }

    protected abstract void t(Wu0 wu0);

    @Override // com.google.android.gms.internal.ads.IG0
    public /* synthetic */ boolean u() {
        return true;
    }

    protected final void v(AbstractC1981Yl abstractC1981Yl) {
        this.f21977f = abstractC1981Yl;
        ArrayList arrayList = this.f21972a;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((HG0) arrayList.get(i8)).a(this, abstractC1981Yl);
        }
    }

    protected abstract void w();

    protected final boolean x() {
        return !this.f21973b.isEmpty();
    }
}
