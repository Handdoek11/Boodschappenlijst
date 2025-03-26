package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class R6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18604a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18605b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f18606c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18607d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18608e;

    private R6(int i8, byte[] bArr, Map map, List list, boolean z7, long j8) {
        this.f18604a = i8;
        this.f18605b = bArr;
        this.f18606c = map;
        this.f18607d = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.f18608e = z7;
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new O6((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public R6(int i8, byte[] bArr, Map map, boolean z7, long j8) {
        this(i8, bArr, map, a(map), z7, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public R6(int i8, byte[] bArr, boolean z7, long j8, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                O6 o62 = (O6) it.next();
                treeMap.put(o62.a(), o62.b());
            }
        }
        this(i8, bArr, treeMap, list, z7, j8);
    }

    public R6(byte[] bArr, Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
