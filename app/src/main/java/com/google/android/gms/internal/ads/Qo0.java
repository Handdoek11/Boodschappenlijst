package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class Qo0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Qo0 f18535b = new Oo0().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f18536a;

    public final Map a() {
        return this.f18536a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Qo0) {
            return this.f18536a.equals(((Qo0) obj).f18536a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18536a.hashCode();
    }

    public final String toString() {
        return this.f18536a.toString();
    }
}
