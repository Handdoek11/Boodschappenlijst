package com.google.android.gms.internal.measurement;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5004q5 implements Comparable, Map.Entry {

    /* renamed from: o, reason: collision with root package name */
    private final Comparable f29512o;

    /* renamed from: s, reason: collision with root package name */
    private Object f29513s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ AbstractC4972m5 f29514t;

    C5004q5(AbstractC4972m5 abstractC4972m5, Map.Entry entry) {
        this(abstractC4972m5, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C5004q5) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f29512o, entry.getKey()) && a(this.f29513s, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29512o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29513s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f29512o;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f29513s;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29514t.r();
        Object obj2 = this.f29513s;
        this.f29513s = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f29512o) + "=" + String.valueOf(this.f29513s);
    }

    C5004q5(AbstractC4972m5 abstractC4972m5, Comparable comparable, Object obj) {
        this.f29514t = abstractC4972m5;
        this.f29512o = comparable;
        this.f29513s = obj;
    }
}
