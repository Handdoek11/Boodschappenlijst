package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0832a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import f.AbstractC5752a;
import g.AbstractC5794a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z0.AbstractC7048s;
import z0.C7062z;
import z0.InterfaceC6998B;
import z0.InterfaceC7056w;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC7056w {

    /* renamed from: A, reason: collision with root package name */
    private Context f7647A;

    /* renamed from: B, reason: collision with root package name */
    private int f7648B;

    /* renamed from: C, reason: collision with root package name */
    private int f7649C;

    /* renamed from: D, reason: collision with root package name */
    private int f7650D;

    /* renamed from: E, reason: collision with root package name */
    int f7651E;

    /* renamed from: F, reason: collision with root package name */
    private int f7652F;

    /* renamed from: G, reason: collision with root package name */
    private int f7653G;

    /* renamed from: H, reason: collision with root package name */
    private int f7654H;

    /* renamed from: I, reason: collision with root package name */
    private int f7655I;

    /* renamed from: J, reason: collision with root package name */
    private int f7656J;

    /* renamed from: K, reason: collision with root package name */
    private Y f7657K;

    /* renamed from: L, reason: collision with root package name */
    private int f7658L;

    /* renamed from: M, reason: collision with root package name */
    private int f7659M;

    /* renamed from: N, reason: collision with root package name */
    private int f7660N;

    /* renamed from: O, reason: collision with root package name */
    private CharSequence f7661O;

    /* renamed from: P, reason: collision with root package name */
    private CharSequence f7662P;

    /* renamed from: Q, reason: collision with root package name */
    private ColorStateList f7663Q;

    /* renamed from: R, reason: collision with root package name */
    private ColorStateList f7664R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f7665S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f7666T;

    /* renamed from: U, reason: collision with root package name */
    private final ArrayList f7667U;

    /* renamed from: V, reason: collision with root package name */
    private final ArrayList f7668V;

    /* renamed from: W, reason: collision with root package name */
    private final int[] f7669W;

    /* renamed from: a0, reason: collision with root package name */
    final C7062z f7670a0;

    /* renamed from: b0, reason: collision with root package name */
    private ArrayList f7671b0;

    /* renamed from: c0, reason: collision with root package name */
    h f7672c0;

    /* renamed from: d0, reason: collision with root package name */
    private final ActionMenuView.e f7673d0;

    /* renamed from: e0, reason: collision with root package name */
    private j0 f7674e0;

    /* renamed from: f0, reason: collision with root package name */
    private C0843c f7675f0;

    /* renamed from: g0, reason: collision with root package name */
    private f f7676g0;

    /* renamed from: h0, reason: collision with root package name */
    private j.a f7677h0;

    /* renamed from: i0, reason: collision with root package name */
    e.a f7678i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f7679j0;

    /* renamed from: k0, reason: collision with root package name */
    private OnBackInvokedCallback f7680k0;

    /* renamed from: l0, reason: collision with root package name */
    private OnBackInvokedDispatcher f7681l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f7682m0;

    /* renamed from: n0, reason: collision with root package name */
    private final Runnable f7683n0;

    /* renamed from: o, reason: collision with root package name */
    ActionMenuView f7684o;

    /* renamed from: s, reason: collision with root package name */
    private TextView f7685s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f7686t;

    /* renamed from: u, reason: collision with root package name */
    private ImageButton f7687u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f7688v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f7689w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f7690x;

    /* renamed from: y, reason: collision with root package name */
    ImageButton f7691y;

    /* renamed from: z, reason: collision with root package name */
    View f7692z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f7670a0.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f7672c0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f7678i0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f7684o.J()) {
                Toolbar.this.f7670a0.k(eVar);
            }
            e.a aVar = Toolbar.this.f7678i0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.i0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: o, reason: collision with root package name */
        androidx.appcompat.view.menu.e f7697o;

        /* renamed from: s, reason: collision with root package name */
        androidx.appcompat.view.menu.g f7698s;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z7) {
            if (this.f7698s != null) {
                androidx.appcompat.view.menu.e eVar = this.f7697o;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.f7697o.getItem(i8) == this.f7698s) {
                            return;
                        }
                    }
                }
                f(this.f7697o, this.f7698s);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f7692z;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f7692z);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f7691y);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f7692z = null;
            toolbar3.a();
            this.f7698s = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f7691y.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f7691y);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f7691y);
            }
            Toolbar.this.f7692z = gVar.getActionView();
            this.f7698s = gVar;
            ViewParent parent2 = Toolbar.this.f7692z.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f7692z);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f6847a = (toolbar4.f7651E & 112) | 8388611;
                generateDefaultLayoutParams.f7700b = 2;
                toolbar4.f7692z.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f7692z);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f7692z;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f7697o;
            if (eVar2 != null && (gVar = this.f7698s) != null) {
                eVar2.f(gVar);
            }
            this.f7697o = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35373L);
    }

    private int C(View view, int i8, int[] iArr, int i9) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int q8 = q(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q8, max + measuredWidth, view.getMeasuredHeight() + q8);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i8, int[] iArr, int i9) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int q8 = q(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q8, max, view.getMeasuredHeight() + q8);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + max + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i8, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f7670a0.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f7671b0 = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f7683n0);
        post(this.f7683n0);
    }

    private boolean O() {
        if (!this.f7679j0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i8) {
        boolean z7 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int b8 = AbstractC7048s.b(i8, getLayoutDirection());
        list.clear();
        if (!z7) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f7700b == 0 && P(childAt) && p(gVar.f6847a) == b8) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f7700b == 0 && P(childAt2) && p(gVar2.f6847a) == b8) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f7700b = 1;
        if (!z7 || this.f7692z == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f7668V.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i8 = 0; i8 < menu.size(); i8++) {
            arrayList.add(menu.getItem(i8));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f7657K == null) {
            this.f7657K = new Y();
        }
    }

    private void i() {
        if (this.f7688v == null) {
            this.f7688v = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f7684o.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f7684o.getMenu();
            if (this.f7676g0 == null) {
                this.f7676g0 = new f();
            }
            this.f7684o.setExpandedActionViewsExclusive(true);
            eVar.c(this.f7676g0, this.f7647A);
            R();
        }
    }

    private void k() {
        if (this.f7684o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f7684o = actionMenuView;
            actionMenuView.setPopupTheme(this.f7648B);
            this.f7684o.setOnMenuItemClickListener(this.f7673d0);
            this.f7684o.O(this.f7677h0, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6847a = (this.f7651E & 112) | 8388613;
            this.f7684o.setLayoutParams(generateDefaultLayoutParams);
            c(this.f7684o, false);
        }
    }

    private void l() {
        if (this.f7687u == null) {
            this.f7687u = new C0856p(getContext(), null, AbstractC5752a.f35372K);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6847a = (this.f7651E & 112) | 8388611;
            this.f7687u.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i8) {
        int layoutDirection = getLayoutDirection();
        int b8 = AbstractC7048s.b(i8, layoutDirection) & 7;
        return (b8 == 1 || b8 == 3 || b8 == 5) ? b8 : layoutDirection == 1 ? 5 : 3;
    }

    private int q(View view, int i8) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int r8 = r(gVar.f6847a);
        if (r8 == 48) {
            return getPaddingTop() - i9;
        }
        if (r8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    private int r(int i8) {
        int i9 = i8 & 112;
        return (i9 == 16 || i9 == 48 || i9 == 80) ? i9 : this.f7660N & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i8 = iArr[0];
        int i9 = iArr[1];
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            View view = (View) list.get(i10);
            g gVar = (g) view.getLayoutParams();
            int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i8;
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i9;
            int max = Math.max(0, i12);
            int max2 = Math.max(0, i13);
            int max3 = Math.max(0, -i12);
            int max4 = Math.max(0, -i13);
            i11 += max + view.getMeasuredWidth() + max2;
            i10++;
            i9 = max4;
            i8 = max3;
        }
        return i11;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.f7668V.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f7684o;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f7684o;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f7700b != 2 && childAt != this.f7684o) {
                removeViewAt(childCount);
                this.f7668V.add(childAt);
            }
        }
    }

    public void J(int i8, int i9) {
        h();
        this.f7657K.g(i8, i9);
    }

    public void K(androidx.appcompat.view.menu.e eVar, C0843c c0843c) {
        if (eVar == null && this.f7684o == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N7 = this.f7684o.N();
        if (N7 == eVar) {
            return;
        }
        if (N7 != null) {
            N7.P(this.f7675f0);
            N7.P(this.f7676g0);
        }
        if (this.f7676g0 == null) {
            this.f7676g0 = new f();
        }
        c0843c.G(true);
        if (eVar != null) {
            eVar.c(c0843c, this.f7647A);
            eVar.c(this.f7676g0, this.f7647A);
        } else {
            c0843c.i(this.f7647A, null);
            this.f7676g0.i(this.f7647A, null);
            c0843c.d(true);
            this.f7676g0.d(true);
        }
        this.f7684o.setPopupTheme(this.f7648B);
        this.f7684o.setPresenter(c0843c);
        this.f7675f0 = c0843c;
        R();
    }

    public void L(j.a aVar, e.a aVar2) {
        this.f7677h0 = aVar;
        this.f7678i0 = aVar2;
        ActionMenuView actionMenuView = this.f7684o;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i8) {
        this.f7650D = i8;
        TextView textView = this.f7686t;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void N(Context context, int i8) {
        this.f7649C = i8;
        TextView textView = this.f7685s;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f7684o;
        return actionMenuView != null && actionMenuView.P();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a8 = e.a(this);
            boolean z7 = v() && a8 != null && isAttachedToWindow() && this.f7682m0;
            if (z7 && this.f7681l0 == null) {
                if (this.f7680k0 == null) {
                    this.f7680k0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7831o.e();
                        }
                    });
                }
                e.c(a8, this.f7680k0);
                this.f7681l0 = a8;
                return;
            }
            if (z7 || (onBackInvokedDispatcher = this.f7681l0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f7680k0);
            this.f7681l0 = null;
        }
    }

    void a() {
        for (int size = this.f7668V.size() - 1; size >= 0; size--) {
            addView((View) this.f7668V.get(size));
        }
        this.f7668V.clear();
    }

    @Override // z0.InterfaceC7056w
    public void addMenuProvider(InterfaceC6998B interfaceC6998B) {
        this.f7670a0.c(interfaceC6998B);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f7684o) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f7676g0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f7698s;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f7684o;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f7691y == null) {
            C0856p c0856p = new C0856p(getContext(), null, AbstractC5752a.f35372K);
            this.f7691y = c0856p;
            c0856p.setImageDrawable(this.f7689w);
            this.f7691y.setContentDescription(this.f7690x);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6847a = (this.f7651E & 112) | 8388611;
            generateDefaultLayoutParams.f7700b = 2;
            this.f7691y.setLayoutParams(generateDefaultLayoutParams);
            this.f7691y.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f7691y;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f7691y;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Y y7 = this.f7657K;
        if (y7 != null) {
            return y7.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.f7659M;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Y y7 = this.f7657K;
        if (y7 != null) {
            return y7.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Y y7 = this.f7657K;
        if (y7 != null) {
            return y7.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Y y7 = this.f7657K;
        if (y7 != null) {
            return y7.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.f7658L;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N7;
        ActionMenuView actionMenuView = this.f7684o;
        return (actionMenuView == null || (N7 = actionMenuView.N()) == null || !N7.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f7659M, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f7658L, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f7688v;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f7688v;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f7684o.getMenu();
    }

    View getNavButtonView() {
        return this.f7687u;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f7687u;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f7687u;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0843c getOuterActionMenuPresenter() {
        return this.f7675f0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f7684o.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f7647A;
    }

    public int getPopupTheme() {
        return this.f7648B;
    }

    public CharSequence getSubtitle() {
        return this.f7662P;
    }

    final TextView getSubtitleTextView() {
        return this.f7686t;
    }

    public CharSequence getTitle() {
        return this.f7661O;
    }

    public int getTitleMarginBottom() {
        return this.f7656J;
    }

    public int getTitleMarginEnd() {
        return this.f7654H;
    }

    public int getTitleMarginStart() {
        return this.f7653G;
    }

    public int getTitleMarginTop() {
        return this.f7655I;
    }

    final TextView getTitleTextView() {
        return this.f7685s;
    }

    public J getWrapper() {
        if (this.f7674e0 == null) {
            this.f7674e0 = new j0(this, true);
        }
        return this.f7674e0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC0832a.C0133a ? new g((AbstractC0832a.C0133a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f7683n0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7666T = false;
        }
        if (!this.f7666T) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7666T = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7666T = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a1 A[LOOP:0: B:106:0x029f->B:107:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c3 A[LOOP:1: B:109:0x02c1->B:110:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fc A[LOOP:2: B:118:0x02fa->B:119:0x02fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr = this.f7669W;
        boolean b8 = q0.b(this);
        int i17 = !b8 ? 1 : 0;
        if (P(this.f7687u)) {
            F(this.f7687u, i8, 0, i9, 0, this.f7652F);
            i10 = this.f7687u.getMeasuredWidth() + s(this.f7687u);
            i11 = Math.max(0, this.f7687u.getMeasuredHeight() + t(this.f7687u));
            i12 = View.combineMeasuredStates(0, this.f7687u.getMeasuredState());
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (P(this.f7691y)) {
            F(this.f7691y, i8, 0, i9, 0, this.f7652F);
            i10 = this.f7691y.getMeasuredWidth() + s(this.f7691y);
            i11 = Math.max(i11, this.f7691y.getMeasuredHeight() + t(this.f7691y));
            i12 = View.combineMeasuredStates(i12, this.f7691y.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i10);
        iArr[b8 ? 1 : 0] = Math.max(0, currentContentInsetStart - i10);
        if (P(this.f7684o)) {
            F(this.f7684o, i8, max, i9, 0, this.f7652F);
            i13 = this.f7684o.getMeasuredWidth() + s(this.f7684o);
            i11 = Math.max(i11, this.f7684o.getMeasuredHeight() + t(this.f7684o));
            i12 = View.combineMeasuredStates(i12, this.f7684o.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i13);
        iArr[i17] = Math.max(0, currentContentInsetEnd - i13);
        if (P(this.f7692z)) {
            max2 += E(this.f7692z, i8, max2, i9, 0, iArr);
            i11 = Math.max(i11, this.f7692z.getMeasuredHeight() + t(this.f7692z));
            i12 = View.combineMeasuredStates(i12, this.f7692z.getMeasuredState());
        }
        if (P(this.f7688v)) {
            max2 += E(this.f7688v, i8, max2, i9, 0, iArr);
            i11 = Math.max(i11, this.f7688v.getMeasuredHeight() + t(this.f7688v));
            i12 = View.combineMeasuredStates(i12, this.f7688v.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((g) childAt.getLayoutParams()).f7700b == 0 && P(childAt)) {
                max2 += E(childAt, i8, max2, i9, 0, iArr);
                i11 = Math.max(i11, childAt.getMeasuredHeight() + t(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i19 = this.f7655I + this.f7656J;
        int i20 = this.f7653G + this.f7654H;
        if (P(this.f7685s)) {
            E(this.f7685s, i8, max2 + i20, i9, i19, iArr);
            int measuredWidth = this.f7685s.getMeasuredWidth() + s(this.f7685s);
            i14 = this.f7685s.getMeasuredHeight() + t(this.f7685s);
            i15 = View.combineMeasuredStates(i12, this.f7685s.getMeasuredState());
            i16 = measuredWidth;
        } else {
            i14 = 0;
            i15 = i12;
            i16 = 0;
        }
        if (P(this.f7686t)) {
            i16 = Math.max(i16, E(this.f7686t, i8, max2 + i20, i9, i14 + i19, iArr));
            i14 += this.f7686t.getMeasuredHeight() + t(this.f7686t);
            i15 = View.combineMeasuredStates(i15, this.f7686t.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i16 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, (-16777216) & i15), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i11, i14) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, i15 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f7684o;
        androidx.appcompat.view.menu.e N7 = actionMenuView != null ? actionMenuView.N() : null;
        int i8 = iVar.f7701t;
        if (i8 != 0 && this.f7676g0 != null && N7 != null && (findItem = N7.findItem(i8)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f7702u) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        h();
        this.f7657K.f(i8 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f7676g0;
        if (fVar != null && (gVar = fVar.f7698s) != null) {
            iVar.f7701t = gVar.getItemId();
        }
        iVar.f7702u = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7665S = false;
        }
        if (!this.f7665S) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7665S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7665S = false;
        }
        return true;
    }

    @Override // z0.InterfaceC7056w
    public void removeMenuProvider(InterfaceC6998B interfaceC6998B) {
        this.f7670a0.l(interfaceC6998B);
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f7682m0 != z7) {
            this.f7682m0 = z7;
            R();
        }
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(AbstractC5794a.b(getContext(), i8));
    }

    public void setCollapsible(boolean z7) {
        this.f7679j0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f7659M) {
            this.f7659M = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f7658L) {
            this.f7658L = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i8) {
        setLogo(AbstractC5794a.b(getContext(), i8));
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(AbstractC5794a.b(getContext(), i8));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f7687u.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f7672c0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f7684o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.f7648B != i8) {
            this.f7648B = i8;
            if (i8 == 0) {
                this.f7647A = getContext();
            } else {
                this.f7647A = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitleMarginBottom(int i8) {
        this.f7656J = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.f7654H = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.f7653G = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.f7655I = i8;
        requestLayout();
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public boolean v() {
        f fVar = this.f7676g0;
        return (fVar == null || fVar.f7698s == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f7684o;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    public void y() {
        Iterator it = this.f7671b0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        G();
    }

    public static class g extends AbstractC0832a.C0133a {

        /* renamed from: b, reason: collision with root package name */
        int f7700b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7700b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i8, int i9) {
            super(i8, i9);
            this.f7700b = 0;
            this.f6847a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC0832a.C0133a) gVar);
            this.f7700b = 0;
            this.f7700b = gVar.f7700b;
        }

        public g(AbstractC0832a.C0133a c0133a) {
            super(c0133a);
            this.f7700b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7700b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7700b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7660N = 8388627;
        this.f7667U = new ArrayList();
        this.f7668V = new ArrayList();
        this.f7669W = new int[2];
        this.f7670a0 = new C7062z(new Runnable() { // from class: androidx.appcompat.widget.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7836o.y();
            }
        });
        this.f7671b0 = new ArrayList();
        this.f7673d0 = new a();
        this.f7683n0 = new b();
        f0 v7 = f0.v(getContext(), attributeSet, f.j.f35688d3, i8, 0);
        z0.X.l0(this, context, f.j.f35688d3, attributeSet, v7.r(), i8, 0);
        this.f7649C = v7.n(f.j.f35576F3, 0);
        this.f7650D = v7.n(f.j.f35783w3, 0);
        this.f7660N = v7.l(f.j.f35693e3, this.f7660N);
        this.f7651E = v7.l(f.j.f35698f3, 48);
        int e8 = v7.e(f.j.f35798z3, 0);
        e8 = v7.s(f.j.f35571E3) ? v7.e(f.j.f35571E3, e8) : e8;
        this.f7656J = e8;
        this.f7655I = e8;
        this.f7654H = e8;
        this.f7653G = e8;
        int e9 = v7.e(f.j.f35561C3, -1);
        if (e9 >= 0) {
            this.f7653G = e9;
        }
        int e10 = v7.e(f.j.f35556B3, -1);
        if (e10 >= 0) {
            this.f7654H = e10;
        }
        int e11 = v7.e(f.j.f35566D3, -1);
        if (e11 >= 0) {
            this.f7655I = e11;
        }
        int e12 = v7.e(f.j.f35551A3, -1);
        if (e12 >= 0) {
            this.f7656J = e12;
        }
        this.f7652F = v7.f(f.j.f35753q3, -1);
        int e13 = v7.e(f.j.f35733m3, Integer.MIN_VALUE);
        int e14 = v7.e(f.j.f35713i3, Integer.MIN_VALUE);
        int f8 = v7.f(f.j.f35723k3, 0);
        int f9 = v7.f(f.j.f35728l3, 0);
        h();
        this.f7657K.e(f8, f9);
        if (e13 != Integer.MIN_VALUE || e14 != Integer.MIN_VALUE) {
            this.f7657K.g(e13, e14);
        }
        this.f7658L = v7.e(f.j.f35738n3, Integer.MIN_VALUE);
        this.f7659M = v7.e(f.j.f35718j3, Integer.MIN_VALUE);
        this.f7689w = v7.g(f.j.f35708h3);
        this.f7690x = v7.p(f.j.f35703g3);
        CharSequence p8 = v7.p(f.j.f35793y3);
        if (!TextUtils.isEmpty(p8)) {
            setTitle(p8);
        }
        CharSequence p9 = v7.p(f.j.f35778v3);
        if (!TextUtils.isEmpty(p9)) {
            setSubtitle(p9);
        }
        this.f7647A = getContext();
        setPopupTheme(v7.n(f.j.f35773u3, 0));
        Drawable g8 = v7.g(f.j.f35768t3);
        if (g8 != null) {
            setNavigationIcon(g8);
        }
        CharSequence p10 = v7.p(f.j.f35763s3);
        if (!TextUtils.isEmpty(p10)) {
            setNavigationContentDescription(p10);
        }
        Drawable g9 = v7.g(f.j.f35743o3);
        if (g9 != null) {
            setLogo(g9);
        }
        CharSequence p11 = v7.p(f.j.f35748p3);
        if (!TextUtils.isEmpty(p11)) {
            setLogoDescription(p11);
        }
        if (v7.s(f.j.f35581G3)) {
            setTitleTextColor(v7.c(f.j.f35581G3));
        }
        if (v7.s(f.j.f35788x3)) {
            setSubtitleTextColor(v7.c(f.j.f35788x3));
        }
        if (v7.s(f.j.f35758r3)) {
            x(v7.n(f.j.f35758r3, 0));
        }
        v7.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f7691y;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f7691y.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f7691y;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f7689w);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f7688v)) {
                c(this.f7688v, true);
            }
        } else {
            ImageView imageView = this.f7688v;
            if (imageView != null && z(imageView)) {
                removeView(this.f7688v);
                this.f7668V.remove(this.f7688v);
            }
        }
        ImageView imageView2 = this.f7688v;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f7688v;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f7687u;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            k0.a(this.f7687u, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f7687u)) {
                c(this.f7687u, true);
            }
        } else {
            ImageButton imageButton = this.f7687u;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f7687u);
                this.f7668V.remove(this.f7687u);
            }
        }
        ImageButton imageButton2 = this.f7687u;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f7686t;
            if (textView != null && z(textView)) {
                removeView(this.f7686t);
                this.f7668V.remove(this.f7686t);
            }
        } else {
            if (this.f7686t == null) {
                Context context = getContext();
                D d8 = new D(context);
                this.f7686t = d8;
                d8.setSingleLine();
                this.f7686t.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f7650D;
                if (i8 != 0) {
                    this.f7686t.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f7664R;
                if (colorStateList != null) {
                    this.f7686t.setTextColor(colorStateList);
                }
            }
            if (!z(this.f7686t)) {
                c(this.f7686t, true);
            }
        }
        TextView textView2 = this.f7686t;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f7662P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f7664R = colorStateList;
        TextView textView = this.f7686t;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f7685s;
            if (textView != null && z(textView)) {
                removeView(this.f7685s);
                this.f7668V.remove(this.f7685s);
            }
        } else {
            if (this.f7685s == null) {
                Context context = getContext();
                D d8 = new D(context);
                this.f7685s = d8;
                d8.setSingleLine();
                this.f7685s.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f7649C;
                if (i8 != 0) {
                    this.f7685s.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f7663Q;
                if (colorStateList != null) {
                    this.f7685s.setTextColor(colorStateList);
                }
            }
            if (!z(this.f7685s)) {
                c(this.f7685s, true);
            }
        }
        TextView textView2 = this.f7685s;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f7661O = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f7663Q = colorStateList;
        TextView textView = this.f7685s;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends F0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        int f7701t;

        /* renamed from: u, reason: collision with root package name */
        boolean f7702u;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7701t = parcel.readInt();
            this.f7702u = parcel.readInt() != 0;
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f7701t);
            parcel.writeInt(this.f7702u ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
