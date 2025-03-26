package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class r extends ImageView {

    /* renamed from: o, reason: collision with root package name */
    private final C0845e f7926o;

    /* renamed from: s, reason: collision with root package name */
    private final C0857q f7927s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7928t;

    public r(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            c0845e.b();
        }
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            return c0845e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            return c0845e.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            return c0857q.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            return c0857q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f7927s.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            c0845e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            c0845e.g(i8);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0857q c0857q = this.f7927s;
        if (c0857q != null && drawable != null && !this.f7928t) {
            c0857q.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0857q c0857q2 = this.f7927s;
        if (c0857q2 != null) {
            c0857q2.c();
            if (this.f7928t) {
                return;
            }
            this.f7927s.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i8) {
        super.setImageLevel(i8);
        this.f7928t = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.i(i8);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            c0845e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0845e c0845e = this.f7926o;
        if (c0845e != null) {
            c0845e.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0857q c0857q = this.f7927s;
        if (c0857q != null) {
            c0857q.k(mode);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i8) {
        super(c0.b(context), attributeSet, i8);
        this.f7928t = false;
        b0.a(this, getContext());
        C0845e c0845e = new C0845e(this);
        this.f7926o = c0845e;
        c0845e.e(attributeSet, i8);
        C0857q c0857q = new C0857q(this);
        this.f7927s = c0857q;
        c0857q.g(attributeSet, i8);
    }
}
