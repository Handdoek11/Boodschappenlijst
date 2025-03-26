package com.google.android.gms.internal.ads;

import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.Zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006Zf {

    /* renamed from: d, reason: collision with root package name */
    public static final C2006Zf f20520d = new C2006Zf(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f20521a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20522b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20523c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C2006Zf(float f8, float f9) {
        AbstractC3796qC.d(f8 > 0.0f);
        AbstractC3796qC.d(f9 > 0.0f);
        this.f20521a = f8;
        this.f20522b = f9;
        this.f20523c = Math.round(f8 * 1000.0f);
    }

    public final long a(long j8) {
        return j8 * this.f20523c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2006Zf.class == obj.getClass()) {
            C2006Zf c2006Zf = (C2006Zf) obj;
            if (this.f20521a == c2006Zf.f20521a && this.f20522b == c2006Zf.f20522b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f20521a) + 527) * 31) + Float.floatToRawIntBits(this.f20522b);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f20521a), Float.valueOf(this.f20522b));
    }
}
