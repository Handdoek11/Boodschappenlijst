package c4;

import d4.AbstractC5723a;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: c4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C1006i extends AbstractMap implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private static final Object f12175A = new Object();

    /* renamed from: o, reason: collision with root package name */
    private transient Object f12176o;

    /* renamed from: s, reason: collision with root package name */
    transient int[] f12177s;

    /* renamed from: t, reason: collision with root package name */
    transient Object[] f12178t;

    /* renamed from: u, reason: collision with root package name */
    transient Object[] f12179u;

    /* renamed from: v, reason: collision with root package name */
    private transient int f12180v;

    /* renamed from: w, reason: collision with root package name */
    private transient int f12181w;

    /* renamed from: x, reason: collision with root package name */
    private transient Set f12182x;

    /* renamed from: y, reason: collision with root package name */
    private transient Set f12183y;

    /* renamed from: z, reason: collision with root package name */
    private transient Collection f12184z;

    /* renamed from: c4.i$a */
    class a extends e {
        a() {
            super(C1006i.this, null);
        }

        @Override // c4.C1006i.e
        Object b(int i8) {
            return C1006i.this.H(i8);
        }
    }

    /* renamed from: c4.i$b */
    class b extends e {
        b() {
            super(C1006i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // c4.C1006i.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i8) {
            return C1006i.this.new g(i8);
        }
    }

    /* renamed from: c4.i$c */
    class c extends e {
        c() {
            super(C1006i.this, null);
        }

        @Override // c4.C1006i.e
        Object b(int i8) {
            return C1006i.this.X(i8);
        }
    }

    /* renamed from: c4.i$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1006i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map x7 = C1006i.this.x();
            if (x7 != null) {
                return x7.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int E7 = C1006i.this.E(entry.getKey());
            return E7 != -1 && b4.f.a(C1006i.this.X(E7), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1006i.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map x7 = C1006i.this.x();
            if (x7 != null) {
                return x7.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C1006i.this.K()) {
                return false;
            }
            int C7 = C1006i.this.C();
            int f8 = AbstractC1007j.f(entry.getKey(), entry.getValue(), C7, C1006i.this.O(), C1006i.this.M(), C1006i.this.N(), C1006i.this.P());
            if (f8 == -1) {
                return false;
            }
            C1006i.this.J(f8, C7);
            C1006i.f(C1006i.this);
            C1006i.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1006i.this.size();
        }
    }

    /* renamed from: c4.i$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1006i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C1006i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1006i.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map x7 = C1006i.this.x();
            return x7 != null ? x7.keySet().remove(obj) : C1006i.this.L(obj) != C1006i.f12175A;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1006i.this.size();
        }
    }

    /* renamed from: c4.i$g */
    final class g extends AbstractC1000c {

        /* renamed from: o, reason: collision with root package name */
        private final Object f12194o;

        /* renamed from: s, reason: collision with root package name */
        private int f12195s;

        g(int i8) {
            this.f12194o = C1006i.this.H(i8);
            this.f12195s = i8;
        }

        private void a() {
            int i8 = this.f12195s;
            if (i8 == -1 || i8 >= C1006i.this.size() || !b4.f.a(this.f12194o, C1006i.this.H(this.f12195s))) {
                this.f12195s = C1006i.this.E(this.f12194o);
            }
        }

        @Override // c4.AbstractC1000c, java.util.Map.Entry
        public Object getKey() {
            return this.f12194o;
        }

        @Override // c4.AbstractC1000c, java.util.Map.Entry
        public Object getValue() {
            Map x7 = C1006i.this.x();
            if (x7 != null) {
                return AbstractC0996E.a(x7.get(this.f12194o));
            }
            a();
            int i8 = this.f12195s;
            return i8 == -1 ? AbstractC0996E.b() : C1006i.this.X(i8);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map x7 = C1006i.this.x();
            if (x7 != null) {
                return AbstractC0996E.a(x7.put(this.f12194o, obj));
            }
            a();
            int i8 = this.f12195s;
            if (i8 == -1) {
                C1006i.this.put(this.f12194o, obj);
                return AbstractC0996E.b();
            }
            Object X7 = C1006i.this.X(i8);
            C1006i.this.W(this.f12195s, obj);
            return X7;
        }
    }

    /* renamed from: c4.i$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C1006i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1006i.this.Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C1006i.this.size();
        }
    }

    C1006i() {
        F(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        return (1 << (this.f12180v & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(Object obj) {
        if (K()) {
            return -1;
        }
        int c8 = AbstractC1010m.c(obj);
        int C7 = C();
        int h8 = AbstractC1007j.h(O(), c8 & C7);
        if (h8 == 0) {
            return -1;
        }
        int b8 = AbstractC1007j.b(c8, C7);
        do {
            int i8 = h8 - 1;
            int y7 = y(i8);
            if (AbstractC1007j.b(y7, C7) == b8 && b4.f.a(obj, H(i8))) {
                return i8;
            }
            h8 = AbstractC1007j.c(y7, C7);
        } while (h8 != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object H(int i8) {
        return N()[i8];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object L(Object obj) {
        if (K()) {
            return f12175A;
        }
        int C7 = C();
        int f8 = AbstractC1007j.f(obj, null, C7, O(), M(), N(), null);
        if (f8 == -1) {
            return f12175A;
        }
        Object X7 = X(f8);
        J(f8, C7);
        this.f12181w--;
        D();
        return X7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] M() {
        int[] iArr = this.f12177s;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] N() {
        Object[] objArr = this.f12178t;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object O() {
        Object obj = this.f12176o;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] P() {
        Object[] objArr = this.f12179u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void R(int i8) {
        int min;
        int length = M().length;
        if (i8 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        Q(min);
    }

    private int S(int i8, int i9, int i10, int i11) {
        Object a8 = AbstractC1007j.a(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC1007j.i(a8, i10 & i12, i11 + 1);
        }
        Object O7 = O();
        int[] M7 = M();
        for (int i13 = 0; i13 <= i8; i13++) {
            int h8 = AbstractC1007j.h(O7, i13);
            while (h8 != 0) {
                int i14 = h8 - 1;
                int i15 = M7[i14];
                int b8 = AbstractC1007j.b(i15, i8) | i13;
                int i16 = b8 & i12;
                int h9 = AbstractC1007j.h(a8, i16);
                AbstractC1007j.i(a8, i16, h8);
                M7[i14] = AbstractC1007j.d(b8, h9, i12);
                h8 = AbstractC1007j.c(i15, i8);
            }
        }
        this.f12176o = a8;
        U(i12);
        return i12;
    }

    private void T(int i8, int i9) {
        M()[i8] = i9;
    }

    private void U(int i8) {
        this.f12180v = AbstractC1007j.d(this.f12180v, 32 - Integer.numberOfLeadingZeros(i8), 31);
    }

    private void V(int i8, Object obj) {
        N()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i8, Object obj) {
        P()[i8] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object X(int i8) {
        return P()[i8];
    }

    static /* synthetic */ int f(C1006i c1006i) {
        int i8 = c1006i.f12181w;
        c1006i.f12181w = i8 - 1;
        return i8;
    }

    public static C1006i s() {
        return new C1006i();
    }

    private int y(int i8) {
        return M()[i8];
    }

    int A() {
        return isEmpty() ? -1 : 0;
    }

    int B(int i8) {
        int i9 = i8 + 1;
        if (i9 < this.f12181w) {
            return i9;
        }
        return -1;
    }

    void D() {
        this.f12180v += 32;
    }

    void F(int i8) {
        b4.h.e(i8 >= 0, "Expected size must be >= 0");
        this.f12180v = AbstractC5723a.a(i8, 1, 1073741823);
    }

    void G(int i8, Object obj, Object obj2, int i9, int i10) {
        T(i8, AbstractC1007j.d(i9, 0, i10));
        V(i8, obj);
        W(i8, obj2);
    }

    Iterator I() {
        Map x7 = x();
        return x7 != null ? x7.keySet().iterator() : new a();
    }

    void J(int i8, int i9) {
        Object O7 = O();
        int[] M7 = M();
        Object[] N7 = N();
        Object[] P7 = P();
        int size = size();
        int i10 = size - 1;
        if (i8 >= i10) {
            N7[i8] = null;
            P7[i8] = null;
            M7[i8] = 0;
            return;
        }
        Object obj = N7[i10];
        N7[i8] = obj;
        P7[i8] = P7[i10];
        N7[i10] = null;
        P7[i10] = null;
        M7[i8] = M7[i10];
        M7[i10] = 0;
        int c8 = AbstractC1010m.c(obj) & i9;
        int h8 = AbstractC1007j.h(O7, c8);
        if (h8 == size) {
            AbstractC1007j.i(O7, c8, i8 + 1);
            return;
        }
        while (true) {
            int i11 = h8 - 1;
            int i12 = M7[i11];
            int c9 = AbstractC1007j.c(i12, i9);
            if (c9 == size) {
                M7[i11] = AbstractC1007j.d(i12, i8 + 1, i9);
                return;
            }
            h8 = c9;
        }
    }

    boolean K() {
        return this.f12176o == null;
    }

    void Q(int i8) {
        this.f12177s = Arrays.copyOf(M(), i8);
        this.f12178t = Arrays.copyOf(N(), i8);
        this.f12179u = Arrays.copyOf(P(), i8);
    }

    Iterator Y() {
        Map x7 = x();
        return x7 != null ? x7.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (K()) {
            return;
        }
        D();
        Map x7 = x();
        if (x7 != null) {
            this.f12180v = AbstractC5723a.a(size(), 3, 1073741823);
            x7.clear();
            this.f12176o = null;
            this.f12181w = 0;
            return;
        }
        Arrays.fill(N(), 0, this.f12181w, (Object) null);
        Arrays.fill(P(), 0, this.f12181w, (Object) null);
        AbstractC1007j.g(O());
        Arrays.fill(M(), 0, this.f12181w, 0);
        this.f12181w = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map x7 = x();
        return x7 != null ? x7.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map x7 = x();
        if (x7 != null) {
            return x7.containsValue(obj);
        }
        for (int i8 = 0; i8 < this.f12181w; i8++) {
            if (b4.f.a(obj, X(i8))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f12183y;
        if (set != null) {
            return set;
        }
        Set t7 = t();
        this.f12183y = t7;
        return t7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map x7 = x();
        if (x7 != null) {
            return x7.get(obj);
        }
        int E7 = E(obj);
        if (E7 == -1) {
            return null;
        }
        o(E7);
        return X(E7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f12182x;
        if (set != null) {
            return set;
        }
        Set v7 = v();
        this.f12182x = v7;
        return v7;
    }

    int p(int i8, int i9) {
        return i8 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int S7;
        int i8;
        if (K()) {
            q();
        }
        Map x7 = x();
        if (x7 != null) {
            return x7.put(obj, obj2);
        }
        int[] M7 = M();
        Object[] N7 = N();
        Object[] P7 = P();
        int i9 = this.f12181w;
        int i10 = i9 + 1;
        int c8 = AbstractC1010m.c(obj);
        int C7 = C();
        int i11 = c8 & C7;
        int h8 = AbstractC1007j.h(O(), i11);
        if (h8 != 0) {
            int b8 = AbstractC1007j.b(c8, C7);
            int i12 = 0;
            while (true) {
                int i13 = h8 - 1;
                int i14 = M7[i13];
                if (AbstractC1007j.b(i14, C7) == b8 && b4.f.a(obj, N7[i13])) {
                    Object obj3 = P7[i13];
                    P7[i13] = obj2;
                    o(i13);
                    return obj3;
                }
                int c9 = AbstractC1007j.c(i14, C7);
                i12++;
                if (c9 != 0) {
                    h8 = c9;
                } else {
                    if (i12 >= 9) {
                        return r().put(obj, obj2);
                    }
                    if (i10 > C7) {
                        S7 = S(C7, AbstractC1007j.e(C7), c8, i9);
                    } else {
                        M7[i13] = AbstractC1007j.d(i14, i10, C7);
                    }
                }
            }
            i8 = C7;
        } else if (i10 > C7) {
            S7 = S(C7, AbstractC1007j.e(C7), c8, i9);
            i8 = S7;
        } else {
            AbstractC1007j.i(O(), i11, i10);
            i8 = C7;
        }
        R(i10);
        G(i9, obj, obj2, c8, i8);
        this.f12181w = i10;
        D();
        return null;
    }

    int q() {
        b4.h.o(K(), "Arrays already allocated");
        int i8 = this.f12180v;
        int j8 = AbstractC1007j.j(i8);
        this.f12176o = AbstractC1007j.a(j8);
        U(j8 - 1);
        this.f12177s = new int[i8];
        this.f12178t = new Object[i8];
        this.f12179u = new Object[i8];
        return i8;
    }

    Map r() {
        Map u7 = u(C() + 1);
        int A7 = A();
        while (A7 >= 0) {
            u7.put(H(A7), X(A7));
            A7 = B(A7);
        }
        this.f12176o = u7;
        this.f12177s = null;
        this.f12178t = null;
        this.f12179u = null;
        D();
        return u7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map x7 = x();
        if (x7 != null) {
            return x7.remove(obj);
        }
        Object L7 = L(obj);
        if (L7 == f12175A) {
            return null;
        }
        return L7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map x7 = x();
        return x7 != null ? x7.size() : this.f12181w;
    }

    Set t() {
        return new d();
    }

    Map u(int i8) {
        return new LinkedHashMap(i8, 1.0f);
    }

    Set v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f12184z;
        if (collection != null) {
            return collection;
        }
        Collection w7 = w();
        this.f12184z = w7;
        return w7;
    }

    Collection w() {
        return new h();
    }

    Map x() {
        Object obj = this.f12176o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator z() {
        Map x7 = x();
        return x7 != null ? x7.entrySet().iterator() : new b();
    }

    /* renamed from: c4.i$e */
    private abstract class e implements Iterator {

        /* renamed from: o, reason: collision with root package name */
        int f12189o;

        /* renamed from: s, reason: collision with root package name */
        int f12190s;

        /* renamed from: t, reason: collision with root package name */
        int f12191t;

        private e() {
            this.f12189o = C1006i.this.f12180v;
            this.f12190s = C1006i.this.A();
            this.f12191t = -1;
        }

        private void a() {
            if (C1006i.this.f12180v != this.f12189o) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i8);

        void c() {
            this.f12189o += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12190s >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i8 = this.f12190s;
            this.f12191t = i8;
            Object b8 = b(i8);
            this.f12190s = C1006i.this.B(this.f12190s);
            return b8;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC1004g.c(this.f12191t >= 0);
            c();
            C1006i c1006i = C1006i.this;
            c1006i.remove(c1006i.H(this.f12191t));
            this.f12190s = C1006i.this.p(this.f12190s, this.f12191t);
            this.f12191t = -1;
        }

        /* synthetic */ e(C1006i c1006i, a aVar) {
            this();
        }
    }

    void o(int i8) {
    }
}
