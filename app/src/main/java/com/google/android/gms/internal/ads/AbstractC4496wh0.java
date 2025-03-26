package com.google.android.gms.internal.ads;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.wh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4496wh0 implements Map, Serializable, j$.util.Map {

    /* renamed from: o, reason: collision with root package name */
    private transient AbstractC4714yh0 f27528o;

    /* renamed from: s, reason: collision with root package name */
    private transient AbstractC4714yh0 f27529s;

    /* renamed from: t, reason: collision with root package name */
    private transient AbstractC3625oh0 f27530t;

    AbstractC4496wh0() {
    }

    public static AbstractC4496wh0 d(Map map) {
        Set entrySet = map.entrySet();
        C4387vh0 c4387vh0 = new C4387vh0(entrySet instanceof Collection ? entrySet.size() : 4);
        c4387vh0.b(entrySet);
        return c4387vh0.c();
    }

    public static AbstractC4496wh0 e() {
        return C3191ki0.f24076x;
    }

    public static AbstractC4496wh0 f(Object obj, Object obj2) {
        AbstractC1659Pg0.b("dialog_not_shown_reason", obj2);
        return C3191ki0.k(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    abstract AbstractC3625oh0 a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3625oh0 values() {
        AbstractC3625oh0 abstractC3625oh0 = this.f27530t;
        if (abstractC3625oh0 != null) {
            return abstractC3625oh0;
        }
        AbstractC3625oh0 a8 = a();
        this.f27530t = a8;
        return a8;
    }

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
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1696Qh0.b(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    abstract AbstractC4714yh0 g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract AbstractC4714yh0 h();

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC4389vi0.a(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC4714yh0 entrySet() {
        AbstractC4714yh0 abstractC4714yh0 = this.f27528o;
        if (abstractC4714yh0 != null) {
            return abstractC4714yh0;
        }
        AbstractC4714yh0 g8 = g();
        this.f27528o = g8;
        return g8;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC4714yh0 keySet() {
        AbstractC4714yh0 abstractC4714yh0 = this.f27529s;
        if (abstractC4714yh0 != null) {
            return abstractC4714yh0;
        }
        AbstractC4714yh0 h8 = h();
        this.f27529s = h8;
        return h8;
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

    public final String toString() {
        int size = size();
        AbstractC1659Pg0.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
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
