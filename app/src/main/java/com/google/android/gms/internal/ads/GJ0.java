package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class GJ0 {

    /* renamed from: a, reason: collision with root package name */
    private D f15354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3008j f15355b;

    /* synthetic */ GJ0(C3008j c3008j, AbstractC2901i abstractC2901i) {
        this.f15355b = c3008j;
    }

    public final void a(C4408vs c4408vs) {
        C2723gJ0 c2723gJ0 = new C2723gJ0();
        c2723gJ0.G(c4408vs.f27377a);
        c2723gJ0.k(c4408vs.f27378b);
        c2723gJ0.B("video/raw");
        this.f15354a = c2723gJ0.H();
        Iterator it = this.f15355b.f23151i.iterator();
        while (it.hasNext()) {
            ((InterfaceC2465e) it.next()).d(this.f15355b, c4408vs);
        }
    }

    public final void b(long j8, long j9, boolean z7) {
        if (z7) {
            C3008j c3008j = this.f15355b;
            if (c3008j.f23154l != null) {
                Iterator it = c3008j.f23151i.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2465e) it.next()).c(this.f15355b);
                }
            }
        }
        if (this.f15355b.f23152j != null) {
            D d8 = this.f15354a;
            if (d8 == null) {
                d8 = new C2723gJ0().H();
            }
            D d9 = d8;
            C3008j c3008j2 = this.f15355b;
            c3008j2.f23152j.a(j9, c3008j2.f23150h.a(), d9, null);
        }
        AbstractC3796qC.b(null);
        throw null;
    }
}
