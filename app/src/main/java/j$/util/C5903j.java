package j$.util;

import j$.util.Map;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5903j implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f37387a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37388b = this;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f37389c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Set f37390d;

    /* renamed from: e, reason: collision with root package name */
    private transient java.util.Collection f37391e;

    C5903j(java.util.Map map) {
        this.f37387a = (java.util.Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f37388b) {
            size = this.f37387a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f37388b) {
            isEmpty = this.f37387a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f37388b) {
            containsKey = this.f37387a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f37388b) {
            containsValue = this.f37387a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f37388b) {
            obj2 = this.f37387a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f37388b) {
            put = this.f37387a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f37388b) {
            remove = this.f37387a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f37388b) {
            this.f37387a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f37388b) {
            this.f37387a.clear();
        }
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set;
        synchronized (this.f37388b) {
            try {
                if (this.f37389c == null) {
                    this.f37389c = new C5905l(this.f37387a.keySet(), this.f37388b);
                }
                set = this.f37389c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set;
        synchronized (this.f37388b) {
            try {
                if (this.f37390d == null) {
                    this.f37390d = new C5905l(this.f37387a.entrySet(), this.f37388b);
                }
                set = this.f37390d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        java.util.Collection collection;
        synchronized (this.f37388b) {
            try {
                if (this.f37391e == null) {
                    this.f37391e = new C5901h(this.f37387a.values(), this.f37388b);
                }
                collection = this.f37391e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f37388b) {
            equals = this.f37387a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f37388b) {
            hashCode = this.f37387a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.f37388b) {
            obj = this.f37387a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f37388b) {
            orDefault = Map.EL.getOrDefault(this.f37387a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f37388b) {
            Map.EL.a(this.f37387a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(tVar);
                } else {
                    j$.util.concurrent.u.a(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object b8;
        synchronized (this.f37388b) {
            b8 = Map.EL.b(this.f37387a, obj, obj2);
        }
        return b8;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object $default$computeIfAbsent;
        Object apply;
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object $default$computeIfPresent;
        Object apply;
        synchronized (this.f37388b) {
            java.util.Map map = this.f37387a;
            if (map instanceof Map) {
                $default$computeIfPresent = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj2 = concurrentMap.get(obj);
                    if (obj2 == null) {
                        $default$computeIfPresent = null;
                        break;
                    }
                    apply = biFunction.apply(obj, obj2);
                    if (apply == null) {
                        if (concurrentMap.remove(obj, obj2)) {
                            break;
                        }
                    } else if (concurrentMap.replace(obj, obj2, apply)) {
                        break;
                    }
                }
                $default$computeIfPresent = apply;
            } else {
                $default$computeIfPresent = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return $default$computeIfPresent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r5 = r3;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object compute(java.lang.Object r5, java.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f37388b
            monitor-enter(r0)
            java.util.Map r1 = r4.f37387a     // Catch: java.lang.Throwable -> L41
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: java.lang.Throwable -> L41
            goto L3f
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3b
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L41
        L16:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L41
        L1a:
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L31
            if (r2 == 0) goto L2a
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L28:
            r5 = r3
            goto L3f
        L2a:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L1a
            goto L28
        L31:
            if (r2 == 0) goto L39
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L39:
            r5 = 0
            goto L3f
        L3b:
            java.lang.Object r5 = j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C5903j.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1.replace(r5, r2, r3) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1.remove(r5, r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        r6 = null;
     */
    @Override // java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, java.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f37388b
            monitor-enter(r0)
            java.util.Map r1 = r4.f37387a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            j$.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            j$.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C5903j.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f37388b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
