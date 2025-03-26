package q0;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6413d {

    /* renamed from: q0.d$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        int f40902a;

        /* renamed from: b, reason: collision with root package name */
        boolean f40903b;

        a() {
        }
    }

    private static void a(ArrayList arrayList, char c8, float[] fArr) {
        arrayList.add(new b(c8, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            if (bVarArr[i8].f40904a != bVarArr2[i8].f40904a || bVarArr[i8].f40905b.length != bVarArr2[i8].f40905b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i8 < 0 || i8 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = i9 - i8;
        int min = Math.min(i10, length - i8);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, i8, fArr2, 0, min);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 1;
        while (i9 < str.length()) {
            int i10 = i(str, i9);
            String trim = str.substring(i8, i10).trim();
            if (!trim.isEmpty()) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i8 = i10;
            i9 = i10 + 1;
        }
        if (i9 - i8 == 1 && i8 < str.length()) {
            a(arrayList, str.charAt(i8), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.i(d(str), path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing " + str, e8);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            bVarArr2[i8] = new b(bVarArr[i8]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(java.lang.String r8, int r9, q0.AbstractC6413d.a r10) {
        /*
            r0 = 0
            r10.f40903b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f40903b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f40903b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f40902a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.AbstractC6413d.g(java.lang.String, int, q0.d$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i8 = 1;
            int i9 = 0;
            while (i8 < length) {
                g(str, i8, aVar);
                int i10 = aVar.f40902a;
                if (i8 < i10) {
                    fArr[i9] = Float.parseFloat(str.substring(i8, i10));
                    i9++;
                }
                i8 = aVar.f40903b ? i10 : i10 + 1;
            }
            return c(fArr, 0, i9);
        } catch (NumberFormatException e8) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e8);
        }
    }

    private static int i(String str, int i8) {
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i8;
            }
            i8++;
        }
        return i8;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c8 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c8, bVar.f40904a, bVar.f40905b);
            c8 = bVar.f40904a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i8 = 0; i8 < bVarArr2.length; i8++) {
            bVarArr[i8].f40904a = bVarArr2[i8].f40904a;
            for (int i9 = 0; i9 < bVarArr2[i8].f40905b.length; i9++) {
                bVarArr[i8].f40905b[i9] = bVarArr2[i8].f40905b[i9];
            }
        }
    }

    /* renamed from: q0.d$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private char f40904a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f40905b;

        b(char c8, float[] fArr) {
            this.f40904a = c8;
            this.f40905b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c8, char c9, float[] fArr2) {
            int i8;
            int i9;
            int i10;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            char c10 = c9;
            boolean z7 = false;
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i8 = 7;
                    i9 = i8;
                    break;
                case 'C':
                case 'c':
                    i8 = 6;
                    i9 = i8;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i9 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                    i9 = 2;
                    break;
            }
            float f22 = f16;
            float f23 = f17;
            float f24 = f20;
            float f25 = f21;
            int i11 = 0;
            char c11 = c8;
            while (i11 < fArr2.length) {
                if (c10 != 'A') {
                    if (c10 == 'C') {
                        i10 = i11;
                        int i12 = i10 + 2;
                        int i13 = i10 + 3;
                        int i14 = i10 + 4;
                        int i15 = i10 + 5;
                        path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        f22 = fArr2[i14];
                        float f26 = fArr2[i15];
                        float f27 = fArr2[i12];
                        float f28 = fArr2[i13];
                        f23 = f26;
                        f19 = f28;
                        f18 = f27;
                    } else if (c10 == 'H') {
                        i10 = i11;
                        path.lineTo(fArr2[i10], f23);
                        f22 = fArr2[i10];
                    } else if (c10 == 'Q') {
                        i10 = i11;
                        int i16 = i10 + 1;
                        int i17 = i10 + 2;
                        int i18 = i10 + 3;
                        path.quadTo(fArr2[i10], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f29 = fArr2[i10];
                        float f30 = fArr2[i16];
                        f22 = fArr2[i17];
                        f23 = fArr2[i18];
                        f18 = f29;
                        f19 = f30;
                    } else if (c10 == 'V') {
                        i10 = i11;
                        path.lineTo(f22, fArr2[i10]);
                        f23 = fArr2[i10];
                    } else if (c10 != 'a') {
                        if (c10 != 'c') {
                            if (c10 == 'h') {
                                path.rLineTo(fArr2[i11], 0.0f);
                                f22 += fArr2[i11];
                            } else if (c10 != 'q') {
                                if (c10 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i11]);
                                    f11 = fArr2[i11];
                                } else if (c10 == 'L') {
                                    int i19 = i11 + 1;
                                    path.lineTo(fArr2[i11], fArr2[i19]);
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i19];
                                } else if (c10 == 'M') {
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i11 + 1];
                                    if (i11 > 0) {
                                        path.lineTo(f22, f23);
                                    } else {
                                        path.moveTo(f22, f23);
                                        i10 = i11;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 'S') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    float f31 = f23;
                                    float f32 = f22;
                                    int i20 = i11 + 1;
                                    int i21 = i11 + 2;
                                    int i22 = i11 + 3;
                                    path.cubicTo(f32, f31, fArr2[i11], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f8 = fArr2[i11];
                                    f9 = fArr2[i20];
                                    f22 = fArr2[i21];
                                    f23 = fArr2[i22];
                                    f18 = f8;
                                    f19 = f9;
                                } else if (c10 == 'T') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f22 = (f22 * 2.0f) - f18;
                                        f23 = (f23 * 2.0f) - f19;
                                    }
                                    int i23 = i11 + 1;
                                    path.quadTo(f22, f23, fArr2[i11], fArr2[i23]);
                                    i10 = i11;
                                    f19 = f23;
                                    f18 = f22;
                                    f22 = fArr2[i11];
                                    f23 = fArr2[i23];
                                } else if (c10 == 'l') {
                                    int i24 = i11 + 1;
                                    path.rLineTo(fArr2[i11], fArr2[i24]);
                                    f22 += fArr2[i11];
                                    f11 = fArr2[i24];
                                } else if (c10 == 'm') {
                                    float f33 = fArr2[i11];
                                    f22 += f33;
                                    float f34 = fArr2[i11 + 1];
                                    f23 += f34;
                                    if (i11 > 0) {
                                        path.rLineTo(f33, f34);
                                    } else {
                                        path.rMoveTo(f33, f34);
                                        i10 = i11;
                                        f25 = f23;
                                        f24 = f22;
                                    }
                                } else if (c10 == 's') {
                                    if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                        float f35 = f22 - f18;
                                        f12 = f23 - f19;
                                        f13 = f35;
                                    } else {
                                        f13 = 0.0f;
                                        f12 = 0.0f;
                                    }
                                    int i25 = i11 + 1;
                                    int i26 = i11 + 2;
                                    int i27 = i11 + 3;
                                    path.rCubicTo(f13, f12, fArr2[i11], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f8 = fArr2[i11] + f22;
                                    f9 = fArr2[i25] + f23;
                                    f22 += fArr2[i26];
                                    f10 = fArr2[i27];
                                } else if (c10 == 't') {
                                    if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                        f14 = f22 - f18;
                                        f15 = f23 - f19;
                                    } else {
                                        f15 = 0.0f;
                                        f14 = 0.0f;
                                    }
                                    int i28 = i11 + 1;
                                    path.rQuadTo(f14, f15, fArr2[i11], fArr2[i28]);
                                    float f36 = f14 + f22;
                                    float f37 = f15 + f23;
                                    f22 += fArr2[i11];
                                    f23 += fArr2[i28];
                                    f19 = f37;
                                    f18 = f36;
                                }
                                f23 += f11;
                            } else {
                                int i29 = i11 + 1;
                                int i30 = i11 + 2;
                                int i31 = i11 + 3;
                                path.rQuadTo(fArr2[i11], fArr2[i29], fArr2[i30], fArr2[i31]);
                                f8 = fArr2[i11] + f22;
                                f9 = fArr2[i29] + f23;
                                f22 += fArr2[i30];
                                f10 = fArr2[i31];
                            }
                            i10 = i11;
                        } else {
                            int i32 = i11 + 2;
                            int i33 = i11 + 3;
                            int i34 = i11 + 4;
                            int i35 = i11 + 5;
                            path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                            f8 = fArr2[i32] + f22;
                            f9 = fArr2[i33] + f23;
                            f22 += fArr2[i34];
                            f10 = fArr2[i35];
                        }
                        f23 += f10;
                        f18 = f8;
                        f19 = f9;
                        i10 = i11;
                    } else {
                        int i36 = i11 + 5;
                        int i37 = i11 + 6;
                        i10 = i11;
                        g(path, f22, f23, fArr2[i36] + f22, fArr2[i37] + f23, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        f22 += fArr2[i36];
                        f23 += fArr2[i37];
                    }
                    i11 = i10 + i9;
                    c11 = c9;
                    c10 = c11;
                    z7 = false;
                } else {
                    i10 = i11;
                    int i38 = i10 + 5;
                    int i39 = i10 + 6;
                    g(path, f22, f23, fArr2[i38], fArr2[i39], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                    f22 = fArr2[i38];
                    f23 = fArr2[i39];
                }
                f19 = f23;
                f18 = f22;
                i11 = i10 + i9;
                c11 = c9;
                c10 = c11;
                z7 = false;
            }
            fArr[z7 ? 1 : 0] = f22;
            fArr[1] = f23;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f24;
            fArr[5] = f25;
        }

        private static void f(Path path, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
            double d17 = d10;
            int ceil = (int) Math.ceil(Math.abs((d16 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d14);
            double sin = Math.sin(d14);
            double cos2 = Math.cos(d15);
            double sin2 = Math.sin(d15);
            double d18 = -d17;
            double d19 = d18 * cos;
            double d20 = d11 * sin;
            double d21 = (d19 * sin2) - (d20 * cos2);
            double d22 = d18 * sin;
            double d23 = d11 * cos;
            double d24 = (sin2 * d22) + (cos2 * d23);
            double d25 = d16 / ceil;
            double d26 = d24;
            double d27 = d21;
            int i8 = 0;
            double d28 = d12;
            double d29 = d13;
            double d30 = d15;
            while (i8 < ceil) {
                double d31 = d30 + d25;
                double sin3 = Math.sin(d31);
                double cos3 = Math.cos(d31);
                double d32 = (d8 + ((d17 * cos) * cos3)) - (d20 * sin3);
                double d33 = d9 + (d17 * sin * cos3) + (d23 * sin3);
                double d34 = (d19 * sin3) - (d20 * cos3);
                double d35 = (sin3 * d22) + (cos3 * d23);
                double d36 = d31 - d30;
                double tan = Math.tan(d36 / 2.0d);
                double sin4 = (Math.sin(d36) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d37 = d28 + (d27 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d37, (float) (d29 + (d26 * sin4)), (float) (d32 - (sin4 * d34)), (float) (d33 - (sin4 * d35)), (float) d32, (float) d33);
                i8++;
                d25 = d25;
                sin = sin;
                d28 = d32;
                d22 = d22;
                cos = cos;
                d30 = d31;
                d26 = d35;
                d27 = d34;
                ceil = ceil;
                d29 = d33;
                d17 = d10;
            }
        }

        private static void g(Path path, float f8, float f9, float f10, float f11, float f12, float f13, float f14, boolean z7, boolean z8) {
            double d8;
            double d9;
            double radians = Math.toRadians(f14);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d10 = f8;
            double d11 = d10 * cos;
            double d12 = f9;
            double d13 = f12;
            double d14 = (d11 + (d12 * sin)) / d13;
            double d15 = ((-f8) * sin) + (d12 * cos);
            double d16 = f13;
            double d17 = d15 / d16;
            double d18 = f11;
            double d19 = ((f10 * cos) + (d18 * sin)) / d13;
            double d20 = (((-f10) * sin) + (d18 * cos)) / d16;
            double d21 = d14 - d19;
            double d22 = d17 - d20;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d21 * d21) + (d22 * d22);
            if (d25 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d25);
                float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                g(path, f8, f9, f10, f11, f12 * sqrt, f13 * sqrt, f14, z7, z8);
                return;
            }
            double sqrt2 = Math.sqrt(d26);
            double d27 = d21 * sqrt2;
            double d28 = sqrt2 * d22;
            if (z7 == z8) {
                d8 = d23 - d28;
                d9 = d24 + d27;
            } else {
                d8 = d23 + d28;
                d9 = d24 - d27;
            }
            double atan2 = Math.atan2(d17 - d9, d14 - d8);
            double atan22 = Math.atan2(d20 - d9, d19 - d8) - atan2;
            if (z8 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d29 = d8 * d13;
            double d30 = d9 * d16;
            f(path, (d29 * cos) - (d30 * sin), (d29 * sin) + (d30 * cos), d13, d16, d10, d12, radians, atan2, atan22);
        }

        public static void i(b[] bVarArr, Path path) {
            AbstractC6413d.j(bVarArr, path);
        }

        public void h(b bVar, b bVar2, float f8) {
            this.f40904a = bVar.f40904a;
            int i8 = 0;
            while (true) {
                float[] fArr = bVar.f40905b;
                if (i8 >= fArr.length) {
                    return;
                }
                this.f40905b[i8] = (fArr[i8] * (1.0f - f8)) + (bVar2.f40905b[i8] * f8);
                i8++;
            }
        }

        b(b bVar) {
            this.f40904a = bVar.f40904a;
            float[] fArr = bVar.f40905b;
            this.f40905b = AbstractC6413d.c(fArr, 0, fArr.length);
        }
    }
}
