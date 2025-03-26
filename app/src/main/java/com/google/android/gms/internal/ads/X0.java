package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19931a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19932b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19934d;

    public X0(int i8, byte[] bArr, int i9, int i10) {
        this.f19931a = i8;
        this.f19932b = bArr;
        this.f19933c = i9;
        this.f19934d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X0.class == obj.getClass()) {
            X0 x02 = (X0) obj;
            if (this.f19931a == x02.f19931a && this.f19933c == x02.f19933c && this.f19934d == x02.f19934d && Arrays.equals(this.f19932b, x02.f19932b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f19931a * 31) + Arrays.hashCode(this.f19932b)) * 31) + this.f19933c) * 31) + this.f19934d;
    }
}
