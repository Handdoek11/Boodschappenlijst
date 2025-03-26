package androidx.fragment.app;

import J6.AbstractC0650j;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.C7061y0;
import z0.X;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private final List f9939o;

    /* renamed from: s, reason: collision with root package name */
    private final List f9940s;

    /* renamed from: t, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f9941t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9942u;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9943a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            J6.r.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            J6.r.e(view, "v");
            J6.r.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            J6.r.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        J6.r.e(context, "context");
    }

    private final void a(View view) {
        if (this.f9940s.contains(view)) {
            this.f9939o.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        J6.r.e(view, "child");
        if (w.A0(view) != null) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C7061y0 Z7;
        J6.r.e(windowInsets, "insets");
        C7061y0 u7 = C7061y0.u(windowInsets);
        J6.r.d(u7, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9941t;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f9943a;
            J6.r.b(onApplyWindowInsetsListener);
            Z7 = C7061y0.u(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            Z7 = X.Z(this, u7);
        }
        J6.r.d(Z7, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!Z7.n()) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                X.g(getChildAt(i8), Z7);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        J6.r.e(canvas, "canvas");
        if (this.f9942u) {
            Iterator it = this.f9939o.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        J6.r.e(canvas, "canvas");
        J6.r.e(view, "child");
        if (this.f9942u && !this.f9939o.isEmpty() && this.f9939o.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j8);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        J6.r.e(view, "view");
        this.f9940s.remove(view);
        if (this.f9939o.remove(view)) {
            this.f9942u = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) w.j0(this).g0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        J6.r.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                J6.r.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        J6.r.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i8) {
        View childAt = getChildAt(i8);
        J6.r.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        J6.r.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i8, int i9) {
        int i10 = i8 + i9;
        for (int i11 = i8; i11 < i10; i11++) {
            View childAt = getChildAt(i11);
            J6.r.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i8, i9);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i8, int i9) {
        int i10 = i8 + i9;
        for (int i11 = i8; i11 < i10; i11++) {
            View childAt = getChildAt(i11);
            J6.r.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i8, i9);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f9942u = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        J6.r.e(onApplyWindowInsetsListener, "listener");
        this.f9941t = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        J6.r.e(view, "view");
        if (view.getParent() == this) {
            this.f9940s.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC0650j abstractC0650j) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i8) {
        String str;
        super(context, attributeSet, i8);
        J6.r.e(context, "context");
        this.f9939o = new ArrayList();
        this.f9940s = new ArrayList();
        this.f9942u = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = O0.c.f4234e;
            J6.r.d(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(O0.c.f4235f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, w wVar) {
        String str;
        super(context, attributeSet);
        J6.r.e(context, "context");
        J6.r.e(attributeSet, "attrs");
        J6.r.e(wVar, "fm");
        this.f9939o = new ArrayList();
        this.f9940s = new ArrayList();
        this.f9942u = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = O0.c.f4234e;
        J6.r.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(O0.c.f4235f) : classAttribute;
        String string = obtainStyledAttributes.getString(O0.c.f4236g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment g02 = wVar.g0(id);
        if (classAttribute != null && g02 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a8 = wVar.r0().a(context.getClassLoader(), classAttribute);
            J6.r.d(a8, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a8.V0(context, attributeSet, null);
            wVar.o().p(true).c(this, a8, string).j();
        }
        wVar.X0(this);
    }
}
