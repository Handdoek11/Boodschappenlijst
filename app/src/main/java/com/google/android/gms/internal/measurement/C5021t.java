package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5021t extends AbstractC4974n implements InterfaceC4966m {

    /* renamed from: t, reason: collision with root package name */
    private final List f29569t;

    /* renamed from: u, reason: collision with root package name */
    private final List f29570u;

    /* renamed from: v, reason: collision with root package name */
    private Z2 f29571v;

    private C5021t(C5021t c5021t) {
        super(c5021t.f29460o);
        ArrayList arrayList = new ArrayList(c5021t.f29569t.size());
        this.f29569t = arrayList;
        arrayList.addAll(c5021t.f29569t);
        ArrayList arrayList2 = new ArrayList(c5021t.f29570u.size());
        this.f29570u = arrayList2;
        arrayList2.addAll(c5021t.f29570u);
        this.f29571v = c5021t.f29571v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n, com.google.android.gms.internal.measurement.InterfaceC5013s
    public final InterfaceC5013s a() {
        return new C5021t(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC4974n
    public final InterfaceC5013s f(Z2 z22, List list) {
        Z2 d8 = this.f29571v.d();
        for (int i8 = 0; i8 < this.f29569t.size(); i8++) {
            if (i8 < list.size()) {
                d8.e((String) this.f29569t.get(i8), z22.b((InterfaceC5013s) list.get(i8)));
            } else {
                d8.e((String) this.f29569t.get(i8), InterfaceC5013s.f29548h);
            }
        }
        for (InterfaceC5013s interfaceC5013s : this.f29570u) {
            InterfaceC5013s b8 = d8.b(interfaceC5013s);
            if (b8 instanceof C5037v) {
                b8 = d8.b(interfaceC5013s);
            }
            if (b8 instanceof C4958l) {
                return ((C4958l) b8).f();
            }
        }
        return InterfaceC5013s.f29548h;
    }

    public C5021t(String str, List list, List list2, Z2 z22) {
        super(str);
        this.f29569t = new ArrayList();
        this.f29571v = z22;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f29569t.add(((InterfaceC5013s) it.next()).c());
            }
        }
        this.f29570u = new ArrayList(list2);
    }
}
