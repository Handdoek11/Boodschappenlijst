package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4887d {

    /* renamed from: a, reason: collision with root package name */
    private C4896e f29250a;

    /* renamed from: b, reason: collision with root package name */
    private C4896e f29251b;

    /* renamed from: c, reason: collision with root package name */
    private List f29252c;

    public C4887d() {
        this.f29250a = new C4896e("", 0L, null);
        this.f29251b = new C4896e("", 0L, null);
        this.f29252c = new ArrayList();
    }

    public final C4896e a() {
        return this.f29250a;
    }

    public final void b(C4896e c4896e) {
        this.f29250a = c4896e;
        this.f29251b = (C4896e) c4896e.clone();
        this.f29252c.clear();
    }

    public final void c(String str, long j8, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C4896e.c(str2, this.f29250a.b(str2), map.get(str2)));
        }
        this.f29252c.add(new C4896e(str, j8, hashMap));
    }

    public final /* synthetic */ Object clone() {
        C4887d c4887d = new C4887d((C4896e) this.f29250a.clone());
        Iterator it = this.f29252c.iterator();
        while (it.hasNext()) {
            c4887d.f29252c.add((C4896e) ((C4896e) it.next()).clone());
        }
        return c4887d;
    }

    public final C4896e d() {
        return this.f29251b;
    }

    public final void e(C4896e c4896e) {
        this.f29251b = c4896e;
    }

    public final List f() {
        return this.f29252c;
    }

    private C4887d(C4896e c4896e) {
        this.f29250a = c4896e;
        this.f29251b = (C4896e) c4896e.clone();
        this.f29252c = new ArrayList();
    }
}
