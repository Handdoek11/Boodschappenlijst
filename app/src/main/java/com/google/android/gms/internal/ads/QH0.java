package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class QH0 implements BI0 {

    /* renamed from: a, reason: collision with root package name */
    protected final C4614xm f18438a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f18439b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f18440c;

    /* renamed from: d, reason: collision with root package name */
    private final D[] f18441d;

    /* renamed from: e, reason: collision with root package name */
    private int f18442e;

    public QH0(C4614xm c4614xm, int[] iArr, int i8) {
        int length = iArr.length;
        AbstractC3796qC.f(length > 0);
        c4614xm.getClass();
        this.f18438a = c4614xm;
        this.f18439b = length;
        this.f18441d = new D[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f18441d[i9] = c4614xm.b(iArr[i9]);
        }
        Arrays.sort(this.f18441d, new Comparator() { // from class: com.google.android.gms.internal.ads.PH0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((D) obj2).f14329j - ((D) obj).f14329j;
            }
        });
        this.f18440c = new int[this.f18439b];
        for (int i10 = 0; i10 < this.f18439b; i10++) {
            this.f18440c[i10] = c4614xm.a(this.f18441d[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int B(int i8) {
        for (int i9 = 0; i9 < this.f18439b; i9++) {
            if (this.f18440c[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final D D(int i8) {
        return this.f18441d[i8];
    }

    @Override // com.google.android.gms.internal.ads.BI0
    public final D c() {
        return this.f18441d[0];
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int d() {
        return this.f18440c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            QH0 qh0 = (QH0) obj;
            if (this.f18438a.equals(qh0.f18438a) && Arrays.equals(this.f18440c, qh0.f18440c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final C4614xm g() {
        return this.f18438a;
    }

    public final int hashCode() {
        int i8 = this.f18442e;
        if (i8 != 0) {
            return i8;
        }
        int identityHashCode = (System.identityHashCode(this.f18438a) * 31) + Arrays.hashCode(this.f18440c);
        this.f18442e = identityHashCode;
        return identityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.FI0
    public final int m(int i8) {
        return this.f18440c[i8];
    }

    @Override // com.google.android.gms.internal.ads.BI0
    public final int zzb() {
        return this.f18440c[0];
    }
}
