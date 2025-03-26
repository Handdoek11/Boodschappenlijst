package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m0.AbstractC6183a;
import m0.AbstractC6184b;
import m0.AbstractC6185c;
import o0.AbstractC6278a;
import r0.AbstractC6641a;
import z0.AbstractC7048s;
import z0.C7003G;
import z0.C7061y0;
import z0.InterfaceC7001E;
import z0.InterfaceC7002F;
import z0.InterfaceC7004H;
import z0.X;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC7001E, InterfaceC7002F {

    /* renamed from: L, reason: collision with root package name */
    static final String f9018L;

    /* renamed from: M, reason: collision with root package name */
    static final Class[] f9019M;

    /* renamed from: N, reason: collision with root package name */
    static final ThreadLocal f9020N;

    /* renamed from: O, reason: collision with root package name */
    static final Comparator f9021O;

    /* renamed from: P, reason: collision with root package name */
    private static final y0.f f9022P;

    /* renamed from: A, reason: collision with root package name */
    private int[] f9023A;

    /* renamed from: B, reason: collision with root package name */
    private View f9024B;

    /* renamed from: C, reason: collision with root package name */
    private View f9025C;

    /* renamed from: D, reason: collision with root package name */
    private g f9026D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f9027E;

    /* renamed from: F, reason: collision with root package name */
    private C7061y0 f9028F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f9029G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f9030H;

    /* renamed from: I, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f9031I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC7004H f9032J;

    /* renamed from: K, reason: collision with root package name */
    private final C7003G f9033K;

    /* renamed from: o, reason: collision with root package name */
    private final List f9034o;

    /* renamed from: s, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.b f9035s;

    /* renamed from: t, reason: collision with root package name */
    private final List f9036t;

    /* renamed from: u, reason: collision with root package name */
    private final List f9037u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f9038v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f9039w;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f9040x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9041y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9042z;

    class a implements InterfaceC7004H {
        a() {
        }

        @Override // z0.InterfaceC7004H
        public C7061y0 a(View view, C7061y0 c7061y0) {
            return CoordinatorLayout.this.V(c7061y0);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            if (i9 == 0) {
                return z(coordinatorLayout, view, view2, view3, i8);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i8) {
            if (i8 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f9, boolean z7) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f8, float f9) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
            if (i10 == 0) {
                p(coordinatorLayout, view, view2, i8, i9, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12) {
            if (i12 == 0) {
                r(coordinatorLayout, view, view2, i8, i9, i10, i11);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i10;
            iArr[1] = iArr[1] + i11;
            s(coordinatorLayout, view, view2, i8, i9, i10, i11, i12);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            if (i9 == 0) {
                u(coordinatorLayout, view, view2, view3, i8);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z7) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public C7061y0 f(CoordinatorLayout coordinatorLayout, View view, C7061y0 c7061y0) {
            return c7061y0;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9031I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.G(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9031I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.G(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float L7 = X.L(view);
            float L8 = X.L(view2);
            if (L7 > L8) {
                return -1;
            }
            return L7 < L8 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f9018L = r02 != null ? r02.getName() : null;
        f9021O = new i();
        f9019M = new Class[]{Context.class, AttributeSet.class};
        f9020N = new ThreadLocal();
        f9022P = new y0.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC6183a.f38900a);
    }

    private void B(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        Rect a8 = a();
        a8.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f9028F != null && X.w(this) && !X.w(view)) {
            a8.left += this.f9028F.i();
            a8.top += this.f9028F.k();
            a8.right -= this.f9028F.j();
            a8.bottom -= this.f9028F.h();
        }
        Rect a9 = a();
        AbstractC7048s.a(R(fVar.f9047c), view.getMeasuredWidth(), view.getMeasuredHeight(), a8, a9, i8);
        view.layout(a9.left, a9.top, a9.right, a9.bottom);
        N(a8);
        N(a9);
    }

    private void C(View view, View view2, int i8) {
        Rect a8 = a();
        Rect a9 = a();
        try {
            s(view2, a8);
            t(view, i8, a8, a9);
            view.layout(a9.left, a9.top, a9.right, a9.bottom);
        } finally {
            N(a8);
            N(a9);
        }
    }

    private void D(View view, int i8, int i9) {
        f fVar = (f) view.getLayoutParams();
        int b8 = AbstractC7048s.b(S(fVar.f9047c), i9);
        int i10 = b8 & 7;
        int i11 = b8 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i9 == 1) {
            i8 = width - i8;
        }
        int v7 = v(i8) - measuredWidth;
        if (i10 == 1) {
            v7 += measuredWidth / 2;
        } else if (i10 == 5) {
            v7 += measuredWidth;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(v7, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void E(View view, Rect rect, int i8) {
        boolean z7;
        boolean z8;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        if (X.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f8 = fVar.f();
            Rect a8 = a();
            Rect a9 = a();
            a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f8 == null || !f8.b(this, view, a8)) {
                a8.set(a9);
            } else if (!a9.contains(a8)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
            }
            N(a9);
            if (a8.isEmpty()) {
                N(a8);
                return;
            }
            int b8 = AbstractC7048s.b(fVar.f9052h, i8);
            boolean z9 = true;
            if ((b8 & 48) != 48 || (i13 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f9054j) >= (i14 = rect.top)) {
                z7 = false;
            } else {
                U(view, i14 - i13);
                z7 = true;
            }
            if ((b8 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f9054j) < (i12 = rect.bottom)) {
                U(view, height - i12);
                z7 = true;
            }
            if (!z7) {
                U(view, 0);
            }
            if ((b8 & 3) != 3 || (i10 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f9053i) >= (i11 = rect.left)) {
                z8 = false;
            } else {
                T(view, i11 - i10);
                z8 = true;
            }
            if ((b8 & 5) != 5 || (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f9053i) >= (i9 = rect.right)) {
                z9 = z8;
            } else {
                T(view, width - i9);
            }
            if (!z9) {
                T(view, 0);
            }
            N(a8);
        }
    }

    static c J(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f9018L;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f9020N;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f9019M);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e8) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e8);
        }
    }

    private boolean K(MotionEvent motionEvent, int i8) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f9036t;
        y(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) list.get(i9);
            f fVar = (f) view.getLayoutParams();
            c f8 = fVar.f();
            if (!(z7 || z8) || actionMasked == 0) {
                if (!z7 && f8 != null) {
                    if (i8 == 0) {
                        z7 = f8.k(this, view, motionEvent);
                    } else if (i8 == 1) {
                        z7 = f8.D(this, view, motionEvent);
                    }
                    if (z7) {
                        this.f9024B = view;
                    }
                }
                boolean c8 = fVar.c();
                boolean i10 = fVar.i(this, view);
                z8 = i10 && !c8;
                if (i10 && !z8) {
                    break;
                }
            } else if (f8 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i8 == 0) {
                    f8.k(this, view, motionEvent2);
                } else if (i8 == 1) {
                    f8.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z7;
    }

    private void L() {
        this.f9034o.clear();
        this.f9035s.c();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f x7 = x(childAt);
            x7.d(this, childAt);
            this.f9035s.b(childAt);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (i9 != i8) {
                    View childAt2 = getChildAt(i9);
                    if (x7.b(this, childAt, childAt2)) {
                        if (!this.f9035s.d(childAt2)) {
                            this.f9035s.b(childAt2);
                        }
                        this.f9035s.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f9034o.addAll(this.f9035s.i());
        Collections.reverse(this.f9034o);
    }

    private static void N(Rect rect) {
        rect.setEmpty();
        f9022P.a(rect);
    }

    private void P(boolean z7) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            c f8 = ((f) childAt.getLayoutParams()).f();
            if (f8 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z7) {
                    f8.k(this, childAt, obtain);
                } else {
                    f8.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            ((f) getChildAt(i9).getLayoutParams()).m();
        }
        this.f9024B = null;
        this.f9041y = false;
    }

    private static int Q(int i8) {
        if (i8 == 0) {
            return 17;
        }
        return i8;
    }

    private static int R(int i8) {
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        return (i8 & 112) == 0 ? i8 | 48 : i8;
    }

    private static int S(int i8) {
        if (i8 == 0) {
            return 8388661;
        }
        return i8;
    }

    private void T(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f9053i;
        if (i9 != i8) {
            X.X(view, i8 - i9);
            fVar.f9053i = i8;
        }
    }

    private void U(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f9054j;
        if (i9 != i8) {
            X.Y(view, i8 - i9);
            fVar.f9054j = i8;
        }
    }

    private void W() {
        if (!X.w(this)) {
            X.A0(this, null);
            return;
        }
        if (this.f9032J == null) {
            this.f9032J = new a();
        }
        X.A0(this, this.f9032J);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f9022P.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : i8 > i10 ? i10 : i8;
    }

    private void d(f fVar, Rect rect, int i8, int i9) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i8) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i9) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i8 + max, i9 + max2);
    }

    private C7061y0 e(C7061y0 c7061y0) {
        c f8;
        if (c7061y0.n()) {
            return c7061y0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (X.w(childAt) && (f8 = ((f) childAt.getLayoutParams()).f()) != null) {
                c7061y0 = f8.f(this, childAt, c7061y0);
                if (c7061y0.n()) {
                    break;
                }
            }
        }
        return c7061y0;
    }

    private void u(View view, int i8, Rect rect, Rect rect2, f fVar, int i9, int i10) {
        int b8 = AbstractC7048s.b(Q(fVar.f9047c), i8);
        int b9 = AbstractC7048s.b(R(fVar.f9048d), i8);
        int i11 = b8 & 7;
        int i12 = b8 & 112;
        int i13 = b9 & 7;
        int i14 = b9 & 112;
        int width = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            width -= i9 / 2;
        } else if (i11 != 5) {
            width -= i9;
        }
        if (i12 == 16) {
            height -= i10 / 2;
        } else if (i12 != 80) {
            height -= i10;
        }
        rect2.set(width, height, i9 + width, i10 + height);
    }

    private int v(int i8) {
        int[] iArr = this.f9023A;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i8);
            return 0;
        }
        if (i8 >= 0 && i8 < iArr.length) {
            return iArr[i8];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i8 + " out of range for " + this);
        return 0;
    }

    private void y(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i8) : i8));
        }
        Comparator comparator = f9021O;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean z(View view) {
        return this.f9035s.j(view);
    }

    public boolean A(View view, int i8, int i9) {
        Rect a8 = a();
        s(view, a8);
        try {
            return a8.contains(i8, i9);
        } finally {
            N(a8);
        }
    }

    void F(View view, int i8) {
        c f8;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f9055k != null) {
            Rect a8 = a();
            Rect a9 = a();
            Rect a10 = a();
            s(fVar.f9055k, a8);
            q(view, false, a9);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            u(view, i8, a8, a10, fVar, measuredWidth, measuredHeight);
            boolean z7 = (a10.left == a9.left && a10.top == a9.top) ? false : true;
            d(fVar, a10, measuredWidth, measuredHeight);
            int i9 = a10.left - a9.left;
            int i10 = a10.top - a9.top;
            if (i9 != 0) {
                X.X(view, i9);
            }
            if (i10 != 0) {
                X.Y(view, i10);
            }
            if (z7 && (f8 = fVar.f()) != null) {
                f8.h(this, view, fVar.f9055k);
            }
            N(a8);
            N(a9);
            N(a10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void G(int r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.G(int):void");
    }

    public void H(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f9055k;
        if (view2 != null) {
            C(view, view2, i8);
            return;
        }
        int i9 = fVar.f9049e;
        if (i9 >= 0) {
            D(view, i9, i8);
        } else {
            B(view, i8);
        }
    }

    public void I(View view, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    void M(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void O() {
        if (this.f9042z && this.f9026D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9026D);
        }
        this.f9027E = false;
    }

    final C7061y0 V(C7061y0 c7061y0) {
        if (y0.d.a(this.f9028F, c7061y0)) {
            return c7061y0;
        }
        this.f9028F = c7061y0;
        boolean z7 = false;
        boolean z8 = c7061y0 != null && c7061y0.k() > 0;
        this.f9029G = z8;
        if (!z8 && getBackground() == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        C7061y0 e8 = e(c7061y0);
        requestLayout();
        return e8;
    }

    void b() {
        if (this.f9042z) {
            if (this.f9026D == null) {
                this.f9026D = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9026D);
        }
        this.f9027E = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j8) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f9045a;
        if (cVar != null) {
            float d8 = cVar.d(this, view);
            if (d8 > 0.0f) {
                if (this.f9038v == null) {
                    this.f9038v = new Paint();
                }
                this.f9038v.setColor(fVar.f9045a.c(this, view));
                this.f9038v.setAlpha(c(Math.round(d8 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f9038v);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9030H;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List g8 = this.f9035s.g(view);
        if (g8 == null || g8.isEmpty()) {
            return;
        }
        for (int i8 = 0; i8 < g8.size(); i8++) {
            View view2 = (View) g8.get(i8);
            c f8 = ((f) view2.getLayoutParams()).f();
            if (f8 != null) {
                f8.h(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            if (z(getChildAt(i8))) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (z7 != this.f9027E) {
            if (z7) {
                b();
            } else {
                O();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        L();
        return DesugarCollections.unmodifiableList(this.f9034o);
    }

    public final C7061y0 getLastWindowInsets() {
        return this.f9028F;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9033K.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f9030H;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // z0.InterfaceC7002F
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        c f8;
        boolean z7;
        int min;
        int childCount = getChildCount();
        boolean z8 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (f8 = fVar.f()) != null) {
                    int[] iArr2 = this.f9039w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f8.t(this, childAt, view, i8, i9, i10, i11, i12, iArr2);
                    int[] iArr3 = this.f9039w;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    if (i11 > 0) {
                        z7 = true;
                        min = Math.max(i14, this.f9039w[1]);
                    } else {
                        z7 = true;
                        min = Math.min(i14, this.f9039w[1]);
                    }
                    i14 = min;
                    z8 = z7;
                }
            }
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (z8) {
            G(1);
        }
    }

    @Override // z0.InterfaceC7001E
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        j(view, i8, i9, i10, i11, 0, this.f9040x);
    }

    @Override // z0.InterfaceC7001E
    public boolean l(View view, View view2, int i8, int i9) {
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f8 = fVar.f();
                if (f8 != null) {
                    boolean A7 = f8.A(this, childAt, view, view2, i8, i9);
                    z7 |= A7;
                    fVar.r(i9, A7);
                } else {
                    fVar.r(i9, false);
                }
            }
        }
        return z7;
    }

    @Override // z0.InterfaceC7001E
    public void m(View view, View view2, int i8, int i9) {
        c f8;
        this.f9033K.c(view, view2, i8, i9);
        this.f9025C = view2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i9) && (f8 = fVar.f()) != null) {
                f8.v(this, childAt, view, view2, i8, i9);
            }
        }
    }

    @Override // z0.InterfaceC7001E
    public void n(View view, int i8) {
        this.f9033K.d(view, i8);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i8)) {
                c f8 = fVar.f();
                if (f8 != null) {
                    f8.C(this, childAt, view, i8);
                }
                fVar.l(i8);
                fVar.k();
            }
        }
        this.f9025C = null;
    }

    @Override // z0.InterfaceC7001E
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        c f8;
        int childCount = getChildCount();
        boolean z7 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i10) && (f8 = fVar.f()) != null) {
                    int[] iArr2 = this.f9039w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f8.q(this, childAt, view, i8, i9, iArr2, i10);
                    int[] iArr3 = this.f9039w;
                    i11 = i8 > 0 ? Math.max(i11, iArr3[0]) : Math.min(i11, iArr3[0]);
                    int[] iArr4 = this.f9039w;
                    i12 = i9 > 0 ? Math.max(i12, iArr4[1]) : Math.min(i12, iArr4[1]);
                    z7 = true;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
        if (z7) {
            G(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        P(false);
        if (this.f9027E) {
            if (this.f9026D == null) {
                this.f9026D = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9026D);
        }
        if (this.f9028F == null && X.w(this)) {
            X.k0(this);
        }
        this.f9042z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        P(false);
        if (this.f9027E && this.f9026D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9026D);
        }
        View view = this.f9025C;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f9042z = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9029G || this.f9030H == null) {
            return;
        }
        C7061y0 c7061y0 = this.f9028F;
        int k8 = c7061y0 != null ? c7061y0.k() : 0;
        if (k8 > 0) {
            this.f9030H.setBounds(0, 0, getWidth(), k8);
            this.f9030H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            P(true);
        }
        boolean K7 = K(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            P(true);
        }
        return K7;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        c f8;
        int z8 = X.z(this);
        int size = this.f9034o.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f9034o.get(i12);
            if (view.getVisibility() != 8 && ((f8 = ((f) view.getLayoutParams()).f()) == null || !f8.l(this, view, z8))) {
                H(view, z8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        c f10;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f10 = fVar.f()) != null) {
                    z8 |= f10.n(this, childAt, view, f8, f9, z7);
                }
            }
        }
        if (z8) {
            G(1);
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        c f10;
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f10 = fVar.f()) != null) {
                    z7 |= f10.o(this, childAt, view, f8, f9);
                }
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        o(view, i8, i9, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        k(view, i8, i9, i10, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f9064t;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c f8 = x(childAt).f();
            if (id != -1 && f8 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                f8.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y7;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c f8 = ((f) childAt.getLayoutParams()).f();
            if (id != -1 && f8 != null && (y7 = f8.y(this, childAt)) != null) {
                sparseArray.append(id, y7);
            }
        }
        hVar.f9064t = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f9024B
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.K(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f9024B
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f9024B
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f9024B
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.P(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z7, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z7) {
            s(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List h8 = this.f9035s.h(view);
        this.f9037u.clear();
        if (h8 != null) {
            this.f9037u.addAll(h8);
        }
        return this.f9037u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        c f8 = ((f) view.getLayoutParams()).f();
        if (f8 == null || !f8.w(this, view, rect, z7)) {
            return super.requestChildRectangleOnScreen(view, rect, z7);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        super.requestDisallowInterceptTouchEvent(z7);
        if (!z7 || this.f9041y) {
            return;
        }
        P(false);
        this.f9041y = true;
    }

    void s(View view, Rect rect) {
        androidx.coordinatorlayout.widget.c.a(this, view, rect);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z7) {
        super.setFitsSystemWindows(z7);
        W();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9031I = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9030H;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9030H = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9030H.setState(getDrawableState());
                }
                AbstractC6641a.m(this.f9030H, X.z(this));
                this.f9030H.setVisible(getVisibility() == 0, false);
                this.f9030H.setCallback(this);
            }
            X.e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i8) {
        setStatusBarBackground(new ColorDrawable(i8));
    }

    public void setStatusBarBackgroundResource(int i8) {
        setStatusBarBackground(i8 != 0 ? AbstractC6278a.e(getContext(), i8) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z7 = i8 == 0;
        Drawable drawable = this.f9030H;
        if (drawable == null || drawable.isVisible() == z7) {
            return;
        }
        this.f9030H.setVisible(z7, false);
    }

    void t(View view, int i8, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        u(view, i8, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9030H;
    }

    void w(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f x(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f9046b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f9046b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e8) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e8);
                    }
                }
                fVar.f9046b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9034o = new ArrayList();
        this.f9035s = new androidx.coordinatorlayout.widget.b();
        this.f9036t = new ArrayList();
        this.f9037u = new ArrayList();
        this.f9039w = new int[2];
        this.f9040x = new int[2];
        this.f9033K = new C7003G(this);
        TypedArray obtainStyledAttributes = i8 == 0 ? context.obtainStyledAttributes(attributeSet, AbstractC6185c.f38903b, 0, AbstractC6184b.f38901a) : context.obtainStyledAttributes(attributeSet, AbstractC6185c.f38903b, i8, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i8 == 0) {
                saveAttributeDataForStyleable(context, AbstractC6185c.f38903b, attributeSet, obtainStyledAttributes, 0, AbstractC6184b.f38901a);
            } else {
                saveAttributeDataForStyleable(context, AbstractC6185c.f38903b, attributeSet, obtainStyledAttributes, i8, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC6185c.f38904c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f9023A = resources.getIntArray(resourceId);
            float f8 = resources.getDisplayMetrics().density;
            int length = this.f9023A.length;
            for (int i9 = 0; i9 < length; i9++) {
                this.f9023A[i9] = (int) (r12[i9] * f8);
            }
        }
        this.f9030H = obtainStyledAttributes.getDrawable(AbstractC6185c.f38905d);
        obtainStyledAttributes.recycle();
        W();
        super.setOnHierarchyChangeListener(new e());
        if (X.x(this) == 0) {
            X.w0(this, 1);
        }
    }

    protected static class h extends F0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        SparseArray f9064t;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f9064t = new SparseArray(readInt);
            for (int i8 = 0; i8 < readInt; i8++) {
                this.f9064t.append(iArr[i8], readParcelableArray[i8]);
            }
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            SparseArray sparseArray = this.f9064t;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr[i9] = this.f9064t.keyAt(i9);
                parcelableArr[i9] = (Parcelable) this.f9064t.valueAt(i9);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i8);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c f9045a;

        /* renamed from: b, reason: collision with root package name */
        boolean f9046b;

        /* renamed from: c, reason: collision with root package name */
        public int f9047c;

        /* renamed from: d, reason: collision with root package name */
        public int f9048d;

        /* renamed from: e, reason: collision with root package name */
        public int f9049e;

        /* renamed from: f, reason: collision with root package name */
        int f9050f;

        /* renamed from: g, reason: collision with root package name */
        public int f9051g;

        /* renamed from: h, reason: collision with root package name */
        public int f9052h;

        /* renamed from: i, reason: collision with root package name */
        int f9053i;

        /* renamed from: j, reason: collision with root package name */
        int f9054j;

        /* renamed from: k, reason: collision with root package name */
        View f9055k;

        /* renamed from: l, reason: collision with root package name */
        View f9056l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f9057m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f9058n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9059o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f9060p;

        /* renamed from: q, reason: collision with root package name */
        final Rect f9061q;

        /* renamed from: r, reason: collision with root package name */
        Object f9062r;

        public f(int i8, int i9) {
            super(i8, i9);
            this.f9046b = false;
            this.f9047c = 0;
            this.f9048d = 0;
            this.f9049e = -1;
            this.f9050f = -1;
            this.f9051g = 0;
            this.f9052h = 0;
            this.f9061q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f9050f);
            this.f9055k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f9056l = null;
                    this.f9055k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f9050f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f9056l = null;
                this.f9055k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f9056l = null;
                    this.f9055k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f9056l = findViewById;
        }

        private boolean s(View view, int i8) {
            int b8 = AbstractC7048s.b(((f) view.getLayoutParams()).f9051g, i8);
            return b8 != 0 && (AbstractC7048s.b(this.f9052h, i8) & b8) == b8;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f9055k.getId() != this.f9050f) {
                return false;
            }
            View view2 = this.f9055k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f9056l = null;
                    this.f9055k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f9056l = view2;
            return true;
        }

        boolean a() {
            return this.f9055k == null && this.f9050f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f9056l || s(view2, X.z(coordinatorLayout)) || ((cVar = this.f9045a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f9045a == null) {
                this.f9057m = false;
            }
            return this.f9057m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f9050f == -1) {
                this.f9056l = null;
                this.f9055k = null;
                return null;
            }
            if (this.f9055k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f9055k;
        }

        public int e() {
            return this.f9050f;
        }

        public c f() {
            return this.f9045a;
        }

        boolean g() {
            return this.f9060p;
        }

        Rect h() {
            return this.f9061q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z7 = this.f9057m;
            if (z7) {
                return true;
            }
            c cVar = this.f9045a;
            boolean a8 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z7;
            this.f9057m = a8;
            return a8;
        }

        boolean j(int i8) {
            if (i8 == 0) {
                return this.f9058n;
            }
            if (i8 != 1) {
                return false;
            }
            return this.f9059o;
        }

        void k() {
            this.f9060p = false;
        }

        void l(int i8) {
            r(i8, false);
        }

        void m() {
            this.f9057m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f9045a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f9045a = cVar;
                this.f9062r = null;
                this.f9046b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z7) {
            this.f9060p = z7;
        }

        void q(Rect rect) {
            this.f9061q.set(rect);
        }

        void r(int i8, boolean z7) {
            if (i8 == 0) {
                this.f9058n = z7;
            } else {
                if (i8 != 1) {
                    return;
                }
                this.f9059o = z7;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9046b = false;
            this.f9047c = 0;
            this.f9048d = 0;
            this.f9049e = -1;
            this.f9050f = -1;
            this.f9051g = 0;
            this.f9052h = 0;
            this.f9061q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC6185c.f38906e);
            this.f9047c = obtainStyledAttributes.getInteger(AbstractC6185c.f38907f, 0);
            this.f9050f = obtainStyledAttributes.getResourceId(AbstractC6185c.f38908g, -1);
            this.f9048d = obtainStyledAttributes.getInteger(AbstractC6185c.f38909h, 0);
            this.f9049e = obtainStyledAttributes.getInteger(AbstractC6185c.f38913l, -1);
            this.f9051g = obtainStyledAttributes.getInt(AbstractC6185c.f38912k, 0);
            this.f9052h = obtainStyledAttributes.getInt(AbstractC6185c.f38911j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(AbstractC6185c.f38910i);
            this.f9046b = hasValue;
            if (hasValue) {
                this.f9045a = CoordinatorLayout.J(context, attributeSet, obtainStyledAttributes.getString(AbstractC6185c.f38910i));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f9045a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f9046b = false;
            this.f9047c = 0;
            this.f9048d = 0;
            this.f9049e = -1;
            this.f9050f = -1;
            this.f9051g = 0;
            this.f9052h = 0;
            this.f9061q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9046b = false;
            this.f9047c = 0;
            this.f9048d = 0;
            this.f9049e = -1;
            this.f9050f = -1;
            this.f9051g = 0;
            this.f9052h = 0;
            this.f9061q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9046b = false;
            this.f9047c = 0;
            this.f9048d = 0;
            this.f9049e = -1;
            this.f9050f = -1;
            this.f9051g = 0;
            this.f9052h = 0;
            this.f9061q = new Rect();
        }
    }
}
