package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14644a;

    /* renamed from: b, reason: collision with root package name */
    public final C3128k5 f14645b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f14646c;

    /* renamed from: d, reason: collision with root package name */
    public final M9 f14647d;

    /* renamed from: e, reason: collision with root package name */
    public final H2 f14648e;

    /* renamed from: f, reason: collision with root package name */
    public final C3348m6 f14649f;

    static {
        new F1().c();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ E7(String str, C2799h3 c2799h3, C3128k5 c3128k5, J4 j42, M9 m9, C3348m6 c3348m6, AbstractC2372d7 abstractC2372d7) {
        this.f14644a = str;
        this.f14645b = c3128k5;
        this.f14646c = j42;
        this.f14647d = m9;
        this.f14648e = c2799h3;
        this.f14649f = c3348m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e72 = (E7) obj;
        return Objects.equals(this.f14644a, e72.f14644a) && this.f14648e.equals(e72.f14648e) && Objects.equals(this.f14645b, e72.f14645b) && Objects.equals(this.f14646c, e72.f14646c) && Objects.equals(this.f14647d, e72.f14647d) && Objects.equals(this.f14649f, e72.f14649f);
    }

    public final int hashCode() {
        int hashCode = this.f14644a.hashCode() * 31;
        C3128k5 c3128k5 = this.f14645b;
        return (((((((hashCode + (c3128k5 != null ? c3128k5.hashCode() : 0)) * 31) + this.f14646c.hashCode()) * 31) + this.f14648e.hashCode()) * 31) + this.f14647d.hashCode()) * 31;
    }
}
