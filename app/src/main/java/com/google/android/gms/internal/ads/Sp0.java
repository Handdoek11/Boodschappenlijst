package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
final class Sp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f18970a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f18971b;

    /* synthetic */ Sp0(Class cls, Class cls2, Tp0 tp0) {
        this.f18970a = cls;
        this.f18971b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Sp0)) {
            return false;
        }
        Sp0 sp0 = (Sp0) obj;
        return sp0.f18970a.equals(this.f18970a) && sp0.f18971b.equals(this.f18971b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18970a, this.f18971b);
    }

    public final String toString() {
        Class cls = this.f18971b;
        return this.f18970a.getSimpleName() + " with serialization type: " + cls.getSimpleName();
    }
}
