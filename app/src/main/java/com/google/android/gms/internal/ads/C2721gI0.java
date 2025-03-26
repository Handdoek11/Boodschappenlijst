package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2721gI0 extends C1599No {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f22287D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f22288E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f22289F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f22290G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f22291H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f22292I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f22293J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f22294K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f22295L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f22296M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f22297N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f22298O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f22299P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f22300Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f22301R;

    /* renamed from: S, reason: collision with root package name */
    private final SparseArray f22302S;

    /* renamed from: T, reason: collision with root package name */
    private final SparseBooleanArray f22303T;

    static {
        new C2721gI0(new C2612fI0());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public static C2721gI0 d(Context context) {
        return new C2721gI0(new C2612fI0(context));
    }

    public final C2612fI0 c() {
        return new C2612fI0(this, null);
    }

    public final AbstractC2830hI0 e(int i8, JH0 jh0) {
        Map map = (Map) this.f22302S.get(i8);
        if (map != null) {
            androidx.appcompat.app.E.a(map.get(jh0));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.C1599No
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2721gI0.class == obj.getClass()) {
            C2721gI0 c2721gI0 = (C2721gI0) obj;
            if (super.equals(c2721gI0) && this.f22287D == c2721gI0.f22287D && this.f22289F == c2721gI0.f22289F && this.f22291H == c2721gI0.f22291H && this.f22296M == c2721gI0.f22296M && this.f22297N == c2721gI0.f22297N && this.f22298O == c2721gI0.f22298O && this.f22300Q == c2721gI0.f22300Q) {
                SparseBooleanArray sparseBooleanArray = this.f22303T;
                SparseBooleanArray sparseBooleanArray2 = c2721gI0.f22303T;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            SparseArray sparseArray = this.f22302S;
                            SparseArray sparseArray2 = c2721gI0.f22302S;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i9 = 0; i9 < size2; i9++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i9);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                JH0 jh0 = (JH0) entry.getKey();
                                                if (!map2.containsKey(jh0) || !Objects.equals(entry.getValue(), map2.get(jh0))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i8)) < 0) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i8) {
        return this.f22303T.get(i8);
    }

    public final boolean g(int i8, JH0 jh0) {
        Map map = (Map) this.f22302S.get(i8);
        return map != null && map.containsKey(jh0);
    }

    @Override // com.google.android.gms.internal.ads.C1599No
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f22287D ? 1 : 0)) * 961) + (this.f22289F ? 1 : 0)) * 961) + (this.f22291H ? 1 : 0)) * 28629151) + (this.f22296M ? 1 : 0)) * 31) + (this.f22297N ? 1 : 0)) * 31) + (this.f22298O ? 1 : 0)) * 961) + (this.f22300Q ? 1 : 0)) * 31;
    }

    private C2721gI0(C2612fI0 c2612fI0) {
        super(c2612fI0);
        this.f22287D = c2612fI0.f21996s;
        this.f22288E = false;
        this.f22289F = c2612fI0.f21997t;
        this.f22290G = false;
        this.f22291H = c2612fI0.f21998u;
        this.f22292I = false;
        this.f22293J = false;
        this.f22294K = false;
        this.f22295L = false;
        this.f22296M = c2612fI0.f21999v;
        this.f22297N = c2612fI0.f22000w;
        this.f22298O = c2612fI0.f22001x;
        this.f22299P = false;
        this.f22300Q = c2612fI0.f22002y;
        this.f22301R = false;
        this.f22302S = c2612fI0.f22003z;
        this.f22303T = c2612fI0.f21995A;
    }
}
