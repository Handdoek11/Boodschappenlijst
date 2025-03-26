package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4894d6;
import com.google.android.gms.internal.measurement.C4944j2;
import com.google.android.gms.internal.measurement.C4953k2;
import com.google.android.gms.internal.measurement.C4961l2;
import com.google.android.gms.internal.measurement.C5016s2;
import com.google.android.gms.internal.measurement.C5024t2;
import com.google.android.gms.internal.measurement.C5032u2;
import com.google.android.gms.internal.measurement.C5052w6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q.C6397a;

/* loaded from: classes2.dex */
final class h6 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private String f30984d;

    /* renamed from: e, reason: collision with root package name */
    private Set f30985e;

    /* renamed from: f, reason: collision with root package name */
    private Map f30986f;

    /* renamed from: g, reason: collision with root package name */
    private Long f30987g;

    /* renamed from: h, reason: collision with root package name */
    private Long f30988h;

    h6(H5 h52) {
        super(h52);
    }

    private final void A(List list, boolean z7) {
        A a8;
        m6 m6Var;
        Integer num;
        Map map;
        long j8;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        m6 m6Var2 = new m6(this);
        C6397a c6397a = new C6397a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4961l2 c4961l2 = (C4961l2) it.next();
            C4961l2 a9 = m6Var2.a(this.f30984d, c4961l2);
            if (a9 != null) {
                C5354k o8 = o();
                String str2 = this.f30984d;
                String U7 = a9.U();
                A J02 = o8.J0(str2, c4961l2.U());
                if (J02 == null) {
                    o8.h().J().c("Event aggregate wasn't created during raw event logging. appId, event", C5378n2.t(str2), o8.e().c(U7));
                    a8 = new A(str2, c4961l2.U(), 1L, 1L, 1L, c4961l2.R(), 0L, null, null, null, null);
                } else {
                    a8 = new A(J02.f30249a, J02.f30250b, J02.f30251c + 1, J02.f30252d + 1, J02.f30253e + 1, J02.f30254f, J02.f30255g, J02.f30256h, J02.f30257i, J02.f30258j, J02.f30259k);
                }
                A a10 = a8;
                o().S(a10);
                if (!C4894d6.a() || !a().F(str, G.f30421Z0) || !z7) {
                    long j9 = a10.f30251c;
                    String U8 = a9.U();
                    Map map2 = (Map) c6397a.get(U8);
                    if (map2 == null) {
                        map2 = o().N0(this.f30984d, U8);
                        c6397a.put(U8, map2);
                    }
                    Map map3 = map2;
                    for (Integer num2 : map3.keySet()) {
                        int intValue = num2.intValue();
                        if (this.f30985e.contains(num2)) {
                            h().I().b("Skipping failed audience ID", num2);
                        } else {
                            Iterator it2 = ((List) map3.get(num2)).iterator();
                            boolean z8 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    m6Var = m6Var2;
                                    num = num2;
                                    map = map3;
                                    j8 = j9;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.K1 k12 = (com.google.android.gms.internal.measurement.K1) it2.next();
                                l6 l6Var = new l6(this, this.f30984d, intValue, k12);
                                m6Var = m6Var2;
                                num = num2;
                                int i8 = intValue;
                                map = map3;
                                j8 = j9;
                                z8 = l6Var.k(this.f30987g, this.f30988h, a9, j9, a10, B(intValue, k12.J()));
                                if (!z8) {
                                    this.f30985e.add(num);
                                    break;
                                }
                                w(num).c(l6Var);
                                num2 = num;
                                m6Var2 = m6Var;
                                intValue = i8;
                                map3 = map;
                                j9 = j8;
                            }
                            if (!z8) {
                                this.f30985e.add(num);
                            }
                            m6Var2 = m6Var;
                            map3 = map;
                            j9 = j8;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final boolean B(int i8, int i9) {
        j6 j6Var = (j6) this.f30986f.get(Integer.valueOf(i8));
        if (j6Var == null) {
            return false;
        }
        return j6Var.f31027d.get(i9);
    }

    private final List C() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f30986f.keySet();
        keySet.removeAll(this.f30985e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            j6 j6Var = (j6) this.f30986f.get(num);
            Z2.r.l(j6Var);
            C4944j2 a8 = j6Var.a(intValue);
            arrayList.add(a8);
            C5354k o8 = o();
            String str = this.f30984d;
            C5016s2 M7 = a8.M();
            o8.s();
            o8.l();
            Z2.r.f(str);
            Z2.r.l(M7);
            byte[] j8 = M7.j();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", j8);
            try {
                if (o8.z().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    o8.h().E().b("Failed to insert filter results (got -1). appId", C5378n2.t(str));
                }
            } catch (SQLiteException e8) {
                o8.h().E().c("Error storing filter results. appId", C5378n2.t(str), e8);
            }
        }
        return arrayList;
    }

    private final j6 w(Integer num) {
        if (this.f30986f.containsKey(num)) {
            return (j6) this.f30986f.get(num);
        }
        j6 j6Var = new j6(this, this.f30984d);
        this.f30986f.put(num, j6Var);
        return j6Var;
    }

    private final void z(List list) {
        com.google.android.gms.internal.measurement.N1 n12;
        if (list.isEmpty()) {
            return;
        }
        C6397a c6397a = new C6397a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5032u2 c5032u2 = (C5032u2) it.next();
            String U7 = c5032u2.U();
            Map map = (Map) c6397a.get(U7);
            if (map == null) {
                map = o().P0(this.f30984d, U7);
                c6397a.put(U7, map);
            }
            Iterator it2 = map.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer num = (Integer) it2.next();
                    int intValue = num.intValue();
                    if (this.f30985e.contains(num)) {
                        h().I().b("Skipping failed audience ID", num);
                        break;
                    }
                    Iterator it3 = ((List) map.get(num)).iterator();
                    boolean z7 = true;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        n12 = (com.google.android.gms.internal.measurement.N1) it3.next();
                        if (h().A(2)) {
                            h().I().d("Evaluating filter. audience, filter, property", num, n12.O() ? Integer.valueOf(n12.k()) : null, e().g(n12.K()));
                            h().I().b("Filter definition", m().J(n12));
                        }
                        if (n12.O() && n12.k() <= 256) {
                            n6 n6Var = new n6(this, this.f30984d, intValue, n12);
                            z7 = n6Var.k(this.f30987g, this.f30988h, c5032u2, B(intValue, n12.k()));
                            if (!z7) {
                                this.f30985e.add(num);
                                break;
                            }
                            w(num).c(n6Var);
                        } else {
                            break;
                        }
                    }
                    h().J().c("Invalid property filter ID. appId, id", C5378n2.t(this.f30984d), String.valueOf(n12.O() ? Integer.valueOf(n12.k()) : null));
                    z7 = false;
                    if (!z7) {
                        this.f30985e.add(num);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final List x(String str, List list, List list2, Long l8, Long l9) {
        return y(str, list, list2, l8, l9, false);
    }

    final List y(String str, List list, List list2, Long l8, Long l9, boolean z7) {
        boolean z8;
        Map map;
        List<com.google.android.gms.internal.measurement.K1> list3;
        Iterator it;
        Iterator it2;
        Map map2;
        Map map3;
        Iterator it3;
        Z2.r.f(str);
        Z2.r.l(list);
        Z2.r.l(list2);
        this.f30984d = str;
        this.f30985e = new HashSet();
        this.f30986f = new C6397a();
        this.f30987g = l8;
        this.f30988h = l9;
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z8 = false;
                break;
            }
            if ("_s".equals(((C4961l2) it4.next()).U())) {
                z8 = true;
                break;
            }
        }
        boolean z9 = C5052w6.a() && a().F(this.f30984d, G.f30468q0);
        boolean z10 = C5052w6.a() && a().F(this.f30984d, G.f30466p0);
        if (z8) {
            C5354k o8 = o();
            String str2 = this.f30984d;
            o8.s();
            o8.l();
            Z2.r.f(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                o8.z().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e8) {
                o8.h().E().c("Error resetting session-scoped event counts. appId", C5378n2.t(str2), e8);
            }
        }
        Map emptyMap = Collections.emptyMap();
        if (z10 && z9) {
            emptyMap = o().Y0(this.f30984d);
        }
        Map X02 = o().X0(this.f30984d);
        if (!X02.isEmpty()) {
            HashSet hashSet = new HashSet(X02.keySet());
            if (z8) {
                String str3 = this.f30984d;
                Map Z02 = o().Z0(this.f30984d);
                Z2.r.f(str3);
                Z2.r.l(X02);
                Map c6397a = new C6397a();
                if (!X02.isEmpty()) {
                    Iterator it5 = X02.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        C5016s2 c5016s2 = (C5016s2) X02.get(num);
                        List list4 = (List) Z02.get(num);
                        if (list4 == null || list4.isEmpty()) {
                            map3 = Z02;
                            it3 = it5;
                            c6397a.put(num, c5016s2);
                        } else {
                            List N7 = m().N(c5016s2.V(), list4);
                            if (!N7.isEmpty()) {
                                C5016s2.a B7 = ((C5016s2.a) c5016s2.y()).A().B(N7);
                                B7.E().F(m().N(c5016s2.X(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (C4953k2 c4953k2 : c5016s2.U()) {
                                    Map map4 = Z02;
                                    Iterator it6 = it5;
                                    if (!list4.contains(Integer.valueOf(c4953k2.k()))) {
                                        arrayList.add(c4953k2);
                                    }
                                    Z02 = map4;
                                    it5 = it6;
                                }
                                map3 = Z02;
                                it3 = it5;
                                B7.y().z(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (C5024t2 c5024t2 : c5016s2.W()) {
                                    if (!list4.contains(Integer.valueOf(c5024t2.J()))) {
                                        arrayList2.add(c5024t2);
                                    }
                                }
                                B7.C().D(arrayList2);
                                c6397a.put(num, (C5016s2) ((AbstractC5010r4) B7.u()));
                            }
                        }
                        Z02 = map3;
                        it5 = it3;
                    }
                }
                map = c6397a;
            } else {
                map = X02;
            }
            Iterator it7 = hashSet.iterator();
            Map map5 = X02;
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                C5016s2 c5016s22 = (C5016s2) map.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C6397a c6397a2 = new C6397a();
                if (c5016s22 != null && c5016s22.k() != 0) {
                    for (C4953k2 c4953k22 : c5016s22.U()) {
                        if (c4953k22.M()) {
                            c6397a2.put(Integer.valueOf(c4953k22.k()), c4953k22.L() ? Long.valueOf(c4953k22.I()) : null);
                        }
                    }
                }
                C6397a c6397a3 = new C6397a();
                if (c5016s22 != null && c5016s22.L() != 0) {
                    Iterator it8 = c5016s22.W().iterator();
                    while (it8.hasNext()) {
                        C5024t2 c5024t22 = (C5024t2) it8.next();
                        if (!c5024t22.N() || c5024t22.k() <= 0) {
                            it2 = it8;
                            map2 = map;
                        } else {
                            it2 = it8;
                            map2 = map;
                            c6397a3.put(Integer.valueOf(c5024t22.J()), Long.valueOf(c5024t22.G(c5024t22.k() - 1)));
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map map6 = map;
                if (c5016s22 != null) {
                    int i8 = 0;
                    while (i8 < (c5016s22.O() << 6)) {
                        if (Z5.c0(c5016s22.X(), i8)) {
                            it = it7;
                            h().I().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i8));
                            bitSet2.set(i8);
                            if (Z5.c0(c5016s22.V(), i8)) {
                                bitSet.set(i8);
                            }
                            i8++;
                            it7 = it;
                        } else {
                            it = it7;
                        }
                        c6397a2.remove(Integer.valueOf(i8));
                        i8++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                C5016s2 c5016s23 = (C5016s2) map5.get(num2);
                if (z10 && z9 && (list3 = (List) emptyMap.get(num2)) != null && this.f30988h != null && this.f30987g != null) {
                    for (com.google.android.gms.internal.measurement.K1 k12 : list3) {
                        int J7 = k12.J();
                        long longValue = this.f30988h.longValue() / 1000;
                        if (k12.Q()) {
                            longValue = this.f30987g.longValue() / 1000;
                        }
                        if (c6397a2.containsKey(Integer.valueOf(J7))) {
                            c6397a2.put(Integer.valueOf(J7), Long.valueOf(longValue));
                        }
                        if (c6397a3.containsKey(Integer.valueOf(J7))) {
                            c6397a3.put(Integer.valueOf(J7), Long.valueOf(longValue));
                        }
                    }
                }
                this.f30986f.put(num2, new j6(this, this.f30984d, c5016s23, bitSet, bitSet2, c6397a2, c6397a3));
                it7 = it9;
                map5 = map5;
                map = map6;
            }
        }
        if (!C4894d6.a() || !a().F(null, G.f30421Z0)) {
            A(list, true);
            z(list2);
            return C();
        }
        A(list, z7);
        if (z7) {
            return new ArrayList();
        }
        z(list2);
        return C();
    }
}
