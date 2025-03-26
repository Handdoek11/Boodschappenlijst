package i5;

import android.view.animation.Interpolator;

/* renamed from: i5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class InterpolatorC5863c implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float f36533a;

    /* renamed from: b, reason: collision with root package name */
    private final float f36534b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36535c;

    public InterpolatorC5863c() {
        this(0.3f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f8) {
        return Math.abs(f8 - 0.5f) < this.f36534b ? (f8 - this.f36533a) * this.f36535c : f8 < 0.5f ? 0.0f : 1.0f;
    }

    public InterpolatorC5863c(float f8) {
        if (f8 < 0.0f || f8 >= 0.5f) {
            throw new IllegalArgumentException("Invalid threshold range: " + f8);
        }
        float f9 = 1.0f - (2.0f * f8);
        this.f36533a = f8;
        this.f36534b = 0.5f * f9;
        this.f36535c = 1.0f / f9;
    }
}
