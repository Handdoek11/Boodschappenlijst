package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4896e {

    /* renamed from: d, reason: collision with root package name */
    private static final c4.r f29274d = c4.r.w("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f29275a;

    /* renamed from: b, reason: collision with root package name */
    private long f29276b;

    /* renamed from: c, reason: collision with root package name */
    private Map f29277c;

    public C4896e(String str, long j8, Map map) {
        this.f29275a = str;
        this.f29276b = j8;
        HashMap hashMap = new HashMap();
        this.f29277c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (f29274d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final long a() {
        return this.f29276b;
    }

    public final Object b(String str) {
        if (this.f29277c.containsKey(str)) {
            return this.f29277c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C4896e(this.f29275a, this.f29276b, new HashMap(this.f29277c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f29277c.remove(str);
        } else {
            this.f29277c.put(str, c(str, this.f29277c.get(str), obj));
        }
    }

    public final String e() {
        return this.f29275a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4896e)) {
            return false;
        }
        C4896e c4896e = (C4896e) obj;
        if (this.f29276b == c4896e.f29276b && this.f29275a.equals(c4896e.f29275a)) {
            return this.f29277c.equals(c4896e.f29277c);
        }
        return false;
    }

    public final void f(String str) {
        this.f29275a = str;
    }

    public final Map g() {
        return this.f29277c;
    }

    public final int hashCode() {
        int hashCode = this.f29275a.hashCode() * 31;
        long j8 = this.f29276b;
        return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f29277c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f29275a + "', timestamp=" + this.f29276b + ", params=" + String.valueOf(this.f29277c) + "}";
    }
}
