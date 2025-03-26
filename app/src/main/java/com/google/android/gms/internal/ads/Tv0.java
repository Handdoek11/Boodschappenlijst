package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class Tv0 extends Uv0 {
    Tv0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final byte a(long j8) {
        return Memory.peekByte(j8);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final double b(Object obj, long j8) {
        return Double.longBitsToDouble(this.f19482a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final float c(Object obj, long j8) {
        return Float.intBitsToFloat(this.f19482a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final void d(long j8, byte[] bArr, long j9, long j10) {
        Memory.peekByteArray(j8, bArr, (int) j9, (int) j10);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final void e(Object obj, long j8, boolean z7) {
        if (Vv0.f19678i) {
            Vv0.g(obj, j8, z7 ? (byte) 1 : (byte) 0);
        } else {
            Vv0.h(obj, j8, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final void f(Object obj, long j8, byte b8) {
        if (Vv0.f19678i) {
            Vv0.g(obj, j8, b8);
        } else {
            Vv0.h(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final void g(Object obj, long j8, double d8) {
        this.f19482a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final void h(Object obj, long j8, float f8) {
        this.f19482a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final boolean i(Object obj, long j8) {
        return Vv0.f19678i ? Vv0.E(obj, j8) : Vv0.F(obj, j8);
    }
}
