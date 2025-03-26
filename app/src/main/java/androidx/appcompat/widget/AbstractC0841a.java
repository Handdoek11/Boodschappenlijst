package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import f.AbstractC5752a;
import z0.C7026g0;
import z0.InterfaceC7028h0;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC0841a extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    protected final C0136a f7732o;

    /* renamed from: s, reason: collision with root package name */
    protected final Context f7733s;

    /* renamed from: t, reason: collision with root package name */
    protected ActionMenuView f7734t;

    /* renamed from: u, reason: collision with root package name */
    protected C0843c f7735u;

    /* renamed from: v, reason: collision with root package name */
    protected int f7736v;

    /* renamed from: w, reason: collision with root package name */
    protected C7026g0 f7737w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f7738x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7739y;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0136a implements InterfaceC7028h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7740a = false;

        /* renamed from: b, reason: collision with root package name */
        int f7741b;

        protected C0136a() {
        }

        @Override // z0.InterfaceC7028h0
        public void a(View view) {
            this.f7740a = true;
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            if (this.f7740a) {
                return;
            }
            AbstractC0841a abstractC0841a = AbstractC0841a.this;
            abstractC0841a.f7737w = null;
            AbstractC0841a.super.setVisibility(this.f7741b);
        }

        @Override // z0.InterfaceC7028h0
        public void c(View view) {
            AbstractC0841a.super.setVisibility(0);
            this.f7740a = false;
        }

        public C0136a d(C7026g0 c7026g0, int i8) {
            AbstractC0841a.this.f7737w = c7026g0;
            this.f7741b = i8;
            return this;
        }
    }

    AbstractC0841a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7732o = new C0136a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC5752a.f35374a, typedValue, true) || typedValue.resourceId == 0) {
            this.f7733s = context;
        } else {
            this.f7733s = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i8, int i9, boolean z7) {
        return z7 ? i8 - i9 : i8 + i9;
    }

    protected int c(View view, int i8, int i9, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i9);
        return Math.max(0, (i8 - view.getMeasuredWidth()) - i10);
    }

    protected int e(View view, int i8, int i9, int i10, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i9 + ((i10 - measuredHeight) / 2);
        if (z7) {
            view.layout(i8 - measuredWidth, i11, i8, measuredHeight + i11);
        } else {
            view.layout(i8, i11, i8 + measuredWidth, measuredHeight + i11);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public C7026g0 f(int i8, long j8) {
        C7026g0 c7026g0 = this.f7737w;
        if (c7026g0 != null) {
            c7026g0.c();
        }
        if (i8 != 0) {
            C7026g0 b8 = z0.X.e(this).b(0.0f);
            b8.i(j8);
            b8.k(this.f7732o.d(b8, i8));
            return b8;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C7026g0 b9 = z0.X.e(this).b(1.0f);
        b9.i(j8);
        b9.k(this.f7732o.d(b9, i8));
        return b9;
    }

    public int getAnimatedVisibility() {
        return this.f7737w != null ? this.f7732o.f7741b : getVisibility();
    }

    public int getContentHeight() {
        return this.f7736v;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.j.f35669a, AbstractC5752a.f35376c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(f.j.f35714j, 0));
        obtainStyledAttributes.recycle();
        C0843c c0843c = this.f7735u;
        if (c0843c != null) {
            c0843c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7739y = false;
        }
        if (!this.f7739y) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7739y = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7739y = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7738x = false;
        }
        if (!this.f7738x) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7738x = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7738x = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i8);

    @Override // android.view.View
    public void setVisibility(int i8) {
        if (i8 != getVisibility()) {
            C7026g0 c7026g0 = this.f7737w;
            if (c7026g0 != null) {
                c7026g0.c();
            }
            super.setVisibility(i8);
        }
    }
}
