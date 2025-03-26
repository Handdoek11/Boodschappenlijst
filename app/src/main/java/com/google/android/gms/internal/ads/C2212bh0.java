package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2212bh0 extends AbstractMap implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private static final Object f20911A = new Object();

    /* renamed from: o, reason: collision with root package name */
    private transient Object f20912o;

    /* renamed from: s, reason: collision with root package name */
    transient int[] f20913s;

    /* renamed from: t, reason: collision with root package name */
    transient Object[] f20914t;

    /* renamed from: u, reason: collision with root package name */
    transient Object[] f20915u;

    /* renamed from: v, reason: collision with root package name */
    private transient int f20916v;

    /* renamed from: w, reason: collision with root package name */
    private transient int f20917w;

    /* renamed from: x, reason: collision with root package name */
    private transient Set f20918x;

    /* renamed from: y, reason: collision with root package name */
    private transient Set f20919y;

    /* renamed from: z, reason: collision with root package name */
    private transient Collection f20920z;

    C2212bh0(int i8) {
        t(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(Object obj) {
        if (v()) {
            return -1;
        }
        int b8 = AbstractC3298lh0.b(obj);
        int z7 = z();
        Object obj2 = this.f20912o;
        Objects.requireNonNull(obj2);
        int c8 = AbstractC2320ch0.c(obj2, b8 & z7);
        if (c8 != 0) {
            int i8 = ~z7;
            int i9 = b8 & i8;
            do {
                int i10 = c8 - 1;
                int i11 = a()[i10];
                if ((i11 & i8) == i9 && AbstractC1657Pf0.a(obj, b()[i10])) {
                    return i10;
                }
                c8 = i11 & z7;
            } while (c8 != 0);
        }
        return -1;
    }

    private final int B(int i8, int i9, int i10, int i11) {
        int i12 = i9 - 1;
        Object d8 = AbstractC2320ch0.d(i9);
        if (i11 != 0) {
            AbstractC2320ch0.e(d8, i10 & i12, i11 + 1);
        }
        Object obj = this.f20912o;
        Objects.requireNonNull(obj);
        int[] a8 = a();
        for (int i13 = 0; i13 <= i8; i13++) {
            int c8 = AbstractC2320ch0.c(obj, i13);
            while (c8 != 0) {
                int i14 = c8 - 1;
                int i15 = a8[i14];
                int i16 = ((~i8) & i15) | i13;
                int i17 = i16 & i12;
                int c9 = AbstractC2320ch0.c(d8, i17);
                AbstractC2320ch0.e(d8, i17, c8);
                a8[i14] = ((~i12) & i16) | (c9 & i12);
                c8 = i15 & i8;
            }
        }
        this.f20912o = d8;
        D(i12);
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object C(Object obj) {
        if (!v()) {
            int z7 = z();
            Object obj2 = this.f20912o;
            Objects.requireNonNull(obj2);
            int b8 = AbstractC2320ch0.b(obj, null, z7, obj2, a(), b(), null);
            if (b8 != -1) {
                Object obj3 = d()[b8];
                u(b8, z7);
                this.f20917w--;
                s();
                return obj3;
            }
        }
        return f20911A;
    }

    private final void D(int i8) {
        this.f20916v = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f20916v & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] a() {
        int[] iArr = this.f20913s;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] b() {
        Object[] objArr = this.f20914t;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] d() {
        Object[] objArr = this.f20915u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    static /* synthetic */ Object k(C2212bh0 c2212bh0, int i8) {
        return c2212bh0.b()[i8];
    }

    static /* synthetic */ Object m(C2212bh0 c2212bh0) {
        Object obj = c2212bh0.f20912o;
        Objects.requireNonNull(obj);
        return obj;
    }

    static /* synthetic */ Object n(C2212bh0 c2212bh0, int i8) {
        return c2212bh0.d()[i8];
    }

    static /* synthetic */ void r(C2212bh0 c2212bh0, int i8, Object obj) {
        c2212bh0.d()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z() {
        return (1 << (this.f20916v & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (v()) {
            return;
        }
        s();
        Map p8 = p();
        if (p8 != null) {
            this.f20916v = AbstractC1943Xi0.c(size(), 3, 1073741823);
            p8.clear();
            this.f20912o = null;
            this.f20917w = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f20917w, (Object) null);
        Arrays.fill(d(), 0, this.f20917w, (Object) null);
        Object obj = this.f20912o;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f20917w, 0);
        this.f20917w = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map p8 = p();
        return p8 != null ? p8.containsKey(obj) : A(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map p8 = p();
        if (p8 != null) {
            return p8.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f20917w; i8++) {
            if (AbstractC1657Pf0.a(obj, d()[i8])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20919y;
        if (set != null) {
            return set;
        }
        C1869Vg0 c1869Vg0 = new C1869Vg0(this);
        this.f20919y = c1869Vg0;
        return c1869Vg0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map p8 = p();
        if (p8 != null) {
            return p8.get(obj);
        }
        int A7 = A(obj);
        if (A7 == -1) {
            return null;
        }
        return d()[A7];
    }

    final int i() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final int j(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f20917w) {
            return i9;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f20918x;
        if (set != null) {
            return set;
        }
        C1939Xg0 c1939Xg0 = new C1939Xg0(this);
        this.f20918x = c1939Xg0;
        return c1939Xg0;
    }

    final Map p() {
        Object obj = this.f20912o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (v()) {
            AbstractC1762Sf0.m(v(), "Arrays already allocated");
            int i8 = this.f20916v;
            int max = Math.max(i8 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f20912o = AbstractC2320ch0.d(max2);
            D(max2 - 1);
            this.f20913s = new int[i8];
            this.f20914t = new Object[i8];
            this.f20915u = new Object[i8];
        }
        Map p8 = p();
        if (p8 != null) {
            return p8.put(obj, obj2);
        }
        int[] a8 = a();
        Object[] b8 = b();
        Object[] d8 = d();
        int i9 = this.f20917w;
        int i10 = i9 + 1;
        int b9 = AbstractC3298lh0.b(obj);
        int z7 = z();
        int i11 = b9 & z7;
        Object obj3 = this.f20912o;
        Objects.requireNonNull(obj3);
        int c8 = AbstractC2320ch0.c(obj3, i11);
        if (c8 != 0) {
            int i12 = ~z7;
            int i13 = b9 & i12;
            int i14 = 0;
            while (true) {
                int i15 = c8 - 1;
                int i16 = a8[i15];
                int i17 = i16 & i12;
                if (i17 == i13 && AbstractC1657Pf0.a(obj, b8[i15])) {
                    Object obj4 = d8[i15];
                    d8[i15] = obj2;
                    return obj4;
                }
                int i18 = i16 & z7;
                i14++;
                if (i18 != 0) {
                    c8 = i18;
                } else {
                    if (i14 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(z() + 1, 1.0f);
                        int i19 = i();
                        while (i19 >= 0) {
                            linkedHashMap.put(b()[i19], d()[i19]);
                            i19 = j(i19);
                        }
                        this.f20912o = linkedHashMap;
                        this.f20913s = null;
                        this.f20914t = null;
                        this.f20915u = null;
                        s();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i10 > z7) {
                        z7 = B(z7, AbstractC2320ch0.a(z7), b9, i9);
                    } else {
                        a8[i15] = (i10 & z7) | i17;
                    }
                }
            }
        } else if (i10 > z7) {
            z7 = B(z7, AbstractC2320ch0.a(z7), b9, i9);
        } else {
            Object obj5 = this.f20912o;
            Objects.requireNonNull(obj5);
            AbstractC2320ch0.e(obj5, i11, i10);
        }
        int length = a().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f20913s = Arrays.copyOf(a(), min);
            this.f20914t = Arrays.copyOf(b(), min);
            this.f20915u = Arrays.copyOf(d(), min);
        }
        a()[i9] = (~z7) & b9;
        b()[i9] = obj;
        d()[i9] = obj2;
        this.f20917w = i10;
        s();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map p8 = p();
        if (p8 != null) {
            return p8.remove(obj);
        }
        Object C7 = C(obj);
        if (C7 == f20911A) {
            return null;
        }
        return C7;
    }

    final void s() {
        this.f20916v += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map p8 = p();
        return p8 != null ? p8.size() : this.f20917w;
    }

    final void t(int i8) {
        this.f20916v = AbstractC1943Xi0.c(i8, 1, 1073741823);
    }

    final void u(int i8, int i9) {
        Object obj = this.f20912o;
        Objects.requireNonNull(obj);
        int[] a8 = a();
        Object[] b8 = b();
        Object[] d8 = d();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            b8[i8] = null;
            d8[i8] = null;
            a8[i8] = 0;
            return;
        }
        int i11 = i8 + 1;
        Object obj2 = b8[i10];
        b8[i8] = obj2;
        d8[i8] = d8[i10];
        b8[i10] = null;
        d8[i10] = null;
        a8[i8] = a8[i10];
        a8[i10] = 0;
        int b9 = AbstractC3298lh0.b(obj2) & i9;
        int c8 = AbstractC2320ch0.c(obj, b9);
        if (c8 == size) {
            AbstractC2320ch0.e(obj, b9, i11);
            return;
        }
        while (true) {
            int i12 = c8 - 1;
            int i13 = a8[i12];
            int i14 = i13 & i9;
            if (i14 == size) {
                a8[i12] = (i13 & (~i9)) | (i9 & i11);
                return;
            }
            c8 = i14;
        }
    }

    final boolean v() {
        return this.f20912o == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f20920z;
        if (collection != null) {
            return collection;
        }
        C2009Zg0 c2009Zg0 = new C2009Zg0(this);
        this.f20920z = c2009Zg0;
        return c2009Zg0;
    }
}
