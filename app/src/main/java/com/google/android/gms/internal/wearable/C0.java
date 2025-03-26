package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class C0 extends LinkedHashMap {

    /* renamed from: s, reason: collision with root package name */
    private static final C0 f30045s;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30046o;

    static {
        C0 c02 = new C0();
        f30045s = c02;
        c02.f30046o = false;
    }

    private C0() {
        this.f30046o = true;
    }

    public static C0 b() {
        return f30045s;
    }

    private static int l(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC5269s0.f30213b;
        int length = bArr.length;
        int b8 = AbstractC5269s0.b(length, bArr, 0, length);
        if (b8 == 0) {
            return 1;
        }
        return b8;
    }

    private final void m() {
        if (!this.f30046o) {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final C0 f() {
        return isEmpty() ? new C0() : new C0(this);
    }

    public final void h() {
        this.f30046o = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i8 += l(entry.getValue()) ^ l(entry.getKey());
        }
        return i8;
    }

    public final void i(C0 c02) {
        m();
        if (c02.isEmpty()) {
            return;
        }
        putAll(c02);
    }

    public final boolean k() {
        return this.f30046o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        byte[] bArr = AbstractC5269s0.f30213b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC5269s0.f30213b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m();
        return super.remove(obj);
    }

    private C0(Map map) {
        super(map);
        this.f30046o = true;
    }
}
