package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.yh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4714yh0 extends AbstractC3625oh0 implements Set, j$.util.Set {

    /* renamed from: s, reason: collision with root package name */
    private transient AbstractC4169th0 f28168s;

    AbstractC4714yh0() {
    }

    public static AbstractC4714yh0 C(Object obj, Object obj2, Object obj3) {
        return L(3, obj, obj2, obj3);
    }

    public static AbstractC4714yh0 F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return L(5, obj, obj2, obj3, obj4, obj5);
    }

    public static AbstractC4714yh0 H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[9];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 3);
        return L(9, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC4714yh0 L(int i8, Object... objArr) {
        if (i8 == 0) {
            return C3300li0.f24373z;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new C4498wi0(obj);
        }
        int p8 = p(i8);
        Object[] objArr2 = new Object[p8];
        int i9 = p8 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            AbstractC2431di0.a(obj2, i12);
            int hashCode = obj2.hashCode();
            int a8 = AbstractC3298lh0.a(hashCode);
            while (true) {
                int i13 = a8 & i9;
                Object obj3 = objArr2[i13];
                if (obj3 == null) {
                    objArr[i11] = obj2;
                    objArr2[i13] = obj2;
                    i10 += hashCode;
                    i11++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    a8++;
                }
            }
        }
        Arrays.fill(objArr, i11, i8, (Object) null);
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new C4498wi0(obj4);
        }
        if (p(i11) < p8 / 2) {
            return L(i11, objArr);
        }
        if (N(i11, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new C3300li0(objArr, i10, objArr2, i9, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean N(int i8, int i9) {
        return i8 < (i9 >> 1) + (i9 >> 2);
    }

    static int p(int i8) {
        int max = Math.max(i8, 2);
        if (max >= 751619276) {
            AbstractC1762Sf0.f(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static C4605xh0 r(int i8) {
        return new C4605xh0(i8, true);
    }

    public static AbstractC4714yh0 t(Collection collection) {
        if ((collection instanceof AbstractC4714yh0) && !(collection instanceof SortedSet)) {
            AbstractC4714yh0 abstractC4714yh0 = (AbstractC4714yh0) collection;
            if (!abstractC4714yh0.n()) {
                return abstractC4714yh0;
            }
        }
        Object[] array = collection.toArray();
        return L(array.length, array);
    }

    public static AbstractC4714yh0 v(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? L(length, (Object[]) objArr.clone()) : new C4498wi0(objArr[0]) : C3300li0.f24373z;
    }

    public static AbstractC4714yh0 w() {
        return C3300li0.f24373z;
    }

    public static AbstractC4714yh0 x(Object obj) {
        return new C4498wi0(obj);
    }

    public static AbstractC4714yh0 y(Object obj, Object obj2) {
        return L(2, obj, obj2);
    }

    boolean J() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    public AbstractC4169th0 e() {
        AbstractC4169th0 abstractC4169th0 = this.f28168s;
        if (abstractC4169th0 != null) {
            return abstractC4169th0;
        }
        AbstractC4169th0 q8 = q();
        this.f28168s = q8;
        return q8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC4714yh0) && J() && ((AbstractC4714yh0) obj).J() && hashCode() != obj.hashCode()) {
            return false;
        }
        return AbstractC4389vi0.d(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC4389vi0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3625oh0
    public abstract AbstractC4825zi0 j();

    AbstractC4169th0 q() {
        Object[] array = toArray();
        int i8 = AbstractC4169th0.f26913t;
        return AbstractC4169th0.r(array, array.length);
    }
}
