package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import f.AbstractC5757f;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private int f7285A;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7286o;

    /* renamed from: s, reason: collision with root package name */
    private View f7287s;

    /* renamed from: t, reason: collision with root package name */
    private View f7288t;

    /* renamed from: u, reason: collision with root package name */
    private View f7289u;

    /* renamed from: v, reason: collision with root package name */
    Drawable f7290v;

    /* renamed from: w, reason: collision with root package name */
    Drawable f7291w;

    /* renamed from: x, reason: collision with root package name */
    Drawable f7292x;

    /* renamed from: y, reason: collision with root package name */
    boolean f7293y;

    /* renamed from: z, reason: collision with root package name */
    boolean f7294z;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0842b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35669a);
        this.f7290v = obtainStyledAttributes.getDrawable(f.j.f35674b);
        this.f7291w = obtainStyledAttributes.getDrawable(f.j.f35684d);
        this.f7285A = obtainStyledAttributes.getDimensionPixelSize(f.j.f35714j, -1);
        boolean z7 = true;
        if (getId() == AbstractC5757f.f35474H) {
            this.f7293y = true;
            this.f7292x = obtainStyledAttributes.getDrawable(f.j.f35679c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f7293y ? this.f7290v != null || this.f7291w != null : this.f7292x != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7290v;
        if (drawable != null && drawable.isStateful()) {
            this.f7290v.setState(getDrawableState());
        }
        Drawable drawable2 = this.f7291w;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f7291w.setState(getDrawableState());
        }
        Drawable drawable3 = this.f7292x;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f7292x.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f7287s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7290v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7291w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f7292x;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7288t = findViewById(AbstractC5757f.f35483a);
        this.f7289u = findViewById(AbstractC5757f.f35488f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f7286o || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.view.View r5 = r4.f7287s
            r7 = 8
            r9 = 1
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.getVisibility()
            if (r1 == r7) goto L13
            r1 = r9
            goto L14
        L13:
            r1 = r0
        L14:
            if (r5 == 0) goto L33
            int r2 = r5.getVisibility()
            if (r2 == r7) goto L33
            int r7 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r5.getMeasuredHeight()
            int r3 = r7 - r3
            int r2 = r2.bottomMargin
            int r3 = r3 - r2
            int r7 = r7 - r2
            r5.layout(r6, r3, r8, r7)
        L33:
            boolean r6 = r4.f7293y
            if (r6 == 0) goto L4b
            android.graphics.drawable.Drawable r5 = r4.f7292x
            if (r5 == 0) goto L48
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            r5.setBounds(r0, r0, r6, r7)
            goto Lbe
        L48:
            r9 = r0
            goto Lbe
        L4b:
            android.graphics.drawable.Drawable r6 = r4.f7290v
            if (r6 == 0) goto La3
            android.view.View r6 = r4.f7288t
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L75
            android.graphics.drawable.Drawable r6 = r4.f7290v
            android.view.View r7 = r4.f7288t
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f7288t
            int r8 = r8.getTop()
            android.view.View r0 = r4.f7288t
            int r0 = r0.getRight()
            android.view.View r2 = r4.f7288t
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L75:
            android.view.View r6 = r4.f7289u
            if (r6 == 0) goto L9d
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L9d
            android.graphics.drawable.Drawable r6 = r4.f7290v
            android.view.View r7 = r4.f7289u
            int r7 = r7.getLeft()
            android.view.View r8 = r4.f7289u
            int r8 = r8.getTop()
            android.view.View r0 = r4.f7289u
            int r0 = r0.getRight()
            android.view.View r2 = r4.f7289u
            int r2 = r2.getBottom()
            r6.setBounds(r7, r8, r0, r2)
            goto La2
        L9d:
            android.graphics.drawable.Drawable r6 = r4.f7290v
            r6.setBounds(r0, r0, r0, r0)
        La2:
            r0 = r9
        La3:
            r4.f7294z = r1
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r4.f7291w
            if (r6 == 0) goto L48
            int r7 = r5.getLeft()
            int r8 = r5.getTop()
            int r0 = r5.getRight()
            int r5 = r5.getBottom()
            r6.setBounds(r7, r8, r0, r5)
        Lbe:
            if (r9 == 0) goto Lc3
            r4.invalidate()
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        if (this.f7288t == null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f7285A) >= 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i8, i9);
        if (this.f7288t == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        View view = this.f7287s;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f7288t) ? a(this.f7288t) : !b(this.f7289u) ? a(this.f7289u) : 0) + a(this.f7287s), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i9) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f7290v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f7290v);
        }
        this.f7290v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f7288t;
            if (view != null) {
                this.f7290v.setBounds(view.getLeft(), this.f7288t.getTop(), this.f7288t.getRight(), this.f7288t.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f7293y ? !(this.f7290v != null || this.f7291w != null) : this.f7292x == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7292x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7292x);
        }
        this.f7292x = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7293y && (drawable2 = this.f7292x) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f7293y ? !(this.f7290v != null || this.f7291w != null) : this.f7292x == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f7291w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f7291w);
        }
        this.f7291w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f7294z && (drawable2 = this.f7291w) != null) {
                drawable2.setBounds(this.f7287s.getLeft(), this.f7287s.getTop(), this.f7287s.getRight(), this.f7287s.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f7293y ? !(this.f7290v != null || this.f7291w != null) : this.f7292x == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(Z z7) {
        View view = this.f7287s;
        if (view != null) {
            removeView(view);
        }
        this.f7287s = z7;
    }

    public void setTransitioning(boolean z7) {
        this.f7286o = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z7 = i8 == 0;
        Drawable drawable = this.f7290v;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f7291w;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f7292x;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f7290v && !this.f7293y) || (drawable == this.f7291w && this.f7294z) || ((drawable == this.f7292x && this.f7293y) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }
}
