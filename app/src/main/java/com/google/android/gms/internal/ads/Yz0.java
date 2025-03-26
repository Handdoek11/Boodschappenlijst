package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20368a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20369b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20370c;

    /* synthetic */ Yz0(Wz0 wz0, Xz0 xz0) {
        this.f20368a = wz0.f19928a;
        this.f20369b = wz0.f19929b;
        this.f20370c = wz0.f19930c;
    }

    public final Wz0 a() {
        return new Wz0(this, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yz0)) {
            return false;
        }
        Yz0 yz0 = (Yz0) obj;
        return this.f20368a == yz0.f20368a && this.f20369b == yz0.f20369b && this.f20370c == yz0.f20370c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f20368a), Float.valueOf(this.f20369b), Long.valueOf(this.f20370c)});
    }
}
