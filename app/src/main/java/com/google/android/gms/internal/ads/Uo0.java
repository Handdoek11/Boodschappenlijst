package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Uo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Uk0 f19468a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19469b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19470c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19471d;

    /* synthetic */ Uo0(Uk0 uk0, int i8, String str, String str2, Vo0 vo0) {
        this.f19468a = uk0;
        this.f19469b = i8;
        this.f19470c = str;
        this.f19471d = str2;
    }

    public final int a() {
        return this.f19469b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Uo0)) {
            return false;
        }
        Uo0 uo0 = (Uo0) obj;
        return this.f19468a == uo0.f19468a && this.f19469b == uo0.f19469b && this.f19470c.equals(uo0.f19470c) && this.f19471d.equals(uo0.f19471d);
    }

    public final int hashCode() {
        return Objects.hash(this.f19468a, Integer.valueOf(this.f19469b), this.f19470c, this.f19471d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f19468a, Integer.valueOf(this.f19469b), this.f19470c, this.f19471d);
    }
}
