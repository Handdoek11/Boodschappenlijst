package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.Bg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1162Bg0 extends C1306Fg0 implements NavigableMap {

    /* renamed from: x, reason: collision with root package name */
    final /* synthetic */ AbstractC1520Lg0 f13830x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1162Bg0(AbstractC1520Lg0 abstractC1520Lg0, NavigableMap navigableMap) {
        super(abstractC1520Lg0, navigableMap);
        this.f13830x = abstractC1520Lg0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f27897t)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27897t)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0
    final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f27897t);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C1162Bg0(this.f13830x, ((NavigableMap) ((SortedMap) this.f27897t)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0
    /* renamed from: f */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f27897t)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return b(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f27897t)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return b(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27897t)).floorKey(obj);
    }

    final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h8 = this.f13830x.h();
        h8.addAll((Collection) entry.getValue());
        it.remove();
        return new C3734ph0(entry.getKey(), this.f13830x.i(h8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C1306Fg0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableSet e() {
        return new C1198Cg0(this.f13830x, (NavigableMap) ((SortedMap) this.f27897t));
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f27897t)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return b(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27897t)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0, com.google.android.gms.internal.ads.C4603xg0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f27897t)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return b(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f27897t)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f27897t)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(descendingMap().entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C1306Fg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z7) {
        return new C1162Bg0(this.f13830x, ((NavigableMap) ((SortedMap) this.f27897t)).headMap(obj, z7));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z7, Object obj2, boolean z8) {
        return new C1162Bg0(this.f13830x, ((NavigableMap) ((SortedMap) this.f27897t)).subMap(obj, z7, obj2, z8));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z7) {
        return new C1162Bg0(this.f13830x, ((NavigableMap) ((SortedMap) this.f27897t)).tailMap(obj, z7));
    }
}
