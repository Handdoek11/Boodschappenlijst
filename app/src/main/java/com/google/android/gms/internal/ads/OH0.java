package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class OH0 extends QH0 {
    protected OH0(C4614xm c4614xm, int[] iArr, int i8, QI0 qi0, long j8, long j9, long j10, int i9, int i10, float f8, float f9, List list, RC rc) {
        super(c4614xm, iArr, 0);
        AbstractC4169th0.t(list);
    }

    static /* bridge */ /* synthetic */ AbstractC4169th0 a(AI0[] ai0Arr) {
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i8 = 2;
            i9 = 1;
            if (i11 >= 2) {
                break;
            }
            AI0 ai0 = ai0Arr[i11];
            if (ai0 == null || ai0.f13537b.length <= 1) {
                arrayList.add(null);
            } else {
                C3843qh0 c3843qh0 = new C3843qh0();
                c3843qh0.g(new MH0(0L, 0L));
                arrayList.add(c3843qh0);
            }
            i11++;
        }
        long[][] jArr = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            AI0 ai02 = ai0Arr[i12];
            if (ai02 == null) {
                jArr[i12] = new long[0];
            } else {
                jArr[i12] = new long[ai02.f13537b.length];
                int i13 = 0;
                while (true) {
                    int[] iArr = ai02.f13537b;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    long j8 = ai02.f13536a.b(iArr[i13]).f14329j;
                    long[] jArr2 = jArr[i12];
                    if (j8 == -1) {
                        j8 = 0;
                    }
                    jArr2[i13] = j8;
                    i13++;
                }
                Arrays.sort(jArr[i12]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr4 = jArr[i14];
            jArr3[i14] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        b(arrayList, jArr3);
        InterfaceC1272Eh0 c8 = AbstractC2011Zh0.b(AbstractC2539ei0.c()).b(2).c();
        int i15 = 0;
        while (i15 < i8) {
            int length = jArr[i15].length;
            if (length > i9) {
                double[] dArr = new double[length];
                int i16 = i10;
                while (true) {
                    long[] jArr5 = jArr[i15];
                    double d8 = 0.0d;
                    if (i16 >= jArr5.length) {
                        break;
                    }
                    long j9 = jArr5[i16];
                    if (j9 != -1) {
                        d8 = Math.log(j9);
                    }
                    dArr[i16] = d8;
                    i16++;
                }
                int i17 = length - 1;
                double d9 = dArr[i17] - dArr[i10];
                int i18 = i10;
                while (i18 < i17) {
                    double d10 = dArr[i18];
                    i18++;
                    c8.a(Double.valueOf(d9 == 0.0d ? 1.0d : (((d10 + dArr[i18]) * 0.5d) - dArr[i10]) / d9), Integer.valueOf(i15));
                    i10 = 0;
                }
            }
            i15++;
            i10 = 0;
            i8 = 2;
            i9 = 1;
        }
        AbstractC4169th0 t7 = AbstractC4169th0.t(c8.r());
        for (int i19 = 0; i19 < t7.size(); i19++) {
            int intValue = ((Integer) t7.get(i19)).intValue();
            int i20 = iArr2[intValue] + 1;
            iArr2[intValue] = i20;
            jArr3[intValue] = jArr[intValue][i20];
            b(arrayList, jArr3);
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (arrayList.get(i21) != null) {
                long j10 = jArr3[i21];
                jArr3[i21] = j10 + j10;
            }
        }
        b(arrayList, jArr3);
        C3843qh0 c3843qh02 = new C3843qh0();
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            C3843qh0 c3843qh03 = (C3843qh0) arrayList.get(i22);
            c3843qh02.g(c3843qh03 == null ? AbstractC4169th0.w() : c3843qh03.j());
        }
        return c3843qh02.j();
    }

    private static void b(List list, long[] jArr) {
        long j8 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            j8 += jArr[i8];
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            C3843qh0 c3843qh0 = (C3843qh0) list.get(i9);
            if (c3843qh0 != null) {
                c3843qh0.g(new MH0(j8, jArr[i9]));
            }
        }
    }
}
