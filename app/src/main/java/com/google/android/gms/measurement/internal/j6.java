package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4944j2;
import com.google.android.gms.internal.measurement.C4953k2;
import com.google.android.gms.internal.measurement.C5016s2;
import com.google.android.gms.internal.measurement.C5024t2;
import com.google.android.gms.internal.measurement.C5052w6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q.C6397a;

/* loaded from: classes2.dex */
final class j6 {

    /* renamed from: a, reason: collision with root package name */
    private String f31024a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31025b;

    /* renamed from: c, reason: collision with root package name */
    private C5016s2 f31026c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f31027d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f31028e;

    /* renamed from: f, reason: collision with root package name */
    private Map f31029f;

    /* renamed from: g, reason: collision with root package name */
    private Map f31030g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h6 f31031h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.j2$a, com.google.android.gms.internal.measurement.r4$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.s2$a] */
    final C4944j2 a(int i8) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? J7 = C4944j2.J();
        J7.y(i8);
        J7.B(this.f31025b);
        C5016s2 c5016s2 = this.f31026c;
        if (c5016s2 != null) {
            J7.A(c5016s2);
        }
        ?? F7 = C5016s2.R().B(Z5.M(this.f31027d)).F(Z5.M(this.f31028e));
        if (this.f31029f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f31029f.size());
            for (Integer num : this.f31029f.keySet()) {
                int intValue = num.intValue();
                Long l8 = (Long) this.f31029f.get(num);
                if (l8 != null) {
                    arrayList.add((C4953k2) ((AbstractC5010r4) C4953k2.J().y(intValue).z(l8.longValue()).u()));
                }
            }
        }
        if (arrayList != null) {
            F7.z(arrayList);
        }
        if (this.f31030g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f31030g.size());
            for (Integer num2 : this.f31030g.keySet()) {
                C5024t2.a y7 = C5024t2.K().y(num2.intValue());
                List list = (List) this.f31030g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    y7.z(list);
                }
                arrayList2.add((C5024t2) ((AbstractC5010r4) y7.u()));
            }
        }
        F7.D(arrayList2);
        J7.z(F7);
        return (C4944j2) ((AbstractC5010r4) J7.u());
    }

    final void c(AbstractC5291b abstractC5291b) {
        int a8 = abstractC5291b.a();
        Boolean bool = abstractC5291b.f30827c;
        if (bool != null) {
            this.f31028e.set(a8, bool.booleanValue());
        }
        Boolean bool2 = abstractC5291b.f30828d;
        if (bool2 != null) {
            this.f31027d.set(a8, bool2.booleanValue());
        }
        if (abstractC5291b.f30829e != null) {
            Long l8 = (Long) this.f31029f.get(Integer.valueOf(a8));
            long longValue = abstractC5291b.f30829e.longValue() / 1000;
            if (l8 == null || longValue > l8.longValue()) {
                this.f31029f.put(Integer.valueOf(a8), Long.valueOf(longValue));
            }
        }
        if (abstractC5291b.f30830f != null) {
            List list = (List) this.f31030g.get(Integer.valueOf(a8));
            if (list == null) {
                list = new ArrayList();
                this.f31030g.put(Integer.valueOf(a8), list);
            }
            if (abstractC5291b.j()) {
                list.clear();
            }
            if (C5052w6.a() && this.f31031h.a().F(this.f31024a, G.f30468q0) && abstractC5291b.i()) {
                list.clear();
            }
            if (!C5052w6.a() || !this.f31031h.a().F(this.f31024a, G.f30468q0)) {
                list.add(Long.valueOf(abstractC5291b.f30830f.longValue() / 1000));
                return;
            }
            long longValue2 = abstractC5291b.f30830f.longValue() / 1000;
            if (list.contains(Long.valueOf(longValue2))) {
                return;
            }
            list.add(Long.valueOf(longValue2));
        }
    }

    private j6(h6 h6Var, String str) {
        this.f31031h = h6Var;
        this.f31024a = str;
        this.f31025b = true;
        this.f31027d = new BitSet();
        this.f31028e = new BitSet();
        this.f31029f = new C6397a();
        this.f31030g = new C6397a();
    }

    private j6(h6 h6Var, String str, C5016s2 c5016s2, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f31031h = h6Var;
        this.f31024a = str;
        this.f31027d = bitSet;
        this.f31028e = bitSet2;
        this.f31029f = map;
        this.f31030g = new C6397a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f31030g.put(num, arrayList);
            }
        }
        this.f31025b = false;
        this.f31026c = c5016s2;
    }
}
