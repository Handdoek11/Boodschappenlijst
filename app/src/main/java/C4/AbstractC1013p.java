package c4;

import c4.AbstractC1011n;
import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: c4.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1013p implements Map, Serializable, j$.util.Map {

    /* renamed from: u, reason: collision with root package name */
    static final Map.Entry[] f12210u = new Map.Entry[0];

    /* renamed from: o, reason: collision with root package name */
    private transient r f12211o;

    /* renamed from: s, reason: collision with root package name */
    private transient r f12212s;

    /* renamed from: t, reason: collision with root package name */
    private transient AbstractC1011n f12213t;

    /* renamed from: c4.p$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Comparator f12214a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f12215b;

        /* renamed from: c, reason: collision with root package name */
        int f12216c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f12217d = false;

        /* renamed from: e, reason: collision with root package name */
        C0209a f12218e;

        /* renamed from: c4.p$a$a, reason: collision with other inner class name */
        static final class C0209a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f12219a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f12220b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f12221c;

            C0209a(Object obj, Object obj2, Object obj3) {
                this.f12219a = obj;
                this.f12220b = obj2;
                this.f12221c = obj3;
            }

            IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f12219a);
                String valueOf2 = String.valueOf(this.f12220b);
                String valueOf3 = String.valueOf(this.f12219a);
                String valueOf4 = String.valueOf(this.f12221c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        a(int i8) {
            this.f12215b = new Object[i8 * 2];
        }

        private AbstractC1013p a(boolean z7) {
            Object[] objArr;
            C0209a c0209a;
            C0209a c0209a2;
            if (z7 && (c0209a2 = this.f12218e) != null) {
                throw c0209a2.a();
            }
            int i8 = this.f12216c;
            if (this.f12214a == null) {
                objArr = this.f12215b;
            } else {
                if (this.f12217d) {
                    this.f12215b = Arrays.copyOf(this.f12215b, i8 * 2);
                }
                objArr = this.f12215b;
                if (!z7) {
                    objArr = d(objArr, this.f12216c);
                    if (objArr.length < this.f12215b.length) {
                        i8 = objArr.length >>> 1;
                    }
                }
                f(objArr, i8, this.f12214a);
            }
            this.f12217d = true;
            J i9 = J.i(i8, objArr, this);
            if (!z7 || (c0209a = this.f12218e) == null) {
                return i9;
            }
            throw c0209a.a();
        }

        private void c(int i8) {
            int i9 = i8 * 2;
            Object[] objArr = this.f12215b;
            if (i9 > objArr.length) {
                this.f12215b = Arrays.copyOf(objArr, AbstractC1011n.b.a(objArr.length, i9));
                this.f12217d = false;
            }
        }

        private Object[] d(Object[] objArr, int i8) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                Object obj = objArr[i9 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i9);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i8 - bitSet.cardinality()) * 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8 * 2) {
                if (bitSet.get(i10 >>> 1)) {
                    i10 += 2;
                } else {
                    int i12 = i11 + 1;
                    int i13 = i10 + 1;
                    Object obj2 = objArr[i10];
                    Objects.requireNonNull(obj2);
                    objArr2[i11] = obj2;
                    i11 += 2;
                    i10 += 2;
                    Object obj3 = objArr[i13];
                    Objects.requireNonNull(obj3);
                    objArr2[i12] = obj3;
                }
            }
            return objArr2;
        }

        static void f(Object[] objArr, int i8, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                int i10 = i9 * 2;
                Object obj = objArr[i10];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i10 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i9] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i8, G.a(comparator).e(z.d()));
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i11 * 2;
                objArr[i12] = entryArr[i11].getKey();
                objArr[i12 + 1] = entryArr[i11].getValue();
            }
        }

        public AbstractC1013p b() {
            return a(true);
        }

        public a e(Object obj, Object obj2) {
            c(this.f12216c + 1);
            AbstractC1004g.a(obj, obj2);
            Object[] objArr = this.f12215b;
            int i8 = this.f12216c;
            objArr[i8 * 2] = obj;
            objArr[(i8 * 2) + 1] = obj2;
            this.f12216c = i8 + 1;
            return this;
        }
    }

    AbstractC1013p() {
    }

    public static AbstractC1013p g() {
        return J.f12134y;
    }

    abstract r a();

    abstract r b();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC1011n d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public r entrySet() {
        r rVar = this.f12211o;
        if (rVar != null) {
            return rVar;
        }
        r a8 = a();
        this.f12211o = a8;
        return a8;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return z.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r keySet() {
        r rVar = this.f12212s;
        if (rVar != null) {
            return rVar;
        }
        r b8 = b();
        this.f12212s = b8;
        return b8;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC1011n values() {
        AbstractC1011n abstractC1011n = this.f12213t;
        if (abstractC1011n != null) {
            return abstractC1011n;
        }
        AbstractC1011n d8 = d();
        this.f12213t = d8;
        return d8;
    }

    @Override // java.util.Map
    public int hashCode() {
        return M.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return z.c(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
