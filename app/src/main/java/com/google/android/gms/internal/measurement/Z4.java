package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C1445Je;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class Z4 implements InterfaceC4964l5 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f29137q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f29138r = B5.p();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f29139a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f29140b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29141c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29142d;

    /* renamed from: e, reason: collision with root package name */
    private final W4 f29143e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f29144f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f29145g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f29146h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f29147i;

    /* renamed from: j, reason: collision with root package name */
    private final int f29148j;

    /* renamed from: k, reason: collision with root package name */
    private final int f29149k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC4884c5 f29150l;

    /* renamed from: m, reason: collision with root package name */
    private final F4 f29151m;

    /* renamed from: n, reason: collision with root package name */
    private final A5 f29152n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC4919g4 f29153o;

    /* renamed from: p, reason: collision with root package name */
    private final O4 f29154p;

    private Z4(int[] iArr, Object[] objArr, int i8, int i9, W4 w42, boolean z7, int[] iArr2, int i10, int i11, InterfaceC4884c5 interfaceC4884c5, F4 f42, A5 a52, AbstractC4919g4 abstractC4919g4, O4 o42) {
        this.f29139a = iArr;
        this.f29140b = objArr;
        this.f29141c = i8;
        this.f29142d = i9;
        this.f29145g = w42 instanceof AbstractC5010r4;
        this.f29144f = abstractC4919g4 != null && abstractC4919g4.d(w42);
        this.f29146h = false;
        this.f29147i = iArr2;
        this.f29148j = i10;
        this.f29149k = i11;
        this.f29150l = interfaceC4884c5;
        this.f29151m = f42;
        this.f29152n = a52;
        this.f29153o = abstractC4919g4;
        this.f29143e = w42;
        this.f29154p = o42;
    }

    private static float A(Object obj, long j8) {
        return ((Float) B5.B(obj, j8)).floatValue();
    }

    private final int B(int i8) {
        return this.f29139a[i8 + 2];
    }

    private final void C(Object obj, int i8) {
        int B7 = B(i8);
        long j8 = 1048575 & B7;
        if (j8 == 1048575) {
            return;
        }
        B5.h(obj, j8, (1 << (B7 >>> 20)) | B5.t(obj, j8));
    }

    private final void D(Object obj, int i8, int i9) {
        B5.h(obj, B(i9) & 1048575, i8);
    }

    private final void E(Object obj, Object obj2, int i8) {
        int i9 = this.f29139a[i8];
        if (J(obj2, i9, i8)) {
            long F7 = F(i8) & 1048575;
            Unsafe unsafe = f29138r;
            Object object = unsafe.getObject(obj2, F7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f29139a[i8] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC4964l5 N7 = N(i8);
            if (!J(obj, i9, i8)) {
                if (S(object)) {
                    Object zza = N7.zza();
                    N7.f(zza, object);
                    unsafe.putObject(obj, F7, zza);
                } else {
                    unsafe.putObject(obj, F7, object);
                }
                D(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, F7);
            if (!S(object2)) {
                Object zza2 = N7.zza();
                N7.f(zza2, object2);
                unsafe.putObject(obj, F7, zza2);
                object2 = zza2;
            }
            N7.f(object2, object);
        }
    }

    private final int F(int i8) {
        return this.f29139a[i8 + 1];
    }

    private static int G(Object obj, long j8) {
        return ((Integer) B5.B(obj, j8)).intValue();
    }

    static C5075z5 H(Object obj) {
        AbstractC5010r4 abstractC5010r4 = (AbstractC5010r4) obj;
        C5075z5 c5075z5 = abstractC5010r4.zzb;
        if (c5075z5 != C5075z5.k()) {
            return c5075z5;
        }
        C5075z5 l8 = C5075z5.l();
        abstractC5010r4.zzb = l8;
        return l8;
    }

    private final boolean I(Object obj, int i8) {
        int B7 = B(i8);
        long j8 = B7 & 1048575;
        if (j8 != 1048575) {
            return (B5.t(obj, j8) & (1 << (B7 >>> 20))) != 0;
        }
        int F7 = F(i8);
        long j9 = F7 & 1048575;
        switch ((F7 & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(B5.a(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(B5.n(obj, j9)) != 0;
            case 2:
                return B5.x(obj, j9) != 0;
            case 3:
                return B5.x(obj, j9) != 0;
            case 4:
                return B5.t(obj, j9) != 0;
            case 5:
                return B5.x(obj, j9) != 0;
            case 6:
                return B5.t(obj, j9) != 0;
            case 7:
                return B5.F(obj, j9);
            case 8:
                Object B8 = B5.B(obj, j9);
                if (B8 instanceof String) {
                    return !((String) B8).isEmpty();
                }
                if (B8 instanceof K3) {
                    return !K3.f28931s.equals(B8);
                }
                throw new IllegalArgumentException();
            case 9:
                return B5.B(obj, j9) != null;
            case 10:
                return !K3.f28931s.equals(B5.B(obj, j9));
            case 11:
                return B5.t(obj, j9) != 0;
            case 12:
                return B5.t(obj, j9) != 0;
            case 13:
                return B5.t(obj, j9) != 0;
            case 14:
                return B5.x(obj, j9) != 0;
            case 15:
                return B5.t(obj, j9) != 0;
            case 16:
                return B5.x(obj, j9) != 0;
            case 17:
                return B5.B(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(Object obj, int i8, int i9) {
        return B5.t(obj, (long) (B(i9) & 1048575)) == i8;
    }

    private final boolean K(Object obj, Object obj2, int i8) {
        return I(obj, i8) == I(obj2, i8);
    }

    private static long L(Object obj, long j8) {
        return ((Long) B5.B(obj, j8)).longValue();
    }

    private final InterfaceC5042v4 M(int i8) {
        return (InterfaceC5042v4) this.f29140b[((i8 / 3) << 1) + 1];
    }

    private final InterfaceC4964l5 N(int i8) {
        int i9 = (i8 / 3) << 1;
        InterfaceC4964l5 interfaceC4964l5 = (InterfaceC4964l5) this.f29140b[i9];
        if (interfaceC4964l5 != null) {
            return interfaceC4964l5;
        }
        InterfaceC4964l5 b8 = C4938i5.a().b((Class) this.f29140b[i9 + 1]);
        this.f29140b[i9] = b8;
        return b8;
    }

    private static boolean O(Object obj, long j8) {
        return ((Boolean) B5.B(obj, j8)).booleanValue();
    }

    private final Object P(int i8) {
        return this.f29140b[(i8 / 3) << 1];
    }

    private static void Q(Object obj) {
        if (S(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean R(int i8) {
        return (i8 & 536870912) != 0;
    }

    private static boolean S(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5010r4) {
            return ((AbstractC5010r4) obj).F();
        }
        return true;
    }

    private static double i(Object obj, long j8) {
        return ((Double) B5.B(obj, j8)).doubleValue();
    }

    private final int j(int i8) {
        if (i8 < this.f29141c || i8 > this.f29142d) {
            return -1;
        }
        return k(i8, 0);
    }

    private final int k(int i8, int i9) {
        int length = (this.f29139a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f29139a[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.measurement.Z4 m(java.lang.Class r32, com.google.android.gms.internal.measurement.U4 r33, com.google.android.gms.internal.measurement.InterfaceC4884c5 r34, com.google.android.gms.internal.measurement.F4 r35, com.google.android.gms.internal.measurement.A5 r36, com.google.android.gms.internal.measurement.AbstractC4919g4 r37, com.google.android.gms.internal.measurement.O4 r38) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.m(java.lang.Class, com.google.android.gms.internal.measurement.U4, com.google.android.gms.internal.measurement.c5, com.google.android.gms.internal.measurement.F4, com.google.android.gms.internal.measurement.A5, com.google.android.gms.internal.measurement.g4, com.google.android.gms.internal.measurement.O4):com.google.android.gms.internal.measurement.Z4");
    }

    private final Object n(int i8, int i9, Map map, InterfaceC5042v4 interfaceC5042v4, Object obj, A5 a52, Object obj2) {
        this.f29154p.a(P(i8));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!interfaceC5042v4.m(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = a52.i(obj2);
                }
                T3 v7 = K3.v(N4.a(null, entry.getKey(), entry.getValue()));
                try {
                    N4.b(v7.b(), null, entry.getKey(), entry.getValue());
                    a52.c(obj, i9, v7.a());
                    it.remove();
                } catch (IOException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
        return obj;
    }

    private final Object o(Object obj, int i8) {
        InterfaceC4964l5 N7 = N(i8);
        long F7 = F(i8) & 1048575;
        if (!I(obj, i8)) {
            return N7.zza();
        }
        Object object = f29138r.getObject(obj, F7);
        if (S(object)) {
            return object;
        }
        Object zza = N7.zza();
        if (object != null) {
            N7.f(zza, object);
        }
        return zza;
    }

    private final Object p(Object obj, int i8, int i9) {
        InterfaceC4964l5 N7 = N(i9);
        if (!J(obj, i8, i9)) {
            return N7.zza();
        }
        Object object = f29138r.getObject(obj, F(i9) & 1048575);
        if (S(object)) {
            return object;
        }
        Object zza = N7.zza();
        if (object != null) {
            N7.f(zza, object);
        }
        return zza;
    }

    private final Object q(Object obj, int i8, Object obj2, A5 a52, Object obj3) {
        InterfaceC5042v4 M7;
        int i9 = this.f29139a[i8];
        Object B7 = B5.B(obj, F(i8) & 1048575);
        return (B7 == null || (M7 = M(i8)) == null) ? obj2 : n(i8, i9, this.f29154p.b(B7), M7, obj2, a52, obj3);
    }

    private static Field r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void s(int i8, Object obj, S5 s52) {
        if (obj instanceof String) {
            s52.g(i8, (String) obj);
        } else {
            s52.q(i8, (K3) obj);
        }
    }

    private static void t(A5 a52, Object obj, S5 s52) {
        a52.g(a52.k(obj), s52);
    }

    private final void u(S5 s52, int i8, Object obj, int i9) {
        if (obj != null) {
            this.f29154p.a(P(i9));
            s52.n(i8, null, this.f29154p.e(obj));
        }
    }

    private final void v(Object obj, int i8, int i9, Object obj2) {
        f29138r.putObject(obj, F(i9) & 1048575, obj2);
        D(obj, i8, i9);
    }

    private final void w(Object obj, int i8, Object obj2) {
        f29138r.putObject(obj, F(i8) & 1048575, obj2);
        C(obj, i8);
    }

    private final void x(Object obj, Object obj2, int i8) {
        if (I(obj2, i8)) {
            long F7 = F(i8) & 1048575;
            Unsafe unsafe = f29138r;
            Object object = unsafe.getObject(obj2, F7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f29139a[i8] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC4964l5 N7 = N(i8);
            if (!I(obj, i8)) {
                if (S(object)) {
                    Object zza = N7.zza();
                    N7.f(zza, object);
                    unsafe.putObject(obj, F7, zza);
                } else {
                    unsafe.putObject(obj, F7, object);
                }
                C(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, F7);
            if (!S(object2)) {
                Object zza2 = N7.zza();
                N7.f(zza2, object2);
                unsafe.putObject(obj, F7, zza2);
                object2 = zza2;
            }
            N7.f(object2, object);
        }
    }

    private final boolean y(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? I(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean z(Object obj, int i8, InterfaceC4964l5 interfaceC4964l5) {
        return interfaceC4964l5.b(B5.B(obj, i8 & 1048575));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final int a(Object obj) {
        int i8;
        int i9;
        int i10;
        int e8;
        int z7;
        int p02;
        boolean z8;
        int x7;
        int B7;
        int s02;
        int v02;
        Unsafe unsafe = f29138r;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.f29139a.length) {
            int F7 = F(i14);
            int i16 = (267386880 & F7) >>> 20;
            int[] iArr = this.f29139a;
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i11;
            if (i16 <= 17) {
                if (i19 != i12) {
                    i13 = i19 == i11 ? 0 : unsafe.getInt(obj, i19);
                    i12 = i19;
                }
                i8 = i12;
                i9 = i13;
                i10 = 1 << (i18 >>> 20);
            } else {
                i8 = i12;
                i9 = i13;
                i10 = 0;
            }
            long j8 = F7 & i11;
            if (i16 >= EnumC4963l4.f29422b0.zza()) {
                EnumC4963l4.f29435o0.zza();
            }
            switch (i16) {
                case 0:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.e(i17, 0.0d);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.f(i17, 0.0f);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.Y(i17, unsafe.getLong(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.m0(i17, unsafe.getLong(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.l0(i17, unsafe.getInt(obj, j8));
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.P(i17, 0L);
                        i15 += e8;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (y(obj, i14, i8, i9, i10)) {
                        e8 = zzjc.h0(i17, 0);
                        i15 += e8;
                        break;
                    }
                    break;
                case 7:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.z(i17, true);
                        i15 += z7;
                    }
                    break;
                case 8:
                    if (y(obj, i14, i8, i9, i10)) {
                        Object object = unsafe.getObject(obj, j8);
                        z7 = object instanceof K3 ? zzjc.Q(i17, (K3) object) : zzjc.y(i17, (String) object);
                        i15 += z7;
                    }
                    break;
                case 9:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = AbstractC4980n5.a(i17, unsafe.getObject(obj, j8), N(i14));
                        i15 += z7;
                    }
                    break;
                case 10:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.Q(i17, (K3) unsafe.getObject(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 11:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.w0(i17, unsafe.getInt(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 12:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.d0(i17, unsafe.getInt(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 13:
                    if (y(obj, i14, i8, i9, i10)) {
                        p02 = zzjc.p0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 14:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.e0(i17, 0L);
                        i15 += z7;
                    }
                    break;
                case 15:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.t0(i17, unsafe.getInt(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 16:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.i0(i17, unsafe.getLong(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 17:
                    if (y(obj, i14, i8, i9, i10)) {
                        z7 = zzjc.x(i17, (W4) unsafe.getObject(obj, j8), N(i14));
                        i15 += z7;
                    }
                    break;
                case 18:
                    z7 = AbstractC4980n5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z7;
                    break;
                case 19:
                    z8 = false;
                    x7 = AbstractC4980n5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 20:
                    z8 = false;
                    x7 = AbstractC4980n5.G(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case C1445Je.zzm /* 21 */:
                    z8 = false;
                    x7 = AbstractC4980n5.S(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 22:
                    z8 = false;
                    x7 = AbstractC4980n5.D(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 23:
                    z8 = false;
                    x7 = AbstractC4980n5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 24:
                    z8 = false;
                    x7 = AbstractC4980n5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 25:
                    z8 = false;
                    x7 = AbstractC4980n5.d(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 26:
                    z7 = AbstractC4980n5.q(i17, (List) unsafe.getObject(obj, j8));
                    i15 += z7;
                    break;
                case 27:
                    z7 = AbstractC4980n5.r(i17, (List) unsafe.getObject(obj, j8), N(i14));
                    i15 += z7;
                    break;
                case 28:
                    z7 = AbstractC4980n5.b(i17, (List) unsafe.getObject(obj, j8));
                    i15 += z7;
                    break;
                case 29:
                    z7 = AbstractC4980n5.P(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += z7;
                    break;
                case 30:
                    z8 = false;
                    x7 = AbstractC4980n5.s(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 31:
                    z8 = false;
                    x7 = AbstractC4980n5.x(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 32:
                    z8 = false;
                    x7 = AbstractC4980n5.A(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 33:
                    z8 = false;
                    x7 = AbstractC4980n5.J(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 34:
                    z8 = false;
                    x7 = AbstractC4980n5.M(i17, (List) unsafe.getObject(obj, j8), false);
                    i15 += x7;
                    break;
                case 35:
                    B7 = AbstractC4980n5.B((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 36:
                    B7 = AbstractC4980n5.y((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 37:
                    B7 = AbstractC4980n5.H((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 38:
                    B7 = AbstractC4980n5.T((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 39:
                    B7 = AbstractC4980n5.E((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 40:
                    B7 = AbstractC4980n5.B((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 41:
                    B7 = AbstractC4980n5.y((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 42:
                    B7 = AbstractC4980n5.e((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 43:
                    B7 = AbstractC4980n5.Q((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 44:
                    B7 = AbstractC4980n5.t((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 45:
                    B7 = AbstractC4980n5.y((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 46:
                    B7 = AbstractC4980n5.B((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 47:
                    B7 = AbstractC4980n5.K((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 48:
                    B7 = AbstractC4980n5.N((List) unsafe.getObject(obj, j8));
                    if (B7 > 0) {
                        s02 = zzjc.s0(i17);
                        v02 = zzjc.v0(B7);
                        p02 = s02 + v02 + B7;
                        i15 += p02;
                    }
                    break;
                case 49:
                    z7 = AbstractC4980n5.c(i17, (List) unsafe.getObject(obj, j8), N(i14));
                    i15 += z7;
                    break;
                case 50:
                    z7 = this.f29154p.h(i17, unsafe.getObject(obj, j8), P(i14));
                    i15 += z7;
                    break;
                case 51:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.e(i17, 0.0d);
                        i15 += z7;
                    }
                    break;
                case 52:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.f(i17, 0.0f);
                        i15 += z7;
                    }
                    break;
                case 53:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.Y(i17, L(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 54:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.m0(i17, L(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 55:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.l0(i17, G(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 56:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.P(i17, 0L);
                        i15 += z7;
                    }
                    break;
                case 57:
                    if (J(obj, i17, i14)) {
                        p02 = zzjc.h0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 58:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.z(i17, true);
                        i15 += z7;
                    }
                    break;
                case 59:
                    if (J(obj, i17, i14)) {
                        Object object2 = unsafe.getObject(obj, j8);
                        z7 = object2 instanceof K3 ? zzjc.Q(i17, (K3) object2) : zzjc.y(i17, (String) object2);
                        i15 += z7;
                    }
                    break;
                case 60:
                    if (J(obj, i17, i14)) {
                        z7 = AbstractC4980n5.a(i17, unsafe.getObject(obj, j8), N(i14));
                        i15 += z7;
                    }
                    break;
                case 61:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.Q(i17, (K3) unsafe.getObject(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 62:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.w0(i17, G(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 63:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.d0(i17, G(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 64:
                    if (J(obj, i17, i14)) {
                        p02 = zzjc.p0(i17, 0);
                        i15 += p02;
                    }
                    break;
                case 65:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.e0(i17, 0L);
                        i15 += z7;
                    }
                    break;
                case 66:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.t0(i17, G(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 67:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.i0(i17, L(obj, j8));
                        i15 += z7;
                    }
                    break;
                case 68:
                    if (J(obj, i17, i14)) {
                        z7 = zzjc.x(i17, (W4) unsafe.getObject(obj, j8), N(i14));
                        i15 += z7;
                    }
                    break;
            }
            i14 += 3;
            i12 = i8;
            i13 = i9;
            i11 = 1048575;
        }
        int i20 = 0;
        A5 a52 = this.f29152n;
        int a8 = i15 + a52.a(a52.k(obj));
        if (!this.f29144f) {
            return a8;
        }
        C4955k4 b8 = this.f29153o.b(obj);
        int a9 = b8.f29384a.a();
        for (int i21 = 0; i21 < a9; i21++) {
            Map.Entry g8 = b8.f29384a.g(i21);
            androidx.appcompat.app.E.a(g8.getKey());
            i20 += C4955k4.b(null, g8.getValue());
        }
        for (Map.Entry entry : b8.f29384a.h()) {
            androidx.appcompat.app.E.a(entry.getKey());
            i20 += C4955k4.b(null, entry.getValue());
        }
        return a8 + i20;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.b(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final int c(Object obj) {
        int i8;
        int b8;
        int length = this.f29139a.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int F7 = F(i10);
            int i11 = this.f29139a[i10];
            long j8 = 1048575 & F7;
            int i12 = 37;
            switch ((F7 & 267386880) >>> 20) {
                case 0:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(Double.doubleToLongBits(B5.a(obj, j8)));
                    i9 = i8 + b8;
                    break;
                case 1:
                    i8 = i9 * 53;
                    b8 = Float.floatToIntBits(B5.n(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 2:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(B5.x(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 3:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(B5.x(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 4:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 5:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(B5.x(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 6:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 7:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.c(B5.F(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 8:
                    i8 = i9 * 53;
                    b8 = ((String) B5.B(obj, j8)).hashCode();
                    i9 = i8 + b8;
                    break;
                case 9:
                    Object B7 = B5.B(obj, j8);
                    if (B7 != null) {
                        i12 = B7.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i8 = i9 * 53;
                    b8 = B5.B(obj, j8).hashCode();
                    i9 = i8 + b8;
                    break;
                case 11:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 12:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 13:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 14:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(B5.x(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 15:
                    i8 = i9 * 53;
                    b8 = B5.t(obj, j8);
                    i9 = i8 + b8;
                    break;
                case 16:
                    i8 = i9 * 53;
                    b8 = AbstractC5026t4.b(B5.x(obj, j8));
                    i9 = i8 + b8;
                    break;
                case 17:
                    Object B8 = B5.B(obj, j8);
                    if (B8 != null) {
                        i12 = B8.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case C1445Je.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    b8 = B5.B(obj, j8).hashCode();
                    i9 = i8 + b8;
                    break;
                case 50:
                    i8 = i9 * 53;
                    b8 = B5.B(obj, j8).hashCode();
                    i9 = i8 + b8;
                    break;
                case 51:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(Double.doubleToLongBits(i(obj, j8)));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = Float.floatToIntBits(A(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(L(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(L(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(L(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.c(O(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = ((String) B5.B(obj, j8)).hashCode();
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = B5.B(obj, j8).hashCode();
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = B5.B(obj, j8).hashCode();
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(L(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = G(obj, j8);
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = AbstractC5026t4.b(L(obj, j8));
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(obj, i11, i10)) {
                        i8 = i9 * 53;
                        b8 = B5.B(obj, j8).hashCode();
                        i9 = i8 + b8;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i9 * 53) + this.f29152n.k(obj).hashCode();
        return this.f29144f ? (hashCode * 53) + this.f29153o.b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r24, com.google.android.gms.internal.measurement.S5 r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.d(java.lang.Object, com.google.android.gms.internal.measurement.S5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = S(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.AbstractC5010r4
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.measurement.r4 r0 = (com.google.android.gms.internal.measurement.AbstractC5010r4) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.i(r2)
            r0.zza = r1
            r0.E()
        L1a:
            int[] r0 = r7.f29139a
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L83
            int r2 = r7.F(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L6d
            r5 = 60
            if (r2 == r5) goto L55
            r5 = 68
            if (r2 == r5) goto L55
            switch(r2) {
                case 17: goto L6d;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L80
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.measurement.Z4.f29138r
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L80
            com.google.android.gms.internal.measurement.O4 r6 = r7.f29154p
            java.lang.Object r5 = r6.g(r5)
            r2.putObject(r8, r3, r5)
            goto L80
        L4f:
            com.google.android.gms.internal.measurement.F4 r2 = r7.f29151m
            r2.a(r8, r3)
            goto L80
        L55:
            int[] r2 = r7.f29139a
            r2 = r2[r1]
            boolean r2 = r7.J(r8, r2, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.l5 r2 = r7.N(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.Z4.f29138r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
            goto L80
        L6d:
            boolean r2 = r7.I(r8, r1)
            if (r2 == 0) goto L80
            com.google.android.gms.internal.measurement.l5 r2 = r7.N(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.measurement.Z4.f29138r
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
        L80:
            int r1 = r1 + 3
            goto L1d
        L83:
            com.google.android.gms.internal.measurement.A5 r0 = r7.f29152n
            r0.l(r8)
            boolean r0 = r7.f29144f
            if (r0 == 0) goto L91
            com.google.android.gms.internal.measurement.g4 r0 = r7.f29153o
            r0.f(r8)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.e(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void f(Object obj, Object obj2) {
        Q(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f29139a.length; i8 += 3) {
            int F7 = F(i8);
            long j8 = 1048575 & F7;
            int i9 = this.f29139a[i8];
            switch ((F7 & 267386880) >>> 20) {
                case 0:
                    if (I(obj2, i8)) {
                        B5.f(obj, j8, B5.a(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i8)) {
                        B5.g(obj, j8, B5.n(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(obj2, i8)) {
                        B5.i(obj, j8, B5.x(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (I(obj2, i8)) {
                        B5.i(obj, j8, B5.x(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (I(obj2, i8)) {
                        B5.i(obj, j8, B5.x(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (I(obj2, i8)) {
                        B5.v(obj, j8, B5.F(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (I(obj2, i8)) {
                        B5.j(obj, j8, B5.B(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    x(obj, obj2, i8);
                    break;
                case 10:
                    if (I(obj2, i8)) {
                        B5.j(obj, j8, B5.B(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(obj2, i8)) {
                        B5.i(obj, j8, B5.x(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(obj2, i8)) {
                        B5.h(obj, j8, B5.t(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (I(obj2, i8)) {
                        B5.i(obj, j8, B5.x(obj2, j8));
                        C(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    x(obj, obj2, i8);
                    break;
                case 18:
                case 19:
                case 20:
                case C1445Je.zzm /* 21 */:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f29151m.b(obj, obj2, j8);
                    break;
                case 50:
                    AbstractC4980n5.m(this.f29154p, obj, obj2, j8);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (J(obj2, i9, i8)) {
                        B5.j(obj, j8, B5.B(obj2, j8));
                        D(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    E(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (J(obj2, i9, i8)) {
                        B5.j(obj, j8, B5.B(obj2, j8));
                        D(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    E(obj, obj2, i8);
                    break;
            }
        }
        AbstractC4980n5.n(this.f29152n, obj, obj2);
        if (this.f29144f) {
            AbstractC4980n5.l(this.f29153o, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void g(Object obj, byte[] bArr, int i8, int i9, J3 j32) {
        l(obj, bArr, i8, i9, 0, j32);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.h(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:457:0x0b50 A[PHI: r4 r8 r9 r20 r27
  0x0b50: PHI (r4v78 com.google.android.gms.internal.measurement.J3) = 
  (r4v51 com.google.android.gms.internal.measurement.J3)
  (r4v52 com.google.android.gms.internal.measurement.J3)
  (r4v53 com.google.android.gms.internal.measurement.J3)
  (r4v54 com.google.android.gms.internal.measurement.J3)
  (r4v55 com.google.android.gms.internal.measurement.J3)
  (r4v57 com.google.android.gms.internal.measurement.J3)
  (r4v58 com.google.android.gms.internal.measurement.J3)
  (r4v59 com.google.android.gms.internal.measurement.J3)
  (r4v68 com.google.android.gms.internal.measurement.J3)
  (r4v73 com.google.android.gms.internal.measurement.J3)
  (r4v79 com.google.android.gms.internal.measurement.J3)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r8v78 int) = 
  (r8v56 int)
  (r8v57 int)
  (r8v58 int)
  (r8v59 int)
  (r8v60 int)
  (r8v62 int)
  (r8v63 int)
  (r8v64 int)
  (r8v70 int)
  (r8v73 int)
  (r8v79 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r9v84 int) = 
  (r9v59 int)
  (r9v60 int)
  (r9v61 int)
  (r9v62 int)
  (r9v63 int)
  (r9v65 int)
  (r9v66 int)
  (r9v67 int)
  (r9v76 int)
  (r9v78 int)
  (r9v85 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r20v52 int) = 
  (r20v31 int)
  (r20v32 int)
  (r20v33 int)
  (r20v34 int)
  (r20v35 int)
  (r20v37 int)
  (r20v38 int)
  (r20v39 int)
  (r20v44 int)
  (r20v47 int)
  (r20v53 int)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]
  0x0b50: PHI (r27v13 sun.misc.Unsafe) = 
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v8 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
  (r27v7 sun.misc.Unsafe)
 binds: [B:455:0x0b3c, B:452:0x0b20, B:449:0x0b04, B:446:0x0ae9, B:443:0x0ace, B:439:0x0ab0, B:432:0x0a8a, B:430:0x0a7e, B:398:0x09b5, B:394:0x098f, B:385:0x0932] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0bd4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x089e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int l(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.J3 r36) {
        /*
            Method dump skipped, instructions count: 3278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.Z4.l(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.J3):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final Object zza() {
        return this.f29150l.a(this.f29143e);
    }
}
