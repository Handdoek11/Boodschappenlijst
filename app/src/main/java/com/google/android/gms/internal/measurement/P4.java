package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class P4 extends LinkedHashMap {

    /* renamed from: s, reason: collision with root package name */
    private static final P4 f28981s;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28982o;

    static {
        P4 p42 = new P4();
        f28981s = p42;
        p42.f28982o = false;
    }

    private P4() {
        this.f28982o = true;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC5026t4.d((byte[]) obj);
        }
        if (obj instanceof InterfaceC5050w4) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static P4 f() {
        return f28981s;
    }

    private final void m() {
        if (!this.f28982o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.P4.equals(java.lang.Object):boolean");
    }

    public final void h(P4 p42) {
        m();
        if (p42.isEmpty()) {
            return;
        }
        putAll(p42);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i8 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i8;
    }

    public final P4 i() {
        return isEmpty() ? new P4() : new P4(this);
    }

    public final void k() {
        this.f28982o = false;
    }

    public final boolean l() {
        return this.f28982o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        AbstractC5026t4.e(obj);
        AbstractC5026t4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            AbstractC5026t4.e(obj);
            AbstractC5026t4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private P4(Map map) {
        super(map);
        this.f28982o = true;
    }
}
