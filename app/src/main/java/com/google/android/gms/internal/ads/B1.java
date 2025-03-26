package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class B1 extends C1 {

    /* renamed from: b, reason: collision with root package name */
    private long f13714b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f13715c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f13716d;

    public B1() {
        super(new C3336m0());
        this.f13714b = -9223372036854775807L;
        this.f13715c = new long[0];
        this.f13716d = new long[0];
    }

    private static Double g(UQ uq) {
        return Double.valueOf(Double.longBitsToDouble(uq.J()));
    }

    private static Object h(UQ uq, int i8) {
        if (i8 == 0) {
            return g(uq);
        }
        if (i8 == 1) {
            return Boolean.valueOf(uq.C() == 1);
        }
        if (i8 == 2) {
            return i(uq);
        }
        if (i8 != 3) {
            if (i8 == 8) {
                return j(uq);
            }
            if (i8 != 10) {
                if (i8 != 11) {
                    return null;
                }
                Date date = new Date((long) g(uq).doubleValue());
                uq.m(2);
                return date;
            }
            int F7 = uq.F();
            ArrayList arrayList = new ArrayList(F7);
            for (int i9 = 0; i9 < F7; i9++) {
                Object h8 = h(uq, uq.C());
                if (h8 != null) {
                    arrayList.add(h8);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String i10 = i(uq);
            int C7 = uq.C();
            if (C7 == 9) {
                return hashMap;
            }
            Object h9 = h(uq, C7);
            if (h9 != null) {
                hashMap.put(i10, h9);
            }
        }
    }

    private static String i(UQ uq) {
        int G7 = uq.G();
        int t7 = uq.t();
        uq.m(G7);
        return new String(uq.n(), t7, G7);
    }

    private static HashMap j(UQ uq) {
        int F7 = uq.F();
        HashMap hashMap = new HashMap(F7);
        for (int i8 = 0; i8 < F7; i8++) {
            String i9 = i(uq);
            Object h8 = h(uq, uq.C());
            if (h8 != null) {
                hashMap.put(i9, h8);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean a(UQ uq) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C1
    protected final boolean b(UQ uq, long j8) {
        if (uq.C() == 2 && "onMetaData".equals(i(uq)) && uq.r() != 0 && uq.C() == 8) {
            HashMap j9 = j(uq);
            Object obj = j9.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f13714b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = j9.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f13715c = new long[size];
                    this.f13716d = new long[size];
                    for (int i8 = 0; i8 < size; i8++) {
                        Object obj5 = list.get(i8);
                        Object obj6 = list2.get(i8);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f13715c = new long[0];
                            this.f13716d = new long[0];
                            break;
                        }
                        this.f13715c[i8] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f13716d[i8] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f13714b;
    }

    public final long[] e() {
        return this.f13716d;
    }

    public final long[] f() {
        return this.f13715c;
    }
}
