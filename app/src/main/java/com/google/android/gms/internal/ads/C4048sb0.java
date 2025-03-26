package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.ads.sb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4048sb0 {

    /* renamed from: c, reason: collision with root package name */
    private static final C4048sb0 f26706c = new C4048sb0();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f26707a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f26708b = new ArrayList();

    private C4048sb0() {
    }

    public static C4048sb0 a() {
        return f26706c;
    }

    public final Collection b() {
        return DesugarCollections.unmodifiableCollection(this.f26708b);
    }

    public final Collection c() {
        return DesugarCollections.unmodifiableCollection(this.f26707a);
    }

    public final void d(C2200bb0 c2200bb0) {
        this.f26707a.add(c2200bb0);
    }

    public final void e(C2200bb0 c2200bb0) {
        ArrayList arrayList = this.f26707a;
        boolean g8 = g();
        arrayList.remove(c2200bb0);
        this.f26708b.remove(c2200bb0);
        if (!g8 || g()) {
            return;
        }
        C1116Ab0.c().g();
    }

    public final void f(C2200bb0 c2200bb0) {
        ArrayList arrayList = this.f26708b;
        boolean g8 = g();
        arrayList.add(c2200bb0);
        if (g8) {
            return;
        }
        C1116Ab0.c().f();
    }

    public final boolean g() {
        return this.f26708b.size() > 0;
    }
}
