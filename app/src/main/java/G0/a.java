package G0;

import A0.A;
import A0.B;
import A0.z;
import G0.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.internal.ads.C1445Je;
import java.util.ArrayList;
import java.util.List;
import q.C6408l;
import z0.C7013a;
import z0.X;

/* loaded from: classes.dex */
public abstract class a extends C7013a {

    /* renamed from: E, reason: collision with root package name */
    private static final Rect f2517E = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: F, reason: collision with root package name */
    private static final b.a f2518F = new C0040a();

    /* renamed from: G, reason: collision with root package name */
    private static final b.InterfaceC0041b f2519G = new b();

    /* renamed from: A, reason: collision with root package name */
    private c f2520A;

    /* renamed from: y, reason: collision with root package name */
    private final AccessibilityManager f2528y;

    /* renamed from: z, reason: collision with root package name */
    private final View f2529z;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f2524u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    private final Rect f2525v = new Rect();

    /* renamed from: w, reason: collision with root package name */
    private final Rect f2526w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    private final int[] f2527x = new int[2];

    /* renamed from: B, reason: collision with root package name */
    int f2521B = Integer.MIN_VALUE;

    /* renamed from: C, reason: collision with root package name */
    int f2522C = Integer.MIN_VALUE;

    /* renamed from: D, reason: collision with root package name */
    private int f2523D = Integer.MIN_VALUE;

    /* renamed from: G0.a$a, reason: collision with other inner class name */
    class C0040a implements b.a {
        C0040a() {
        }

        @Override // G0.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(z zVar, Rect rect) {
            zVar.l(rect);
        }
    }

    class b implements b.InterfaceC0041b {
        b() {
        }

        @Override // G0.b.InterfaceC0041b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public z a(C6408l c6408l, int i8) {
            return (z) c6408l.r(i8);
        }

        @Override // G0.b.InterfaceC0041b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(C6408l c6408l) {
            return c6408l.q();
        }
    }

    private class c extends A {
        c() {
        }

        @Override // A0.A
        public z b(int i8) {
            return z.Y(a.this.L(i8));
        }

        @Override // A0.A
        public z d(int i8) {
            int i9 = i8 == 2 ? a.this.f2521B : a.this.f2522C;
            if (i9 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i9);
        }

        @Override // A0.A
        public boolean f(int i8, int i9, Bundle bundle) {
            return a.this.T(i8, i9, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2529z = view;
        this.f2528y = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (X.x(view) == 0) {
            X.w0(view, 1);
        }
    }

    private C6408l C() {
        ArrayList arrayList = new ArrayList();
        G(arrayList);
        C6408l c6408l = new C6408l();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c6408l.p(((Integer) arrayList.get(i8)).intValue(), x(((Integer) arrayList.get(i8)).intValue()));
        }
        return c6408l;
    }

    private void D(int i8, Rect rect) {
        L(i8).l(rect);
    }

    private static Rect H(View view, int i8, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i8 == 17) {
            rect.set(width, 0, width, height);
        } else if (i8 == 33) {
            rect.set(0, height, width, height);
        } else if (i8 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f2529z.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f2529z.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int J(int i8) {
        if (i8 == 19) {
            return 33;
        }
        if (i8 != 21) {
            return i8 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean K(int i8, Rect rect) {
        z zVar;
        C6408l C7 = C();
        int i9 = this.f2522C;
        z zVar2 = i9 == Integer.MIN_VALUE ? null : (z) C7.h(i9);
        if (i8 == 1 || i8 == 2) {
            zVar = (z) G0.b.d(C7, f2519G, f2518F, zVar2, i8, X.z(this.f2529z) == 1, false);
        } else {
            if (i8 != 17 && i8 != 33 && i8 != 66 && i8 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i10 = this.f2522C;
            if (i10 != Integer.MIN_VALUE) {
                D(i10, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                H(this.f2529z, i8, rect2);
            }
            zVar = (z) G0.b.c(C7, f2519G, f2518F, zVar2, rect2, i8);
        }
        return X(zVar != null ? C7.m(C7.l(zVar)) : Integer.MIN_VALUE);
    }

    private boolean U(int i8, int i9, Bundle bundle) {
        return i9 != 1 ? i9 != 2 ? i9 != 64 ? i9 != 128 ? N(i8, i9, bundle) : r(i8) : W(i8) : s(i8) : X(i8);
    }

    private boolean V(int i8, Bundle bundle) {
        return X.c0(this.f2529z, i8, bundle);
    }

    private boolean W(int i8) {
        int i9;
        if (!this.f2528y.isEnabled() || !this.f2528y.isTouchExplorationEnabled() || (i9 = this.f2521B) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            r(i9);
        }
        this.f2521B = i8;
        this.f2529z.invalidate();
        Y(i8, 32768);
        return true;
    }

    private void Z(int i8) {
        int i9 = this.f2523D;
        if (i9 == i8) {
            return;
        }
        this.f2523D = i8;
        Y(i8, 128);
        Y(i9, 256);
    }

    private boolean r(int i8) {
        if (this.f2521B != i8) {
            return false;
        }
        this.f2521B = Integer.MIN_VALUE;
        this.f2529z.invalidate();
        Y(i8, 65536);
        return true;
    }

    private boolean t() {
        int i8 = this.f2522C;
        return i8 != Integer.MIN_VALUE && N(i8, 16, null);
    }

    private AccessibilityEvent u(int i8, int i9) {
        return i8 != -1 ? v(i8, i9) : w(i9);
    }

    private AccessibilityEvent v(int i8, int i9) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i9);
        z L7 = L(i8);
        obtain.getText().add(L7.A());
        obtain.setContentDescription(L7.s());
        obtain.setScrollable(L7.S());
        obtain.setPassword(L7.R());
        obtain.setEnabled(L7.L());
        obtain.setChecked(L7.I());
        P(i8, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(L7.p());
        B.c(obtain, this.f2529z, i8);
        obtain.setPackageName(this.f2529z.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent w(int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        this.f2529z.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private z x(int i8) {
        z X7 = z.X();
        X7.q0(true);
        X7.s0(true);
        X7.k0("android.view.View");
        Rect rect = f2517E;
        X7.g0(rect);
        X7.h0(rect);
        X7.A0(this.f2529z);
        R(i8, X7);
        if (X7.A() == null && X7.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        X7.l(this.f2525v);
        if (this.f2525v.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j8 = X7.j();
        if ((j8 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j8 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        X7.y0(this.f2529z.getContext().getPackageName());
        X7.G0(this.f2529z, i8);
        if (this.f2521B == i8) {
            X7.e0(true);
            X7.a(128);
        } else {
            X7.e0(false);
            X7.a(64);
        }
        boolean z7 = this.f2522C == i8;
        if (z7) {
            X7.a(2);
        } else if (X7.M()) {
            X7.a(1);
        }
        X7.t0(z7);
        this.f2529z.getLocationOnScreen(this.f2527x);
        X7.m(this.f2524u);
        if (this.f2524u.equals(rect)) {
            X7.l(this.f2524u);
            if (X7.f10b != -1) {
                z X8 = z.X();
                for (int i9 = X7.f10b; i9 != -1; i9 = X8.f10b) {
                    X8.B0(this.f2529z, -1);
                    X8.g0(f2517E);
                    R(i9, X8);
                    X8.l(this.f2525v);
                    Rect rect2 = this.f2524u;
                    Rect rect3 = this.f2525v;
                    rect2.offset(rect3.left, rect3.top);
                }
                X8.b0();
            }
            this.f2524u.offset(this.f2527x[0] - this.f2529z.getScrollX(), this.f2527x[1] - this.f2529z.getScrollY());
        }
        if (this.f2529z.getLocalVisibleRect(this.f2526w)) {
            this.f2526w.offset(this.f2527x[0] - this.f2529z.getScrollX(), this.f2527x[1] - this.f2529z.getScrollY());
            if (this.f2524u.intersect(this.f2526w)) {
                X7.h0(this.f2524u);
                if (I(this.f2524u)) {
                    X7.K0(true);
                }
            }
        }
        return X7;
    }

    private z y() {
        z Z7 = z.Z(this.f2529z);
        X.a0(this.f2529z, Z7);
        ArrayList arrayList = new ArrayList();
        G(arrayList);
        if (Z7.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Z7.c(this.f2529z, ((Integer) arrayList.get(i8)).intValue());
        }
        return Z7;
    }

    public final boolean A(KeyEvent keyEvent) {
        int i8 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return K(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return K(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case C1445Je.zzm /* 21 */:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int J7 = J(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z7 = false;
                    while (i8 < repeatCount && K(J7, null)) {
                        i8++;
                        z7 = true;
                    }
                    return z7;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t();
        return true;
    }

    public final int B() {
        return this.f2521B;
    }

    public final int E() {
        return this.f2522C;
    }

    protected abstract int F(float f8, float f9);

    protected abstract void G(List list);

    z L(int i8) {
        return i8 == -1 ? y() : x(i8);
    }

    public final void M(boolean z7, int i8, Rect rect) {
        int i9 = this.f2522C;
        if (i9 != Integer.MIN_VALUE) {
            s(i9);
        }
        if (z7) {
            K(i8, rect);
        }
    }

    protected abstract boolean N(int i8, int i9, Bundle bundle);

    protected abstract void Q(z zVar);

    protected abstract void R(int i8, z zVar);

    protected abstract void S(int i8, boolean z7);

    boolean T(int i8, int i9, Bundle bundle) {
        return i8 != -1 ? U(i8, i9, bundle) : V(i9, bundle);
    }

    public final boolean X(int i8) {
        int i9;
        if ((!this.f2529z.isFocused() && !this.f2529z.requestFocus()) || (i9 = this.f2522C) == i8) {
            return false;
        }
        if (i9 != Integer.MIN_VALUE) {
            s(i9);
        }
        if (i8 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2522C = i8;
        S(i8, true);
        Y(i8, 8);
        return true;
    }

    public final boolean Y(int i8, int i9) {
        ViewParent parent;
        if (i8 == Integer.MIN_VALUE || !this.f2528y.isEnabled() || (parent = this.f2529z.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f2529z, u(i8, i9));
    }

    @Override // z0.C7013a
    public A b(View view) {
        if (this.f2520A == null) {
            this.f2520A = new c();
        }
        return this.f2520A;
    }

    @Override // z0.C7013a
    public void j(View view, AccessibilityEvent accessibilityEvent) {
        super.j(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // z0.C7013a
    public void k(View view, z zVar) {
        super.k(view, zVar);
        Q(zVar);
    }

    public final boolean s(int i8) {
        if (this.f2522C != i8) {
            return false;
        }
        this.f2522C = Integer.MIN_VALUE;
        S(i8, false);
        Y(i8, 8);
        return true;
    }

    public final boolean z(MotionEvent motionEvent) {
        if (!this.f2528y.isEnabled() || !this.f2528y.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int F7 = F(motionEvent.getX(), motionEvent.getY());
            Z(F7);
            return F7 != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f2523D == Integer.MIN_VALUE) {
            return false;
        }
        Z(Integer.MIN_VALUE);
        return true;
    }

    protected void O(AccessibilityEvent accessibilityEvent) {
    }

    protected void P(int i8, AccessibilityEvent accessibilityEvent) {
    }
}
