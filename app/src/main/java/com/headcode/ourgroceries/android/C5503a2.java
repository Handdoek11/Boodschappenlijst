package com.headcode.ourgroceries.android;

import j$.util.Objects;

/* renamed from: com.headcode.ourgroceries.android.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5503a2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34647a;

    /* renamed from: com.headcode.ourgroceries.android.a2$a */
    public interface a {
        void apply(Object obj);
    }

    /* renamed from: com.headcode.ourgroceries.android.a2$b */
    public interface b {
        Object apply(Object obj);
    }

    /* renamed from: com.headcode.ourgroceries.android.a2$c */
    public interface c {
        Object get();
    }

    private C5503a2() {
        this.f34647a = null;
    }

    public static C5503a2 a() {
        return new C5503a2();
    }

    public static C5503a2 e(Object obj) {
        return new C5503a2(obj);
    }

    public Object b(b bVar, c cVar) {
        Object obj = this.f34647a;
        return obj == null ? cVar.get() : bVar.apply(obj);
    }

    public void c(a aVar) {
        Object obj = this.f34647a;
        if (obj != null) {
            aVar.apply(obj);
        }
    }

    public boolean d() {
        return this.f34647a != null;
    }

    private C5503a2(Object obj) {
        Objects.requireNonNull(obj);
        this.f34647a = obj;
    }
}
