package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3019j5 implements InterfaceC3126k4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f23176a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f23177b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f23178c;

    public C3019j5(List list) {
        this.f23176a = DesugarCollections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f23177b = new long[size + size];
        for (int i8 = 0; i8 < list.size(); i8++) {
            Y4 y42 = (Y4) list.get(i8);
            long[] jArr = this.f23177b;
            int i9 = i8 + i8;
            jArr[i9] = y42.f20200b;
            jArr[i9 + 1] = y42.f20201c;
        }
        long[] jArr2 = this.f23177b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f23178c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final long A(int i8) {
        AbstractC3796qC.d(i8 >= 0);
        AbstractC3796qC.d(i8 < this.f23178c.length);
        return this.f23178c[i8];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final List a(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i8 = 0; i8 < this.f23176a.size(); i8++) {
            long[] jArr = this.f23177b;
            int i9 = i8 + i8;
            if (jArr[i9] <= j8 && j8 < jArr[i9 + 1]) {
                Y4 y42 = (Y4) this.f23176a.get(i8);
                C3004iy c3004iy = y42.f20199a;
                if (c3004iy.f23128e == -3.4028235E38f) {
                    arrayList2.add(y42);
                } else {
                    arrayList.add(c3004iy);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.i5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Y4) obj).f20200b, ((Y4) obj2).f20200b);
            }
        });
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            C2677fx b8 = ((Y4) arrayList2.get(i10)).f20199a.b();
            b8.e((-1) - i10, 1);
            arrayList.add(b8.p());
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3126k4
    public final int zza() {
        return this.f23178c.length;
    }
}
