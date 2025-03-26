package T1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d2.AbstractC5709k;

/* loaded from: classes.dex */
public abstract class j implements L1.c, L1.b {

    /* renamed from: o, reason: collision with root package name */
    protected final Drawable f5174o;

    public j(Drawable drawable) {
        this.f5174o = (Drawable) AbstractC5709k.d(drawable);
    }

    @Override // L1.b
    public void a() {
        Drawable drawable = this.f5174o;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof V1.c) {
            ((V1.c) drawable).e().prepareToDraw();
        }
    }

    @Override // L1.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f5174o.getConstantState();
        return constantState == null ? this.f5174o : constantState.newDrawable();
    }
}
