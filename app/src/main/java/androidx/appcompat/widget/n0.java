package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.adadapted.android.sdk.constants.Config;
import z0.AbstractC7014a0;

/* loaded from: classes.dex */
class n0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: B, reason: collision with root package name */
    private static n0 f7894B;

    /* renamed from: C, reason: collision with root package name */
    private static n0 f7895C;

    /* renamed from: A, reason: collision with root package name */
    private boolean f7896A;

    /* renamed from: o, reason: collision with root package name */
    private final View f7897o;

    /* renamed from: s, reason: collision with root package name */
    private final CharSequence f7898s;

    /* renamed from: t, reason: collision with root package name */
    private final int f7899t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f7900u = new Runnable() { // from class: androidx.appcompat.widget.l0
        @Override // java.lang.Runnable
        public final void run() {
            this.f7888o.e();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private final Runnable f7901v = new Runnable() { // from class: androidx.appcompat.widget.m0
        @Override // java.lang.Runnable
        public final void run() {
            this.f7891o.d();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    private int f7902w;

    /* renamed from: x, reason: collision with root package name */
    private int f7903x;

    /* renamed from: y, reason: collision with root package name */
    private o0 f7904y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7905z;

    private n0(View view, CharSequence charSequence) {
        this.f7897o = view;
        this.f7898s = charSequence;
        this.f7899t = AbstractC7014a0.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f7897o.removeCallbacks(this.f7900u);
    }

    private void c() {
        this.f7896A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f7897o.postDelayed(this.f7900u, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(n0 n0Var) {
        n0 n0Var2 = f7894B;
        if (n0Var2 != null) {
            n0Var2.b();
        }
        f7894B = n0Var;
        if (n0Var != null) {
            n0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        n0 n0Var = f7894B;
        if (n0Var != null && n0Var.f7897o == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new n0(view, charSequence);
            return;
        }
        n0 n0Var2 = f7895C;
        if (n0Var2 != null && n0Var2.f7897o == view) {
            n0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (!this.f7896A && Math.abs(x7 - this.f7902w) <= this.f7899t && Math.abs(y7 - this.f7903x) <= this.f7899t) {
            return false;
        }
        this.f7902w = x7;
        this.f7903x = y7;
        this.f7896A = false;
        return true;
    }

    void d() {
        if (f7895C == this) {
            f7895C = null;
            o0 o0Var = this.f7904y;
            if (o0Var != null) {
                o0Var.c();
                this.f7904y = null;
                c();
                this.f7897o.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f7894B == this) {
            g(null);
        }
        this.f7897o.removeCallbacks(this.f7901v);
    }

    void i(boolean z7) {
        long longPressTimeout;
        long j8;
        long j9;
        if (this.f7897o.isAttachedToWindow()) {
            g(null);
            n0 n0Var = f7895C;
            if (n0Var != null) {
                n0Var.d();
            }
            f7895C = this;
            this.f7905z = z7;
            o0 o0Var = new o0(this.f7897o.getContext());
            this.f7904y = o0Var;
            o0Var.e(this.f7897o, this.f7902w, this.f7903x, this.f7905z, this.f7898s);
            this.f7897o.addOnAttachStateChangeListener(this);
            if (this.f7905z) {
                j9 = 2500;
            } else {
                if ((z0.X.K(this.f7897o) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = Config.DEFAULT_EVENT_POLLING;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j8 = 15000;
                }
                j9 = j8 - longPressTimeout;
            }
            this.f7897o.removeCallbacks(this.f7901v);
            this.f7897o.postDelayed(this.f7901v, j9);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f7904y != null && this.f7905z) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f7897o.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f7897o.isEnabled() && this.f7904y == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f7902w = view.getWidth() / 2;
        this.f7903x = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
