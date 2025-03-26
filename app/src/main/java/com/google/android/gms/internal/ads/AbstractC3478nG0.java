package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.nG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3478nG0 extends AbstractC2608fG0 {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap f24909h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private Handler f24910i;

    /* renamed from: j, reason: collision with root package name */
    private Wu0 f24911j;

    protected AbstractC3478nG0() {
    }

    protected int A(Object obj, int i8) {
        return 0;
    }

    protected long B(Object obj, long j8, GG0 gg0) {
        return j8;
    }

    protected abstract GG0 C(Object obj, GG0 gg0);

    @Override // com.google.android.gms.internal.ads.IG0
    public void I() {
        Iterator it = this.f24909h.values().iterator();
        while (it.hasNext()) {
            ((C3369mG0) it.next()).f24483a.I();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void r() {
        for (C3369mG0 c3369mG0 : this.f24909h.values()) {
            c3369mG0.f24483a.f(c3369mG0.f24484b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void s() {
        for (C3369mG0 c3369mG0 : this.f24909h.values()) {
            c3369mG0.f24483a.i(c3369mG0.f24484b);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected void t(Wu0 wu0) {
        this.f24911j = wu0;
        this.f24910i = AbstractC2301cW.Q(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected void w() {
        for (C3369mG0 c3369mG0 : this.f24909h.values()) {
            c3369mG0.f24483a.a(c3369mG0.f24484b);
            c3369mG0.f24483a.h(c3369mG0.f24485c);
            c3369mG0.f24483a.k(c3369mG0.f24485c);
        }
        this.f24909h.clear();
    }

    protected abstract void y(Object obj, IG0 ig0, AbstractC1981Yl abstractC1981Yl);

    protected final void z(final Object obj, IG0 ig0) {
        AbstractC3796qC.d(!this.f24909h.containsKey(obj));
        HG0 hg0 = new HG0() { // from class: com.google.android.gms.internal.ads.kG0
            @Override // com.google.android.gms.internal.ads.HG0
            public final void a(IG0 ig02, AbstractC1981Yl abstractC1981Yl) {
                this.f23529a.y(obj, ig02, abstractC1981Yl);
            }
        };
        C3260lG0 c3260lG0 = new C3260lG0(this, obj);
        this.f24909h.put(obj, new C3369mG0(ig0, hg0, c3260lG0));
        Handler handler = this.f24910i;
        handler.getClass();
        ig0.l(handler, c3260lG0);
        Handler handler2 = this.f24910i;
        handler2.getClass();
        ig0.j(handler2, c3260lG0);
        ig0.g(hg0, this.f24911j, m());
        if (x()) {
            return;
        }
        ig0.f(hg0);
    }
}
