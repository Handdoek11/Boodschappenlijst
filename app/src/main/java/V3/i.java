package V3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f5650a;

    public i(float f8) {
        this.f5650a = f8;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // V3.c
    public float a(RectF rectF) {
        return this.f5650a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f5650a == ((i) obj).f5650a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5650a)});
    }
}
