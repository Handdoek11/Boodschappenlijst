package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.kJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3157kJ0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Comparator f23576g = new Comparator() { // from class: com.google.android.gms.internal.ads.fJ0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C2941iJ0) obj).f22954a - ((C2941iJ0) obj2).f22954a;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator f23577h = new Comparator() { // from class: com.google.android.gms.internal.ads.hJ0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C2941iJ0) obj).f22956c, ((C2941iJ0) obj2).f22956c);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private int f23581d;

    /* renamed from: e, reason: collision with root package name */
    private int f23582e;

    /* renamed from: f, reason: collision with root package name */
    private int f23583f;

    /* renamed from: b, reason: collision with root package name */
    private final C2941iJ0[] f23579b = new C2941iJ0[5];

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f23578a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private int f23580c = -1;

    public C3157kJ0(int i8) {
    }

    public final float a(float f8) {
        if (this.f23580c != 0) {
            Collections.sort(this.f23578a, f23577h);
            this.f23580c = 0;
        }
        float f9 = this.f23582e;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f23578a.size(); i9++) {
            float f10 = 0.5f * f9;
            C2941iJ0 c2941iJ0 = (C2941iJ0) this.f23578a.get(i9);
            i8 += c2941iJ0.f22955b;
            if (i8 >= f10) {
                return c2941iJ0.f22956c;
            }
        }
        if (this.f23578a.isEmpty()) {
            return Float.NaN;
        }
        return ((C2941iJ0) this.f23578a.get(r6.size() - 1)).f22956c;
    }

    public final void b(int i8, float f8) {
        C2941iJ0 c2941iJ0;
        if (this.f23580c != 1) {
            Collections.sort(this.f23578a, f23576g);
            this.f23580c = 1;
        }
        int i9 = this.f23583f;
        if (i9 > 0) {
            C2941iJ0[] c2941iJ0Arr = this.f23579b;
            int i10 = i9 - 1;
            this.f23583f = i10;
            c2941iJ0 = c2941iJ0Arr[i10];
        } else {
            c2941iJ0 = new C2941iJ0(null);
        }
        int i11 = this.f23581d;
        this.f23581d = i11 + 1;
        c2941iJ0.f22954a = i11;
        c2941iJ0.f22955b = i8;
        c2941iJ0.f22956c = f8;
        this.f23578a.add(c2941iJ0);
        this.f23582e += i8;
        while (true) {
            int i12 = this.f23582e;
            if (i12 <= 2000) {
                return;
            }
            int i13 = i12 - 2000;
            C2941iJ0 c2941iJ02 = (C2941iJ0) this.f23578a.get(0);
            int i14 = c2941iJ02.f22955b;
            if (i14 <= i13) {
                this.f23582e -= i14;
                this.f23578a.remove(0);
                int i15 = this.f23583f;
                if (i15 < 5) {
                    C2941iJ0[] c2941iJ0Arr2 = this.f23579b;
                    this.f23583f = i15 + 1;
                    c2941iJ0Arr2[i15] = c2941iJ02;
                }
            } else {
                c2941iJ02.f22955b = i14 - i13;
                this.f23582e -= i13;
            }
        }
    }

    public final void c() {
        this.f23578a.clear();
        this.f23580c = -1;
        this.f23581d = 0;
        this.f23582e = 0;
    }
}
