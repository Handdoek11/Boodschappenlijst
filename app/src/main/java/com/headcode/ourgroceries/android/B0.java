package com.headcode.ourgroceries.android;

import com.headcode.ourgroceries.android.C5688z0;
import com.headcode.ourgroceries.android.Z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final C5688z0 f33280a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator f33281b;

    /* renamed from: c, reason: collision with root package name */
    private final Z0 f33282c = Z0.F();

    /* renamed from: d, reason: collision with root package name */
    private final Map f33283d = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f33284a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f33285b;

        static {
            int[] iArr = new int[C5688z0.c.values().length];
            f33285b = iArr;
            try {
                iArr[C5688z0.c.ALPHABETICALLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33285b[C5688z0.c.BY_FREQUENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33285b[C5688z0.c.BY_DRAG_AND_DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33285b[C5688z0.c.RECENT_AT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33285b[C5688z0.c.RECENT_AT_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[C5688z0.d.values().length];
            f33284a = iArr2;
            try {
                iArr2[C5688z0.d.ALPHABETICALLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33284a[C5688z0.d.BY_DRAG_AND_DROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public B0(C5688z0 c5688z0, Comparator comparator) {
        this.f33280a = c5688z0;
        this.f33281b = comparator;
    }

    private static Comparator b() {
        return a.f33284a[A2.f33140n0.I().ordinal()] != 1 ? Z0.f34624x : Z0.f34626z;
    }

    private static Comparator c(C5574j1 c5574j1) {
        int i8 = a.f33285b[A2.f33140n0.G().ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? Z0.f34616A : Z0.f34625y : Z0.f34624x : new Z0.b(c5574j1.M()) : Z0.f34623w;
    }

    public static B0 e(C5688z0 c5688z0) {
        return new B0(c5688z0, b());
    }

    public static B0 f(C5574j1 c5574j1) {
        boolean m8 = A2.f33140n0.m();
        return new B0(m8 ? c5574j1.D() : null, c(c5574j1));
    }

    public void a(Z0 z02) {
        String u7 = this.f33280a != null ? z02.u() : this.f33282c.w();
        C5565i0 c5565i0 = (C5565i0) this.f33283d.get(u7);
        if (c5565i0 == null) {
            Z0 J7 = (this.f33280a == null || u7.equals(this.f33282c.w())) ? null : this.f33280a.J(u7);
            if (J7 == null) {
                J7 = this.f33282c;
            }
            C5565i0 c5565i02 = new C5565i0(J7);
            this.f33283d.put(u7, c5565i02);
            c5565i0 = c5565i02;
        }
        c5565i0.c().add(z02);
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        for (C5565i0 c5565i0 : this.f33283d.values()) {
            Collections.sort(c5565i0.c(), this.f33281b);
            arrayList.add(c5565i0);
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 1 && ((C5565i0) arrayList.get(0)).a() == this.f33282c) {
            ((C5565i0) arrayList.get(0)).f(false);
        }
        return arrayList;
    }
}
