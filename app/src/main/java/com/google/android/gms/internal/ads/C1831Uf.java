package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1831Uf {

    /* renamed from: a, reason: collision with root package name */
    private final String f19426a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f19427b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19428c;

    protected C1831Uf(String str, Object obj, int i8) {
        this.f19426a = str;
        this.f19427b = obj;
        this.f19428c = i8;
    }

    public static C1831Uf a(String str, double d8) {
        return new C1831Uf(str, Double.valueOf(d8), 3);
    }

    public static C1831Uf b(String str, long j8) {
        return new C1831Uf(str, Long.valueOf(j8), 2);
    }

    public static C1831Uf c(String str, String str2) {
        return new C1831Uf("gad:dynamite_module:experiment_id", "", 4);
    }

    public static C1831Uf d(String str, boolean z7) {
        return new C1831Uf(str, Boolean.valueOf(z7), 1);
    }

    public final Object e() {
        InterfaceC1161Bg a8 = AbstractC1233Dg.a();
        if (a8 == null) {
            AbstractC1233Dg.b();
            return this.f19427b;
        }
        int i8 = this.f19428c - 1;
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? a8.a(this.f19426a, (String) this.f19427b) : a8.b(this.f19426a, ((Double) this.f19427b).doubleValue()) : a8.c(this.f19426a, ((Long) this.f19427b).longValue()) : a8.d(this.f19426a, ((Boolean) this.f19427b).booleanValue());
    }
}
