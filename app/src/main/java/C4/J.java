package c4;

import c4.AbstractC1013p;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
final class J extends AbstractC1013p {

    /* renamed from: y, reason: collision with root package name */
    static final AbstractC1013p f12134y = new J(null, new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    private final transient Object f12135v;

    /* renamed from: w, reason: collision with root package name */
    final transient Object[] f12136w;

    /* renamed from: x, reason: collision with root package name */
    private final transient int f12137x;

    static class a extends r {

        /* renamed from: t, reason: collision with root package name */
        private final transient AbstractC1013p f12138t;

        /* renamed from: u, reason: collision with root package name */
        private final transient Object[] f12139u;

        /* renamed from: v, reason: collision with root package name */
        private final transient int f12140v;

        /* renamed from: w, reason: collision with root package name */
        private final transient int f12141w;

        /* renamed from: c4.J$a$a, reason: collision with other inner class name */
        class C0206a extends AbstractC1012o {
            C0206a() {
            }

            @Override // java.util.List
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i8) {
                b4.h.g(i8, a.this.f12141w);
                int i9 = i8 * 2;
                Object obj = a.this.f12139u[a.this.f12140v + i9];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f12139u[i9 + (a.this.f12140v ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // c4.AbstractC1011n
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f12141w;
            }
        }

        a(AbstractC1013p abstractC1013p, Object[] objArr, int i8, int i9) {
            this.f12138t = abstractC1013p;
            this.f12139u = objArr;
            this.f12140v = i8;
            this.f12141w = i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return n().iterator();
        }

        @Override // c4.AbstractC1011n
        int b(Object[] objArr, int i8) {
            return n().b(objArr, i8);
        }

        @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f12138t.get(key));
        }

        @Override // c4.AbstractC1011n
        boolean j() {
            return true;
        }

        @Override // c4.r
        AbstractC1012o r() {
            return new C0206a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12141w;
        }
    }

    static final class b extends r {

        /* renamed from: t, reason: collision with root package name */
        private final transient AbstractC1013p f12143t;

        /* renamed from: u, reason: collision with root package name */
        private final transient AbstractC1012o f12144u;

        b(AbstractC1013p abstractC1013p, AbstractC1012o abstractC1012o) {
            this.f12143t = abstractC1013p;
            this.f12144u = abstractC1012o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return n().iterator();
        }

        @Override // c4.AbstractC1011n
        int b(Object[] objArr, int i8) {
            return n().b(objArr, i8);
        }

        @Override // c4.AbstractC1011n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12143t.get(obj) != null;
        }

        @Override // c4.AbstractC1011n
        boolean j() {
            return true;
        }

        @Override // c4.r
        public AbstractC1012o n() {
            return this.f12144u;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12143t.size();
        }
    }

    static final class c extends AbstractC1012o {

        /* renamed from: t, reason: collision with root package name */
        private final transient Object[] f12145t;

        /* renamed from: u, reason: collision with root package name */
        private final transient int f12146u;

        /* renamed from: v, reason: collision with root package name */
        private final transient int f12147v;

        c(Object[] objArr, int i8, int i9) {
            this.f12145t = objArr;
            this.f12146u = i8;
            this.f12147v = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            b4.h.g(i8, this.f12147v);
            Object obj = this.f12145t[(i8 * 2) + this.f12146u];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // c4.AbstractC1011n
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12147v;
        }
    }

    private J(Object obj, Object[] objArr, int i8) {
        this.f12135v = obj;
        this.f12136w = objArr;
        this.f12137x = i8;
    }

    static J i(int i8, Object[] objArr, AbstractC1013p.a aVar) {
        if (i8 == 0) {
            return (J) f12134y;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC1004g.a(obj, obj2);
            return new J(null, objArr, 1);
        }
        b4.h.k(i8, objArr.length >> 1);
        Object j8 = j(objArr, i8, r.o(i8), 0);
        if (j8 instanceof Object[]) {
            Object[] objArr2 = (Object[]) j8;
            AbstractC1013p.a.C0209a c0209a = (AbstractC1013p.a.C0209a) objArr2[2];
            if (aVar == null) {
                throw c0209a.a();
            }
            aVar.f12218e = c0209a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            j8 = obj3;
            i8 = intValue;
        }
        return new J(j8, objArr, i8);
    }

    private static Object j(Object[] objArr, int i8, int i9, int i10) {
        AbstractC1013p.a.C0209a c0209a = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC1004g.a(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC1004g.a(obj3, obj4);
                int b8 = AbstractC1010m.b(obj3.hashCode());
                while (true) {
                    int i17 = b8 & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            c0209a = new AbstractC1013p.a.C0209a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        b8 = i17 + 1;
                    }
                }
            }
            return i13 == i8 ? bArr : new Object[]{bArr, Integer.valueOf(i13), c0209a};
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC1004g.a(obj6, obj7);
                int b9 = AbstractC1010m.b(obj6.hashCode());
                while (true) {
                    int i24 = b9 & i11;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            c0209a = new AbstractC1013p.a.C0209a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        b9 = i24 + 1;
                    }
                }
            }
            return i20 == i8 ? sArr : new Object[]{sArr, Integer.valueOf(i20), c0209a};
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC1004g.a(obj9, obj10);
            int b10 = AbstractC1010m.b(obj9.hashCode());
            while (true) {
                int i31 = b10 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        c0209a = new AbstractC1013p.a.C0209a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    b10 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        return i28 == i8 ? iArr : new Object[]{iArr, Integer.valueOf(i28), c0209a};
    }

    static Object k(Object obj, Object[] objArr, int i8, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b8 = AbstractC1010m.b(obj2.hashCode());
            while (true) {
                int i10 = b8 & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                b8 = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b9 = AbstractC1010m.b(obj2.hashCode());
            while (true) {
                int i12 = b9 & length2;
                int i13 = sArr[i12] & 65535;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                b9 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b10 = AbstractC1010m.b(obj2.hashCode());
            while (true) {
                int i14 = b10 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                b10 = i14 + 1;
            }
        }
    }

    @Override // c4.AbstractC1013p
    r a() {
        return new a(this, this.f12136w, 0, this.f12137x);
    }

    @Override // c4.AbstractC1013p
    r b() {
        return new b(this, new c(this.f12136w, 0, this.f12137x));
    }

    @Override // c4.AbstractC1013p
    AbstractC1011n d() {
        return new c(this.f12136w, 1, this.f12137x);
    }

    @Override // c4.AbstractC1013p, java.util.Map
    public Object get(Object obj) {
        Object k8 = k(this.f12135v, this.f12136w, this.f12137x, 0, obj);
        if (k8 == null) {
            return null;
        }
        return k8;
    }

    @Override // java.util.Map
    public int size() {
        return this.f12137x;
    }
}
