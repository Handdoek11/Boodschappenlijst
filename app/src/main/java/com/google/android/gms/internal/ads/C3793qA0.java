package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.qA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3793qA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2059aD0 f25856a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3575oA0 f25860e;

    /* renamed from: h, reason: collision with root package name */
    private final JA0 f25863h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC2068aI f25864i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25865j;

    /* renamed from: k, reason: collision with root package name */
    private Wu0 f25866k;

    /* renamed from: l, reason: collision with root package name */
    private CH0 f25867l = new CH0(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f25858c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f25859d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f25857b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f25861f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f25862g = new HashSet();

    public C3793qA0(InterfaceC3575oA0 interfaceC3575oA0, JA0 ja0, InterfaceC2068aI interfaceC2068aI, C2059aD0 c2059aD0) {
        this.f25856a = c2059aD0;
        this.f25860e = interfaceC3575oA0;
        this.f25863h = ja0;
        this.f25864i = interfaceC2068aI;
    }

    private final void q(int i8, int i9) {
        while (i8 < this.f25857b.size()) {
            ((C3466nA0) this.f25857b.get(i8)).f24897d += i9;
            i8++;
        }
    }

    private final void r(C3466nA0 c3466nA0) {
        C3357mA0 c3357mA0 = (C3357mA0) this.f25861f.get(c3466nA0);
        if (c3357mA0 != null) {
            c3357mA0.f24471a.f(c3357mA0.f24472b);
        }
    }

    private final void s() {
        Iterator it = this.f25862g.iterator();
        while (it.hasNext()) {
            C3466nA0 c3466nA0 = (C3466nA0) it.next();
            if (c3466nA0.f24896c.isEmpty()) {
                r(c3466nA0);
                it.remove();
            }
        }
    }

    private final void t(C3466nA0 c3466nA0) {
        if (c3466nA0.f24898e && c3466nA0.f24896c.isEmpty()) {
            C3357mA0 c3357mA0 = (C3357mA0) this.f25861f.remove(c3466nA0);
            c3357mA0.getClass();
            c3357mA0.f24471a.a(c3357mA0.f24472b);
            c3357mA0.f24471a.h(c3357mA0.f24473c);
            c3357mA0.f24471a.k(c3357mA0.f24473c);
            this.f25862g.remove(c3466nA0);
        }
    }

    private final void u(C3466nA0 c3466nA0) {
        BG0 bg0 = c3466nA0.f24894a;
        HG0 hg0 = new HG0() { // from class: com.google.android.gms.internal.ads.fA0
            @Override // com.google.android.gms.internal.ads.HG0
            public final void a(IG0 ig0, AbstractC1981Yl abstractC1981Yl) {
                this.f21961a.f(ig0, abstractC1981Yl);
            }
        };
        C3248lA0 c3248lA0 = new C3248lA0(this, c3466nA0);
        this.f25861f.put(c3466nA0, new C3357mA0(bg0, hg0, c3248lA0));
        bg0.l(new Handler(AbstractC2301cW.R(), null), c3248lA0);
        bg0.j(new Handler(AbstractC2301cW.R(), null), c3248lA0);
        bg0.g(hg0, this.f25866k, this.f25856a);
    }

    private final void v(int i8, int i9) {
        while (true) {
            i9--;
            if (i9 < i8) {
                return;
            }
            C3466nA0 c3466nA0 = (C3466nA0) this.f25857b.remove(i9);
            this.f25859d.remove(c3466nA0.f24895b);
            q(i9, -c3466nA0.f24894a.H().c());
            c3466nA0.f24898e = true;
            if (this.f25865j) {
                t(c3466nA0);
            }
        }
    }

    public final int a() {
        return this.f25857b.size();
    }

    public final AbstractC1981Yl b() {
        if (this.f25857b.isEmpty()) {
            return AbstractC1981Yl.f20311a;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f25857b.size(); i9++) {
            C3466nA0 c3466nA0 = (C3466nA0) this.f25857b.get(i9);
            c3466nA0.f24897d = i8;
            i8 += c3466nA0.f24894a.H().c();
        }
        return new C4555xA0(this.f25857b, this.f25867l);
    }

    public final AbstractC1981Yl c(int i8, int i9, List list) {
        AbstractC3796qC.d(i8 >= 0 && i8 <= i9 && i9 <= a());
        AbstractC3796qC.d(list.size() == i9 - i8);
        for (int i10 = i8; i10 < i9; i10++) {
            ((C3466nA0) this.f25857b.get(i10)).f24894a.c((E7) list.get(i10 - i8));
        }
        return b();
    }

    final /* synthetic */ void f(IG0 ig0, AbstractC1981Yl abstractC1981Yl) {
        this.f25860e.e();
    }

    public final void g(Wu0 wu0) {
        AbstractC3796qC.f(!this.f25865j);
        this.f25866k = wu0;
        for (int i8 = 0; i8 < this.f25857b.size(); i8++) {
            C3466nA0 c3466nA0 = (C3466nA0) this.f25857b.get(i8);
            u(c3466nA0);
            this.f25862g.add(c3466nA0);
        }
        this.f25865j = true;
    }

    public final void h() {
        for (C3357mA0 c3357mA0 : this.f25861f.values()) {
            try {
                c3357mA0.f24471a.a(c3357mA0.f24472b);
            } catch (RuntimeException e8) {
                HL.d("MediaSourceList", "Failed to release child source.", e8);
            }
            c3357mA0.f24471a.h(c3357mA0.f24473c);
            c3357mA0.f24471a.k(c3357mA0.f24473c);
        }
        this.f25861f.clear();
        this.f25862g.clear();
        this.f25865j = false;
    }

    public final void i(EG0 eg0) {
        C3466nA0 c3466nA0 = (C3466nA0) this.f25858c.remove(eg0);
        c3466nA0.getClass();
        c3466nA0.f24894a.b(eg0);
        c3466nA0.f24896c.remove(((C4567xG0) eg0).f27782o);
        if (!this.f25858c.isEmpty()) {
            s();
        }
        t(c3466nA0);
    }

    public final boolean j() {
        return this.f25865j;
    }

    public final AbstractC1981Yl k(int i8, List list, CH0 ch0) {
        if (!list.isEmpty()) {
            this.f25867l = ch0;
            for (int i9 = i8; i9 < list.size() + i8; i9++) {
                C3466nA0 c3466nA0 = (C3466nA0) list.get(i9 - i8);
                if (i9 > 0) {
                    C3466nA0 c3466nA02 = (C3466nA0) this.f25857b.get(i9 - 1);
                    c3466nA0.a(c3466nA02.f24897d + c3466nA02.f24894a.H().c());
                } else {
                    c3466nA0.a(0);
                }
                q(i9, c3466nA0.f24894a.H().c());
                this.f25857b.add(i9, c3466nA0);
                this.f25859d.put(c3466nA0.f24895b, c3466nA0);
                if (this.f25865j) {
                    u(c3466nA0);
                    if (this.f25858c.isEmpty()) {
                        this.f25862g.add(c3466nA0);
                    } else {
                        r(c3466nA0);
                    }
                }
            }
        }
        return b();
    }

    public final AbstractC1981Yl l(int i8, int i9, CH0 ch0) {
        boolean z7 = false;
        if (i8 >= 0 && i8 <= i9 && i9 <= a()) {
            z7 = true;
        }
        AbstractC3796qC.d(z7);
        this.f25867l = ch0;
        v(i8, i9);
        return b();
    }

    public final AbstractC1981Yl m(List list, CH0 ch0) {
        v(0, this.f25857b.size());
        return k(this.f25857b.size(), list, ch0);
    }

    public final AbstractC1981Yl n(CH0 ch0) {
        int a8 = a();
        if (ch0.c() != a8) {
            ch0 = ch0.f().g(0, a8);
        }
        this.f25867l = ch0;
        return b();
    }

    public final EG0 o(GG0 gg0, RI0 ri0, long j8) {
        int i8 = C4555xA0.f27759k;
        Object obj = gg0.f15340a;
        Object obj2 = ((Pair) obj).first;
        GG0 a8 = gg0.a(((Pair) obj).second);
        C3466nA0 c3466nA0 = (C3466nA0) this.f25859d.get(obj2);
        c3466nA0.getClass();
        this.f25862g.add(c3466nA0);
        C3357mA0 c3357mA0 = (C3357mA0) this.f25861f.get(c3466nA0);
        if (c3357mA0 != null) {
            c3357mA0.f24471a.i(c3357mA0.f24472b);
        }
        c3466nA0.f24896c.add(a8);
        C4567xG0 e8 = c3466nA0.f24894a.e(a8, ri0, j8);
        this.f25858c.put(e8, c3466nA0);
        s();
        return e8;
    }

    public final CH0 p() {
        return this.f25867l;
    }
}
