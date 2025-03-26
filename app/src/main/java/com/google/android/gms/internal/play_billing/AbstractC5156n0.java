package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5156n0 extends AbstractC5084b0 implements Set, j$.util.Set {

    /* renamed from: s, reason: collision with root package name */
    private transient AbstractC5114g0 f29950s;

    AbstractC5156n0() {
    }

    static int o(int i8) {
        int max = Math.max(i8, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC5156n0 s(int i8, Object... objArr) {
        if (i8 == 0) {
            return J0.f29771z;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new M0(obj);
        }
        int o8 = o(i8);
        Object[] objArr2 = new Object[o8];
        int i9 = o8 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            AbstractC5209w0.a(obj2, i12);
            int hashCode = obj2.hashCode();
            int a8 = Y.a(hashCode);
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
            return new M0(obj4);
        }
        if (o(i11) < o8 / 2) {
            return s(i11, objArr);
        }
        int length = objArr.length;
        if (i11 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new J0(objArr, i10, objArr2, i9, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5084b0
    public AbstractC5114g0 e() {
        AbstractC5114g0 abstractC5114g0 = this.f29950s;
        if (abstractC5114g0 != null) {
            return abstractC5114g0;
        }
        AbstractC5114g0 p8 = p();
        this.f29950s = p8;
        return p8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5156n0) && r() && ((AbstractC5156n0) obj).r() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return L0.a(this);
    }

    AbstractC5114g0 p() {
        Object[] array = toArray();
        int i8 = AbstractC5114g0.f29907t;
        return AbstractC5114g0.q(array, array.length);
    }

    boolean r() {
        return false;
    }
}
