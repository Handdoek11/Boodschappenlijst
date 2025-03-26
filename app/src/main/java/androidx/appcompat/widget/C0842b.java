package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0842b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f7762a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0842b(ActionBarContainer actionBarContainer) {
        this.f7762a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f7762a;
        if (actionBarContainer.f7293y) {
            Drawable drawable = actionBarContainer.f7292x;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f7290v;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f7762a;
        Drawable drawable3 = actionBarContainer2.f7291w;
        if (drawable3 == null || !actionBarContainer2.f7294z) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f7762a;
        if (actionBarContainer.f7293y) {
            if (actionBarContainer.f7292x != null) {
                a.a(actionBarContainer.f7290v, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f7290v;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
