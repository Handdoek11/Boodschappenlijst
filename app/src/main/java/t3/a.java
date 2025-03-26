package T3;

import V3.g;
import V3.k;
import V3.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class a extends Drawable implements n {

    /* renamed from: o, reason: collision with root package name */
    private b f5181o;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f5181o = new b(this.f5181o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f5181o;
        if (bVar.f5183b) {
            bVar.f5182a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5181o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5181o.f5182a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5181o.f5182a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f5181o.f5182a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e8 = T3.b.e(iArr);
        b bVar = this.f5181o;
        if (bVar.f5183b == e8) {
            return onStateChange;
        }
        bVar.f5183b = e8;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f5181o.f5182a.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5181o.f5182a.setColorFilter(colorFilter);
    }

    @Override // V3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f5181o.f5182a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        this.f5181o.f5182a.setTint(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5181o.f5182a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5181o.f5182a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        g f5182a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5183b;

        public b(g gVar) {
            this.f5182a = gVar;
            this.f5183b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f5182a = (g) bVar.f5182a.getConstantState().newDrawable();
            this.f5183b = bVar.f5183b;
        }
    }

    private a(b bVar) {
        this.f5181o = bVar;
    }
}
