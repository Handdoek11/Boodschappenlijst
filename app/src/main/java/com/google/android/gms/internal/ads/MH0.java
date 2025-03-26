package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class MH0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17318a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17319b;

    public MH0(long j8, long j9) {
        this.f17318a = j8;
        this.f17319b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MH0)) {
            return false;
        }
        MH0 mh0 = (MH0) obj;
        return this.f17318a == mh0.f17318a && this.f17319b == mh0.f17319b;
    }

    public final int hashCode() {
        return (((int) this.f17318a) * 31) + ((int) this.f17319b);
    }
}
