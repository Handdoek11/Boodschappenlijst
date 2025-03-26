package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class A4 implements InterfaceC3562o4 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f13490h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f13491i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f13492j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f13493a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f13494b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f13495c;

    /* renamed from: d, reason: collision with root package name */
    private final C4106t4 f13496d;

    /* renamed from: e, reason: collision with root package name */
    private final C3997s4 f13497e;

    /* renamed from: f, reason: collision with root package name */
    private final C4760z4 f13498f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f13499g;

    public A4(List list) {
        UQ uq = new UQ((byte[]) list.get(0));
        int G7 = uq.G();
        int G8 = uq.G();
        Paint paint = new Paint();
        this.f13493a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f13494b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f13495c = new Canvas();
        this.f13496d = new C4106t4(719, 575, 0, 719, 0, 575);
        this.f13497e = new C3997s4(0, g(), h(), i());
        this.f13498f = new C4760z4(G7, G8);
    }

    private static int b(int i8, int i9, int i10, int i11) {
        return (i8 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    private static C3997s4 c(C4144tQ c4144tQ, int i8) {
        int d8;
        int d9;
        int i9;
        int i10;
        int i11 = 8;
        int d10 = c4144tQ.d(8);
        c4144tQ.n(8);
        int[] g8 = g();
        int[] h8 = h();
        int[] i12 = i();
        int i13 = i8 - 2;
        while (i13 > 0) {
            int d11 = c4144tQ.d(i11);
            int d12 = c4144tQ.d(i11);
            int[] iArr = (d12 & 128) != 0 ? g8 : (d12 & 64) != 0 ? h8 : i12;
            if ((d12 & 1) != 0) {
                i9 = c4144tQ.d(i11);
                i10 = c4144tQ.d(i11);
                d8 = c4144tQ.d(i11);
                d9 = c4144tQ.d(i11);
                i13 -= 6;
            } else {
                int d13 = c4144tQ.d(6) << 2;
                int d14 = c4144tQ.d(4) << 4;
                i13 -= 4;
                d8 = c4144tQ.d(4) << 4;
                d9 = c4144tQ.d(2) << 6;
                i9 = d13;
                i10 = d14;
            }
            if (i9 == 0) {
                d9 = 255;
            }
            if (i9 == 0) {
                d8 = 0;
            }
            if (i9 == 0) {
                i10 = 0;
            }
            double d15 = i9;
            double d16 = i10 - 128;
            double d17 = d8 - 128;
            iArr[d11] = b((byte) (255 - (d9 & 255)), Math.max(0, Math.min((int) (d15 + (1.402d * d16)), 255)), Math.max(0, Math.min((int) ((d15 - (0.34414d * d17)) - (d16 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d15 + (d17 * 1.772d)), 255)));
            d10 = d10;
            i11 = 8;
        }
        return new C3997s4(d10, g8, h8, i12);
    }

    private static C4215u4 d(C4144tQ c4144tQ) {
        byte[] bArr;
        int d8 = c4144tQ.d(16);
        c4144tQ.n(4);
        int d9 = c4144tQ.d(2);
        boolean p8 = c4144tQ.p();
        c4144tQ.n(1);
        byte[] bArr2 = AbstractC2301cW.f21211f;
        if (d9 != 1) {
            if (d9 == 0) {
                int d10 = c4144tQ.d(16);
                int d11 = c4144tQ.d(16);
                if (d10 > 0) {
                    bArr2 = new byte[d10];
                    c4144tQ.i(bArr2, 0, d10);
                }
                if (d11 > 0) {
                    bArr = new byte[d11];
                    c4144tQ.i(bArr, 0, d11);
                }
            }
            return new C4215u4(d8, p8, bArr2, bArr);
        }
        c4144tQ.n(c4144tQ.d(8) * 16);
        bArr = bArr2;
        return new C4215u4(d8, p8, bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A4.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] f(int i8, int i9, C4144tQ c4144tQ) {
        byte[] bArr = new byte[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) c4144tQ.d(i9);
        }
        return bArr;
    }

    private static int[] g() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i8 = 1; i8 < 16; i8++) {
            int i9 = i8 & 4;
            int i10 = i8 & 2;
            int i11 = i8 & 1;
            if (i8 < 8) {
                iArr[i8] = b(255, 1 != i11 ? 0 : 255, i10 != 0 ? 255 : 0, i9 != 0 ? 255 : 0);
            } else {
                int i12 = ModuleDescriptor.MODULE_VERSION;
                int i13 = 1 != i11 ? 0 : 127;
                int i14 = i10 != 0 ? 127 : 0;
                if (i9 == 0) {
                    i12 = 0;
                }
                iArr[i8] = b(255, i13, i14, i12);
            }
        }
        return iArr;
    }

    private static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i8 = 0; i8 < 256; i8++) {
            if (i8 < 8) {
                iArr[i8] = b(63, 1 != (i8 & 1) ? 0 : 255, (i8 & 2) != 0 ? 255 : 0, (i8 & 4) == 0 ? 0 : 255);
            } else {
                int i9 = i8 & 136;
                if (i9 == 0) {
                    iArr[i8] = b(255, (1 != (i8 & 1) ? 0 : 85) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 8) {
                    iArr[i8] = b(ModuleDescriptor.MODULE_VERSION, (1 != (i8 & 1) ? 0 : 85) + ((i8 & 16) != 0 ? 170 : 0), ((i8 & 2) != 0 ? 85 : 0) + ((i8 & 32) != 0 ? 170 : 0), ((i8 & 4) == 0 ? 0 : 85) + ((i8 & 64) == 0 ? 0 : 170));
                } else if (i9 == 128) {
                    iArr[i8] = b(255, (1 != (i8 & 1) ? 0 : 43) + ModuleDescriptor.MODULE_VERSION + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + ModuleDescriptor.MODULE_VERSION + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + ModuleDescriptor.MODULE_VERSION + ((i8 & 64) == 0 ? 0 : 85));
                } else if (i9 == 136) {
                    iArr[i8] = b(255, (1 != (i8 & 1) ? 0 : 43) + ((i8 & 16) != 0 ? 85 : 0), ((i8 & 2) != 0 ? 43 : 0) + ((i8 & 32) != 0 ? 85 : 0), ((i8 & 4) == 0 ? 0 : 43) + ((i8 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3562o4
    public final void a(byte[] bArr, int i8, int i9, C3453n4 c3453n4, WE we) {
        C2692g4 c2692g4;
        char c8;
        char c9;
        int i10;
        SparseArray sparseArray;
        int i11;
        SparseArray sparseArray2;
        C4542x4 c4542x4;
        int i12;
        int d8;
        int d9;
        int i13;
        int i14;
        int i15;
        int i16;
        C4144tQ c4144tQ = new C4144tQ(bArr, i8 + i9);
        c4144tQ.l(i8);
        while (c4144tQ.a() >= 48 && c4144tQ.d(8) == 15) {
            C4760z4 c4760z4 = this.f13498f;
            int d10 = c4144tQ.d(8);
            int d11 = c4144tQ.d(16);
            int d12 = c4144tQ.d(16);
            int b8 = c4144tQ.b() + d12;
            if (d12 * 8 > c4144tQ.a()) {
                HL.f("DvbParser", "Data field length exceeds limit");
                c4144tQ.n(c4144tQ.a());
            } else {
                switch (d10) {
                    case 16:
                        if (d11 == c4760z4.f28267a) {
                            C4324v4 c4324v4 = c4760z4.f28275i;
                            int d13 = c4144tQ.d(8);
                            int d14 = c4144tQ.d(4);
                            int d15 = c4144tQ.d(2);
                            c4144tQ.n(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i17 = d12 - 2; i17 > 0; i17 -= 6) {
                                int d16 = c4144tQ.d(8);
                                c4144tQ.n(8);
                                sparseArray3.put(d16, new C4433w4(c4144tQ.d(16), c4144tQ.d(16)));
                            }
                            C4324v4 c4324v42 = new C4324v4(d13, d14, d15, sparseArray3);
                            if (c4324v42.f27177b != 0) {
                                c4760z4.f28275i = c4324v42;
                                c4760z4.f28269c.clear();
                                c4760z4.f28270d.clear();
                                c4760z4.f28271e.clear();
                                break;
                            } else if (c4324v4 != null) {
                                if (c4324v4.f27176a != c4324v42.f27176a) {
                                    c4760z4.f28275i = c4324v42;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        C4324v4 c4324v43 = c4760z4.f28275i;
                        if (d11 == c4760z4.f28267a && c4324v43 != null) {
                            int d17 = c4144tQ.d(8);
                            c4144tQ.n(4);
                            boolean p8 = c4144tQ.p();
                            c4144tQ.n(3);
                            int d18 = c4144tQ.d(16);
                            int d19 = c4144tQ.d(16);
                            int d20 = c4144tQ.d(3);
                            int d21 = c4144tQ.d(3);
                            c4144tQ.n(2);
                            int d22 = c4144tQ.d(8);
                            int d23 = c4144tQ.d(8);
                            int d24 = c4144tQ.d(4);
                            int d25 = c4144tQ.d(2);
                            c4144tQ.n(2);
                            int i18 = d12 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i18 > 0) {
                                int d26 = c4144tQ.d(16);
                                int d27 = c4144tQ.d(2);
                                int d28 = c4144tQ.d(2);
                                int d29 = c4144tQ.d(12);
                                c4144tQ.n(4);
                                int d30 = c4144tQ.d(12);
                                int i19 = i18 - 6;
                                if (d27 == 1) {
                                    i18 -= 8;
                                    i12 = d27;
                                    d8 = c4144tQ.d(8);
                                    d9 = c4144tQ.d(8);
                                } else if (d27 == 2) {
                                    d27 = 2;
                                    i18 -= 8;
                                    i12 = d27;
                                    d8 = c4144tQ.d(8);
                                    d9 = c4144tQ.d(8);
                                } else {
                                    i12 = d27;
                                    i18 = i19;
                                    d8 = 0;
                                    d9 = 0;
                                }
                                sparseArray4.put(d26, new C4651y4(i12, d28, d29, d30, d8, d9));
                            }
                            C4542x4 c4542x42 = new C4542x4(d17, p8, d18, d19, d20, d21, d22, d23, d24, d25, sparseArray4);
                            if (c4324v43.f27177b == 0 && (c4542x4 = (C4542x4) c4760z4.f28269c.get(c4542x42.f27727a)) != null) {
                                int i20 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = c4542x4.f27736j;
                                    if (i20 < sparseArray5.size()) {
                                        c4542x42.f27736j.put(sparseArray5.keyAt(i20), (C4651y4) sparseArray5.valueAt(i20));
                                        i20++;
                                    }
                                }
                            }
                            c4760z4.f28269c.put(c4542x42.f27727a, c4542x42);
                            break;
                        }
                        break;
                    case 18:
                        if (d11 == c4760z4.f28267a) {
                            C3997s4 c10 = c(c4144tQ, d12);
                            c4760z4.f28270d.put(c10.f26538a, c10);
                            break;
                        } else if (d11 == c4760z4.f28268b) {
                            C3997s4 c11 = c(c4144tQ, d12);
                            c4760z4.f28272f.put(c11.f26538a, c11);
                            break;
                        }
                        break;
                    case 19:
                        if (d11 == c4760z4.f28267a) {
                            C4215u4 d31 = d(c4144tQ);
                            c4760z4.f28271e.put(d31.f26991a, d31);
                            break;
                        } else if (d11 == c4760z4.f28268b) {
                            C4215u4 d32 = d(c4144tQ);
                            c4760z4.f28273g.put(d32.f26991a, d32);
                            break;
                        }
                        break;
                    case 20:
                        if (d11 == c4760z4.f28267a) {
                            c4144tQ.n(4);
                            boolean p9 = c4144tQ.p();
                            c4144tQ.n(3);
                            int d33 = c4144tQ.d(16);
                            int d34 = c4144tQ.d(16);
                            if (p9) {
                                int d35 = c4144tQ.d(16);
                                i13 = c4144tQ.d(16);
                                i16 = c4144tQ.d(16);
                                i14 = c4144tQ.d(16);
                                i15 = d35;
                            } else {
                                i13 = d33;
                                i14 = d34;
                                i15 = 0;
                                i16 = 0;
                            }
                            c4760z4.f28274h = new C4106t4(d33, d34, i15, i13, i16, i14);
                            break;
                        }
                        break;
                }
                c4144tQ.o(b8 - c4144tQ.b());
            }
        }
        C4760z4 c4760z42 = this.f13498f;
        C4324v4 c4324v44 = c4760z42.f28275i;
        if (c4324v44 == null) {
            c2692g4 = new C2692g4(AbstractC4169th0.w(), -9223372036854775807L, -9223372036854775807L);
        } else {
            C4106t4 c4106t4 = c4760z42.f28274h;
            if (c4106t4 == null) {
                c4106t4 = this.f13496d;
            }
            Bitmap bitmap = this.f13499g;
            if (bitmap == null || c4106t4.f26815a + 1 != bitmap.getWidth() || c4106t4.f26816b + 1 != this.f13499g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c4106t4.f26815a + 1, c4106t4.f26816b + 1, Bitmap.Config.ARGB_8888);
                this.f13499g = createBitmap;
                this.f13495c.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = c4324v44.f27178c;
            int i21 = 0;
            while (i21 < sparseArray6.size()) {
                this.f13495c.save();
                C4433w4 c4433w4 = (C4433w4) sparseArray6.valueAt(i21);
                C4542x4 c4542x43 = (C4542x4) this.f13498f.f28269c.get(sparseArray6.keyAt(i21));
                int i22 = c4433w4.f27434a + c4106t4.f26817c;
                int i23 = c4433w4.f27435b + c4106t4.f26819e;
                this.f13495c.clipRect(i22, i23, Math.min(c4542x43.f27729c + i22, c4106t4.f26818d), Math.min(c4542x43.f27730d + i23, c4106t4.f26820f));
                C3997s4 c3997s4 = (C3997s4) this.f13498f.f28270d.get(c4542x43.f27732f);
                if (c3997s4 == null) {
                    c3997s4 = (C3997s4) this.f13498f.f28272f.get(c4542x43.f27732f);
                    if (c3997s4 == null) {
                        c3997s4 = this.f13497e;
                    }
                }
                SparseArray sparseArray7 = c4542x43.f27736j;
                int i24 = 0;
                while (i24 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i24);
                    C4651y4 c4651y4 = (C4651y4) sparseArray7.valueAt(i24);
                    C4215u4 c4215u4 = (C4215u4) this.f13498f.f28271e.get(keyAt);
                    if (c4215u4 == null) {
                        c4215u4 = (C4215u4) this.f13498f.f28273g.get(keyAt);
                    }
                    if (c4215u4 != null) {
                        Paint paint = c4215u4.f26992b ? null : this.f13493a;
                        int i25 = c4542x43.f27731e;
                        int i26 = c4651y4.f28019a + i22;
                        int i27 = c4651y4.f28020b + i23;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.f13495c;
                        sparseArray2 = sparseArray7;
                        i11 = i21;
                        int[] iArr = i25 == 3 ? c3997s4.f26541d : i25 == 2 ? c3997s4.f26540c : c3997s4.f26539b;
                        Paint paint2 = paint;
                        e(c4215u4.f26993c, iArr, i25, i26, i27, paint2, canvas);
                        e(c4215u4.f26994d, iArr, i25, i26, i27 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i11 = i21;
                        sparseArray2 = sparseArray7;
                    }
                    i24++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i21 = i11;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i28 = i21;
                float f8 = i23;
                float f9 = i22;
                if (c4542x43.f27728b) {
                    int i29 = c4542x43.f27731e;
                    c8 = 3;
                    if (i29 == 3) {
                        i10 = c3997s4.f26541d[c4542x43.f27733g];
                        c9 = 2;
                    } else {
                        c9 = 2;
                        i10 = i29 == 2 ? c3997s4.f26540c[c4542x43.f27734h] : c3997s4.f26539b[c4542x43.f27735i];
                    }
                    this.f13494b.setColor(i10);
                    this.f13495c.drawRect(f9, f8, c4542x43.f27729c + i22, c4542x43.f27730d + i23, this.f13494b);
                } else {
                    c8 = 3;
                    c9 = 2;
                }
                C2677fx c2677fx = new C2677fx();
                c2677fx.c(Bitmap.createBitmap(this.f13499g, i22, i23, c4542x43.f27729c, c4542x43.f27730d));
                c2677fx.h(f9 / c4106t4.f26815a);
                c2677fx.i(0);
                c2677fx.e(f8 / c4106t4.f26816b, 0);
                c2677fx.f(0);
                c2677fx.k(c4542x43.f27729c / c4106t4.f26815a);
                c2677fx.d(c4542x43.f27730d / c4106t4.f26816b);
                arrayList.add(c2677fx.p());
                this.f13495c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f13495c.restore();
                i21 = i28 + 1;
                sparseArray6 = sparseArray8;
            }
            c2692g4 = new C2692g4(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        we.a(c2692g4);
    }
}
