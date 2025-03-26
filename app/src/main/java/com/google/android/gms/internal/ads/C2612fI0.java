package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fI0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2612fI0 extends C3420mo {

    /* renamed from: A, reason: collision with root package name */
    private final SparseBooleanArray f21995A;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21996s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21997t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21998u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21999v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22000w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22001x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22002y;

    /* renamed from: z, reason: collision with root package name */
    private final SparseArray f22003z;

    public C2612fI0() {
        this.f22003z = new SparseArray();
        this.f21995A = new SparseBooleanArray();
        y();
    }

    private final void y() {
        this.f21996s = true;
        this.f21997t = true;
        this.f21998u = true;
        this.f21999v = true;
        this.f22000w = true;
        this.f22001x = true;
        this.f22002y = true;
    }

    public final C2612fI0 q(int i8, boolean z7) {
        if (this.f21995A.get(i8) != z7) {
            if (z7) {
                this.f21995A.put(i8, true);
            } else {
                this.f21995A.delete(i8);
            }
        }
        return this;
    }

    public C2612fI0(Context context) {
        super.e(context);
        Point O7 = AbstractC2301cW.O(context);
        super.f(O7.x, O7.y, true);
        this.f22003z = new SparseArray();
        this.f21995A = new SparseBooleanArray();
        y();
    }

    /* synthetic */ C2612fI0(C2721gI0 c2721gI0, AbstractC4680yI0 abstractC4680yI0) {
        super(c2721gI0);
        this.f21996s = c2721gI0.f22287D;
        this.f21997t = c2721gI0.f22289F;
        this.f21998u = c2721gI0.f22291H;
        this.f21999v = c2721gI0.f22296M;
        this.f22000w = c2721gI0.f22297N;
        this.f22001x = c2721gI0.f22298O;
        this.f22002y = c2721gI0.f22300Q;
        SparseArray sparseArray = c2721gI0.f22302S;
        SparseArray sparseArray2 = new SparseArray();
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            sparseArray2.put(sparseArray.keyAt(i8), new HashMap((Map) sparseArray.valueAt(i8)));
        }
        this.f22003z = sparseArray2;
        this.f21995A = c2721gI0.f22303T.clone();
    }
}
