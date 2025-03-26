package com.headcode.ourgroceries.android;

import java.util.ArrayList;
import t5.AbstractC6802d;

/* renamed from: com.headcode.ourgroceries.android.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5598m1 {

    /* renamed from: a, reason: collision with root package name */
    private final C5574j1 f34892a;

    /* renamed from: b, reason: collision with root package name */
    private final C5688z0 f34893b;

    public C5598m1(C5574j1 c5574j1, C5688z0 c5688z0) {
        this.f34892a = c5574j1;
        this.f34893b = c5688z0;
    }

    private void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((Z0) arrayList.get(i8)).B().length() == 0) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 < 0) {
            return;
        }
        int i9 = i8;
        for (int i10 = i8 + 1; i10 < size && ((Z0) arrayList.get(i10)).B().length() <= 0; i10++) {
            i9 = i10;
        }
        d(arrayList, i8, i9);
    }

    private static AbstractC6802d.a b(ArrayList arrayList, int i8) {
        return c(arrayList, i8, i8);
    }

    private static AbstractC6802d.a c(ArrayList arrayList, int i8, int i9) {
        Z0 z02 = i8 > 0 ? (Z0) arrayList.get(i8 - 1) : null;
        String B7 = z02 == null ? AbstractC6802d.f43902b : z02.B();
        Z0 z03 = i9 < arrayList.size() + (-1) ? (Z0) arrayList.get(i9 + 1) : null;
        return new AbstractC6802d.a(B7, z03 == null ? AbstractC6802d.f43903c : z03.B());
    }

    private void d(ArrayList arrayList, int i8, int i9) {
        e(arrayList, i8, i9, c(arrayList, i8, i9));
    }

    private void e(ArrayList arrayList, int i8, int i9, AbstractC6802d.a aVar) {
        if (i8 > i9) {
            return;
        }
        int i10 = (i8 + i9) / 2;
        Z0 z02 = (Z0) arrayList.get(i10);
        String e8 = aVar.e();
        arrayList.set(i10, this.f34892a.A0(this.f34893b, z02, e8));
        if (i8 < i10) {
            e(arrayList, i8, i10 - 1, new AbstractC6802d.a(aVar.b(), e8));
        }
        if (i10 < i9) {
            e(arrayList, i10 + 1, i9, new AbstractC6802d.a(e8, aVar.c()));
        }
    }

    public Z0 f(ArrayList arrayList, int i8) {
        AbstractC6802d.a b8 = b(arrayList, i8);
        Z0 z02 = (Z0) arrayList.get(i8);
        if (b8.a(z02.B())) {
            return z02;
        }
        Z0 A02 = this.f34892a.A0(this.f34893b, z02, b8.e());
        arrayList.set(i8, A02);
        return A02;
    }

    public void g(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        a(arrayList);
        String B7 = ((Z0) arrayList.get(0)).B();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < size; i10++) {
            String B8 = ((Z0) arrayList.get(i10)).B();
            if (!B8.equals(B7)) {
                if (i8 < i9) {
                    d(arrayList, i8, i9);
                }
                i8 = i10;
                B7 = B8;
            }
            i9 = i10;
        }
        if (i8 < i9) {
            d(arrayList, i8, i9);
        }
    }
}
