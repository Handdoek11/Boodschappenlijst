package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4972m5 extends AbstractMap {

    /* renamed from: o, reason: collision with root package name */
    private Object[] f29452o;

    /* renamed from: s, reason: collision with root package name */
    private int f29453s;

    /* renamed from: t, reason: collision with root package name */
    private Map f29454t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f29455u;

    /* renamed from: v, reason: collision with root package name */
    private volatile C5027t5 f29456v;

    /* renamed from: w, reason: collision with root package name */
    private Map f29457w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int d(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.f29453s
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1f
            java.lang.Object[] r2 = r4.f29452o
            r2 = r2[r1]
            com.google.android.gms.internal.measurement.q5 r2 = (com.google.android.gms.internal.measurement.C5004q5) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1c
            int r0 = r0 + 1
        L1a:
            int r5 = -r0
            return r5
        L1c:
            if (r2 != 0) goto L1f
            return r1
        L1f:
            r0 = 0
        L20:
            if (r0 > r1) goto L41
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.f29452o
            r3 = r3[r2]
            com.google.android.gms.internal.measurement.q5 r3 = (com.google.android.gms.internal.measurement.C5004q5) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3b
            int r1 = r2 + (-1)
            goto L20
        L3b:
            if (r3 <= 0) goto L40
            int r0 = r2 + 1
            goto L20
        L40:
            return r2
        L41:
            int r0 = r0 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC4972m5.d(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(int i8) {
        r();
        Object value = ((C5004q5) this.f29452o[i8]).getValue();
        Object[] objArr = this.f29452o;
        System.arraycopy(objArr, i8 + 1, objArr, i8, (this.f29453s - i8) - 1);
        this.f29453s--;
        if (!this.f29454t.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f29452o[this.f29453s] = new C5004q5(this, (Map.Entry) it.next());
            this.f29453s++;
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f29454t.isEmpty() && !(this.f29454t instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29454t = treeMap;
            this.f29457w = treeMap.descendingMap();
        }
        return (SortedMap) this.f29454t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (this.f29455u) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        return this.f29453s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r();
        if (this.f29453s != 0) {
            this.f29452o = null;
            this.f29453s = 0;
        }
        if (this.f29454t.isEmpty()) {
            return;
        }
        this.f29454t.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f29454t.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f29456v == null) {
            this.f29456v = new C5027t5(this);
        }
        return this.f29456v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4972m5)) {
            return super.equals(obj);
        }
        AbstractC4972m5 abstractC4972m5 = (AbstractC4972m5) obj;
        int size = size();
        if (size != abstractC4972m5.size()) {
            return false;
        }
        int i8 = this.f29453s;
        if (i8 != abstractC4972m5.f29453s) {
            return entrySet().equals(abstractC4972m5.entrySet());
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!g(i9).equals(abstractC4972m5.g(i9))) {
                return false;
            }
        }
        if (i8 != size) {
            return this.f29454t.equals(abstractC4972m5.f29454t);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int d8 = d(comparable);
        if (d8 >= 0) {
            return ((C5004q5) this.f29452o[d8]).setValue(obj);
        }
        r();
        if (this.f29452o == null) {
            this.f29452o = new Object[16];
        }
        int i8 = -(d8 + 1);
        if (i8 >= 16) {
            return q().put(comparable, obj);
        }
        int i9 = this.f29453s;
        if (i9 == 16) {
            C5004q5 c5004q5 = (C5004q5) this.f29452o[15];
            this.f29453s = i9 - 1;
            q().put((Comparable) c5004q5.getKey(), c5004q5.getValue());
        }
        Object[] objArr = this.f29452o;
        System.arraycopy(objArr, i8, objArr, i8 + 1, (objArr.length - i8) - 1);
        this.f29452o[i8] = new C5004q5(this, comparable, obj);
        this.f29453s++;
        return null;
    }

    public final Map.Entry g(int i8) {
        if (i8 < this.f29453s) {
            return (C5004q5) this.f29452o[i8];
        }
        throw new ArrayIndexOutOfBoundsException(i8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int d8 = d(comparable);
        return d8 >= 0 ? ((C5004q5) this.f29452o[d8]).getValue() : this.f29454t.get(comparable);
    }

    public final Iterable h() {
        return this.f29454t.isEmpty() ? Collections.emptySet() : this.f29454t.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i8 = this.f29453s;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += this.f29452o[i10].hashCode();
        }
        return this.f29454t.size() > 0 ? i9 + this.f29454t.hashCode() : i9;
    }

    final Set l() {
        return new C5019s5(this);
    }

    public void m() {
        if (this.f29455u) {
            return;
        }
        this.f29454t = this.f29454t.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f29454t);
        this.f29457w = this.f29457w.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f29457w);
        this.f29455u = true;
    }

    public final boolean o() {
        return this.f29455u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int d8 = d(comparable);
        if (d8 >= 0) {
            return i(d8);
        }
        if (this.f29454t.isEmpty()) {
            return null;
        }
        return this.f29454t.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f29453s + this.f29454t.size();
    }

    private AbstractC4972m5() {
        this.f29454t = Collections.emptyMap();
        this.f29457w = Collections.emptyMap();
    }
}
