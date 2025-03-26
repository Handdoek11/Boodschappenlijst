package N;

import H.AbstractC0626b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f4024a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4025b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4026c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4027d;

    public a(float f8, float f9, long j8, int i8) {
        this.f4024a = f8;
        this.f4025b = f9;
        this.f4026c = j8;
        this.f4027d = i8;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.f4024a == this.f4024a && aVar.f4025b == this.f4025b && aVar.f4026c == this.f4026c && aVar.f4027d == this.f4027d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f4024a) * 31) + Float.floatToIntBits(this.f4025b)) * 31) + AbstractC0626b.a(this.f4026c)) * 31) + this.f4027d;
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f4024a + ",horizontalScrollPixels=" + this.f4025b + ",uptimeMillis=" + this.f4026c + ",deviceId=" + this.f4027d + ')';
    }
}
