package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class Hv0 extends AbstractC3542nu0 {

    /* renamed from: y, reason: collision with root package name */
    static final int[] f15814y = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: t, reason: collision with root package name */
    private final int f15815t;

    /* renamed from: u, reason: collision with root package name */
    private final AbstractC3542nu0 f15816u;

    /* renamed from: v, reason: collision with root package name */
    private final AbstractC3542nu0 f15817v;

    /* renamed from: w, reason: collision with root package name */
    private final int f15818w;

    /* renamed from: x, reason: collision with root package name */
    private final int f15819x;

    static AbstractC3542nu0 O(AbstractC3542nu0 abstractC3542nu0, AbstractC3542nu0 abstractC3542nu02) {
        if (abstractC3542nu02.j() == 0) {
            return abstractC3542nu0;
        }
        if (abstractC3542nu0.j() == 0) {
            return abstractC3542nu02;
        }
        int j8 = abstractC3542nu0.j() + abstractC3542nu02.j();
        if (j8 < 128) {
            return P(abstractC3542nu0, abstractC3542nu02);
        }
        if (abstractC3542nu0 instanceof Hv0) {
            Hv0 hv0 = (Hv0) abstractC3542nu0;
            if (hv0.f15817v.j() + abstractC3542nu02.j() < 128) {
                return new Hv0(hv0.f15816u, P(hv0.f15817v, abstractC3542nu02));
            }
            if (hv0.f15816u.o() > hv0.f15817v.o() && hv0.f15819x > abstractC3542nu02.o()) {
                return new Hv0(hv0.f15816u, new Hv0(hv0.f15817v, abstractC3542nu02));
            }
        }
        return j8 >= Q(Math.max(abstractC3542nu0.o(), abstractC3542nu02.o()) + 1) ? new Hv0(abstractC3542nu0, abstractC3542nu02) : Ev0.a(new Ev0(null), abstractC3542nu0, abstractC3542nu02);
    }

    private static AbstractC3542nu0 P(AbstractC3542nu0 abstractC3542nu0, AbstractC3542nu0 abstractC3542nu02) {
        int j8 = abstractC3542nu0.j();
        int j9 = abstractC3542nu02.j();
        byte[] bArr = new byte[j8 + j9];
        abstractC3542nu0.L(bArr, 0, 0, j8);
        abstractC3542nu02.L(bArr, 0, j8, j9);
        return new C3215ku0(bArr);
    }

    static int Q(int i8) {
        int[] iArr = f15814y;
        int length = iArr.length;
        if (i8 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i8];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final byte c(int i8) {
        AbstractC3542nu0.J(i8, this.f15815t);
        return d(i8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    final byte d(int i8) {
        int i9 = this.f15818w;
        return i8 < i9 ? this.f15816u.d(i8) : this.f15817v.d(i8 - i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3542nu0)) {
            return false;
        }
        AbstractC3542nu0 abstractC3542nu0 = (AbstractC3542nu0) obj;
        if (this.f15815t != abstractC3542nu0.j()) {
            return false;
        }
        if (this.f15815t == 0) {
            return true;
        }
        int x7 = x();
        int x8 = abstractC3542nu0.x();
        if (x7 != 0 && x8 != 0 && x7 != x8) {
            return false;
        }
        Gv0 gv0 = null;
        Fv0 fv0 = new Fv0(this, gv0);
        AbstractC3106ju0 next = fv0.next();
        Fv0 fv02 = new Fv0(abstractC3542nu0, gv0);
        AbstractC3106ju0 next2 = fv02.next();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int j8 = next.j() - i8;
            int j9 = next2.j() - i9;
            int min = Math.min(j8, j9);
            if (!(i8 == 0 ? next.N(next2, i9, min) : next2.N(next, i8, min))) {
                return false;
            }
            i10 += min;
            int i11 = this.f15815t;
            if (i10 >= i11) {
                if (i10 == i11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == j8) {
                next = fv0.next();
                i8 = 0;
            } else {
                i8 += min;
                next = next;
            }
            if (min == j9) {
                next2 = fv02.next();
                i9 = 0;
            } else {
                i9 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Dv0(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final int j() {
        return this.f15815t;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final void n(byte[] bArr, int i8, int i9, int i10) {
        int i11 = i8 + i10;
        int i12 = this.f15818w;
        if (i11 <= i12) {
            this.f15816u.n(bArr, i8, i9, i10);
        } else {
            if (i8 >= i12) {
                this.f15817v.n(bArr, i8 - i12, i9, i10);
                return;
            }
            int i13 = i12 - i8;
            this.f15816u.n(bArr, i8, i9, i13);
            this.f15817v.n(bArr, 0, i9 + i13, i10 - i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final int o() {
        return this.f15819x;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final boolean p() {
        return this.f15815t >= Q(this.f15819x);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    protected final int q(int i8, int i9, int i10) {
        int i11 = i9 + i10;
        int i12 = this.f15818w;
        if (i11 <= i12) {
            return this.f15816u.q(i8, i9, i10);
        }
        if (i9 >= i12) {
            return this.f15817v.q(i8, i9 - i12, i10);
        }
        int i13 = i12 - i9;
        return this.f15817v.q(this.f15816u.q(i8, i9, i13), 0, i10 - i13);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final AbstractC3542nu0 r(int i8, int i9) {
        int w7 = AbstractC3542nu0.w(i8, i9, this.f15815t);
        if (w7 == 0) {
            return AbstractC3542nu0.f25048s;
        }
        if (w7 == this.f15815t) {
            return this;
        }
        int i10 = this.f15818w;
        if (i9 <= i10) {
            return this.f15816u.r(i8, i9);
        }
        if (i8 >= i10) {
            return this.f15817v.r(i8 - i10, i9 - i10);
        }
        AbstractC3542nu0 abstractC3542nu0 = this.f15816u;
        return new Hv0(abstractC3542nu0.r(i8, abstractC3542nu0.j()), this.f15817v.r(0, i9 - this.f15818w));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    public final AbstractC4086su0 s() {
        boolean z7 = true;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b8 = 0;
        Fv0 fv0 = new Fv0(this, null);
        while (fv0.hasNext()) {
            arrayList.add(fv0.next().t());
        }
        int i8 = AbstractC4086su0.f26753e;
        int i9 = 0;
        int i10 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i10 += byteBuffer.remaining();
            i9 = byteBuffer.hasArray() ? i9 | 1 : byteBuffer.isDirect() ? i9 | 2 : i9 | 4;
        }
        return i9 == 2 ? new C3760pu0(arrayList, i10, z7, b8 == true ? 1 : 0) : AbstractC4086su0.e(new C2240bv0(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    final void v(AbstractC2563eu0 abstractC2563eu0) {
        this.f15816u.v(abstractC2563eu0);
        this.f15817v.v(abstractC2563eu0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3542nu0
    /* renamed from: y */
    public final InterfaceC2997iu0 iterator() {
        return new Dv0(this);
    }

    private Hv0(AbstractC3542nu0 abstractC3542nu0, AbstractC3542nu0 abstractC3542nu02) {
        this.f15816u = abstractC3542nu0;
        this.f15817v = abstractC3542nu02;
        int j8 = abstractC3542nu0.j();
        this.f15818w = j8;
        this.f15815t = j8 + abstractC3542nu02.j();
        this.f15819x = Math.max(abstractC3542nu0.o(), abstractC3542nu02.o()) + 1;
    }
}
