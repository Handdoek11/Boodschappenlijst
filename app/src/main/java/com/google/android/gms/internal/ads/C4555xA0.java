package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4555xA0 extends AbstractC4639xy0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f27759k = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f27760d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27761e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f27762f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f27763g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC1981Yl[] f27764h;

    /* renamed from: i, reason: collision with root package name */
    private final Object[] f27765i;

    /* renamed from: j, reason: collision with root package name */
    private final HashMap f27766j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4555xA0(Collection collection, CH0 ch0) {
        AbstractC1981Yl[] abstractC1981YlArr = new AbstractC1981Yl[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            abstractC1981YlArr[i9] = ((InterfaceC2487eA0) it.next()).zza();
            i9++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i8] = ((InterfaceC2487eA0) it2.next()).zzb();
            i8++;
        }
        this(abstractC1981YlArr, objArr, ch0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int b() {
        return this.f27761e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int c() {
        return this.f27760d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final int p(Object obj) {
        Integer num = (Integer) this.f27766j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final int q(int i8) {
        return AbstractC2301cW.u(this.f27762f, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final int r(int i8) {
        return AbstractC2301cW.u(this.f27763g, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final int s(int i8) {
        return this.f27762f[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final int t(int i8) {
        return this.f27763g[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final AbstractC1981Yl u(int i8) {
        return this.f27764h[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4639xy0
    protected final Object v(int i8) {
        return this.f27765i[i8];
    }

    final List y() {
        return Arrays.asList(this.f27764h);
    }

    public final C4555xA0 z(CH0 ch0) {
        AbstractC1981Yl[] abstractC1981YlArr = new AbstractC1981Yl[this.f27764h.length];
        int i8 = 0;
        while (true) {
            AbstractC1981Yl[] abstractC1981YlArr2 = this.f27764h;
            if (i8 >= abstractC1981YlArr2.length) {
                return new C4555xA0(abstractC1981YlArr, this.f27765i, ch0);
            }
            abstractC1981YlArr[i8] = new C4446wA0(this, abstractC1981YlArr2[i8]);
            i8++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C4555xA0(AbstractC1981Yl[] abstractC1981YlArr, Object[] objArr, CH0 ch0) {
        super(false, ch0);
        int i8 = 0;
        this.f27764h = abstractC1981YlArr;
        int length = abstractC1981YlArr.length;
        this.f27762f = new int[length];
        this.f27763g = new int[length];
        this.f27765i = objArr;
        this.f27766j = new HashMap();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < abstractC1981YlArr.length) {
            AbstractC1981Yl abstractC1981Yl = abstractC1981YlArr[i8];
            this.f27764h[i11] = abstractC1981Yl;
            this.f27763g[i11] = i9;
            this.f27762f[i11] = i10;
            i9 += abstractC1981Yl.c();
            i10 += this.f27764h[i11].b();
            this.f27766j.put(objArr[i11], Integer.valueOf(i11));
            i8++;
            i11++;
        }
        this.f27760d = i9;
        this.f27761e = i10;
    }
}
