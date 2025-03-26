package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class XG0 extends AbstractC3478nG0 {

    /* renamed from: s, reason: collision with root package name */
    private static final E7 f20017s;

    /* renamed from: k, reason: collision with root package name */
    private final IG0[] f20018k;

    /* renamed from: l, reason: collision with root package name */
    private final List f20019l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC1981Yl[] f20020m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList f20021n;

    /* renamed from: o, reason: collision with root package name */
    private int f20022o = -1;

    /* renamed from: p, reason: collision with root package name */
    private long[][] f20023p;

    /* renamed from: q, reason: collision with root package name */
    private zzuv f20024q;

    /* renamed from: r, reason: collision with root package name */
    private final C3805qG0 f20025r;

    static {
        F1 f12 = new F1();
        f12.a("MergingMediaSource");
        f20017s = f12.c();
    }

    public XG0(boolean z7, boolean z8, C3805qG0 c3805qG0, IG0... ig0Arr) {
        this.f20018k = ig0Arr;
        this.f20025r = c3805qG0;
        this.f20021n = new ArrayList(Arrays.asList(ig0Arr));
        this.f20019l = new ArrayList(ig0Arr.length);
        int i8 = 0;
        while (true) {
            int length = ig0Arr.length;
            if (i8 >= length) {
                this.f20020m = new AbstractC1981Yl[length];
                this.f20023p = new long[0][];
                new HashMap();
                AbstractC2011Zh0.a(8).b(2).c();
                return;
            }
            this.f20019l.add(new ArrayList());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* bridge */ /* synthetic */ GG0 C(Object obj, GG0 gg0) {
        List list = (List) this.f20019l.get(((Integer) obj).intValue());
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (((VG0) list.get(i8)).f19576a.equals(gg0)) {
                return ((VG0) ((List) this.f20019l.get(0)).get(i8)).f19576a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final E7 G() {
        IG0[] ig0Arr = this.f20018k;
        return ig0Arr.length > 0 ? ig0Arr[0].G() : f20017s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.IG0
    public final void I() {
        zzuv zzuvVar = this.f20024q;
        if (zzuvVar != null) {
            throw zzuvVar;
        }
        super.I();
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void b(EG0 eg0) {
        UG0 ug0 = (UG0) eg0;
        for (int i8 = 0; i8 < this.f20018k.length; i8++) {
            List list = (List) this.f20019l.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (((VG0) list.get(i9)).f19577b.equals(eg0)) {
                    list.remove(i9);
                    break;
                }
                i9++;
            }
            this.f20018k[i8].b(ug0.l(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0, com.google.android.gms.internal.ads.IG0
    public final void c(E7 e72) {
        this.f20018k[0].c(e72);
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final EG0 e(GG0 gg0, RI0 ri0, long j8) {
        AbstractC1981Yl[] abstractC1981YlArr = this.f20020m;
        int length = this.f20018k.length;
        EG0[] eg0Arr = new EG0[length];
        int a8 = abstractC1981YlArr[0].a(gg0.f15340a);
        for (int i8 = 0; i8 < length; i8++) {
            GG0 a9 = gg0.a(this.f20020m[i8].f(a8));
            eg0Arr[i8] = this.f20018k[i8].e(a9, ri0, j8 - this.f20023p[a8][i8]);
            ((List) this.f20019l.get(i8)).add(new VG0(a9, eg0Arr[i8], null));
        }
        return new UG0(this.f20025r, this.f20023p[a8], eg0Arr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void t(Wu0 wu0) {
        super.t(wu0);
        int i8 = 0;
        while (true) {
            IG0[] ig0Arr = this.f20018k;
            if (i8 >= ig0Arr.length) {
                return;
            }
            z(Integer.valueOf(i8), ig0Arr[i8]);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void w() {
        super.w();
        Arrays.fill(this.f20020m, (Object) null);
        this.f20022o = -1;
        this.f20024q = null;
        this.f20021n.clear();
        Collections.addAll(this.f20021n, this.f20018k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* bridge */ /* synthetic */ void y(Object obj, IG0 ig0, AbstractC1981Yl abstractC1981Yl) {
        int i8;
        Integer num = (Integer) obj;
        if (this.f20024q != null) {
            return;
        }
        if (this.f20022o == -1) {
            i8 = abstractC1981Yl.b();
            this.f20022o = i8;
        } else {
            int b8 = abstractC1981Yl.b();
            int i9 = this.f20022o;
            if (b8 != i9) {
                this.f20024q = new zzuv(0);
                return;
            }
            i8 = i9;
        }
        if (this.f20023p.length == 0) {
            this.f20023p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i8, this.f20020m.length);
        }
        this.f20021n.remove(ig0);
        this.f20020m[num.intValue()] = abstractC1981Yl;
        if (this.f20021n.isEmpty()) {
            v(this.f20020m[0]);
        }
    }
}
