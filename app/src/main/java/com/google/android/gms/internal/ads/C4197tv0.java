package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.tv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4197tv0 implements Iv0 {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f26960m = new int[0];

    /* renamed from: n, reason: collision with root package name */
    private static final Unsafe f26961n = Vv0.q();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f26962a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f26963b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26964c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26965d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3871qv0 f26966e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26967f = false;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26968g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f26969h;

    /* renamed from: i, reason: collision with root package name */
    private final int f26970i;

    /* renamed from: j, reason: collision with root package name */
    private final int f26971j;

    /* renamed from: k, reason: collision with root package name */
    private final Ov0 f26972k;

    /* renamed from: l, reason: collision with root package name */
    private final Fu0 f26973l;

    private C4197tv0(int[] iArr, Object[] objArr, int i8, int i9, InterfaceC3871qv0 interfaceC3871qv0, boolean z7, int[] iArr2, int i10, int i11, C4415vv0 c4415vv0, C2565ev0 c2565ev0, Ov0 ov0, Fu0 fu0, C3326lv0 c3326lv0) {
        this.f26962a = iArr;
        this.f26963b = objArr;
        this.f26964c = i8;
        this.f26965d = i9;
        this.f26968g = interfaceC3871qv0 instanceof Qu0;
        this.f26969h = iArr2;
        this.f26970i = i10;
        this.f26971j = i11;
        this.f26972k = ov0;
        this.f26973l = fu0;
        this.f26966e = interfaceC3871qv0;
    }

    private static boolean A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Qu0) {
            return ((Qu0) obj).V();
        }
        return true;
    }

    private final boolean B(Object obj, int i8, int i9) {
        return Vv0.l(obj, (long) (L(i9) & 1048575)) == i8;
    }

    private static boolean C(Object obj, long j8) {
        return ((Boolean) Vv0.p(obj, j8)).booleanValue();
    }

    private static final void D(int i8, Object obj, InterfaceC2242bw0 interfaceC2242bw0) {
        if (obj instanceof String) {
            interfaceC2242bw0.h(i8, (String) obj);
        } else {
            interfaceC2242bw0.I(i8, (AbstractC3542nu0) obj);
        }
    }

    static Pv0 F(Object obj) {
        Qu0 qu0 = (Qu0) obj;
        Pv0 pv0 = qu0.zzt;
        if (pv0 != Pv0.c()) {
            return pv0;
        }
        Pv0 f8 = Pv0.f();
        qu0.zzt = f8;
        return f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.C4197tv0 G(java.lang.Class r34, com.google.android.gms.internal.ads.InterfaceC3544nv0 r35, com.google.android.gms.internal.ads.C4415vv0 r36, com.google.android.gms.internal.ads.C2565ev0 r37, com.google.android.gms.internal.ads.Ov0 r38, com.google.android.gms.internal.ads.Fu0 r39, com.google.android.gms.internal.ads.C3326lv0 r40) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4197tv0.G(java.lang.Class, com.google.android.gms.internal.ads.nv0, com.google.android.gms.internal.ads.vv0, com.google.android.gms.internal.ads.ev0, com.google.android.gms.internal.ads.Ov0, com.google.android.gms.internal.ads.Fu0, com.google.android.gms.internal.ads.lv0):com.google.android.gms.internal.ads.tv0");
    }

    private static double H(Object obj, long j8) {
        return ((Double) Vv0.p(obj, j8)).doubleValue();
    }

    private static float I(Object obj, long j8) {
        return ((Float) Vv0.p(obj, j8)).floatValue();
    }

    private static int J(Object obj, long j8) {
        return ((Integer) Vv0.p(obj, j8)).intValue();
    }

    private final int K(int i8) {
        if (i8 < this.f26964c || i8 > this.f26965d) {
            return -1;
        }
        return M(i8, 0);
    }

    private final int L(int i8) {
        return this.f26962a[i8 + 2];
    }

    private final int M(int i8, int i9) {
        int length = (this.f26962a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f26962a[i11];
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

    private static int N(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int O(int i8) {
        return this.f26962a[i8 + 1];
    }

    private static long P(Object obj, long j8) {
        return ((Long) Vv0.p(obj, j8)).longValue();
    }

    private final Uu0 Q(int i8) {
        int i9 = i8 / 3;
        return (Uu0) this.f26963b[i9 + i9 + 1];
    }

    private final Iv0 R(int i8) {
        Object[] objArr = this.f26963b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        Iv0 iv0 = (Iv0) objArr[i10];
        if (iv0 != null) {
            return iv0;
        }
        Iv0 b8 = C4851zv0.a().b((Class) objArr[i10 + 1]);
        this.f26963b[i10] = b8;
        return b8;
    }

    private final Object S(Object obj, int i8, Object obj2, Ov0 ov0, Object obj3) {
        int i9 = this.f26962a[i8];
        Object p8 = Vv0.p(obj, O(i8) & 1048575);
        if (p8 == null || Q(i8) == null) {
            return obj2;
        }
        androidx.appcompat.app.E.a(T(i8));
        throw null;
    }

    private final Object T(int i8) {
        int i9 = i8 / 3;
        return this.f26963b[i9 + i9];
    }

    private final Object k(Object obj, int i8) {
        Iv0 R7 = R(i8);
        int O7 = O(i8) & 1048575;
        if (!x(obj, i8)) {
            return R7.b();
        }
        Object object = f26961n.getObject(obj, O7);
        if (A(object)) {
            return object;
        }
        Object b8 = R7.b();
        if (object != null) {
            R7.e(b8, object);
        }
        return b8;
    }

    private final Object l(Object obj, int i8, int i9) {
        Iv0 R7 = R(i9);
        if (!B(obj, i8, i9)) {
            return R7.b();
        }
        Object object = f26961n.getObject(obj, O(i9) & 1048575);
        if (A(object)) {
            return object;
        }
        Object b8 = R7.b();
        if (object != null) {
            R7.e(b8, object);
        }
        return b8;
    }

    private static Field m(Class cls, String str) {
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

    private static void n(Object obj) {
        if (!A(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void o(Object obj, Object obj2, int i8) {
        if (x(obj2, i8)) {
            int O7 = O(i8) & 1048575;
            Unsafe unsafe = f26961n;
            long j8 = O7;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f26962a[i8] + " is present but null: " + obj2.toString());
            }
            Iv0 R7 = R(i8);
            if (!x(obj, i8)) {
                if (A(object)) {
                    Object b8 = R7.b();
                    R7.e(b8, object);
                    unsafe.putObject(obj, j8, b8);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                r(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!A(object2)) {
                Object b9 = R7.b();
                R7.e(b9, object2);
                unsafe.putObject(obj, j8, b9);
                object2 = b9;
            }
            R7.e(object2, object);
        }
    }

    private final void p(Object obj, Object obj2, int i8) {
        int i9 = this.f26962a[i8];
        if (B(obj2, i9, i8)) {
            int O7 = O(i8) & 1048575;
            Unsafe unsafe = f26961n;
            long j8 = O7;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f26962a[i8] + " is present but null: " + obj2.toString());
            }
            Iv0 R7 = R(i8);
            if (!B(obj, i9, i8)) {
                if (A(object)) {
                    Object b8 = R7.b();
                    R7.e(b8, object);
                    unsafe.putObject(obj, j8, b8);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                s(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!A(object2)) {
                Object b9 = R7.b();
                R7.e(b9, object2);
                unsafe.putObject(obj, j8, b9);
                object2 = b9;
            }
            R7.e(object2, object);
        }
    }

    private final void q(Object obj, int i8, Cv0 cv0) {
        long j8 = i8 & 1048575;
        if (w(i8)) {
            Vv0.D(obj, j8, cv0.s());
        } else if (this.f26968g) {
            Vv0.D(obj, j8, cv0.r());
        } else {
            Vv0.D(obj, j8, cv0.p());
        }
    }

    private final void r(Object obj, int i8) {
        int L7 = L(i8);
        long j8 = 1048575 & L7;
        if (j8 == 1048575) {
            return;
        }
        Vv0.B(obj, j8, (1 << (L7 >>> 20)) | Vv0.l(obj, j8));
    }

    private final void s(Object obj, int i8, int i9) {
        Vv0.B(obj, L(i9) & 1048575, i8);
    }

    private final void t(Object obj, int i8, Object obj2) {
        f26961n.putObject(obj, O(i8) & 1048575, obj2);
        r(obj, i8);
    }

    private final void u(Object obj, int i8, int i9, Object obj2) {
        f26961n.putObject(obj, O(i9) & 1048575, obj2);
        s(obj, i8, i9);
    }

    private final boolean v(Object obj, Object obj2, int i8) {
        return x(obj, i8) == x(obj2, i8);
    }

    private static boolean w(int i8) {
        return (i8 & 536870912) != 0;
    }

    private final boolean x(Object obj, int i8) {
        int L7 = L(i8);
        long j8 = L7 & 1048575;
        if (j8 != 1048575) {
            return (Vv0.l(obj, j8) & (1 << (L7 >>> 20))) != 0;
        }
        int O7 = O(i8);
        long j9 = O7 & 1048575;
        switch (N(O7)) {
            case 0:
                return Double.doubleToRawLongBits(Vv0.j(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(Vv0.k(obj, j9)) != 0;
            case 2:
                return Vv0.n(obj, j9) != 0;
            case 3:
                return Vv0.n(obj, j9) != 0;
            case 4:
                return Vv0.l(obj, j9) != 0;
            case 5:
                return Vv0.n(obj, j9) != 0;
            case 6:
                return Vv0.l(obj, j9) != 0;
            case 7:
                return Vv0.H(obj, j9);
            case 8:
                Object p8 = Vv0.p(obj, j9);
                if (p8 instanceof String) {
                    return !((String) p8).isEmpty();
                }
                if (p8 instanceof AbstractC3542nu0) {
                    return !AbstractC3542nu0.f25048s.equals(p8);
                }
                throw new IllegalArgumentException();
            case 9:
                return Vv0.p(obj, j9) != null;
            case 10:
                return !AbstractC3542nu0.f25048s.equals(Vv0.p(obj, j9));
            case 11:
                return Vv0.l(obj, j9) != 0;
            case 12:
                return Vv0.l(obj, j9) != 0;
            case 13:
                return Vv0.l(obj, j9) != 0;
            case 14:
                return Vv0.n(obj, j9) != 0;
            case 15:
                return Vv0.l(obj, j9) != 0;
            case 16:
                return Vv0.n(obj, j9) != 0;
            case 17:
                return Vv0.p(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean y(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? x(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean z(Object obj, int i8, Iv0 iv0) {
        return iv0.i(Vv0.p(obj, i8 & 1048575));
    }

    /* JADX WARN: Removed duplicated region for block: B:460:0x0c40 A[PHI: r0 r2 r8 r10 r18 r21 r34
  0x0c40: PHI (r0v97 int) = (r0v68 int), (r0v69 int), (r0v75 int), (r0v80 int), (r0v88 int), (r0v98 int) binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r2v79 com.google.android.gms.internal.ads.au0) = 
  (r2v62 com.google.android.gms.internal.ads.au0)
  (r2v63 com.google.android.gms.internal.ads.au0)
  (r2v69 com.google.android.gms.internal.ads.au0)
  (r2v72 com.google.android.gms.internal.ads.au0)
  (r2v75 com.google.android.gms.internal.ads.au0)
  (r2v80 com.google.android.gms.internal.ads.au0)
 binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r8v85 int) = (r8v60 int), (r8v61 int), (r8v67 int), (r8v70 int), (r8v74 int), (r8v86 int) binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r10v53 int) = (r10v20 int), (r10v21 int), (r10v27 int), (r10v32 int), (r10v42 int), (r10v54 int) binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r18v62 int) = (r18v44 int), (r18v45 int), (r18v51 int), (r18v54 int), (r18v56 int), (r18v63 int) binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r21v30 int) = (r21v9 int), (r21v10 int), (r21v16 int), (r21v19 int), (r21v23 int), (r21v31 int) binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]
  0x0c40: PHI (r34v36 sun.misc.Unsafe) = 
  (r34v14 sun.misc.Unsafe)
  (r34v15 sun.misc.Unsafe)
  (r34v21 sun.misc.Unsafe)
  (r34v24 sun.misc.Unsafe)
  (r34v28 sun.misc.Unsafe)
  (r34v37 sun.misc.Unsafe)
 binds: [B:458:0x0c29, B:455:0x0c03, B:434:0x0b3b, B:418:0x0ae8, B:399:0x0a2c, B:388:0x09b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0921 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int E(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.C2129au0 r37) {
        /*
            Method dump skipped, instructions count: 3472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4197tv0.E(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.au0):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    @Override // com.google.android.gms.internal.ads.Iv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4197tv0.a(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final Object b() {
        return ((Qu0) this.f26966e).K();
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final int c(Object obj) {
        int i8;
        long doubleToLongBits;
        int floatToIntBits;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26962a.length; i11 += 3) {
            int O7 = O(i11);
            int[] iArr = this.f26962a;
            int i12 = 1048575 & O7;
            int N7 = N(O7);
            int i13 = iArr[i11];
            long j8 = i12;
            int i14 = 37;
            switch (N7) {
                case 0:
                    i8 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(Vv0.j(obj, j8));
                    byte[] bArr = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(Vv0.k(obj, j8));
                    i10 = i8 + floatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    doubleToLongBits = Vv0.n(obj, j8);
                    byte[] bArr2 = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 3:
                    i8 = i10 * 53;
                    doubleToLongBits = Vv0.n(obj, j8);
                    byte[] bArr3 = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 4:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    doubleToLongBits = Vv0.n(obj, j8);
                    byte[] bArr4 = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 6:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = AbstractC2131av0.a(Vv0.H(obj, j8));
                    i10 = i8 + floatToIntBits;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) Vv0.p(obj, j8)).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object p8 = Vv0.p(obj, j8);
                    if (p8 != null) {
                        i14 = p8.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.p(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 11:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 12:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 13:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 14:
                    i8 = i10 * 53;
                    doubleToLongBits = Vv0.n(obj, j8);
                    byte[] bArr5 = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 15:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.l(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    doubleToLongBits = Vv0.n(obj, j8);
                    byte[] bArr6 = AbstractC2131av0.f20783b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object p9 = Vv0.p(obj, j8);
                    if (p9 != null) {
                        i14 = p9.hashCode();
                    }
                    i10 = i9 + i14;
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
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.p(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = Vv0.p(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 51:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(H(obj, j8));
                        byte[] bArr7 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(I(obj, j8));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = P(obj, j8);
                        byte[] bArr8 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = P(obj, j8);
                        byte[] bArr9 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = P(obj, j8);
                        byte[] bArr10 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = AbstractC2131av0.a(C(obj, j8));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) Vv0.p(obj, j8)).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Vv0.p(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Vv0.p(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = P(obj, j8);
                        byte[] bArr11 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = J(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = P(obj, j8);
                        byte[] bArr12 = AbstractC2131av0.f20783b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (B(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Vv0.p(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i10 * 53) + ((Qu0) obj).zzt.hashCode();
        if (!this.f26967f) {
            return hashCode;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.gms.internal.ads.Iv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = A(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.Qu0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.ads.Qu0 r0 = (com.google.android.gms.internal.ads.Qu0) r0
            r0.C()
            r0.B()
            r0.E()
        L18:
            int[] r0 = r7.f26962a
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.O(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = N(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L57
            r5 = 68
            if (r2 == r5) goto L57
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4d;
                case 19: goto L4d;
                case 20: goto L4d;
                case 21: goto L4d;
                case 22: goto L4d;
                case 23: goto L4d;
                case 24: goto L4d;
                case 25: goto L4d;
                case 26: goto L4d;
                case 27: goto L4d;
                case 28: goto L4d;
                case 29: goto L4d;
                case 30: goto L4d;
                case 31: goto L4d;
                case 32: goto L4d;
                case 33: goto L4d;
                case 34: goto L4d;
                case 35: goto L4d;
                case 36: goto L4d;
                case 37: goto L4d;
                case 38: goto L4d;
                case 39: goto L4d;
                case 40: goto L4d;
                case 41: goto L4d;
                case 42: goto L4d;
                case 43: goto L4d;
                case 44: goto L4d;
                case 45: goto L4d;
                case 46: goto L4d;
                case 47: goto L4d;
                case 48: goto L4d;
                case 49: goto L4d;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L82
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.ads.C4197tv0.f26961n
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.gms.internal.ads.kv0 r6 = (com.google.android.gms.internal.ads.C3217kv0) r6
            r6.h()
            r2.putObject(r8, r3, r5)
            goto L82
        L4d:
            java.lang.Object r2 = com.google.android.gms.internal.ads.Vv0.p(r8, r3)
            com.google.android.gms.internal.ads.Zu0 r2 = (com.google.android.gms.internal.ads.Zu0) r2
            r2.zzb()
            goto L82
        L57:
            int[] r2 = r7.f26962a
            r2 = r2[r1]
            boolean r2 = r7.B(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.Iv0 r2 = r7.R(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.C4197tv0.f26961n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L82
        L6f:
            boolean r2 = r7.x(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.ads.Iv0 r2 = r7.R(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.ads.C4197tv0.f26961n
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L82:
            int r1 = r1 + 3
            goto L1b
        L85:
            com.google.android.gms.internal.ads.Ov0 r0 = r7.f26972k
            r0.i(r8)
            boolean r0 = r7.f26967f
            if (r0 == 0) goto L93
            com.google.android.gms.internal.ads.Fu0 r0 = r7.f26973l
            r0.a(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4197tv0.d(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void e(Object obj, Object obj2) {
        n(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f26962a.length; i8 += 3) {
            int O7 = O(i8);
            int i9 = 1048575 & O7;
            int[] iArr = this.f26962a;
            int N7 = N(O7);
            int i10 = iArr[i8];
            long j8 = i9;
            switch (N7) {
                case 0:
                    if (x(obj2, i8)) {
                        Vv0.z(obj, j8, Vv0.j(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj2, i8)) {
                        Vv0.A(obj, j8, Vv0.k(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(obj2, i8)) {
                        Vv0.C(obj, j8, Vv0.n(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(obj2, i8)) {
                        Vv0.C(obj, j8, Vv0.n(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(obj2, i8)) {
                        Vv0.C(obj, j8, Vv0.n(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(obj2, i8)) {
                        Vv0.x(obj, j8, Vv0.H(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(obj2, i8)) {
                        Vv0.D(obj, j8, Vv0.p(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    o(obj, obj2, i8);
                    break;
                case 10:
                    if (x(obj2, i8)) {
                        Vv0.D(obj, j8, Vv0.p(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(obj2, i8)) {
                        Vv0.C(obj, j8, Vv0.n(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(obj2, i8)) {
                        Vv0.B(obj, j8, Vv0.l(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(obj2, i8)) {
                        Vv0.C(obj, j8, Vv0.n(obj2, j8));
                        r(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    o(obj, obj2, i8);
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
                    Zu0 zu0 = (Zu0) Vv0.p(obj, j8);
                    Zu0 zu02 = (Zu0) Vv0.p(obj2, j8);
                    int size = zu0.size();
                    int size2 = zu02.size();
                    if (size > 0 && size2 > 0) {
                        if (!zu0.a()) {
                            zu0 = zu0.g(size2 + size);
                        }
                        zu0.addAll(zu02);
                    }
                    if (size > 0) {
                        zu02 = zu0;
                    }
                    Vv0.D(obj, j8, zu02);
                    break;
                case 50:
                    int i11 = Kv0.f16688b;
                    Vv0.D(obj, j8, C3326lv0.b(Vv0.p(obj, j8), Vv0.p(obj2, j8)));
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
                    if (B(obj2, i10, i8)) {
                        Vv0.D(obj, j8, Vv0.p(obj2, j8));
                        s(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    p(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (B(obj2, i10, i8)) {
                        Vv0.D(obj, j8, Vv0.p(obj2, j8));
                        s(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    p(obj, obj2, i8);
                    break;
            }
        }
        Kv0.A(this.f26972k, obj, obj2);
        if (this.f26967f) {
            Kv0.z(this.f26973l, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final boolean f(Object obj, Object obj2) {
        boolean j8;
        for (int i8 = 0; i8 < this.f26962a.length; i8 += 3) {
            int O7 = O(i8);
            long j9 = O7 & 1048575;
            switch (N(O7)) {
                case 0:
                    if (!v(obj, obj2, i8) || Double.doubleToLongBits(Vv0.j(obj, j9)) != Double.doubleToLongBits(Vv0.j(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!v(obj, obj2, i8) || Float.floatToIntBits(Vv0.k(obj, j9)) != Float.floatToIntBits(Vv0.k(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!v(obj, obj2, i8) || Vv0.n(obj, j9) != Vv0.n(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!v(obj, obj2, i8) || Vv0.n(obj, j9) != Vv0.n(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!v(obj, obj2, i8) || Vv0.n(obj, j9) != Vv0.n(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!v(obj, obj2, i8) || Vv0.H(obj, j9) != Vv0.H(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!v(obj, obj2, i8) || !Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!v(obj, obj2, i8) || !Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!v(obj, obj2, i8) || !Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!v(obj, obj2, i8) || Vv0.n(obj, j9) != Vv0.n(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!v(obj, obj2, i8) || Vv0.l(obj, j9) != Vv0.l(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!v(obj, obj2, i8) || Vv0.n(obj, j9) != Vv0.n(obj2, j9)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!v(obj, obj2, i8) || !Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9))) {
                        return false;
                    }
                    continue;
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
                    j8 = Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9));
                    break;
                case 50:
                    j8 = Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long L7 = L(i8) & 1048575;
                    if (Vv0.l(obj, L7) != Vv0.l(obj2, L7) || !Kv0.j(Vv0.p(obj, j9), Vv0.p(obj2, j9))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!j8) {
                return false;
            }
        }
        if (!((Qu0) obj).zzt.equals(((Qu0) obj2).zzt)) {
            return false;
        }
        if (!this.f26967f) {
            return true;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void g(Object obj, InterfaceC2242bw0 interfaceC2242bw0) {
        int i8;
        int i9;
        int i10;
        if (this.f26967f) {
            androidx.appcompat.app.E.a(obj);
            throw null;
        }
        int[] iArr = this.f26962a;
        Unsafe unsafe = f26961n;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr.length) {
            int O7 = O(i14);
            int[] iArr2 = this.f26962a;
            int N7 = N(O7);
            int i15 = iArr2[i14];
            if (N7 <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i8 = i12;
                i9 = i13;
                i10 = 1 << (i16 >>> 20);
            } else {
                i8 = i12;
                i9 = i13;
                i10 = 0;
            }
            long j8 = O7 & i11;
            switch (N7) {
                case 0:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.t(i15, Vv0.j(obj, j8));
                        break;
                    }
                case 1:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.w(i15, Vv0.k(obj, j8));
                        break;
                    }
                case 2:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.m(i15, unsafe.getLong(obj, j8));
                        break;
                    }
                case 3:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.E(i15, unsafe.getLong(obj, j8));
                        break;
                    }
                case 4:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.d(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 5:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.C(i15, unsafe.getLong(obj, j8));
                        break;
                    }
                case 6:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.k(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 7:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.l(i15, Vv0.H(obj, j8));
                        break;
                    }
                case 8:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        D(i15, unsafe.getObject(obj, j8), interfaceC2242bw0);
                        break;
                    }
                case 9:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.H(i15, unsafe.getObject(obj, j8), R(i14));
                        break;
                    }
                case 10:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.I(i15, (AbstractC3542nu0) unsafe.getObject(obj, j8));
                        break;
                    }
                case 11:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.i(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 12:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.r(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 13:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.y(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 14:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.q(i15, unsafe.getLong(obj, j8));
                        break;
                    }
                case 15:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.B(i15, unsafe.getInt(obj, j8));
                        break;
                    }
                case 16:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.u(i15, unsafe.getLong(obj, j8));
                        break;
                    }
                case 17:
                    if (!y(obj, i14, i8, i9, i10)) {
                        break;
                    } else {
                        interfaceC2242bw0.J(i15, unsafe.getObject(obj, j8), R(i14));
                        break;
                    }
                case 18:
                    Kv0.D(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 19:
                    Kv0.H(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 20:
                    Kv0.a(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case C1445Je.zzm /* 21 */:
                    Kv0.i(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 22:
                    Kv0.J(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 23:
                    Kv0.G(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 24:
                    Kv0.F(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 25:
                    Kv0.B(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 26:
                    Kv0.g(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0);
                    break;
                case 27:
                    Kv0.b(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, R(i14));
                    break;
                case 28:
                    Kv0.C(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0);
                    break;
                case 29:
                    Kv0.h(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 30:
                    Kv0.E(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 31:
                    Kv0.c(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 32:
                    Kv0.d(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 33:
                    Kv0.e(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 34:
                    Kv0.f(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, false);
                    break;
                case 35:
                    Kv0.D(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 36:
                    Kv0.H(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 37:
                    Kv0.a(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 38:
                    Kv0.i(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 39:
                    Kv0.J(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 40:
                    Kv0.G(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 41:
                    Kv0.F(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 42:
                    Kv0.B(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 43:
                    Kv0.h(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 44:
                    Kv0.E(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 45:
                    Kv0.c(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 46:
                    Kv0.d(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 47:
                    Kv0.e(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 48:
                    Kv0.f(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, true);
                    break;
                case 49:
                    Kv0.I(this.f26962a[i14], (List) unsafe.getObject(obj, j8), interfaceC2242bw0, R(i14));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        androidx.appcompat.app.E.a(T(i14));
                        throw null;
                    }
                    break;
                case 51:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.t(i15, H(obj, j8));
                        break;
                    }
                case 52:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.w(i15, I(obj, j8));
                        break;
                    }
                case 53:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.m(i15, P(obj, j8));
                        break;
                    }
                case 54:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.E(i15, P(obj, j8));
                        break;
                    }
                case 55:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.d(i15, J(obj, j8));
                        break;
                    }
                case 56:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.C(i15, P(obj, j8));
                        break;
                    }
                case 57:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.k(i15, J(obj, j8));
                        break;
                    }
                case 58:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.l(i15, C(obj, j8));
                        break;
                    }
                case 59:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        D(i15, unsafe.getObject(obj, j8), interfaceC2242bw0);
                        break;
                    }
                case 60:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.H(i15, unsafe.getObject(obj, j8), R(i14));
                        break;
                    }
                case 61:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.I(i15, (AbstractC3542nu0) unsafe.getObject(obj, j8));
                        break;
                    }
                case 62:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.i(i15, J(obj, j8));
                        break;
                    }
                case 63:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.r(i15, J(obj, j8));
                        break;
                    }
                case 64:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.y(i15, J(obj, j8));
                        break;
                    }
                case 65:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.q(i15, P(obj, j8));
                        break;
                    }
                case 66:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.B(i15, J(obj, j8));
                        break;
                    }
                case 67:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.u(i15, P(obj, j8));
                        break;
                    }
                case 68:
                    if (!B(obj, i15, i14)) {
                        break;
                    } else {
                        interfaceC2242bw0.J(i15, unsafe.getObject(obj, j8), R(i14));
                        break;
                    }
            }
            i14 += 3;
            i12 = i8;
            i13 = i9;
            i11 = 1048575;
        }
        ((Qu0) obj).zzt.k(interfaceC2242bw0);
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void h(Object obj, byte[] bArr, int i8, int i9, C2129au0 c2129au0) {
        E(obj, bArr, i8, i9, 0, c2129au0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    @Override // com.google.android.gms.internal.ads.Iv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4197tv0.i(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.Iv0
    public final void j(Object obj, Cv0 cv0, Eu0 eu0) {
        eu0.getClass();
        n(obj);
        Ov0 ov0 = this.f26972k;
        Object obj2 = null;
        while (true) {
            try {
                int a8 = cv0.a();
                int K7 = K(a8);
                if (K7 >= 0) {
                    int O7 = O(K7);
                    try {
                    } catch (zzgyf unused) {
                        if (obj2 == null) {
                            obj2 = ov0.a(obj);
                        }
                        if (!ov0.k(obj2, cv0, 0)) {
                            for (int i8 = this.f26970i; i8 < this.f26971j; i8++) {
                                S(obj, this.f26969h[i8], obj2, ov0, obj);
                            }
                        }
                    }
                    switch (N(O7)) {
                        case 0:
                            Vv0.z(obj, O7 & 1048575, cv0.zza());
                            r(obj, K7);
                        case 1:
                            Vv0.A(obj, O7 & 1048575, cv0.zzb());
                            r(obj, K7);
                        case 2:
                            Vv0.C(obj, O7 & 1048575, cv0.j());
                            r(obj, K7);
                        case 3:
                            Vv0.C(obj, O7 & 1048575, cv0.o());
                            r(obj, K7);
                        case 4:
                            Vv0.B(obj, O7 & 1048575, cv0.g());
                            r(obj, K7);
                        case 5:
                            Vv0.C(obj, O7 & 1048575, cv0.i());
                            r(obj, K7);
                        case 6:
                            Vv0.B(obj, O7 & 1048575, cv0.c());
                            r(obj, K7);
                        case 7:
                            Vv0.x(obj, O7 & 1048575, cv0.L());
                            r(obj, K7);
                        case 8:
                            q(obj, O7, cv0);
                            r(obj, K7);
                        case 9:
                            InterfaceC3871qv0 interfaceC3871qv0 = (InterfaceC3871qv0) k(obj, K7);
                            cv0.t(interfaceC3871qv0, R(K7), eu0);
                            t(obj, K7, interfaceC3871qv0);
                        case 10:
                            Vv0.D(obj, O7 & 1048575, cv0.p());
                            r(obj, K7);
                        case 11:
                            Vv0.B(obj, O7 & 1048575, cv0.h());
                            r(obj, K7);
                        case 12:
                            int b8 = cv0.b();
                            Uu0 Q7 = Q(K7);
                            if (Q7 == null || Q7.m(b8)) {
                                Vv0.B(obj, O7 & 1048575, b8);
                                r(obj, K7);
                            } else {
                                obj2 = Kv0.y(obj, a8, b8, obj2, ov0);
                            }
                            break;
                        case 13:
                            Vv0.B(obj, O7 & 1048575, cv0.e());
                            r(obj, K7);
                        case 14:
                            Vv0.C(obj, O7 & 1048575, cv0.k());
                            r(obj, K7);
                        case 15:
                            Vv0.B(obj, O7 & 1048575, cv0.f());
                            r(obj, K7);
                        case 16:
                            Vv0.C(obj, O7 & 1048575, cv0.l());
                            r(obj, K7);
                        case 17:
                            InterfaceC3871qv0 interfaceC3871qv02 = (InterfaceC3871qv0) k(obj, K7);
                            cv0.x(interfaceC3871qv02, R(K7), eu0);
                            t(obj, K7, interfaceC3871qv02);
                        case 18:
                            cv0.u(C2565ev0.a(obj, O7 & 1048575));
                        case 19:
                            cv0.I(C2565ev0.a(obj, O7 & 1048575));
                        case 20:
                            cv0.n(C2565ev0.a(obj, O7 & 1048575));
                        case C1445Je.zzm /* 21 */:
                            cv0.q(C2565ev0.a(obj, O7 & 1048575));
                        case 22:
                            cv0.w(C2565ev0.a(obj, O7 & 1048575));
                        case 23:
                            cv0.C(C2565ev0.a(obj, O7 & 1048575));
                        case 24:
                            cv0.A(C2565ev0.a(obj, O7 & 1048575));
                        case 25:
                            cv0.G(C2565ev0.a(obj, O7 & 1048575));
                        case 26:
                            if (w(O7)) {
                                ((C4195tu0) cv0).J(C2565ev0.a(obj, O7 & 1048575), true);
                            } else {
                                ((C4195tu0) cv0).J(C2565ev0.a(obj, O7 & 1048575), false);
                            }
                        case 27:
                            cv0.H(C2565ev0.a(obj, O7 & 1048575), R(K7), eu0);
                        case 28:
                            cv0.v(C2565ev0.a(obj, O7 & 1048575));
                        case 29:
                            cv0.F(C2565ev0.a(obj, O7 & 1048575));
                        case 30:
                            List a9 = C2565ev0.a(obj, O7 & 1048575);
                            cv0.m(a9);
                            obj2 = Kv0.x(obj, a8, a9, Q(K7), obj2, ov0);
                        case 31:
                            cv0.z(C2565ev0.a(obj, O7 & 1048575));
                        case 32:
                            cv0.y(C2565ev0.a(obj, O7 & 1048575));
                        case 33:
                            cv0.E(C2565ev0.a(obj, O7 & 1048575));
                        case 34:
                            cv0.B(C2565ev0.a(obj, O7 & 1048575));
                        case 35:
                            cv0.u(C2565ev0.a(obj, O7 & 1048575));
                        case 36:
                            cv0.I(C2565ev0.a(obj, O7 & 1048575));
                        case 37:
                            cv0.n(C2565ev0.a(obj, O7 & 1048575));
                        case 38:
                            cv0.q(C2565ev0.a(obj, O7 & 1048575));
                        case 39:
                            cv0.w(C2565ev0.a(obj, O7 & 1048575));
                        case 40:
                            cv0.C(C2565ev0.a(obj, O7 & 1048575));
                        case 41:
                            cv0.A(C2565ev0.a(obj, O7 & 1048575));
                        case 42:
                            cv0.G(C2565ev0.a(obj, O7 & 1048575));
                        case 43:
                            cv0.F(C2565ev0.a(obj, O7 & 1048575));
                        case 44:
                            List a10 = C2565ev0.a(obj, O7 & 1048575);
                            cv0.m(a10);
                            obj2 = Kv0.x(obj, a8, a10, Q(K7), obj2, ov0);
                        case 45:
                            cv0.z(C2565ev0.a(obj, O7 & 1048575));
                        case 46:
                            cv0.y(C2565ev0.a(obj, O7 & 1048575));
                        case 47:
                            cv0.E(C2565ev0.a(obj, O7 & 1048575));
                        case 48:
                            cv0.B(C2565ev0.a(obj, O7 & 1048575));
                        case 49:
                            cv0.D(C2565ev0.a(obj, O7 & 1048575), R(K7), eu0);
                        case 50:
                            Object T7 = T(K7);
                            long O8 = O(K7) & 1048575;
                            Object p8 = Vv0.p(obj, O8);
                            if (p8 == null) {
                                p8 = C3217kv0.b().f();
                                Vv0.D(obj, O8, p8);
                            } else if (C3326lv0.a(p8)) {
                                Object f8 = C3217kv0.b().f();
                                C3326lv0.b(f8, p8);
                                Vv0.D(obj, O8, f8);
                                p8 = f8;
                            }
                            androidx.appcompat.app.E.a(T7);
                            throw null;
                            break;
                        case 51:
                            Vv0.D(obj, O7 & 1048575, Double.valueOf(cv0.zza()));
                            s(obj, a8, K7);
                        case 52:
                            Vv0.D(obj, O7 & 1048575, Float.valueOf(cv0.zzb()));
                            s(obj, a8, K7);
                        case 53:
                            Vv0.D(obj, O7 & 1048575, Long.valueOf(cv0.j()));
                            s(obj, a8, K7);
                        case 54:
                            Vv0.D(obj, O7 & 1048575, Long.valueOf(cv0.o()));
                            s(obj, a8, K7);
                        case 55:
                            Vv0.D(obj, O7 & 1048575, Integer.valueOf(cv0.g()));
                            s(obj, a8, K7);
                        case 56:
                            Vv0.D(obj, O7 & 1048575, Long.valueOf(cv0.i()));
                            s(obj, a8, K7);
                        case 57:
                            Vv0.D(obj, O7 & 1048575, Integer.valueOf(cv0.c()));
                            s(obj, a8, K7);
                        case 58:
                            Vv0.D(obj, O7 & 1048575, Boolean.valueOf(cv0.L()));
                            s(obj, a8, K7);
                        case 59:
                            q(obj, O7, cv0);
                            s(obj, a8, K7);
                        case 60:
                            InterfaceC3871qv0 interfaceC3871qv03 = (InterfaceC3871qv0) l(obj, a8, K7);
                            cv0.t(interfaceC3871qv03, R(K7), eu0);
                            u(obj, a8, K7, interfaceC3871qv03);
                        case 61:
                            Vv0.D(obj, O7 & 1048575, cv0.p());
                            s(obj, a8, K7);
                        case 62:
                            Vv0.D(obj, O7 & 1048575, Integer.valueOf(cv0.h()));
                            s(obj, a8, K7);
                        case 63:
                            int b9 = cv0.b();
                            Uu0 Q8 = Q(K7);
                            if (Q8 == null || Q8.m(b9)) {
                                Vv0.D(obj, O7 & 1048575, Integer.valueOf(b9));
                                s(obj, a8, K7);
                            } else {
                                obj2 = Kv0.y(obj, a8, b9, obj2, ov0);
                            }
                            break;
                        case 64:
                            Vv0.D(obj, O7 & 1048575, Integer.valueOf(cv0.e()));
                            s(obj, a8, K7);
                        case 65:
                            Vv0.D(obj, O7 & 1048575, Long.valueOf(cv0.k()));
                            s(obj, a8, K7);
                        case 66:
                            Vv0.D(obj, O7 & 1048575, Integer.valueOf(cv0.f()));
                            s(obj, a8, K7);
                        case 67:
                            Vv0.D(obj, O7 & 1048575, Long.valueOf(cv0.l()));
                            s(obj, a8, K7);
                        case 68:
                            InterfaceC3871qv0 interfaceC3871qv04 = (InterfaceC3871qv0) l(obj, a8, K7);
                            cv0.x(interfaceC3871qv04, R(K7), eu0);
                            u(obj, a8, K7, interfaceC3871qv04);
                        default:
                            if (obj2 == null) {
                                obj2 = ov0.a(obj);
                            }
                            if (!ov0.k(obj2, cv0, 0)) {
                                for (int i9 = this.f26970i; i9 < this.f26971j; i9++) {
                                    S(obj, this.f26969h[i9], obj2, ov0, obj);
                                }
                                break;
                            }
                    }
                } else if (a8 == Integer.MAX_VALUE) {
                    for (int i10 = this.f26970i; i10 < this.f26971j; i10++) {
                        S(obj, this.f26969h[i10], obj2, ov0, obj);
                    }
                } else {
                    if (this.f26967f) {
                        eu0.c(this.f26966e, a8);
                    }
                    if (obj2 == null) {
                        obj2 = ov0.a(obj);
                    }
                    if (!ov0.k(obj2, cv0, 0)) {
                        for (int i11 = this.f26970i; i11 < this.f26971j; i11++) {
                            S(obj, this.f26969h[i11], obj2, ov0, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i12 = this.f26970i; i12 < this.f26971j; i12++) {
                    S(obj, this.f26969h[i12], obj2, ov0, obj);
                }
                if (obj2 != null) {
                    ov0.j(obj, obj2);
                }
                throw th;
            }
        }
        if (obj2 != null) {
            ov0.j(obj, obj2);
        }
    }
}
