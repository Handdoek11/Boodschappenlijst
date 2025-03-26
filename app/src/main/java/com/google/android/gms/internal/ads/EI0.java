package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EI0 extends II0 {
    @Override // com.google.android.gms.internal.ads.II0
    public final JI0 f(CA0[] ca0Arr, JH0 jh0, GG0 gg0, AbstractC1981Yl abstractC1981Yl) {
        boolean z7;
        int[] iArr;
        int[] iArr2 = new int[3];
        C4614xm[][] c4614xmArr = new C4614xm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = jh0.f16221a;
            c4614xmArr[i8] = new C4614xm[i9];
            iArr3[i8] = new int[i9][];
        }
        int i10 = 2;
        int[] iArr4 = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr4[i11] = ca0Arr[i11].b();
        }
        int i12 = 0;
        while (i12 < jh0.f16221a) {
            C4614xm b8 = jh0.b(i12);
            int i13 = b8.f27904c;
            int i14 = i10;
            int i15 = 0;
            int i16 = 0;
            boolean z8 = true;
            while (i15 < i10) {
                CA0 ca0 = ca0Arr[i15];
                int i17 = 0;
                for (int i18 = 0; i18 < b8.f27902a; i18++) {
                    i17 = Math.max(i17, ca0.f(b8.b(i18)) & 7);
                }
                boolean z9 = iArr2[i15] == 0;
                if (i17 > i16) {
                    z8 = z9;
                    i14 = i15;
                    i16 = i17;
                } else if (i17 == i16 && i13 == 5 && !z8 && z9) {
                    i14 = i15;
                    i16 = i17;
                    z8 = true;
                }
                i15++;
                i10 = 2;
            }
            if (i14 == i10) {
                iArr = new int[b8.f27902a];
            } else {
                CA0 ca02 = ca0Arr[i14];
                int[] iArr5 = new int[b8.f27902a];
                for (int i19 = 0; i19 < b8.f27902a; i19++) {
                    iArr5[i19] = ca02.f(b8.b(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i14];
            c4614xmArr[i14][i20] = b8;
            iArr3[i14][i20] = iArr;
            iArr2[i14] = i20 + 1;
            i12++;
            i10 = 2;
        }
        int i21 = i10;
        boolean z10 = true;
        JH0[] jh0Arr = new JH0[i21];
        String[] strArr = new String[i21];
        int[] iArr6 = new int[i21];
        int i22 = 0;
        while (i22 < i21) {
            int i23 = iArr2[i22];
            jh0Arr[i22] = new JH0((C4614xm[]) AbstractC2301cW.n(c4614xmArr[i22], i23));
            iArr3[i22] = (int[][]) AbstractC2301cW.n(iArr3[i22], i23);
            strArr[i22] = ca0Arr[i22].u();
            iArr6[i22] = ca0Arr[i22].zzb();
            i22++;
            i21 = 2;
        }
        int i24 = i21;
        DI0 di0 = new DI0(strArr, iArr6, jh0Arr, iArr4, iArr3, new JH0((C4614xm[]) AbstractC2301cW.n(c4614xmArr[i24], iArr2[i24])));
        Pair k8 = k(di0, iArr3, iArr4, gg0, abstractC1981Yl);
        FI0[] fi0Arr = (FI0[]) k8.second;
        List[] listArr = new List[fi0Arr.length];
        for (int i25 = 0; i25 < fi0Arr.length; i25++) {
            FI0 fi0 = fi0Arr[i25];
            listArr[i25] = fi0 != null ? AbstractC4169th0.x(fi0) : AbstractC4169th0.w();
        }
        C3843qh0 c3843qh0 = new C3843qh0();
        int i26 = 0;
        for (int i27 = 2; i26 < i27; i27 = 2) {
            JH0 d8 = di0.d(i26);
            List list = listArr[i26];
            int i28 = 0;
            while (i28 < d8.f16221a) {
                C4614xm b9 = d8.b(i28);
                boolean z11 = di0.a(i26, i28, false) != 0 ? z10 : false;
                int i29 = b9.f27902a;
                int[] iArr7 = new int[i29];
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 < b9.f27902a; i30++) {
                    iArr7[i30] = di0.b(i26, i28, i30) & 7;
                    int i31 = 0;
                    while (true) {
                        if (i31 >= list.size()) {
                            z7 = false;
                            break;
                        }
                        FI0 fi02 = (FI0) list.get(i31);
                        if (fi02.g().equals(b9) && fi02.B(i30) != -1) {
                            z7 = true;
                            break;
                        }
                        i31++;
                    }
                    zArr[i30] = z7;
                }
                c3843qh0.g(new C3640op(b9, z11, iArr7, zArr));
                i28++;
                z10 = true;
            }
            i26++;
            z10 = true;
        }
        JH0 e8 = di0.e();
        for (int i32 = 0; i32 < e8.f16221a; i32++) {
            C4614xm b10 = e8.b(i32);
            int[] iArr8 = new int[b10.f27902a];
            Arrays.fill(iArr8, 0);
            c3843qh0.g(new C3640op(b10, false, iArr8, new boolean[b10.f27902a]));
        }
        return new JI0((DA0[]) k8.first, (BI0[]) k8.second, new C1635Op(c3843qh0.j()), di0);
    }

    @Override // com.google.android.gms.internal.ads.II0
    public final void g(Object obj) {
    }

    protected abstract Pair k(DI0 di0, int[][][] iArr, int[] iArr2, GG0 gg0, AbstractC1981Yl abstractC1981Yl);
}
