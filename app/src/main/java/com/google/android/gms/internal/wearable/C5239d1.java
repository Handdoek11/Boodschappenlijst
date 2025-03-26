package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5239d1 extends AbstractC5242e1 {
    C5239d1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final double a(Object obj, long j8) {
        return Double.longBitsToDouble(this.f30122a.getLong(obj, j8));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final float b(Object obj, long j8) {
        return Float.intBitsToFloat(this.f30122a.getInt(obj, j8));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.wearable.f1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.wearable.f1.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.wearable.f1.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z7' boolean)' in method call: com.google.android.gms.internal.wearable.f1.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final void c(Object obj, long j8, boolean z7) {
        if (f1.f30130h) {
            f1.n(obj, j8, z7);
        } else {
            f1.o(obj, j8, z7);
        }
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final void d(Object obj, long j8, byte b8) {
        if (f1.f30130h) {
            f1.d(obj, j8, b8);
        } else {
            f1.e(obj, j8, b8);
        }
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final void e(Object obj, long j8, double d8) {
        this.f30122a.putLong(obj, j8, Double.doubleToLongBits(d8));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final void f(Object obj, long j8, float f8) {
        this.f30122a.putInt(obj, j8, Float.floatToIntBits(f8));
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5242e1
    public final boolean g(Object obj, long j8) {
        return f1.f30130h ? f1.y(obj, j8) : f1.z(obj, j8);
    }
}
