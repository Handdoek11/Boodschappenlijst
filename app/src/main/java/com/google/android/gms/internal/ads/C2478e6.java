package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2478e6 implements W5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4144tQ f21729a = new C4144tQ(new byte[5], 5);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f21730b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f21731c = new SparseIntArray();

    /* renamed from: d, reason: collision with root package name */
    private final int f21732d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2587f6 f21733e;

    public C2478e6(C2587f6 c2587f6, int i8) {
        this.f21733e = c2587f6;
        this.f21732d = i8;
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void b(BU bu, InterfaceC4207u0 interfaceC4207u0, C3021j6 c3021j6) {
    }

    @Override // com.google.android.gms.internal.ads.W5
    public final void c(UQ uq) {
        BU bu;
        BU bu2;
        int i8;
        if (uq.C() != 2) {
            return;
        }
        BU bu3 = (BU) this.f21733e.f21933b.get(0);
        if ((uq.C() & 128) != 0) {
            uq.m(1);
            int G7 = uq.G();
            int i9 = 3;
            uq.m(3);
            uq.g(this.f21729a, 2);
            this.f21729a.n(3);
            int i10 = 13;
            this.f21733e.f21949r = this.f21729a.d(13);
            uq.g(this.f21729a, 2);
            int i11 = 4;
            this.f21729a.n(4);
            int i12 = 12;
            uq.m(this.f21729a.d(12));
            this.f21730b.clear();
            this.f21731c.clear();
            int r8 = uq.r();
            while (r8 > 0) {
                int i13 = 5;
                uq.g(this.f21729a, 5);
                C4144tQ c4144tQ = this.f21729a;
                int d8 = c4144tQ.d(8);
                c4144tQ.n(i9);
                int d9 = this.f21729a.d(i10);
                this.f21729a.n(i11);
                int d10 = this.f21729a.d(i12);
                int t7 = uq.t();
                int i14 = t7 + d10;
                int i15 = 0;
                String str = null;
                ArrayList arrayList = null;
                int i16 = -1;
                while (uq.t() < i14) {
                    int C7 = uq.C();
                    int t8 = uq.t() + uq.C();
                    if (t8 > i14) {
                        break;
                    }
                    if (C7 == i13) {
                        long K7 = uq.K();
                        if (K7 != 1094921523) {
                            if (K7 != 1161904947) {
                                if (K7 != 1094921524) {
                                    if (K7 == 1212503619) {
                                        i8 = 36;
                                        bu2 = bu3;
                                        i16 = i8;
                                    }
                                    bu2 = bu3;
                                }
                                bu2 = bu3;
                                i16 = 172;
                            }
                            bu2 = bu3;
                            i16 = 135;
                        }
                        bu2 = bu3;
                        i16 = 129;
                    } else if (C7 == 106) {
                        bu2 = bu3;
                        i16 = 129;
                    } else if (C7 == 122) {
                        bu2 = bu3;
                        i16 = 135;
                    } else {
                        if (C7 == 127) {
                            int C8 = uq.C();
                            if (C8 != 21) {
                                if (C8 == 14) {
                                    i8 = 136;
                                } else {
                                    if (C8 == 33) {
                                        i8 = 139;
                                    }
                                    bu2 = bu3;
                                }
                            }
                            bu2 = bu3;
                            i16 = 172;
                        } else if (C7 == 123) {
                            i8 = 138;
                        } else if (C7 == 10) {
                            String trim = uq.b(i9, StandardCharsets.UTF_8).trim();
                            i15 = uq.C();
                            bu2 = bu3;
                            str = trim;
                        } else if (C7 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (uq.t() < t8) {
                                String trim2 = uq.b(i9, StandardCharsets.UTF_8).trim();
                                int C9 = uq.C();
                                BU bu4 = bu3;
                                byte[] bArr = new byte[i11];
                                uq.h(bArr, 0, i11);
                                arrayList2.add(new C2696g6(trim2, C9, bArr));
                                bu3 = bu4;
                                i9 = 3;
                                i11 = 4;
                            }
                            bu2 = bu3;
                            arrayList = arrayList2;
                            i16 = 89;
                        } else {
                            bu2 = bu3;
                            if (C7 == 111) {
                                i16 = 257;
                            }
                        }
                        bu2 = bu3;
                        i16 = i8;
                    }
                    uq.m(t8 - uq.t());
                    bu3 = bu2;
                    i9 = 3;
                    i11 = 4;
                    i13 = 5;
                }
                BU bu5 = bu3;
                uq.l(i14);
                C2805h6 c2805h6 = new C2805h6(i16, str, i15, arrayList, Arrays.copyOfRange(uq.n(), t7, i14));
                if (d8 == 6 || d8 == 5) {
                    d8 = c2805h6.f22475a;
                }
                r8 -= d10 + 5;
                if (!this.f21733e.f21939h.get(d9)) {
                    InterfaceC3130k6 a8 = this.f21733e.f21936e.a(d8, c2805h6);
                    this.f21731c.put(d9, d9);
                    this.f21730b.put(d9, a8);
                }
                bu3 = bu5;
                i9 = 3;
                i11 = 4;
                i12 = 12;
                i10 = 13;
            }
            BU bu6 = bu3;
            int size = this.f21731c.size();
            int i17 = 0;
            while (i17 < size) {
                SparseIntArray sparseIntArray = this.f21731c;
                C2587f6 c2587f6 = this.f21733e;
                int keyAt = sparseIntArray.keyAt(i17);
                int valueAt = sparseIntArray.valueAt(i17);
                c2587f6.f21939h.put(keyAt, true);
                this.f21733e.f21940i.put(valueAt, true);
                InterfaceC3130k6 interfaceC3130k6 = (InterfaceC3130k6) this.f21730b.valueAt(i17);
                if (interfaceC3130k6 != null) {
                    InterfaceC4207u0 interfaceC4207u0 = this.f21733e.f21943l;
                    C3021j6 c3021j6 = new C3021j6(G7, keyAt, 8192);
                    bu = bu6;
                    interfaceC3130k6.b(bu, interfaceC4207u0, c3021j6);
                    this.f21733e.f21938g.put(valueAt, interfaceC3130k6);
                } else {
                    bu = bu6;
                }
                i17++;
                bu6 = bu;
            }
            this.f21733e.f21938g.remove(this.f21732d);
            this.f21733e.f21944m = 0;
            C2587f6 c2587f62 = this.f21733e;
            if (c2587f62.f21944m == 0) {
                c2587f62.f21943l.P();
                this.f21733e.f21945n = true;
            }
        }
    }
}
