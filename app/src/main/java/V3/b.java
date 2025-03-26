package V3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final c f5597a;

    /* renamed from: b, reason: collision with root package name */
    private final float f5598b;

    public b(float f8, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f5597a;
            f8 += ((b) cVar).f5598b;
        }
        this.f5597a = cVar;
        this.f5598b = f8;
    }

    @Override // V3.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f5597a.a(rectF) + this.f5598b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5597a.equals(bVar.f5597a) && this.f5598b == bVar.f5598b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5597a, Float.valueOf(this.f5598b)});
    }
}
