package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import f.AbstractC5752a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class T implements k.e {

    /* renamed from: X, reason: collision with root package name */
    private static Method f7605X;

    /* renamed from: Y, reason: collision with root package name */
    private static Method f7606Y;

    /* renamed from: Z, reason: collision with root package name */
    private static Method f7607Z;

    /* renamed from: A, reason: collision with root package name */
    private boolean f7608A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f7609B;

    /* renamed from: C, reason: collision with root package name */
    private int f7610C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7611D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7612E;

    /* renamed from: F, reason: collision with root package name */
    int f7613F;

    /* renamed from: G, reason: collision with root package name */
    private View f7614G;

    /* renamed from: H, reason: collision with root package name */
    private int f7615H;

    /* renamed from: I, reason: collision with root package name */
    private DataSetObserver f7616I;

    /* renamed from: J, reason: collision with root package name */
    private View f7617J;

    /* renamed from: K, reason: collision with root package name */
    private Drawable f7618K;

    /* renamed from: L, reason: collision with root package name */
    private AdapterView.OnItemClickListener f7619L;

    /* renamed from: M, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f7620M;

    /* renamed from: N, reason: collision with root package name */
    final i f7621N;

    /* renamed from: O, reason: collision with root package name */
    private final h f7622O;

    /* renamed from: P, reason: collision with root package name */
    private final g f7623P;

    /* renamed from: Q, reason: collision with root package name */
    private final e f7624Q;

    /* renamed from: R, reason: collision with root package name */
    private Runnable f7625R;

    /* renamed from: S, reason: collision with root package name */
    final Handler f7626S;

    /* renamed from: T, reason: collision with root package name */
    private final Rect f7627T;

    /* renamed from: U, reason: collision with root package name */
    private Rect f7628U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f7629V;

    /* renamed from: W, reason: collision with root package name */
    PopupWindow f7630W;

    /* renamed from: o, reason: collision with root package name */
    private Context f7631o;

    /* renamed from: s, reason: collision with root package name */
    private ListAdapter f7632s;

    /* renamed from: t, reason: collision with root package name */
    P f7633t;

    /* renamed from: u, reason: collision with root package name */
    private int f7634u;

    /* renamed from: v, reason: collision with root package name */
    private int f7635v;

    /* renamed from: w, reason: collision with root package name */
    private int f7636w;

    /* renamed from: x, reason: collision with root package name */
    private int f7637x;

    /* renamed from: y, reason: collision with root package name */
    private int f7638y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7639z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t7 = T.this.t();
            if (t7 == null || t7.getWindowToken() == null) {
                return;
            }
            T.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
            P p8;
            if (i8 == -1 || (p8 = T.this.f7633t) == null) {
                return;
            }
            p8.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i8, boolean z7) {
            return popupWindow.getMaxAvailableHeight(view, i8, z7);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z7) {
            popupWindow.setIsClippedToScreen(z7);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            T.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (T.this.a()) {
                T.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            T.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (i8 != 1 || T.this.A() || T.this.f7630W.getContentView() == null) {
                return;
            }
            T t7 = T.this;
            t7.f7626S.removeCallbacks(t7.f7621N);
            T.this.f7621N.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = T.this.f7630W) != null && popupWindow.isShowing() && x7 >= 0 && x7 < T.this.f7630W.getWidth() && y7 >= 0 && y7 < T.this.f7630W.getHeight()) {
                T t7 = T.this;
                t7.f7626S.postDelayed(t7.f7621N, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            T t8 = T.this;
            t8.f7626S.removeCallbacks(t8.f7621N);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p8 = T.this.f7633t;
            if (p8 == null || !p8.isAttachedToWindow() || T.this.f7633t.getCount() <= T.this.f7633t.getChildCount()) {
                return;
            }
            int childCount = T.this.f7633t.getChildCount();
            T t7 = T.this;
            if (childCount <= t7.f7613F) {
                t7.f7630W.setInputMethodMode(2);
                T.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f7605X = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f7607Z = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f7606Y = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public T(Context context) {
        this(context, null, AbstractC5752a.f35363B);
    }

    private void C() {
        View view = this.f7614G;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7614G);
            }
        }
    }

    private void O(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f7630W, z7);
            return;
        }
        Method method = f7605X;
        if (method != null) {
            try {
                method.invoke(this.f7630W, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int i8;
        int i9;
        int makeMeasureSpec;
        int i10;
        if (this.f7633t == null) {
            Context context = this.f7631o;
            this.f7625R = new a();
            P s8 = s(context, !this.f7629V);
            this.f7633t = s8;
            Drawable drawable = this.f7618K;
            if (drawable != null) {
                s8.setSelector(drawable);
            }
            this.f7633t.setAdapter(this.f7632s);
            this.f7633t.setOnItemClickListener(this.f7619L);
            this.f7633t.setFocusable(true);
            this.f7633t.setFocusableInTouchMode(true);
            this.f7633t.setOnItemSelectedListener(new b());
            this.f7633t.setOnScrollListener(this.f7623P);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f7620M;
            if (onItemSelectedListener != null) {
                this.f7633t.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f7633t;
            View view2 = this.f7614G;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i11 = this.f7615H;
                if (i11 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i11 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f7615H);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i12 = this.f7635v;
                if (i12 >= 0) {
                    i10 = Integer.MIN_VALUE;
                } else {
                    i12 = 0;
                    i10 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i12, i10), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i8 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i8 = 0;
            }
            this.f7630W.setContentView(view);
        } else {
            View view3 = this.f7614G;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i8 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i8 = 0;
            }
        }
        Drawable background = this.f7630W.getBackground();
        if (background != null) {
            background.getPadding(this.f7627T);
            Rect rect = this.f7627T;
            int i13 = rect.top;
            i9 = rect.bottom + i13;
            if (!this.f7639z) {
                this.f7637x = -i13;
            }
        } else {
            this.f7627T.setEmpty();
            i9 = 0;
        }
        int u7 = u(t(), this.f7637x, this.f7630W.getInputMethodMode() == 2);
        if (this.f7611D || this.f7634u == -1) {
            return u7 + i9;
        }
        int i14 = this.f7635v;
        if (i14 == -2) {
            int i15 = this.f7631o.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f7627T;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i14 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            int i16 = this.f7631o.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f7627T;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect3.left + rect3.right), 1073741824);
        }
        int d8 = this.f7633t.d(makeMeasureSpec, 0, -1, u7 - i8, -1);
        if (d8 > 0) {
            i8 += i9 + this.f7633t.getPaddingTop() + this.f7633t.getPaddingBottom();
        }
        return d8 + i8;
    }

    private int u(View view, int i8, boolean z7) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.f7630W, view, i8, z7);
        }
        Method method = f7606Y;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f7630W, view, Integer.valueOf(i8), Boolean.valueOf(z7))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f7630W.getMaxAvailableHeight(view, i8);
    }

    public boolean A() {
        return this.f7630W.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f7629V;
    }

    public void D(View view) {
        this.f7617J = view;
    }

    public void E(int i8) {
        this.f7630W.setAnimationStyle(i8);
    }

    public void F(int i8) {
        Drawable background = this.f7630W.getBackground();
        if (background == null) {
            R(i8);
            return;
        }
        background.getPadding(this.f7627T);
        Rect rect = this.f7627T;
        this.f7635v = rect.left + rect.right + i8;
    }

    public void G(int i8) {
        this.f7610C = i8;
    }

    public void H(Rect rect) {
        this.f7628U = rect != null ? new Rect(rect) : null;
    }

    public void I(int i8) {
        this.f7630W.setInputMethodMode(i8);
    }

    public void J(boolean z7) {
        this.f7629V = z7;
        this.f7630W.setFocusable(z7);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f7630W.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f7619L = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f7620M = onItemSelectedListener;
    }

    public void N(boolean z7) {
        this.f7609B = true;
        this.f7608A = z7;
    }

    public void P(int i8) {
        this.f7615H = i8;
    }

    public void Q(int i8) {
        P p8 = this.f7633t;
        if (!a() || p8 == null) {
            return;
        }
        p8.setListSelectionHidden(false);
        p8.setSelection(i8);
        if (p8.getChoiceMode() != 0) {
            p8.setItemChecked(i8, true);
        }
    }

    public void R(int i8) {
        this.f7635v = i8;
    }

    @Override // k.e
    public boolean a() {
        return this.f7630W.isShowing();
    }

    @Override // k.e
    public void b() {
        int q8 = q();
        boolean A7 = A();
        androidx.core.widget.g.b(this.f7630W, this.f7638y);
        if (this.f7630W.isShowing()) {
            if (t().isAttachedToWindow()) {
                int i8 = this.f7635v;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = t().getWidth();
                }
                int i9 = this.f7634u;
                if (i9 == -1) {
                    if (!A7) {
                        q8 = -1;
                    }
                    if (A7) {
                        this.f7630W.setWidth(this.f7635v == -1 ? -1 : 0);
                        this.f7630W.setHeight(0);
                    } else {
                        this.f7630W.setWidth(this.f7635v == -1 ? -1 : 0);
                        this.f7630W.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    q8 = i9;
                }
                this.f7630W.setOutsideTouchable((this.f7612E || this.f7611D) ? false : true);
                this.f7630W.update(t(), this.f7636w, this.f7637x, i8 < 0 ? -1 : i8, q8 < 0 ? -1 : q8);
                return;
            }
            return;
        }
        int i10 = this.f7635v;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = t().getWidth();
        }
        int i11 = this.f7634u;
        if (i11 == -1) {
            q8 = -1;
        } else if (i11 != -2) {
            q8 = i11;
        }
        this.f7630W.setWidth(i10);
        this.f7630W.setHeight(q8);
        O(true);
        this.f7630W.setOutsideTouchable((this.f7612E || this.f7611D) ? false : true);
        this.f7630W.setTouchInterceptor(this.f7622O);
        if (this.f7609B) {
            androidx.core.widget.g.a(this.f7630W, this.f7608A);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f7607Z;
            if (method != null) {
                try {
                    method.invoke(this.f7630W, this.f7628U);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            d.a(this.f7630W, this.f7628U);
        }
        androidx.core.widget.g.c(this.f7630W, t(), this.f7636w, this.f7637x, this.f7610C);
        this.f7633t.setSelection(-1);
        if (!this.f7629V || this.f7633t.isInTouchMode()) {
            r();
        }
        if (this.f7629V) {
            return;
        }
        this.f7626S.post(this.f7624Q);
    }

    public void c(Drawable drawable) {
        this.f7630W.setBackgroundDrawable(drawable);
    }

    public int d() {
        return this.f7636w;
    }

    @Override // k.e
    public void dismiss() {
        this.f7630W.dismiss();
        C();
        this.f7630W.setContentView(null);
        this.f7633t = null;
        this.f7626S.removeCallbacks(this.f7621N);
    }

    public void f(int i8) {
        this.f7636w = i8;
    }

    public Drawable i() {
        return this.f7630W.getBackground();
    }

    @Override // k.e
    public ListView j() {
        return this.f7633t;
    }

    public void l(int i8) {
        this.f7637x = i8;
        this.f7639z = true;
    }

    public int o() {
        if (this.f7639z) {
            return this.f7637x;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f7616I;
        if (dataSetObserver == null) {
            this.f7616I = new f();
        } else {
            ListAdapter listAdapter2 = this.f7632s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f7632s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7616I);
        }
        P p8 = this.f7633t;
        if (p8 != null) {
            p8.setAdapter(this.f7632s);
        }
    }

    public void r() {
        P p8 = this.f7633t;
        if (p8 != null) {
            p8.setListSelectionHidden(true);
            p8.requestLayout();
        }
    }

    P s(Context context, boolean z7) {
        return new P(context, z7);
    }

    public View t() {
        return this.f7617J;
    }

    public Object v() {
        if (a()) {
            return this.f7633t.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f7633t.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f7633t.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f7633t.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f7635v;
    }

    public T(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public T(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f7634u = -2;
        this.f7635v = -2;
        this.f7638y = 1002;
        this.f7610C = 0;
        this.f7611D = false;
        this.f7612E = false;
        this.f7613F = Integer.MAX_VALUE;
        this.f7615H = 0;
        this.f7621N = new i();
        this.f7622O = new h();
        this.f7623P = new g();
        this.f7624Q = new e();
        this.f7627T = new Rect();
        this.f7631o = context;
        this.f7626S = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35726l1, i8, i9);
        this.f7636w = obtainStyledAttributes.getDimensionPixelOffset(f.j.f35731m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(f.j.f35736n1, 0);
        this.f7637x = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f7639z = true;
        }
        obtainStyledAttributes.recycle();
        C0859t c0859t = new C0859t(context, attributeSet, i8, i9);
        this.f7630W = c0859t;
        c0859t.setInputMethodMode(1);
    }
}
