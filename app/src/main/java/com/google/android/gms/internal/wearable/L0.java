package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.ads.C1445Je;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class L0 implements U0 {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f30062l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    private static final Unsafe f30063m = f1.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f30064a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f30065b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30066c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30067d;

    /* renamed from: e, reason: collision with root package name */
    private final I0 f30068e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30069f = false;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f30070g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30071h;

    /* renamed from: i, reason: collision with root package name */
    private final int f30072i;

    /* renamed from: j, reason: collision with root package name */
    private final Y0 f30073j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC5241e0 f30074k;

    private L0(int[] iArr, Object[] objArr, int i8, int i9, I0 i02, boolean z7, int[] iArr2, int i10, int i11, N0 n02, C5277w0 c5277w0, Y0 y02, AbstractC5241e0 abstractC5241e0, D0 d02) {
        this.f30064a = iArr;
        this.f30065b = objArr;
        this.f30066c = i8;
        this.f30067d = i9;
        this.f30070g = iArr2;
        this.f30071h = i10;
        this.f30072i = i11;
        this.f30073j = y02;
        this.f30074k = abstractC5241e0;
        this.f30068e = i02;
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
    static com.google.android.gms.internal.wearable.L0 A(java.lang.Class r34, com.google.android.gms.internal.wearable.F0 r35, com.google.android.gms.internal.wearable.N0 r36, com.google.android.gms.internal.wearable.C5277w0 r37, com.google.android.gms.internal.wearable.Y0 r38, com.google.android.gms.internal.wearable.AbstractC5241e0 r39, com.google.android.gms.internal.wearable.D0 r40) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.L0.A(java.lang.Class, com.google.android.gms.internal.wearable.F0, com.google.android.gms.internal.wearable.N0, com.google.android.gms.internal.wearable.w0, com.google.android.gms.internal.wearable.Y0, com.google.android.gms.internal.wearable.e0, com.google.android.gms.internal.wearable.D0):com.google.android.gms.internal.wearable.L0");
    }

    private static double B(Object obj, long j8) {
        return ((Double) f1.k(obj, j8)).doubleValue();
    }

    private static float C(Object obj, long j8) {
        return ((Float) f1.k(obj, j8)).floatValue();
    }

    private static int D(Object obj, long j8) {
        return ((Integer) f1.k(obj, j8)).intValue();
    }

    private final int E(int i8) {
        return this.f30064a[i8 + 2];
    }

    private final int F(int i8, int i9) {
        int length = (this.f30064a.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.f30064a[i11];
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

    private static int G(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int H(int i8) {
        return this.f30064a[i8 + 1];
    }

    private static long I(Object obj, long j8) {
        return ((Long) f1.k(obj, j8)).longValue();
    }

    private final InterfaceC5262o0 J(int i8) {
        int i9 = i8 / 3;
        return (InterfaceC5262o0) this.f30065b[i9 + i9 + 1];
    }

    private final U0 K(int i8) {
        Object[] objArr = this.f30065b;
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        U0 u02 = (U0) objArr[i10];
        if (u02 != null) {
            return u02;
        }
        U0 b8 = R0.a().b((Class) objArr[i10 + 1]);
        this.f30065b[i10] = b8;
        return b8;
    }

    private final Object L(int i8) {
        int i9 = i8 / 3;
        return this.f30065b[i9 + i9];
    }

    private final Object M(Object obj, int i8) {
        U0 K7 = K(i8);
        int H7 = H(i8) & 1048575;
        if (!r(obj, i8)) {
            return K7.b();
        }
        Object object = f30063m.getObject(obj, H7);
        if (u(object)) {
            return object;
        }
        Object b8 = K7.b();
        if (object != null) {
            K7.e(b8, object);
        }
        return b8;
    }

    private final Object N(Object obj, int i8, int i9) {
        U0 K7 = K(i9);
        if (!v(obj, i8, i9)) {
            return K7.b();
        }
        Object object = f30063m.getObject(obj, H(i9) & 1048575);
        if (u(object)) {
            return object;
        }
        Object b8 = K7.b();
        if (object != null) {
            K7.e(b8, object);
        }
        return b8;
    }

    private static Field O(Class cls, String str) {
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

    private static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i8) {
        if (r(obj2, i8)) {
            int H7 = H(i8) & 1048575;
            Unsafe unsafe = f30063m;
            long j8 = H7;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30064a[i8] + " is present but null: " + obj2.toString());
            }
            U0 K7 = K(i8);
            if (!r(obj, i8)) {
                if (u(object)) {
                    Object b8 = K7.b();
                    K7.e(b8, object);
                    unsafe.putObject(obj, j8, b8);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                m(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object b9 = K7.b();
                K7.e(b9, object2);
                unsafe.putObject(obj, j8, b9);
                object2 = b9;
            }
            K7.e(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i8) {
        int i9 = this.f30064a[i8];
        if (v(obj2, i9, i8)) {
            int H7 = H(i8) & 1048575;
            Unsafe unsafe = f30063m;
            long j8 = H7;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f30064a[i8] + " is present but null: " + obj2.toString());
            }
            U0 K7 = K(i8);
            if (!v(obj, i9, i8)) {
                if (u(object)) {
                    Object b8 = K7.b();
                    K7.e(b8, object);
                    unsafe.putObject(obj, j8, b8);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                n(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!u(object2)) {
                Object b9 = K7.b();
                K7.e(b9, object2);
                unsafe.putObject(obj, j8, b9);
                object2 = b9;
            }
            K7.e(object2, object);
        }
    }

    private final void m(Object obj, int i8) {
        int E7 = E(i8);
        long j8 = 1048575 & E7;
        if (j8 == 1048575) {
            return;
        }
        f1.v(obj, j8, (1 << (E7 >>> 20)) | f1.h(obj, j8));
    }

    private final void n(Object obj, int i8, int i9) {
        f1.v(obj, E(i9) & 1048575, i8);
    }

    private final void o(Object obj, int i8, Object obj2) {
        f30063m.putObject(obj, H(i8) & 1048575, obj2);
        m(obj, i8);
    }

    private final void p(Object obj, int i8, int i9, Object obj2) {
        f30063m.putObject(obj, H(i9) & 1048575, obj2);
        n(obj, i8, i9);
    }

    private final boolean q(Object obj, Object obj2, int i8) {
        return r(obj, i8) == r(obj2, i8);
    }

    private final boolean r(Object obj, int i8) {
        int E7 = E(i8);
        long j8 = E7 & 1048575;
        if (j8 != 1048575) {
            return (f1.h(obj, j8) & (1 << (E7 >>> 20))) != 0;
        }
        int H7 = H(i8);
        long j9 = H7 & 1048575;
        switch (G(H7)) {
            case 0:
                return Double.doubleToRawLongBits(f1.f(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(f1.g(obj, j9)) != 0;
            case 2:
                return f1.i(obj, j9) != 0;
            case 3:
                return f1.i(obj, j9) != 0;
            case 4:
                return f1.h(obj, j9) != 0;
            case 5:
                return f1.i(obj, j9) != 0;
            case 6:
                return f1.h(obj, j9) != 0;
            case 7:
                return f1.B(obj, j9);
            case 8:
                Object k8 = f1.k(obj, j9);
                if (k8 instanceof String) {
                    return !((String) k8).isEmpty();
                }
                if (k8 instanceof Q) {
                    return !Q.f30081s.equals(k8);
                }
                throw new IllegalArgumentException();
            case 9:
                return f1.k(obj, j9) != null;
            case 10:
                return !Q.f30081s.equals(f1.k(obj, j9));
            case 11:
                return f1.h(obj, j9) != 0;
            case 12:
                return f1.h(obj, j9) != 0;
            case 13:
                return f1.h(obj, j9) != 0;
            case 14:
                return f1.i(obj, j9) != 0;
            case 15:
                return f1.h(obj, j9) != 0;
            case 16:
                return f1.i(obj, j9) != 0;
            case 17:
                return f1.k(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? r(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean t(Object obj, int i8, U0 u02) {
        return u02.f(f1.k(obj, i8 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC5258m0) {
            return ((AbstractC5258m0) obj).y();
        }
        return true;
    }

    private final boolean v(Object obj, int i8, int i9) {
        return f1.h(obj, (long) (E(i9) & 1048575)) == i8;
    }

    private static boolean w(Object obj, long j8) {
        return ((Boolean) f1.k(obj, j8)).booleanValue();
    }

    private static final void x(int i8, Object obj, k1 k1Var) {
        if (obj instanceof String) {
            k1Var.h(i8, (String) obj);
        } else {
            k1Var.I(i8, (Q) obj);
        }
    }

    static Z0 z(Object obj) {
        AbstractC5258m0 abstractC5258m0 = (AbstractC5258m0) obj;
        Z0 z02 = abstractC5258m0.zzc;
        if (z02 != Z0.c()) {
            return z02;
        }
        Z0 f8 = Z0.f();
        abstractC5258m0.zzc = f8;
        return f8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219  */
    @Override // com.google.android.gms.internal.wearable.U0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.L0.a(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final Object b() {
        return ((AbstractC5258m0) this.f30068e).i();
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final int c(Object obj) {
        int i8;
        long doubleToLongBits;
        int floatToIntBits;
        int i9;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30064a.length; i11 += 3) {
            int H7 = H(i11);
            int[] iArr = this.f30064a;
            int i12 = 1048575 & H7;
            int G7 = G(H7);
            int i13 = iArr[i11];
            long j8 = i12;
            int i14 = 37;
            switch (G7) {
                case 0:
                    i8 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(f1.f(obj, j8));
                    byte[] bArr = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 1:
                    i8 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(f1.g(obj, j8));
                    i10 = i8 + floatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    doubleToLongBits = f1.i(obj, j8);
                    byte[] bArr2 = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 3:
                    i8 = i10 * 53;
                    doubleToLongBits = f1.i(obj, j8);
                    byte[] bArr3 = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 4:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    doubleToLongBits = f1.i(obj, j8);
                    byte[] bArr4 = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 6:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 7:
                    i8 = i10 * 53;
                    floatToIntBits = AbstractC5269s0.a(f1.B(obj, j8));
                    i10 = i8 + floatToIntBits;
                    break;
                case 8:
                    i8 = i10 * 53;
                    floatToIntBits = ((String) f1.k(obj, j8)).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 9:
                    i9 = i10 * 53;
                    Object k8 = f1.k(obj, j8);
                    if (k8 != null) {
                        i14 = k8.hashCode();
                    }
                    i10 = i9 + i14;
                    break;
                case 10:
                    i8 = i10 * 53;
                    floatToIntBits = f1.k(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 11:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 12:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 13:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 14:
                    i8 = i10 * 53;
                    doubleToLongBits = f1.i(obj, j8);
                    byte[] bArr5 = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 15:
                    i8 = i10 * 53;
                    floatToIntBits = f1.h(obj, j8);
                    i10 = i8 + floatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    doubleToLongBits = f1.i(obj, j8);
                    byte[] bArr6 = AbstractC5269s0.f30213b;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i10 = i8 + floatToIntBits;
                    break;
                case 17:
                    i9 = i10 * 53;
                    Object k9 = f1.k(obj, j8);
                    if (k9 != null) {
                        i14 = k9.hashCode();
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
                    floatToIntBits = f1.k(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 50:
                    i8 = i10 * 53;
                    floatToIntBits = f1.k(obj, j8).hashCode();
                    i10 = i8 + floatToIntBits;
                    break;
                case 51:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(B(obj, j8));
                        byte[] bArr7 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(C(obj, j8));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = I(obj, j8);
                        byte[] bArr8 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = I(obj, j8);
                        byte[] bArr9 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = I(obj, j8);
                        byte[] bArr10 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = AbstractC5269s0.a(w(obj, j8));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = ((String) f1.k(obj, j8)).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = f1.k(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = f1.k(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = I(obj, j8);
                        byte[] bArr11 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = D(obj, j8);
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = I(obj, j8);
                        byte[] bArr12 = AbstractC5269s0.f30213b;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (v(obj, i13, i11)) {
                        i8 = i10 * 53;
                        floatToIntBits = f1.k(obj, j8).hashCode();
                        i10 = i8 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i10 * 53) + ((AbstractC5258m0) obj).zzc.hashCode();
        if (!this.f30069f) {
            return hashCode;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.android.gms.internal.wearable.U0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = u(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.wearable.AbstractC5258m0
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.wearable.m0 r0 = (com.google.android.gms.internal.wearable.AbstractC5258m0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.w(r2)
            r0.zza = r1
            r0.s()
        L1b:
            int[] r0 = r7.f30064a
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.H(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = G(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
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
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.wearable.L0.f30063m
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.wearable.C0 r6 = (com.google.android.gms.internal.wearable.C0) r6
            r6.h()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.wearable.f1.k(r8, r3)
            com.google.android.gms.internal.wearable.r0 r2 = (com.google.android.gms.internal.wearable.InterfaceC5267r0) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.f30064a
            r2 = r2[r1]
            boolean r2 = r7.v(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.wearable.U0 r2 = r7.K(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.wearable.L0.f30063m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L84
        L71:
            boolean r2 = r7.r(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.wearable.U0 r2 = r7.K(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.wearable.L0.f30063m
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.wearable.Y0 r0 = r7.f30073j
            r0.a(r8)
            boolean r0 = r7.f30069f
            if (r0 == 0) goto L95
            com.google.android.gms.internal.wearable.e0 r0 = r7.f30074k
            r0.a(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.L0.d(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void e(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.f30064a.length; i8 += 3) {
            int H7 = H(i8);
            int i9 = 1048575 & H7;
            int[] iArr = this.f30064a;
            int G7 = G(H7);
            int i10 = iArr[i8];
            long j8 = i9;
            switch (G7) {
                case 0:
                    if (r(obj2, i8)) {
                        f1.t(obj, j8, f1.f(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(obj2, i8)) {
                        f1.u(obj, j8, f1.g(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(obj2, i8)) {
                        f1.w(obj, j8, f1.i(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(obj2, i8)) {
                        f1.w(obj, j8, f1.i(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(obj2, i8)) {
                        f1.w(obj, j8, f1.i(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(obj2, i8)) {
                        f1.r(obj, j8, f1.B(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(obj2, i8)) {
                        f1.x(obj, j8, f1.k(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    k(obj, obj2, i8);
                    break;
                case 10:
                    if (r(obj2, i8)) {
                        f1.x(obj, j8, f1.k(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(obj2, i8)) {
                        f1.w(obj, j8, f1.i(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(obj2, i8)) {
                        f1.v(obj, j8, f1.h(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(obj2, i8)) {
                        f1.w(obj, j8, f1.i(obj2, j8));
                        m(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    k(obj, obj2, i8);
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
                    InterfaceC5267r0 interfaceC5267r0 = (InterfaceC5267r0) f1.k(obj, j8);
                    InterfaceC5267r0 interfaceC5267r02 = (InterfaceC5267r0) f1.k(obj2, j8);
                    int size = interfaceC5267r0.size();
                    int size2 = interfaceC5267r02.size();
                    if (size > 0 && size2 > 0) {
                        if (!interfaceC5267r0.a()) {
                            interfaceC5267r0 = interfaceC5267r0.f(size2 + size);
                        }
                        interfaceC5267r0.addAll(interfaceC5267r02);
                    }
                    if (size > 0) {
                        interfaceC5267r02 = interfaceC5267r0;
                    }
                    f1.x(obj, j8, interfaceC5267r02);
                    break;
                case 50:
                    int i11 = W0.f30103b;
                    f1.x(obj, j8, D0.a(f1.k(obj, j8), f1.k(obj2, j8)));
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
                    if (v(obj2, i10, i8)) {
                        f1.x(obj, j8, f1.k(obj2, j8));
                        n(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    l(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(obj2, i10, i8)) {
                        f1.x(obj, j8, f1.k(obj2, j8));
                        n(obj, i10, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    l(obj, obj2, i8);
                    break;
            }
        }
        W0.u(this.f30073j, obj, obj2);
        if (this.f30069f) {
            W0.t(this.f30074k, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    @Override // com.google.android.gms.internal.wearable.U0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.L0.f(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final boolean g(Object obj, Object obj2) {
        boolean e8;
        for (int i8 = 0; i8 < this.f30064a.length; i8 += 3) {
            int H7 = H(i8);
            long j8 = H7 & 1048575;
            switch (G(H7)) {
                case 0:
                    if (!q(obj, obj2, i8) || Double.doubleToLongBits(f1.f(obj, j8)) != Double.doubleToLongBits(f1.f(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!q(obj, obj2, i8) || Float.floatToIntBits(f1.g(obj, j8)) != Float.floatToIntBits(f1.g(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!q(obj, obj2, i8) || f1.i(obj, j8) != f1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!q(obj, obj2, i8) || f1.i(obj, j8) != f1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!q(obj, obj2, i8) || f1.i(obj, j8) != f1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!q(obj, obj2, i8) || f1.B(obj, j8) != f1.B(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!q(obj, obj2, i8) || !W0.e(f1.k(obj, j8), f1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!q(obj, obj2, i8) || !W0.e(f1.k(obj, j8), f1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!q(obj, obj2, i8) || !W0.e(f1.k(obj, j8), f1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!q(obj, obj2, i8) || f1.i(obj, j8) != f1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!q(obj, obj2, i8) || f1.h(obj, j8) != f1.h(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!q(obj, obj2, i8) || f1.i(obj, j8) != f1.i(obj2, j8)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!q(obj, obj2, i8) || !W0.e(f1.k(obj, j8), f1.k(obj2, j8))) {
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
                    e8 = W0.e(f1.k(obj, j8), f1.k(obj2, j8));
                    break;
                case 50:
                    e8 = W0.e(f1.k(obj, j8), f1.k(obj2, j8));
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
                    long E7 = E(i8) & 1048575;
                    if (f1.h(obj, E7) != f1.h(obj2, E7) || !W0.e(f1.k(obj, j8), f1.k(obj2, j8))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!e8) {
                return false;
            }
        }
        if (!((AbstractC5258m0) obj).zzc.equals(((AbstractC5258m0) obj2).zzc)) {
            return false;
        }
        if (!this.f30069f) {
            return true;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // com.google.android.gms.internal.wearable.U0
    public final void h(Object obj, k1 k1Var) {
        int i8;
        int i9;
        int i10;
        boolean z7;
        ?? r9 = 1;
        Throwable th = null;
        if (this.f30069f) {
            androidx.appcompat.app.E.a(obj);
            throw null;
        }
        int[] iArr = this.f30064a;
        Unsafe unsafe = f30063m;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < iArr.length) {
            int H7 = H(i14);
            int[] iArr2 = this.f30064a;
            int G7 = G(H7);
            int i15 = iArr2[i14];
            if (G7 <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i8 = i12;
                i9 = i13;
                i10 = r9 << (i16 >>> 20);
            } else {
                i8 = i12;
                i9 = i13;
                i10 = 0;
            }
            long j8 = H7 & i11;
            switch (G7) {
                case 0:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.t(i15, f1.f(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 1:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.w(i15, f1.g(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 2:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.m(i15, unsafe.getLong(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 3:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.E(i15, unsafe.getLong(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 4:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.d(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 5:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.C(i15, unsafe.getLong(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 6:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.k(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 7:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.l(i15, f1.B(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 8:
                    if (s(obj, i14, i8, i9, i10)) {
                        x(i15, unsafe.getObject(obj, j8), k1Var);
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 9:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.J(i15, unsafe.getObject(obj, j8), K(i14));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 10:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.I(i15, (Q) unsafe.getObject(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 11:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.i(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 12:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.r(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 13:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.y(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 14:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.q(i15, unsafe.getLong(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 15:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.B(i15, unsafe.getInt(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 16:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.u(i15, unsafe.getLong(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 17:
                    if (s(obj, i14, i8, i9, i10)) {
                        k1Var.H(i15, unsafe.getObject(obj, j8), K(i14));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 18:
                    z7 = false;
                    W0.w(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 19:
                    z7 = false;
                    W0.A(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 20:
                    z7 = false;
                    W0.C(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case C1445Je.zzm /* 21 */:
                    z7 = false;
                    W0.d(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 22:
                    z7 = false;
                    W0.B(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 23:
                    z7 = false;
                    W0.z(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 24:
                    z7 = false;
                    W0.y(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 25:
                    z7 = false;
                    W0.v(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 26:
                    int i18 = this.f30064a[i14];
                    List list = (List) unsafe.getObject(obj, j8);
                    int i19 = W0.f30103b;
                    if (list != null && !list.isEmpty()) {
                        k1Var.D(i18, list);
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                    break;
                case 27:
                    int i20 = this.f30064a[i14];
                    List list2 = (List) unsafe.getObject(obj, j8);
                    U0 K7 = K(i14);
                    int i21 = W0.f30103b;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22 += r9) {
                            ((Y) k1Var).J(i20, list2.get(i22), K7);
                        }
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                    break;
                case 28:
                    int i23 = this.f30064a[i14];
                    List list3 = (List) unsafe.getObject(obj, j8);
                    int i24 = W0.f30103b;
                    if (list3 != null && !list3.isEmpty()) {
                        k1Var.g(i23, list3);
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                    break;
                case 29:
                    z7 = false;
                    W0.c(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 30:
                    z7 = false;
                    W0.x(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 31:
                    z7 = false;
                    W0.D(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 32:
                    z7 = false;
                    W0.E(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 33:
                    z7 = false;
                    W0.a(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 34:
                    z7 = false;
                    W0.b(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, false);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 35:
                    W0.w(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 36:
                    W0.A(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 37:
                    W0.C(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 38:
                    W0.d(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 39:
                    W0.B(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 40:
                    W0.z(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 41:
                    W0.y(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 42:
                    W0.v(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 43:
                    W0.c(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 44:
                    W0.x(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 45:
                    W0.D(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 46:
                    W0.E(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 47:
                    W0.a(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 48:
                    W0.b(this.f30064a[i14], (List) unsafe.getObject(obj, j8), k1Var, r9);
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 49:
                    int i25 = this.f30064a[i14];
                    List list4 = (List) unsafe.getObject(obj, j8);
                    U0 K8 = K(i14);
                    int i26 = W0.f30103b;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27 += r9) {
                            ((Y) k1Var).H(i25, list4.get(i27), K8);
                        }
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j8) != null) {
                        androidx.appcompat.app.E.a(L(i14));
                        throw th;
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 51:
                    if (v(obj, i15, i14)) {
                        k1Var.t(i15, B(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 52:
                    if (v(obj, i15, i14)) {
                        k1Var.w(i15, C(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 53:
                    if (v(obj, i15, i14)) {
                        k1Var.m(i15, I(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 54:
                    if (v(obj, i15, i14)) {
                        k1Var.E(i15, I(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 55:
                    if (v(obj, i15, i14)) {
                        k1Var.d(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 56:
                    if (v(obj, i15, i14)) {
                        k1Var.C(i15, I(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 57:
                    if (v(obj, i15, i14)) {
                        k1Var.k(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 58:
                    if (v(obj, i15, i14)) {
                        k1Var.l(i15, w(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 59:
                    if (v(obj, i15, i14)) {
                        x(i15, unsafe.getObject(obj, j8), k1Var);
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 60:
                    if (v(obj, i15, i14)) {
                        k1Var.J(i15, unsafe.getObject(obj, j8), K(i14));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 61:
                    if (v(obj, i15, i14)) {
                        k1Var.I(i15, (Q) unsafe.getObject(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 62:
                    if (v(obj, i15, i14)) {
                        k1Var.i(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 63:
                    if (v(obj, i15, i14)) {
                        k1Var.r(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 64:
                    if (v(obj, i15, i14)) {
                        k1Var.y(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 65:
                    if (v(obj, i15, i14)) {
                        k1Var.q(i15, I(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 66:
                    if (v(obj, i15, i14)) {
                        k1Var.B(i15, D(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 67:
                    if (v(obj, i15, i14)) {
                        k1Var.u(i15, I(obj, j8));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                case 68:
                    if (v(obj, i15, i14)) {
                        k1Var.H(i15, unsafe.getObject(obj, j8), K(i14));
                    }
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
                default:
                    i14 += 3;
                    i12 = i8;
                    i13 = i9;
                    r9 = 1;
                    th = null;
                    i11 = 1048575;
            }
        }
        ((AbstractC5258m0) obj).zzc.k(k1Var);
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void i(Object obj, byte[] bArr, int i8, int i9, F f8) {
        y(obj, bArr, i8, i9, 0, f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0def  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0e12  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0acc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0dba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0dd2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0ae0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int y(java.lang.Object r46, byte[] r47, int r48, int r49, int r50, com.google.android.gms.internal.wearable.F r51) {
        /*
            Method dump skipped, instructions count: 3886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.L0.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.wearable.F):int");
    }
}
