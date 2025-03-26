package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
final class Bp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f13889a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f13890b;

    /* synthetic */ Bp0(Class cls, Class cls2, Dp0 dp0) {
        this.f13889a = cls;
        this.f13890b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Bp0)) {
            return false;
        }
        Bp0 bp0 = (Bp0) obj;
        return bp0.f13889a.equals(this.f13889a) && bp0.f13890b.equals(this.f13890b);
    }

    public final int hashCode() {
        return Objects.hash(this.f13889a, this.f13890b);
    }

    public final String toString() {
        Class cls = this.f13890b;
        return this.f13889a.getSimpleName() + " with primitive type: " + cls.getSimpleName();
    }
}
