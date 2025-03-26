package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.Fg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1306Fg0 extends C4603xg0 implements SortedMap {

    /* renamed from: v, reason: collision with root package name */
    SortedSet f15186v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f15187w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1306Fg0(AbstractC1520Lg0 abstractC1520Lg0, SortedMap sortedMap) {
        super(abstractC1520Lg0, sortedMap);
        this.f15187w = abstractC1520Lg0;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    SortedMap d() {
        return (SortedMap) this.f27897t;
    }

    SortedSet e() {
        return new C1342Gg0(this.f15187w, d());
    }

    @Override // com.google.android.gms.internal.ads.C4603xg0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f15186v;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet e8 = e();
        this.f15186v = e8;
        return e8;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1306Fg0(this.f15187w, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1306Fg0(this.f15187w, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1306Fg0(this.f15187w, d().tailMap(obj));
    }
}
