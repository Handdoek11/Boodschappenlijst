package T1;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class k extends j {
    private k(Drawable drawable) {
        super(drawable);
    }

    static L1.c f(Drawable drawable) {
        if (drawable != null) {
            return new k(drawable);
        }
        return null;
    }

    @Override // L1.c
    public int c() {
        return Math.max(1, this.f5174o.getIntrinsicWidth() * this.f5174o.getIntrinsicHeight() * 4);
    }

    @Override // L1.c
    public Class d() {
        return this.f5174o.getClass();
    }

    @Override // L1.c
    public void b() {
    }
}
