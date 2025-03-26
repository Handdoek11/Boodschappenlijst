package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class Sv0 extends Uv0 {
    Sv0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.Uv0
    public final byte a(long j8) {
        return Memory.peekByte((int) j8);
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
        Memory.peekByteArray((int) j8, bArr, (int) j9, (int) j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.Vv0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.Vv0.t(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.Vv0.s(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.Vv0.t(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.Uv0
    public final void e(Object obj, long j8, boolean z7) {
        if (Vv0.f19678i) {
            Vv0.s(obj, j8, z7);
        } else {
            Vv0.t(obj, j8, z7);
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
