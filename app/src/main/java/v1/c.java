package V1;

import J1.l;
import V1.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import d2.AbstractC5709k;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: A, reason: collision with root package name */
    private Rect f5515A;

    /* renamed from: B, reason: collision with root package name */
    private List f5516B;

    /* renamed from: o, reason: collision with root package name */
    private final a f5517o;

    /* renamed from: s, reason: collision with root package name */
    private boolean f5518s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5519t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f5520u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5521v;

    /* renamed from: w, reason: collision with root package name */
    private int f5522w;

    /* renamed from: x, reason: collision with root package name */
    private int f5523x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f5524y;

    /* renamed from: z, reason: collision with root package name */
    private Paint f5525z;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f5526a;

        a(g gVar) {
            this.f5526a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, I1.a aVar, l lVar, int i8, int i9, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.c(context), aVar, i8, i9, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f5515A == null) {
            this.f5515A = new Rect();
        }
        return this.f5515A;
    }

    private Paint h() {
        if (this.f5525z == null) {
            this.f5525z = new Paint(2);
        }
        return this.f5525z;
    }

    private void j() {
        List list = this.f5516B;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f5516B.get(i8)).b(this);
            }
        }
    }

    private void l() {
        this.f5522w = 0;
    }

    private void n() {
        AbstractC5709k.a(!this.f5520u, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f5517o.f5526a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f5518s) {
                return;
            }
            this.f5518s = true;
            this.f5517o.f5526a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f5518s = false;
        this.f5517o.f5526a.s(this);
    }

    @Override // V1.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f5522w++;
        }
        int i8 = this.f5523x;
        if (i8 == -1 || this.f5522w < i8) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f5517o.f5526a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f5520u) {
            return;
        }
        if (this.f5524y) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f5524y = false;
        }
        canvas.drawBitmap(this.f5517o.f5526a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f5517o.f5526a.e();
    }

    public int f() {
        return this.f5517o.f5526a.f();
    }

    public int g() {
        return this.f5517o.f5526a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5517o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5517o.f5526a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5517o.f5526a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f5517o.f5526a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5518s;
    }

    public void k() {
        this.f5520u = true;
        this.f5517o.f5526a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f5517o.f5526a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5524y = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        h().setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        AbstractC5709k.a(!this.f5520u, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f5521v = z7;
        if (!z7) {
            o();
        } else if (this.f5519t) {
            n();
        }
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5519t = true;
        l();
        if (this.f5521v) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5519t = false;
        o();
    }

    c(a aVar) {
        this.f5521v = true;
        this.f5523x = -1;
        this.f5517o = (a) AbstractC5709k.d(aVar);
    }
}
