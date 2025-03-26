package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class B3 extends D3 {
    B3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f29688a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f29688a.getInt(obj, j8));
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final void c(Object obj, long j8, boolean z7) {
        if (E3.f29699h) {
            E3.d(obj, j8, z7 ? (byte) 1 : (byte) 0);
        } else {
            E3.e(obj, j8, z7 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final void d(Object obj, long j8, byte b8) {
        if (E3.f29699h) {
            E3.d(obj, j8, b8);
        } else {
            E3.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final void e(Object obj, long j8, double d8) {
        this.f29688a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final void f(Object obj, long j8, float f8) {
        this.f29688a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.play_billing.D3
    public final boolean g(Object obj, long j8) {
        return E3.f29699h ? E3.y(obj, j8) : E3.z(obj, j8);
    }
}
