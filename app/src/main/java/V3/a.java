package V3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final float f5596a;

    public a(float f8) {
        this.f5596a = f8;
    }

    @Override // V3.c
    public float a(RectF rectF) {
        return this.f5596a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5596a == ((a) obj).f5596a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5596a)});
    }
}
