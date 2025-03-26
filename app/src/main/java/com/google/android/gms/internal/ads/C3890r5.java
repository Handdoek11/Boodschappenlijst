package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3890r5 implements InterfaceC2914i6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f26081a;

    public C3890r5(int i8, List list) {
        this.f26081a = list;
    }

    private final Z5 b(C2805h6 c2805h6) {
        return new Z5(d(c2805h6));
    }

    private final C3457n6 c(C2805h6 c2805h6) {
        return new C3457n6(d(c2805h6));
    }

    private final List d(C2805h6 c2805h6) {
        String str;
        int i8;
        List list;
        UQ uq = new UQ(c2805h6.f22479e);
        List list2 = this.f26081a;
        while (uq.r() > 0) {
            int C7 = uq.C();
            int t7 = uq.t() + uq.C();
            if (C7 == 134) {
                list2 = new ArrayList();
                int C8 = uq.C() & 31;
                for (int i9 = 0; i9 < C8; i9++) {
                    String b8 = uq.b(3, StandardCharsets.UTF_8);
                    int C9 = uq.C();
                    boolean z7 = (C9 & 128) != 0;
                    if (z7) {
                        i8 = C9 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i8 = 1;
                    }
                    byte C10 = (byte) uq.C();
                    uq.m(1);
                    if (z7) {
                        int i10 = C10 & 64;
                        int i11 = AbstractC4015sD.f26606d;
                        list = Collections.singletonList(i10 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C2723gJ0 c2723gJ0 = new C2723gJ0();
                    c2723gJ0.B(str);
                    c2723gJ0.q(b8);
                    c2723gJ0.p0(i8);
                    c2723gJ0.n(list);
                    list2.add(c2723gJ0.H());
                }
            }
            uq.l(t7);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2914i6
    public final InterfaceC3130k6 a(int i8, C2805h6 c2805h6) {
        if (i8 != 2) {
            if (i8 == 3 || i8 == 4) {
                return new P5(new G5(c2805h6.f22476b, c2805h6.a()));
            }
            if (i8 == 21) {
                return new P5(new E5());
            }
            if (i8 == 27) {
                return new P5(new B5(b(c2805h6), false, false));
            }
            if (i8 == 36) {
                return new P5(new D5(b(c2805h6)));
            }
            if (i8 == 45) {
                return new P5(new H5());
            }
            if (i8 == 89) {
                return new P5(new C4108t5(c2805h6.f22478d));
            }
            if (i8 == 172) {
                return new P5(new C3564o5(c2805h6.f22476b, c2805h6.a()));
            }
            if (i8 == 257) {
                return new X5(new O5("application/vnd.dvb.ait"));
            }
            if (i8 != 128) {
                if (i8 != 129) {
                    if (i8 != 138) {
                        if (i8 == 139) {
                            return new P5(new C3999s5(c2805h6.f22476b, c2805h6.a(), 5408));
                        }
                        switch (i8) {
                            case 15:
                                return new P5(new C3782q5(false, c2805h6.f22476b, c2805h6.a()));
                            case 16:
                                return new P5(new C4762z5(c(c2805h6)));
                            case 17:
                                return new P5(new F5(c2805h6.f22476b, c2805h6.a()));
                            default:
                                switch (i8) {
                                    case 134:
                                        return new X5(new O5("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new P5(new C3999s5(c2805h6.f22476b, c2805h6.a(), 4096));
                }
                return new P5(new C3346m5(c2805h6.f22476b, c2805h6.a()));
            }
        }
        return new P5(new C4435w5(c(c2805h6)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2914i6
    public final SparseArray zza() {
        return new SparseArray();
    }
}
