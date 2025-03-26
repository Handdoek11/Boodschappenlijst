package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
final class UG0 implements EG0, DG0 {

    /* renamed from: o, reason: collision with root package name */
    private final EG0[] f19325o;

    /* renamed from: v, reason: collision with root package name */
    private DG0 f19329v;

    /* renamed from: w, reason: collision with root package name */
    private JH0 f19330w;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayList f19327t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final HashMap f19328u = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private BH0 f19332y = new C3696pG0(AbstractC4169th0.w(), AbstractC4169th0.w());

    /* renamed from: s, reason: collision with root package name */
    private final IdentityHashMap f19326s = new IdentityHashMap();

    /* renamed from: x, reason: collision with root package name */
    private EG0[] f19331x = new EG0[0];

    public UG0(C3805qG0 c3805qG0, long[] jArr, EG0... eg0Arr) {
        this.f19325o = eg0Arr;
        for (int i8 = 0; i8 < eg0Arr.length; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                this.f19325o[i8] = new GH0(eg0Arr[i8], j8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long a() {
        return this.f19332y.a();
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long b(long j8) {
        long b8 = this.f19331x[0].b(j8);
        int i8 = 1;
        while (true) {
            EG0[] eg0Arr = this.f19331x;
            if (i8 >= eg0Arr.length) {
                return b8;
            }
            if (eg0Arr[i8].b(b8) != b8) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final void c(long j8) {
        this.f19332y.c(j8);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long d() {
        long j8 = -9223372036854775807L;
        for (EG0 eg0 : this.f19331x) {
            long d8 = eg0.d();
            if (d8 == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && eg0.b(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (EG0 eg02 : this.f19331x) {
                    if (eg02 == eg0) {
                        break;
                    }
                    if (eg02.b(d8) != d8) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = d8;
            } else if (d8 != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final JH0 e() {
        JH0 jh0 = this.f19330w;
        jh0.getClass();
        return jh0;
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean f(Yz0 yz0) {
        if (this.f19327t.isEmpty()) {
            return this.f19332y.f(yz0);
        }
        int size = this.f19327t.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((EG0) this.f19327t.get(i8)).f(yz0);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4787zH0
    public final /* bridge */ /* synthetic */ void g(BH0 bh0) {
        DG0 dg0 = this.f19329v;
        dg0.getClass();
        dg0.g(this);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long h(long j8, FA0 fa0) {
        EG0[] eg0Arr = this.f19331x;
        return (eg0Arr.length > 0 ? eg0Arr[0] : this.f19325o[0]).h(j8, fa0);
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void i() {
        int i8 = 0;
        while (true) {
            EG0[] eg0Arr = this.f19325o;
            if (i8 >= eg0Arr.length) {
                return;
            }
            eg0Arr[i8].i();
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void j(long j8, boolean z7) {
        for (EG0 eg0 : this.f19331x) {
            eg0.j(j8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.DG0
    public final void k(EG0 eg0) {
        this.f19327t.remove(eg0);
        if (!this.f19327t.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (EG0 eg02 : this.f19325o) {
            i8 += eg02.e().f16221a;
        }
        C4614xm[] c4614xmArr = new C4614xm[i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            EG0[] eg0Arr = this.f19325o;
            if (i9 >= eg0Arr.length) {
                this.f19330w = new JH0(c4614xmArr);
                DG0 dg0 = this.f19329v;
                dg0.getClass();
                dg0.k(this);
                return;
            }
            JH0 e8 = eg0Arr[i9].e();
            int i11 = e8.f16221a;
            int i12 = 0;
            while (i12 < i11) {
                C4614xm b8 = e8.b(i12);
                D[] dArr = new D[b8.f27902a];
                for (int i13 = 0; i13 < b8.f27902a; i13++) {
                    D b9 = b8.b(i13);
                    C2723gJ0 b10 = b9.b();
                    String str = b9.f14320a;
                    if (str == null) {
                        str = "";
                    }
                    b10.m(i9 + ":" + str);
                    dArr[i13] = b10.H();
                }
                C4614xm c4614xm = new C4614xm(i9 + ":" + b8.f27903b, dArr);
                this.f19328u.put(c4614xm, b8);
                c4614xmArr[i10] = c4614xm;
                i12++;
                i10++;
            }
            i9++;
        }
    }

    public final EG0 l(int i8) {
        EG0 eg0 = this.f19325o[i8];
        return eg0 instanceof GH0 ? ((GH0) eg0).l() : eg0;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final long n(BI0[] bi0Arr, boolean[] zArr, InterfaceC4678yH0[] interfaceC4678yH0Arr, boolean[] zArr2, long j8) {
        int length;
        int length2 = bi0Arr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            length = bi0Arr.length;
            if (i9 >= length) {
                break;
            }
            InterfaceC4678yH0 interfaceC4678yH0 = interfaceC4678yH0Arr[i9];
            Integer num = interfaceC4678yH0 != null ? (Integer) this.f19326s.get(interfaceC4678yH0) : null;
            iArr[i9] = num == null ? -1 : num.intValue();
            BI0 bi0 = bi0Arr[i9];
            if (bi0 != null) {
                String str = bi0.g().f27903b;
                iArr2[i9] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i9] = -1;
            }
            i9++;
        }
        this.f19326s.clear();
        InterfaceC4678yH0[] interfaceC4678yH0Arr2 = new InterfaceC4678yH0[length];
        InterfaceC4678yH0[] interfaceC4678yH0Arr3 = new InterfaceC4678yH0[length];
        BI0[] bi0Arr2 = new BI0[length];
        ArrayList arrayList = new ArrayList(this.f19325o.length);
        long j9 = j8;
        int i10 = 0;
        while (i10 < this.f19325o.length) {
            for (int i11 = i8; i11 < bi0Arr.length; i11++) {
                interfaceC4678yH0Arr3[i11] = iArr[i11] == i10 ? interfaceC4678yH0Arr[i11] : null;
                if (iArr2[i11] == i10) {
                    BI0 bi02 = bi0Arr[i11];
                    bi02.getClass();
                    C4614xm c4614xm = (C4614xm) this.f19328u.get(bi02.g());
                    c4614xm.getClass();
                    bi0Arr2[i11] = new TG0(bi02, c4614xm);
                } else {
                    bi0Arr2[i11] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            BI0[] bi0Arr3 = bi0Arr2;
            InterfaceC4678yH0[] interfaceC4678yH0Arr4 = interfaceC4678yH0Arr3;
            long n8 = this.f19325o[i10].n(bi0Arr2, zArr, interfaceC4678yH0Arr3, zArr2, j9);
            if (i10 == 0) {
                j9 = n8;
            } else if (n8 != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < bi0Arr.length; i12++) {
                if (iArr2[i12] == i10) {
                    InterfaceC4678yH0 interfaceC4678yH02 = interfaceC4678yH0Arr4[i12];
                    interfaceC4678yH02.getClass();
                    interfaceC4678yH0Arr2[i12] = interfaceC4678yH02;
                    this.f19326s.put(interfaceC4678yH02, Integer.valueOf(i10));
                    z7 = true;
                } else if (iArr[i12] == i10) {
                    AbstractC3796qC.f(interfaceC4678yH0Arr4[i12] == null);
                }
            }
            if (z7) {
                arrayList2.add(this.f19325o[i10]);
            }
            i10++;
            arrayList = arrayList2;
            bi0Arr2 = bi0Arr3;
            interfaceC4678yH0Arr3 = interfaceC4678yH0Arr4;
            i8 = 0;
        }
        int i13 = i8;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(interfaceC4678yH0Arr2, i13, interfaceC4678yH0Arr, i13, length);
        this.f19331x = (EG0[]) arrayList3.toArray(new EG0[i13]);
        this.f19332y = new C3696pG0(arrayList3, AbstractC1487Kh0.b(arrayList3, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.SG0
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return ((EG0) obj).e().c();
            }
        }));
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.EG0
    public final void o(DG0 dg0, long j8) {
        this.f19329v = dg0;
        Collections.addAll(this.f19327t, this.f19325o);
        int i8 = 0;
        while (true) {
            EG0[] eg0Arr = this.f19325o;
            if (i8 >= eg0Arr.length) {
                return;
            }
            eg0Arr[i8].o(this, j8);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final boolean p() {
        return this.f19332y.p();
    }

    @Override // com.google.android.gms.internal.ads.EG0, com.google.android.gms.internal.ads.BH0
    public final long zzb() {
        return this.f19332y.zzb();
    }
}
