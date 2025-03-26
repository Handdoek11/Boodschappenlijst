package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class S2 {

    /* renamed from: O, reason: collision with root package name */
    public byte[] f18749O;

    /* renamed from: U, reason: collision with root package name */
    public Z0 f18755U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f18756V;

    /* renamed from: Y, reason: collision with root package name */
    public Y0 f18759Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f18760Z;

    /* renamed from: a, reason: collision with root package name */
    public String f18761a;

    /* renamed from: b, reason: collision with root package name */
    public String f18762b;

    /* renamed from: c, reason: collision with root package name */
    public int f18763c;

    /* renamed from: d, reason: collision with root package name */
    public int f18764d;

    /* renamed from: e, reason: collision with root package name */
    public int f18765e;

    /* renamed from: f, reason: collision with root package name */
    public int f18766f;

    /* renamed from: g, reason: collision with root package name */
    private int f18767g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18768h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f18769i;

    /* renamed from: j, reason: collision with root package name */
    public X0 f18770j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f18771k;

    /* renamed from: l, reason: collision with root package name */
    public C4785zG0 f18772l;

    /* renamed from: m, reason: collision with root package name */
    public int f18773m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f18774n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f18775o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f18776p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f18777q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f18778r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f18779s = -1;

    /* renamed from: t, reason: collision with root package name */
    public float f18780t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f18781u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f18782v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f18783w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f18784x = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18785y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f18786z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f18735A = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f18736B = -1;

    /* renamed from: C, reason: collision with root package name */
    public int f18737C = 1000;

    /* renamed from: D, reason: collision with root package name */
    public int f18738D = 200;

    /* renamed from: E, reason: collision with root package name */
    public float f18739E = -1.0f;

    /* renamed from: F, reason: collision with root package name */
    public float f18740F = -1.0f;

    /* renamed from: G, reason: collision with root package name */
    public float f18741G = -1.0f;

    /* renamed from: H, reason: collision with root package name */
    public float f18742H = -1.0f;

    /* renamed from: I, reason: collision with root package name */
    public float f18743I = -1.0f;

    /* renamed from: J, reason: collision with root package name */
    public float f18744J = -1.0f;

    /* renamed from: K, reason: collision with root package name */
    public float f18745K = -1.0f;

    /* renamed from: L, reason: collision with root package name */
    public float f18746L = -1.0f;

    /* renamed from: M, reason: collision with root package name */
    public float f18747M = -1.0f;

    /* renamed from: N, reason: collision with root package name */
    public float f18748N = -1.0f;

    /* renamed from: P, reason: collision with root package name */
    public int f18750P = 1;

    /* renamed from: Q, reason: collision with root package name */
    public int f18751Q = -1;

    /* renamed from: R, reason: collision with root package name */
    public int f18752R = 8000;

    /* renamed from: S, reason: collision with root package name */
    public long f18753S = 0;

    /* renamed from: T, reason: collision with root package name */
    public long f18754T = 0;

    /* renamed from: W, reason: collision with root package name */
    public boolean f18757W = true;

    /* renamed from: X, reason: collision with root package name */
    private String f18758X = "eng";

    protected S2() {
    }

    private static Pair f(UQ uq) {
        try {
            uq.m(16);
            long I7 = uq.I();
            if (I7 == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (I7 == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (I7 != 826496599) {
                HL.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int t7 = uq.t() + 20;
            byte[] n8 = uq.n();
            while (true) {
                int length = n8.length;
                if (t7 >= length - 4) {
                    throw zzbc.a("Failed to find FourCC VC1 initialization data", null);
                }
                int i8 = t7 + 1;
                if (n8[t7] == 0 && n8[i8] == 0 && n8[t7 + 2] == 1 && n8[t7 + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(n8, t7, length)));
                }
                t7 = i8;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.a("Error parsing FourCC private data", null);
        }
    }

    private static List g(byte[] bArr) {
        int i8;
        int i9;
        try {
            if (bArr[0] != 2) {
                throw zzbc.a("Error parsing vorbis codec private", null);
            }
            int i10 = 0;
            int i11 = 1;
            while (true) {
                int i12 = bArr[i11];
                i11++;
                i8 = i12 & 255;
                if (i8 != 255) {
                    break;
                }
                i10 += 255;
            }
            int i13 = i10 + i8;
            int i14 = 0;
            while (true) {
                int i15 = bArr[i11];
                i11++;
                i9 = i15 & 255;
                if (i9 != 255) {
                    break;
                }
                i14 += 255;
            }
            int i16 = i14 + i9;
            if (bArr[i11] != 1) {
                throw zzbc.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i13];
            System.arraycopy(bArr, i11, bArr2, 0, i13);
            int i17 = i11 + i13;
            if (bArr[i17] != 3) {
                throw zzbc.a("Error parsing vorbis codec private", null);
            }
            int i18 = i17 + i16;
            if (bArr[i18] != 5) {
                throw zzbc.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i18;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i18, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(UQ uq) {
        try {
            int A7 = uq.A();
            if (A7 == 1) {
                return true;
            }
            if (A7 == 65534) {
                uq.l(24);
                if (uq.J() == U2.f19219i0.getMostSignificantBits()) {
                    if (uq.J() == U2.f19219i0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) {
        byte[] bArr = this.f18771k;
        if (bArr != null) {
            return bArr;
        }
        throw zzbc.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.google.android.gms.internal.ads.InterfaceC4207u0 r19, int r20) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S2.e(com.google.android.gms.internal.ads.u0, int):void");
    }
}
