package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import f.AbstractC5752a;
import h.AbstractC5820c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r0.AbstractC6641a;
import z0.C7026g0;

/* loaded from: classes.dex */
class P extends ListView {

    /* renamed from: A, reason: collision with root package name */
    private boolean f7453A;

    /* renamed from: B, reason: collision with root package name */
    private C7026g0 f7454B;

    /* renamed from: C, reason: collision with root package name */
    private androidx.core.widget.f f7455C;

    /* renamed from: D, reason: collision with root package name */
    f f7456D;

    /* renamed from: o, reason: collision with root package name */
    private final Rect f7457o;

    /* renamed from: s, reason: collision with root package name */
    private int f7458s;

    /* renamed from: t, reason: collision with root package name */
    private int f7459t;

    /* renamed from: u, reason: collision with root package name */
    private int f7460u;

    /* renamed from: v, reason: collision with root package name */
    private int f7461v;

    /* renamed from: w, reason: collision with root package name */
    private int f7462w;

    /* renamed from: x, reason: collision with root package name */
    private d f7463x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f7464y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7465z;

    static class a {
        static void a(View view, float f8, float f9) {
            view.drawableHotspotChanged(f8, f9);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f7466a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f7467b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f7468c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f7469d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f7466a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f7467b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f7468c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f7469d = true;
            } catch (NoSuchMethodException e8) {
                e8.printStackTrace();
            }
        }

        static boolean a() {
            return f7469d;
        }

        static void b(P p8, int i8, View view) {
            try {
                f7466a.invoke(p8, Integer.valueOf(i8), view, Boolean.FALSE, -1, -1);
                f7467b.invoke(p8, Integer.valueOf(i8));
                f7468c.invoke(p8, Integer.valueOf(i8));
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z7) {
            absListView.setSelectedChildViewEnabled(z7);
        }
    }

    private static class d extends AbstractC5820c {

        /* renamed from: s, reason: collision with root package name */
        private boolean f7470s;

        d(Drawable drawable) {
            super(drawable);
            this.f7470s = true;
        }

        void b(boolean z7) {
            this.f7470s = z7;
        }

        @Override // h.AbstractC5820c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f7470s) {
                super.draw(canvas);
            }
        }

        @Override // h.AbstractC5820c, android.graphics.drawable.Drawable
        public void setHotspot(float f8, float f9) {
            if (this.f7470s) {
                super.setHotspot(f8, f9);
            }
        }

        @Override // h.AbstractC5820c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i8, int i9, int i10, int i11) {
            if (this.f7470s) {
                super.setHotspotBounds(i8, i9, i10, i11);
            }
        }

        @Override // h.AbstractC5820c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f7470s) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.AbstractC5820c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f7470s) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f7471a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                e8.printStackTrace();
            }
            f7471a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f7471a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z7) {
            Field field = f7471a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z7));
                } catch (IllegalAccessException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            P p8 = P.this;
            p8.f7456D = null;
            p8.removeCallbacks(this);
        }

        public void b() {
            P.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            P p8 = P.this;
            p8.f7456D = null;
            p8.drawableStateChanged();
        }
    }

    P(Context context, boolean z7) {
        super(context, null, AbstractC5752a.f35397x);
        this.f7457o = new Rect();
        this.f7458s = 0;
        this.f7459t = 0;
        this.f7460u = 0;
        this.f7461v = 0;
        this.f7465z = z7;
        setCacheColorHint(0);
    }

    private void a() {
        this.f7453A = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f7462w - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C7026g0 c7026g0 = this.f7454B;
        if (c7026g0 != null) {
            c7026g0.c();
            this.f7454B = null;
        }
    }

    private void b(View view, int i8) {
        performItemClick(view, i8, getItemIdAtPosition(i8));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f7457o.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f7457o);
        selector.draw(canvas);
    }

    private void f(int i8, View view) {
        Rect rect = this.f7457o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f7458s;
        rect.top -= this.f7459t;
        rect.right += this.f7460u;
        rect.bottom += this.f7461v;
        boolean k8 = k();
        if (view.isEnabled() != k8) {
            l(!k8);
            if (i8 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i8, View view) {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i8 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        f(i8, view);
        if (z7) {
            Rect rect = this.f7457o;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            AbstractC6641a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i8, View view, float f8, float f9) {
        g(i8, view);
        Drawable selector = getSelector();
        if (selector == null || i8 == -1) {
            return;
        }
        AbstractC6641a.k(selector, f8, f9);
    }

    private void i(View view, int i8, float f8, float f9) {
        View childAt;
        this.f7453A = true;
        a.a(this, f8, f9);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i9 = this.f7462w;
        if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f7462w = i8;
        a.a(view, f8 - view.getLeft(), f9 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i8, view, f8, f9);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z7) {
        d dVar = this.f7463x;
        if (dVar != null) {
            dVar.b(z7);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z7) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z7);
        } else {
            e.b(this, z7);
        }
    }

    private boolean m() {
        return this.f7453A;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i8, int i9, int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i13 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        View view = null;
        while (i14 < count) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i17 = layoutParams.height;
            view.measure(i8, i17 > 0 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i13 += dividerHeight;
            }
            i13 += view.getMeasuredHeight();
            if (i13 >= i11) {
                return (i12 < 0 || i14 <= i12 || i16 <= 0 || i13 == i11) ? i11 : i16;
            }
            if (i12 >= 0 && i14 >= i12) {
                i16 = i13;
            }
            i14++;
        }
        return i13;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f7456D != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f7455C
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f7455C = r9
        L5a:
            androidx.core.widget.f r9 = r7.f7455C
            r9.w(r1)
            androidx.core.widget.f r9 = r7.f7455C
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f7455C
            if (r8 == 0) goto L6c
            r8.w(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.P.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f7465z || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f7465z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f7465z || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f7465z && this.f7464y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f7456D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7456D == null) {
            f fVar = new f();
            this.f7456D = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i8 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7462w = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f7456D;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z7) {
        this.f7464y = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f7463x = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7458s = rect.left;
        this.f7459t = rect.top;
        this.f7460u = rect.right;
        this.f7461v = rect.bottom;
    }
}
