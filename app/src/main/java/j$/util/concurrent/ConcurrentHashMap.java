package j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g, reason: collision with root package name */
    static final int f37287g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    private static final j$.sun.misc.a f37288h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f37289i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f37290j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f37291k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f37292l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f37293m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f37294n;

    /* renamed from: o, reason: collision with root package name */
    private static final int f37295o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    volatile transient l[] f37296a;

    /* renamed from: b, reason: collision with root package name */
    private volatile transient l[] f37297b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    private volatile transient c[] f37298c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    private transient i f37299d;

    /* renamed from: e, reason: collision with root package name */
    private transient s f37300e;

    /* renamed from: f, reason: collision with root package name */
    private transient e f37301f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static final int i(int i8) {
        return (i8 ^ (i8 >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h8 = j$.sun.misc.a.h();
        f37288h = h8;
        f37289i = h8.j(ConcurrentHashMap.class, "sizeCtl");
        f37290j = h8.j(ConcurrentHashMap.class, "transferIndex");
        f37291k = h8.j(ConcurrentHashMap.class, "baseCount");
        f37292l = h8.j(ConcurrentHashMap.class, "cellsBusy");
        f37293m = h8.j(c.class, "value");
        f37294n = h8.a(l[].class);
        int b8 = h8.b(l[].class);
        if (((b8 - 1) & b8) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f37295o = 31 - Integer.numberOfLeadingZeros(b8);
    }

    private static final int l(int i8) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i8 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static final l k(l[] lVarArr, int i8) {
        return (l) f37288h.g(lVarArr, (i8 << f37295o) + f37294n);
    }

    static final boolean b(l[] lVarArr, int i8, l lVar) {
        return f37288h.e(lVarArr, (i8 << f37295o) + f37294n, lVar);
    }

    static final void h(l[] lVarArr, int i8, l lVar) {
        f37288h.l(lVarArr, (i8 << f37295o) + f37294n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i8) {
        this(i8, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i8, float f8, int i9) {
        if (f8 <= 0.0f || i8 < 0 || i9 <= 0) {
            throw new IllegalArgumentException();
        }
        long j8 = (long) (((i8 < i9 ? i9 : i8) / f8) + 1.0d);
        this.sizeCtl = j8 >= 1073741824 ? 1073741824 : l((int) j8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j8 = j();
        if (j8 < 0) {
            return 0;
        }
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        l k8;
        Object obj2;
        int i8 = i(obj.hashCode());
        l[] lVarArr = this.f37296a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (k8 = k(lVarArr, (length - 1) & i8)) != null) {
            int i9 = k8.f37321a;
            if (i9 == i8) {
                Object obj3 = k8.f37322b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) k8.f37323c;
                }
            } else if (i9 < 0) {
                l a8 = k8.a(i8, obj);
                if (a8 != null) {
                    return (V) a8.f37323c;
                }
                return null;
            }
            while (true) {
                k8 = k8.f37324d;
                if (k8 == null) {
                    break;
                }
                if (k8.f37321a == i8 && ((obj2 = k8.f37322b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    break;
                }
            }
            return (V) k8.f37323c;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f37296a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                Object obj2 = a8.f37323c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k8, V v7) {
        return (V) f(k8, v7, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f37323c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f37323c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i8;
        l k8;
        boolean z7;
        Object obj4;
        r b8;
        Object obj5;
        int i9 = i(obj.hashCode());
        l[] lVarArr = this.f37296a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (k8 = k(lVarArr, (i8 = (length - 1) & i9))) == null) {
                break;
            }
            int i10 = k8.f37321a;
            if (i10 == -1) {
                lVarArr = d(lVarArr, k8);
            } else {
                synchronized (k8) {
                    try {
                        if (k(lVarArr, i8) == k8) {
                            z7 = true;
                            if (i10 >= 0) {
                                l lVar = null;
                                l lVar2 = k8;
                                while (true) {
                                    if (lVar2.f37321a != i9 || ((obj5 = lVar2.f37322b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        l lVar3 = lVar2.f37324d;
                                        if (lVar3 == null) {
                                            break;
                                        }
                                        lVar = lVar2;
                                        lVar2 = lVar3;
                                    }
                                }
                                obj4 = lVar2.f37323c;
                                if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                    obj4 = null;
                                } else if (obj2 != null) {
                                    lVar2.f37323c = obj2;
                                } else if (lVar != null) {
                                    lVar.f37324d = lVar2.f37324d;
                                } else {
                                    h(lVarArr, i8, lVar2.f37324d);
                                }
                            } else if (k8 instanceof q) {
                                q qVar = (q) k8;
                                r rVar = qVar.f37339e;
                                if (rVar != null && (b8 = rVar.b(i9, obj, null)) != null) {
                                    obj4 = b8.f37323c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b8.f37323c = obj2;
                                        } else if (qVar.f(b8)) {
                                            h(lVarArr, i8, p(qVar.f37340f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (k8 instanceof m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z7 = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z7) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l k8;
        l lVar;
        l[] lVarArr = this.f37296a;
        long j8 = 0;
        loop0: while (true) {
            int i8 = 0;
            while (lVarArr != null && i8 < lVarArr.length) {
                k8 = k(lVarArr, i8);
                if (k8 == null) {
                    i8++;
                } else {
                    int i9 = k8.f37321a;
                    if (i9 == -1) {
                        break;
                    }
                    synchronized (k8) {
                        try {
                            if (k(lVarArr, i8) == k8) {
                                if (i9 >= 0) {
                                    lVar = k8;
                                } else {
                                    lVar = k8 instanceof q ? ((q) k8).f37340f : null;
                                }
                                while (lVar != null) {
                                    j8--;
                                    lVar = lVar.f37324d;
                                }
                                h(lVarArr, i8, null);
                                i8++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k8);
        }
        if (j8 != 0) {
            a(j8, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.f37299d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f37299d = iVar2;
        return iVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s sVar = this.f37300e;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(this);
        this.f37300e = sVar2;
        return sVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f37301f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f37301f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f37296a;
        int i8 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                i8 += a8.f37323c.hashCode() ^ a8.f37322b.hashCode();
            }
        }
        return i8;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f37296a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l a8 = pVar.a();
        if (a8 != null) {
            while (true) {
                Object obj = a8.f37322b;
                Object obj2 = a8.f37323c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        l[] lVarArr = this.f37296a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l a8 = pVar.a();
            if (a8 != null) {
                Object obj2 = a8.f37323c;
                Object obj3 = map.get(a8.f37322b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v7 = get(key)) == null || (value != v7 && !value.equals(v7))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i8 = 0;
        int i9 = 1;
        while (i9 < 16) {
            i8++;
            i9 <<= 1;
        }
        int i10 = 32 - i8;
        int i11 = i9 - 1;
        n[] nVarArr = new n[16];
        for (int i12 = 0; i12 < 16; i12++) {
            nVarArr[i12] = new n();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i10);
        putFields.put("segmentMask", i11);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f37296a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a8 = pVar.a();
                if (a8 == null) {
                    break;
                }
                objectOutputStream.writeObject(a8.f37322b);
                objectOutputStream.writeObject(a8.f37323c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j8;
        boolean z7;
        boolean z8;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j9 = 0;
        long j10 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j8 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j10++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j10 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j11 = (long) ((j10 / 0.75f) + 1.0d);
        int l8 = j11 >= 1073741824 ? 1073741824 : l((int) j11);
        l[] lVarArr = new l[l8];
        int i8 = l8 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f37324d;
            int i9 = lVar.f37321a;
            int i10 = i9 & i8;
            l k8 = k(lVarArr, i10);
            if (k8 == null) {
                z8 = true;
            } else {
                Object obj2 = lVar.f37322b;
                if (k8.f37321a >= 0) {
                    int i11 = 0;
                    for (l lVar3 = k8; lVar3 != null; lVar3 = lVar3.f37324d) {
                        if (lVar3.f37321a == i9 && ((obj = lVar3.f37322b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z7 = false;
                            break;
                        }
                        i11++;
                    }
                    z7 = true;
                    if (!z7 || i11 < 8) {
                        z8 = z7;
                    } else {
                        long j12 = j9 + 1;
                        lVar.f37324d = k8;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j13 = j12;
                            r rVar3 = new r(lVar4.f37321a, lVar4.f37322b, lVar4.f37323c, null, null);
                            rVar3.f37345h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f37324d = rVar3;
                            }
                            lVar4 = lVar4.f37324d;
                            rVar2 = rVar3;
                            j12 = j13;
                        }
                        h(lVarArr, i10, new q(rVar));
                        j9 = j12;
                    }
                } else if (((q) k8).e(i9, obj2, lVar.f37323c) == null) {
                    j9 += j8;
                }
                z8 = false;
            }
            if (z8) {
                j9++;
                lVar.f37324d = k8;
                h(lVarArr, i10, lVar);
            }
            j8 = 1;
            lVar = lVar2;
        }
        this.f37296a = lVarArr;
        this.sizeCtl = l8 - (l8 >>> 2);
        this.baseCount = j9;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k8, V v7) {
        return (V) f(k8, v7, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v7 = get(obj);
        return v7 == null ? obj2 : v7;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f37296a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a8 = pVar.a();
            if (a8 == null) {
                return;
            } else {
                biConsumer.accept(a8.f37322b, a8.f37323c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f37296a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a8 = pVar.a();
            if (a8 == null) {
                return;
            }
            Object obj = a8.f37323c;
            Object obj2 = a8.f37322b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f37323c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f37296a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f37321a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f37321a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f37322b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f37323c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f37323c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f37324d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f37324d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f37324d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f37339e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f37323c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f37323c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f37340f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object apply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i8 = i(obj.hashCode());
        l[] lVarArr = this.f37296a;
        int i9 = 0;
        Object obj3 = null;
        int i10 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & i8;
                    l k8 = k(lVarArr, i11);
                    if (k8 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i11, mVar)) {
                                    try {
                                        obj3 = biFunction.apply(obj, null);
                                        if (obj3 != null) {
                                            lVar = new l(i8, obj, obj3);
                                            i10 = 1;
                                        } else {
                                            lVar = null;
                                        }
                                        h(lVarArr, i11, lVar);
                                        i9 = 1;
                                    } catch (Throwable th) {
                                        h(lVarArr, i11, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i9 != 0) {
                        }
                    } else {
                        int i12 = k8.f37321a;
                        if (i12 == -1) {
                            lVarArr = d(lVarArr, k8);
                        } else {
                            synchronized (k8) {
                                try {
                                    if (k(lVarArr, i11) == k8) {
                                        if (i12 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = k8;
                                            i9 = 1;
                                            while (true) {
                                                if (lVar3.f37321a == i8 && ((obj2 = lVar3.f37322b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.f37324d;
                                                if (lVar4 == null) {
                                                    apply = biFunction.apply(obj, null);
                                                    if (apply != null) {
                                                        if (lVar3.f37324d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.f37324d = new l(i8, obj, apply);
                                                        i10 = 1;
                                                    }
                                                } else {
                                                    i9++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object apply2 = biFunction.apply(obj, lVar3.f37323c);
                                            if (apply2 != null) {
                                                lVar3.f37323c = apply2;
                                                obj3 = apply2;
                                            } else {
                                                l lVar5 = lVar3.f37324d;
                                                if (lVar2 != null) {
                                                    lVar2.f37324d = lVar5;
                                                } else {
                                                    h(lVarArr, i11, lVar5);
                                                }
                                                obj3 = apply2;
                                                i10 = -1;
                                            }
                                        } else if (k8 instanceof q) {
                                            q qVar = (q) k8;
                                            r rVar = qVar.f37339e;
                                            r b8 = rVar != null ? rVar.b(i8, obj, null) : null;
                                            apply = biFunction.apply(obj, b8 == null ? null : b8.f37323c);
                                            if (apply != null) {
                                                if (b8 != null) {
                                                    b8.f37323c = apply;
                                                } else {
                                                    qVar.e(i8, obj, apply);
                                                    i10 = 1;
                                                }
                                            } else if (b8 != null) {
                                                if (qVar.f(b8)) {
                                                    h(lVarArr, i11, p(qVar.f37340f));
                                                }
                                                i10 = -1;
                                            }
                                            i9 = 1;
                                            obj3 = apply;
                                        } else if (k8 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i9 != 0) {
                                if (i9 >= 8) {
                                    n(lVarArr, i11);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i10 != 0) {
            a(i10, i9);
        }
        return obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f37296a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i8 = this.sizeCtl;
            if (i8 < 0) {
                Thread.yield();
            } else if (f37288h.c(this, f37289i, i8, -1)) {
                try {
                    l[] lVarArr2 = this.f37296a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i9 = i8 > 0 ? i8 : 16;
                        l[] lVarArr3 = new l[i9];
                        this.f37296a = lVarArr3;
                        i8 = i9 - (i9 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i8;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i8;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
    
        if (r25.f37298c != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
    
        r25.f37298c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    final l[] d(l[] lVarArr, l lVar) {
        int i8;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f37314e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (true) {
                if (lVarArr2 != this.f37297b || this.f37296a != lVarArr || (i8 = this.sizeCtl) >= 0 || (i8 >>> 16) != numberOfLeadingZeros || i8 == numberOfLeadingZeros + 1 || i8 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                }
                if (f37288h.c(this, f37289i, i8, i8 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f37296a;
    }

    private final void o(int i8) {
        int length;
        int l8 = i8 >= 536870912 ? 1073741824 : l(i8 + (i8 >>> 1) + 1);
        while (true) {
            int i9 = this.sizeCtl;
            if (i9 < 0) {
                return;
            }
            l[] lVarArr = this.f37296a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i10 = i9 > l8 ? i9 : l8;
                if (f37288h.c(this, f37289i, i9, -1)) {
                    try {
                        if (this.f37296a == lVarArr) {
                            this.f37296a = new l[i10];
                            i9 = i10 - (i10 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i9;
                    }
                } else {
                    continue;
                }
            } else {
                if (l8 <= i9 || length >= 1073741824) {
                    return;
                }
                if (lVarArr == this.f37296a) {
                    if (f37288h.c(this, f37289i, i9, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i8;
        int i9;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        boolean z7;
        char c8;
        int i10;
        l qVar;
        l qVar2;
        r rVar;
        int i11;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i12 = f37287g;
        boolean z8 = true;
        int i13 = i12 > 1 ? (length >>> 3) / i12 : length;
        char c9 = 16;
        int i14 = i13 < 16 ? 16 : i13;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f37297b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        boolean z9 = true;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        while (true) {
            if (z9) {
                int i17 = i16 - 1;
                if (i17 >= i15 || z10) {
                    i15 = i15;
                    i16 = i17;
                    z9 = false;
                } else {
                    int i18 = concurrentHashMap2.transferIndex;
                    if (i18 <= 0) {
                        i16 = -1;
                    } else {
                        j$.sun.misc.a aVar = f37288h;
                        long j8 = f37290j;
                        int i19 = i18 > i14 ? i18 - i14 : 0;
                        int i20 = i15;
                        if (aVar.c(this, j8, i18, i19)) {
                            i16 = i18 - 1;
                            i15 = i19;
                        } else {
                            i15 = i20;
                            i16 = i17;
                        }
                    }
                    z9 = false;
                }
            } else {
                int i21 = i15;
                r rVar2 = null;
                if (i16 < 0 || i16 >= length || (i10 = i16 + length) >= length2) {
                    i8 = i14;
                    i9 = length2;
                    gVar = gVar2;
                    if (z10) {
                        this.f37297b = null;
                        this.f37296a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    z7 = true;
                    j$.sun.misc.a aVar2 = f37288h;
                    long j9 = f37289i;
                    int i22 = concurrentHashMap.sizeCtl;
                    int i23 = i16;
                    if (aVar2.c(this, j9, i22, i22 - 1)) {
                        c8 = 16;
                        if (i22 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i16 = length;
                        z9 = true;
                        z10 = true;
                    } else {
                        c8 = 16;
                        i16 = i23;
                    }
                } else {
                    ?? k8 = k(lVarArr4, i16);
                    if (k8 == 0) {
                        z9 = b(lVarArr4, i16, gVar2);
                        c8 = c9;
                        i8 = i14;
                        i9 = length2;
                        z7 = z8;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        int i24 = k8.f37321a;
                        if (i24 == -1) {
                            z9 = z8;
                            c8 = c9;
                            i8 = i14;
                            i9 = length2;
                            concurrentHashMap = concurrentHashMap2;
                            z7 = z9;
                        } else {
                            synchronized (k8) {
                                try {
                                    if (k(lVarArr4, i16) == k8) {
                                        if (i24 >= 0) {
                                            int i25 = i24 & length;
                                            r rVar3 = k8;
                                            for (r rVar4 = k8.f37324d; rVar4 != null; rVar4 = rVar4.f37324d) {
                                                int i26 = rVar4.f37321a & length;
                                                if (i26 != i25) {
                                                    rVar3 = rVar4;
                                                    i25 = i26;
                                                }
                                            }
                                            if (i25 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k8;
                                            while (lVar != rVar3) {
                                                int i27 = lVar.f37321a;
                                                Object obj = lVar.f37322b;
                                                int i28 = i14;
                                                Object obj2 = lVar.f37323c;
                                                if ((i27 & length) == 0) {
                                                    i11 = length2;
                                                    rVar2 = new l(i27, obj, obj2, rVar2);
                                                } else {
                                                    i11 = length2;
                                                    rVar = new l(i27, obj, obj2, rVar);
                                                }
                                                lVar = lVar.f37324d;
                                                i14 = i28;
                                                length2 = i11;
                                            }
                                            i8 = i14;
                                            i9 = length2;
                                            h(lVarArr3, i16, rVar2);
                                            h(lVarArr3, i10, rVar);
                                            h(lVarArr4, i16, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i8 = i14;
                                            i9 = length2;
                                            if (k8 instanceof q) {
                                                q qVar3 = (q) k8;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f37340f;
                                                int i29 = 0;
                                                int i30 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i31 = lVar2.f37321a;
                                                    g gVar3 = gVar2;
                                                    r rVar8 = new r(i31, lVar2.f37322b, lVar2.f37323c, null, null);
                                                    if ((i31 & length) == 0) {
                                                        rVar8.f37345h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.f37324d = rVar8;
                                                        }
                                                        i29++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.f37345h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.f37324d = rVar8;
                                                        }
                                                        i30++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.f37324d;
                                                    qVar3 = qVar4;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar5 = qVar3;
                                                g gVar4 = gVar2;
                                                if (i29 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i30 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i30 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i29 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i16, qVar);
                                                h(lVarArr3, i10, qVar2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i16, gVar);
                                            }
                                        }
                                        z9 = true;
                                    } else {
                                        i8 = i14;
                                        i9 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                            c8 = 16;
                            z7 = true;
                        }
                    }
                    gVar = gVar2;
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                z8 = z7;
                i15 = i21;
                i14 = i8;
                length2 = i9;
                c9 = c8;
            }
        }
    }

    final long j() {
        c[] cVarArr = this.f37298c;
        long j8 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j8 += cVar.value;
                }
            }
        }
        return j8;
    }

    private final void n(l[] lVarArr, int i8) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k8 = k(lVarArr, i8);
        if (k8 == null || k8.f37321a < 0) {
            return;
        }
        synchronized (k8) {
            try {
                if (k(lVarArr, i8) == k8) {
                    r rVar = null;
                    l lVar = k8;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f37321a, lVar.f37322b, lVar.f37323c, null, null);
                        rVar3.f37345h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f37324d = rVar3;
                        }
                        lVar = lVar.f37324d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i8, new q(rVar));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f37324d) {
            l lVar3 = new l(rVar2.f37321a, rVar2.f37322b, rVar2.f37323c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f37324d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
