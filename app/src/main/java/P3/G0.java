package p3;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class G0 extends B0 implements Set, j$.util.Set {

    /* renamed from: s, reason: collision with root package name */
    private transient F0 f40171s;

    G0() {
    }

    static int j(int i8) {
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

    public static G0 p() {
        return J0.f40181z;
    }

    public static G0 q(Object obj, Object obj2, Object obj3, Object obj4) {
        return s(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static G0 s(int i8, Object... objArr) {
        if (i8 == 0) {
            return J0.f40181z;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new K0(obj);
        }
        int j8 = j(i8);
        Object[] objArr2 = new Object[j8];
        int i9 = j8 - 1;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            Object obj2 = objArr[i12];
            if (obj2 == null) {
                throw new NullPointerException("at index " + i12);
            }
            int hashCode = obj2.hashCode();
            int a8 = A0.a(hashCode);
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
            return new K0(obj4);
        }
        if (j(i11) < j8 / 2) {
            return s(i11, objArr);
        }
        if (i11 < 3) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new J0(objArr, i10, objArr2, i9, i11);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof G0) && r() && ((G0) obj).r() && hashCode() != obj.hashCode()) {
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
    public abstract int hashCode();

    public final F0 n() {
        F0 f02 = this.f40171s;
        if (f02 != null) {
            return f02;
        }
        F0 o8 = o();
        this.f40171s = o8;
        return o8;
    }

    F0 o() {
        Object[] array = toArray();
        int i8 = F0.f40169t;
        return F0.n(array, array.length);
    }

    boolean r() {
        return false;
    }
}
