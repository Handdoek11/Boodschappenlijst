package com.google.android.gms.internal.wearable;

import B3.C0394m;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public abstract class B1 {
    public static C0394m a(A1 a12) {
        C0394m c0394m = new C0394m();
        for (C5245g c5245g : a12.f30041a.F()) {
            d(a12.f30042b, c0394m, c5245g.F(), c5245g.D());
        }
        return c0394m;
    }

    public static A1 b(C0394m c0394m) {
        ArrayList arrayList = new ArrayList();
        C1 C7 = C5249i.C();
        TreeSet treeSet = new TreeSet(c0394m.j());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object b8 = c0394m.b(str);
            D1 C8 = C5245g.C();
            C8.q(str);
            C8.r(c(arrayList, b8));
            arrayList2.add((C5245g) C8.i());
        }
        C7.q(arrayList2);
        return new A1((C5249i) C7.i(), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.wearable.C5243f c(java.util.List r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.B1.c(java.util.List, java.lang.Object):com.google.android.gms.internal.wearable.f");
    }

    private static void d(List list, C0394m c0394m, String str, C5243f c5243f) {
        int H7 = c5243f.H();
        if (H7 == 14) {
            c0394m.y(str, null);
            return;
        }
        C5240e D7 = c5243f.D();
        if (H7 == 1) {
            c0394m.o(str, D7.T().s());
            return;
        }
        int i8 = 0;
        if (H7 == 11) {
            c0394m.z(str, (String[]) D7.Z().toArray(new String[0]));
            return;
        }
        if (H7 == 12) {
            Object[] array = D7.Y().toArray();
            int length = array.length;
            long[] jArr = new long[length];
            while (i8 < length) {
                Object obj = array[i8];
                obj.getClass();
                jArr[i8] = ((Number) obj).longValue();
                i8++;
            }
            c0394m.x(str, jArr);
            return;
        }
        if (H7 == 15) {
            Object[] array2 = D7.X().toArray();
            int length2 = array2.length;
            float[] fArr = new float[length2];
            while (i8 < length2) {
                Object obj2 = array2[i8];
                obj2.getClass();
                fArr[i8] = ((Number) obj2).floatValue();
                i8++;
            }
            c0394m.t(str, fArr);
            return;
        }
        if (H7 == 2) {
            c0394m.y(str, D7.U());
            return;
        }
        if (H7 == 3) {
            c0394m.r(str, D7.I());
            return;
        }
        if (H7 == 4) {
            c0394m.s(str, D7.K());
            return;
        }
        if (H7 == 5) {
            c0394m.w(str, D7.P());
            return;
        }
        if (H7 == 6) {
            c0394m.u(str, D7.N());
            return;
        }
        if (H7 == 7) {
            c0394m.n(str, (byte) D7.M());
            return;
        }
        if (H7 == 8) {
            c0394m.m(str, D7.H());
            return;
        }
        if (H7 == 13) {
            c0394m.l(str, (Asset) list.get((int) D7.O()));
            return;
        }
        if (H7 == 9) {
            C0394m c0394m2 = new C0394m();
            for (C5245g c5245g : D7.W()) {
                d(list, c0394m2, c5245g.F(), c5245g.D());
            }
            c0394m.p(str, c0394m2);
            return;
        }
        if (H7 != 10) {
            throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(H7)));
        }
        do {
            int i9 = 14;
            for (C5243f c5243f2 : D7.V()) {
                if (i9 != 14) {
                    if (c5243f2.H() != i9) {
                        throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + Integer.toString(i9) + " and " + Integer.toString(c5243f2.H()));
                    }
                } else if (c5243f2.H() == 9 || c5243f2.H() == 2 || c5243f2.H() == 6) {
                    i9 = c5243f2.H();
                }
            }
            ArrayList arrayList = new ArrayList(D7.L());
            for (C5243f c5243f3 : D7.V()) {
                if (c5243f3.H() == 14) {
                    arrayList.add(null);
                } else if (i9 == 9) {
                    C0394m c0394m3 = new C0394m();
                    for (C5245g c5245g2 : c5243f3.D().W()) {
                        d(list, c0394m3, c5245g2.F(), c5245g2.D());
                    }
                    arrayList.add(c0394m3);
                } else if (i9 == 2) {
                    arrayList.add(c5243f3.D().U());
                } else {
                    if (i9 != 6) {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(i9)));
                    }
                    arrayList.add(Integer.valueOf(c5243f3.D().N()));
                }
            }
            if (i9 == 14) {
                c0394m.A(str, arrayList);
                return;
            }
            if (i9 == 9) {
                c0394m.q(str, arrayList);
                return;
            } else if (i9 == 2) {
                c0394m.A(str, arrayList);
                return;
            } else {
                if (i9 != 6) {
                    throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(i9)));
                }
                c0394m.v(str, arrayList);
                return;
            }
        } while (c5243f2.H() == 14);
        throw new IllegalArgumentException("Unexpected TypedValue type: " + Integer.toString(c5243f2.H()) + " for key " + str);
    }
}
