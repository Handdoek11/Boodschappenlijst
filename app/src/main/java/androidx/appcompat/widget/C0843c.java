package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import f.AbstractC5752a;
import f.AbstractC5758g;
import java.util.ArrayList;
import r0.AbstractC6641a;
import z0.AbstractC7015b;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0843c extends androidx.appcompat.view.menu.a implements AbstractC7015b.a {

    /* renamed from: B, reason: collision with root package name */
    d f7773B;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f7774C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7775D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7776E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f7777F;

    /* renamed from: G, reason: collision with root package name */
    private int f7778G;

    /* renamed from: H, reason: collision with root package name */
    private int f7779H;

    /* renamed from: I, reason: collision with root package name */
    private int f7780I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7781J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f7782K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f7783L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f7784M;

    /* renamed from: N, reason: collision with root package name */
    private int f7785N;

    /* renamed from: O, reason: collision with root package name */
    private final SparseBooleanArray f7786O;

    /* renamed from: P, reason: collision with root package name */
    e f7787P;

    /* renamed from: Q, reason: collision with root package name */
    a f7788Q;

    /* renamed from: R, reason: collision with root package name */
    RunnableC0137c f7789R;

    /* renamed from: S, reason: collision with root package name */
    private b f7790S;

    /* renamed from: T, reason: collision with root package name */
    final f f7791T;

    /* renamed from: U, reason: collision with root package name */
    int f7792U;

    /* renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC5752a.f35382i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C0843c.this.f7773B;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C0843c.this).f7099z : view2);
            }
            j(C0843c.this.f7791T);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C0843c c0843c = C0843c.this;
            c0843c.f7788Q = null;
            c0843c.f7792U = 0;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public k.e a() {
            a aVar = C0843c.this.f7788Q;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0137c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private e f7795o;

        public RunnableC0137c(e eVar) {
            this.f7795o = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C0843c.this).f7093t != null) {
                ((androidx.appcompat.view.menu.a) C0843c.this).f7093t.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C0843c.this).f7099z;
            if (view != null && view.getWindowToken() != null && this.f7795o.m()) {
                C0843c.this.f7787P = this.f7795o;
            }
            C0843c.this.f7789R = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    private class d extends r implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        class a extends S {

            /* renamed from: A, reason: collision with root package name */
            final /* synthetic */ C0843c f7798A;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0843c c0843c) {
                super(view);
                this.f7798A = c0843c;
            }

            @Override // androidx.appcompat.widget.S
            public k.e b() {
                e eVar = C0843c.this.f7787P;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.S
            public boolean d() {
                C0843c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.S
            public boolean g() {
                C0843c c0843c = C0843c.this;
                if (c0843c.f7789R != null) {
                    return false;
                }
                c0843c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC5752a.f35381h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C0843c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0843c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i8, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i8, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC6641a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z7) {
            super(context, eVar, view, z7, AbstractC5752a.f35382i);
            h(8388613);
            j(C0843c.this.f7791T);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C0843c.this).f7093t != null) {
                ((androidx.appcompat.view.menu.a) C0843c.this).f7093t.close();
            }
            C0843c.this.f7787P = null;
            super.e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m8 = C0843c.this.m();
            if (m8 != null) {
                m8.c(eVar, z7);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C0843c.this).f7093t) {
                return false;
            }
            C0843c.this.f7792U = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m8 = C0843c.this.m();
            if (m8 != null) {
                return m8.d(eVar);
            }
            return false;
        }
    }

    public C0843c(Context context) {
        super(context, AbstractC5758g.f35511c, AbstractC5758g.f35510b);
        this.f7786O = new SparseBooleanArray();
        this.f7791T = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f7099z;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f7773B;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f7775D) {
            return this.f7774C;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0137c runnableC0137c = this.f7789R;
        if (runnableC0137c != null && (obj = this.f7099z) != null) {
            ((View) obj).removeCallbacks(runnableC0137c);
            this.f7789R = null;
            return true;
        }
        e eVar = this.f7787P;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f7788Q;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f7789R != null || E();
    }

    public boolean E() {
        e eVar = this.f7787P;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f7781J) {
            this.f7780I = androidx.appcompat.view.a.b(this.f7092s).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f7093t;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z7) {
        this.f7784M = z7;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f7099z = actionMenuView;
        actionMenuView.b(this.f7093t);
    }

    public void I(Drawable drawable) {
        d dVar = this.f7773B;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f7775D = true;
            this.f7774C = drawable;
        }
    }

    public void J(boolean z7) {
        this.f7776E = z7;
        this.f7777F = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f7776E || E() || (eVar = this.f7093t) == null || this.f7099z == null || this.f7789R != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0137c runnableC0137c = new RunnableC0137c(new e(this.f7092s, this.f7093t, this.f7773B, true));
        this.f7789R = runnableC0137c;
        ((View) this.f7099z).post(runnableC0137c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.g(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f7099z);
        if (this.f7790S == null) {
            this.f7790S = new b();
        }
        actionMenuItemView.setPopupCallback(this.f7790S);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
        y();
        super.c(eVar, z7);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        super.d(z7);
        ((View) this.f7099z).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f7093t;
        boolean z8 = false;
        if (eVar != null) {
            ArrayList s8 = eVar.s();
            int size = s8.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC7015b b8 = ((androidx.appcompat.view.menu.g) s8.get(i8)).b();
                if (b8 != null) {
                    b8.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f7093t;
        ArrayList z9 = eVar2 != null ? eVar2.z() : null;
        if (this.f7776E && z9 != null) {
            int size2 = z9.size();
            if (size2 == 1) {
                z8 = !((androidx.appcompat.view.menu.g) z9.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f7773B == null) {
                this.f7773B = new d(this.f7091o);
            }
            ViewGroup viewGroup = (ViewGroup) this.f7773B.getParent();
            if (viewGroup != this.f7099z) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f7773B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f7099z;
                actionMenuView.addView(this.f7773B, actionMenuView.F());
            }
        } else {
            d dVar = this.f7773B;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f7099z;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f7773B);
                }
            }
        }
        ((ActionMenuView) this.f7099z).setOverflowReserved(this.f7776E);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        boolean z7;
        int i11;
        C0843c c0843c = this;
        androidx.appcompat.view.menu.e eVar = c0843c.f7093t;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i8 = arrayList.size();
        } else {
            arrayList = null;
            i8 = 0;
        }
        int i12 = c0843c.f7780I;
        int i13 = c0843c.f7779H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0843c.f7099z;
        boolean z8 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i8; i16++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayList.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z8 = true;
            }
            if (c0843c.f7784M && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (c0843c.f7776E && (z8 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = c0843c.f7786O;
        sparseBooleanArray.clear();
        if (c0843c.f7782K) {
            int i18 = c0843c.f7785N;
            i10 = i13 / i18;
            i9 = i18 + ((i13 % i18) / i10);
        } else {
            i9 = 0;
            i10 = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < i8) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayList.get(i19);
            if (gVar2.o()) {
                View n8 = c0843c.n(gVar2, view, viewGroup);
                if (c0843c.f7782K) {
                    i10 -= ActionMenuView.L(n8, i9, i10, makeMeasureSpec, r32);
                } else {
                    n8.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n8.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z7 = r32;
                i11 = i8;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z9 = sparseBooleanArray.get(groupId2);
                boolean z10 = (i17 > 0 || z9) && i13 > 0 && (!c0843c.f7782K || i10 > 0);
                boolean z11 = z10;
                i11 = i8;
                if (z10) {
                    View n9 = c0843c.n(gVar2, null, viewGroup);
                    if (c0843c.f7782K) {
                        int L7 = ActionMenuView.L(n9, i9, i10, makeMeasureSpec, 0);
                        i10 -= L7;
                        if (L7 == 0) {
                            z11 = false;
                        }
                    } else {
                        n9.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z12 = z11;
                    int measuredWidth2 = n9.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z10 = z12 & (!c0843c.f7782K ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z9) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayList.get(i21);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i17++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z10) {
                    i17--;
                }
                gVar2.u(z10);
                z7 = false;
            } else {
                z7 = r32;
                i11 = i8;
                gVar2.u(z7);
            }
            i19++;
            r32 = z7;
            i8 = i11;
            view = null;
            c0843c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b8 = androidx.appcompat.view.a.b(context);
        if (!this.f7777F) {
            this.f7776E = b8.f();
        }
        if (!this.f7783L) {
            this.f7778G = b8.c();
        }
        if (!this.f7781J) {
            this.f7780I = b8.d();
        }
        int i8 = this.f7778G;
        if (this.f7776E) {
            if (this.f7773B == null) {
                d dVar = new d(this.f7091o);
                this.f7773B = dVar;
                if (this.f7775D) {
                    dVar.setImageDrawable(this.f7774C);
                    this.f7774C = null;
                    this.f7775D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f7773B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i8 -= this.f7773B.getMeasuredWidth();
        } else {
            this.f7773B = null;
        }
        this.f7779H = i8;
        this.f7785N = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z7 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f7093t) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View z8 = z(mVar2.getItem());
        if (z8 == null) {
            return false;
        }
        this.f7792U = mVar.getItem().getItemId();
        int size = mVar.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i8++;
        }
        a aVar = new a(this.f7092s, mVar, z8);
        this.f7788Q = aVar;
        aVar.g(z7);
        this.f7788Q.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i8) {
        if (viewGroup.getChildAt(i8) == this.f7773B) {
            return false;
        }
        return super.l(viewGroup, i8);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f7099z;
        androidx.appcompat.view.menu.k o8 = super.o(viewGroup);
        if (kVar != o8) {
            ((ActionMenuView) o8).setPresenter(this);
        }
        return o8;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i8, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
