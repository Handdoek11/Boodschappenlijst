package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3217kv0 extends LinkedHashMap {

    /* renamed from: s, reason: collision with root package name */
    private static final C3217kv0 f24225s;

    /* renamed from: o, reason: collision with root package name */
    private boolean f24226o;

    static {
        C3217kv0 c3217kv0 = new C3217kv0();
        f24225s = c3217kv0;
        c3217kv0.f24226o = false;
    }

    private C3217kv0() {
        this.f24226o = true;
    }

    public static C3217kv0 b() {
        return f24225s;
    }

    private static int l(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Su0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = AbstractC2131av0.f20783b;
        int length = bArr.length;
        int b8 = AbstractC2131av0.b(length, bArr, 0, length);
        if (b8 == 0) {
            return 1;
        }
        return b8;
    }

    private final void m() {
        if (!this.f24226o) {
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

    public final C3217kv0 f() {
        return isEmpty() ? new C3217kv0() : new C3217kv0(this);
    }

    public final void h() {
        this.f24226o = false;
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

    public final void i(C3217kv0 c3217kv0) {
        m();
        if (c3217kv0.isEmpty()) {
            return;
        }
        putAll(c3217kv0);
    }

    public final boolean k() {
        return this.f24226o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m();
        byte[] bArr = AbstractC2131av0.f20783b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m();
        for (Object obj : map.keySet()) {
            byte[] bArr = AbstractC2131av0.f20783b;
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

    private C3217kv0(Map map) {
        super(map);
        this.f24226o = true;
    }
}
