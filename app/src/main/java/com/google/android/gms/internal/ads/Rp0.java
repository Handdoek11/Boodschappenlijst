package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
final class Rp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f18710a;

    /* renamed from: b, reason: collision with root package name */
    private final Tt0 f18711b;

    /* synthetic */ Rp0(Class cls, Tt0 tt0, Tp0 tp0) {
        this.f18710a = cls;
        this.f18711b = tt0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rp0)) {
            return false;
        }
        Rp0 rp0 = (Rp0) obj;
        return rp0.f18710a.equals(this.f18710a) && rp0.f18711b.equals(this.f18711b);
    }

    public final int hashCode() {
        return Objects.hash(this.f18710a, this.f18711b);
    }

    public final String toString() {
        Tt0 tt0 = this.f18711b;
        return this.f18710a.getSimpleName() + ", object identifier: " + String.valueOf(tt0);
    }
}
