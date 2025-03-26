package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4614xm {

    /* renamed from: a, reason: collision with root package name */
    public final int f27902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27904c;

    /* renamed from: d, reason: collision with root package name */
    private final D[] f27905d;

    /* renamed from: e, reason: collision with root package name */
    private int f27906e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C4614xm(String str, D... dArr) {
        int length = dArr.length;
        int i8 = 1;
        AbstractC3796qC.d(length > 0);
        this.f27903b = str;
        this.f27905d = dArr;
        this.f27902a = length;
        int b8 = AbstractC1650Pc.b(dArr[0].f14334o);
        this.f27904c = b8 == -1 ? AbstractC1650Pc.b(dArr[0].f14333n) : b8;
        String c8 = c(dArr[0].f14323d);
        int i9 = dArr[0].f14325f | 16384;
        while (true) {
            D[] dArr2 = this.f27905d;
            if (i8 >= dArr2.length) {
                return;
            }
            if (!c8.equals(c(dArr2[i8].f14323d))) {
                D[] dArr3 = this.f27905d;
                d("languages", dArr3[0].f14323d, dArr3[i8].f14323d, i8);
                return;
            } else {
                D[] dArr4 = this.f27905d;
                if (i9 != (dArr4[i8].f14325f | 16384)) {
                    d("role flags", Integer.toBinaryString(dArr4[0].f14325f), Integer.toBinaryString(this.f27905d[i8].f14325f), i8);
                    return;
                }
                i8++;
            }
        }
    }

    private static String c(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static void d(String str, String str2, String str3, int i8) {
        HL.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i8 + ")"));
    }

    public final int a(D d8) {
        int i8 = 0;
        while (true) {
            D[] dArr = this.f27905d;
            if (i8 >= dArr.length) {
                return -1;
            }
            if (d8 == dArr[i8]) {
                return i8;
            }
            i8++;
        }
    }

    public final D b(int i8) {
        return this.f27905d[i8];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4614xm.class == obj.getClass()) {
            C4614xm c4614xm = (C4614xm) obj;
            if (this.f27903b.equals(c4614xm.f27903b) && Arrays.equals(this.f27905d, c4614xm.f27905d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f27906e;
        if (i8 != 0) {
            return i8;
        }
        int hashCode = ((this.f27903b.hashCode() + 527) * 31) + Arrays.hashCode(this.f27905d);
        this.f27906e = hashCode;
        return hashCode;
    }
}
