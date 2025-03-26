package com.google.android.material.behavior;

import A0.C;
import A0.z;
import G0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import z0.X;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    G0.c f31405a;

    /* renamed from: b, reason: collision with root package name */
    c f31406b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31407c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31408d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31410f;

    /* renamed from: e, reason: collision with root package name */
    private float f31409e = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    int f31411g = 2;

    /* renamed from: h, reason: collision with root package name */
    float f31412h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    float f31413i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    float f31414j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    private final c.AbstractC0042c f31415k = new a();

    class a extends c.AbstractC0042c {

        /* renamed from: a, reason: collision with root package name */
        private int f31416a;

        /* renamed from: b, reason: collision with root package name */
        private int f31417b = -1;

        a() {
        }

        private boolean n(View view, float f8) {
            if (f8 == 0.0f) {
                return Math.abs(view.getLeft() - this.f31416a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f31412h);
            }
            boolean z7 = X.z(view) == 1;
            int i8 = SwipeDismissBehavior.this.f31411g;
            if (i8 == 2) {
                return true;
            }
            if (i8 == 0) {
                if (z7) {
                    if (f8 >= 0.0f) {
                        return false;
                    }
                } else if (f8 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i8 != 1) {
                return false;
            }
            if (z7) {
                if (f8 <= 0.0f) {
                    return false;
                }
            } else if (f8 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // G0.c.AbstractC0042c
        public int a(View view, int i8, int i9) {
            int width;
            int width2;
            int width3;
            boolean z7 = X.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f31411g;
            if (i10 == 0) {
                if (z7) {
                    width = this.f31416a - view.getWidth();
                    width2 = this.f31416a;
                } else {
                    width = this.f31416a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i10 != 1) {
                width = this.f31416a - view.getWidth();
                width2 = view.getWidth() + this.f31416a;
            } else if (z7) {
                width = this.f31416a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f31416a - view.getWidth();
                width2 = this.f31416a;
            }
            return SwipeDismissBehavior.H(width, i8, width2);
        }

        @Override // G0.c.AbstractC0042c
        public int b(View view, int i8, int i9) {
            return view.getTop();
        }

        @Override // G0.c.AbstractC0042c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // G0.c.AbstractC0042c
        public void i(View view, int i8) {
            this.f31417b = i8;
            this.f31416a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f31408d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f31408d = false;
            }
        }

        @Override // G0.c.AbstractC0042c
        public void j(int i8) {
            c cVar = SwipeDismissBehavior.this.f31406b;
            if (cVar != null) {
                cVar.b(i8);
            }
        }

        @Override // G0.c.AbstractC0042c
        public void k(View view, int i8, int i9, int i10, int i11) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f31413i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f31414j;
            float abs = Math.abs(i8 - this.f31416a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // G0.c.AbstractC0042c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f31417b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f31416a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f31416a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f31416a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                G0.c r5 = r5.f31405a
                int r1 = r3.getTop()
                boolean r5 = r5.F(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                z0.X.f0(r3, r5)
                goto L4a
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f31406b
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // G0.c.AbstractC0042c
        public boolean m(View view, int i8) {
            int i9 = this.f31417b;
            return (i9 == -1 || i9 == i8) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements C {
        b() {
        }

        @Override // A0.C
        public boolean a(View view, C.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z7 = X.z(view) == 1;
            int i8 = SwipeDismissBehavior.this.f31411g;
            X.X(view, (!(i8 == 0 && z7) && (i8 != 1 || z7)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f31406b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i8);
    }

    private class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final View f31420o;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f31421s;

        d(View view, boolean z7) {
            this.f31420o = view;
            this.f31421s = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            G0.c cVar2 = SwipeDismissBehavior.this.f31405a;
            if (cVar2 != null && cVar2.k(true)) {
                X.f0(this.f31420o, this);
            } else {
                if (!this.f31421s || (cVar = SwipeDismissBehavior.this.f31406b) == null) {
                    return;
                }
                cVar.a(this.f31420o);
            }
        }
    }

    static float G(float f8, float f9, float f10) {
        return Math.min(Math.max(f8, f9), f10);
    }

    static int H(int i8, int i9, int i10) {
        return Math.min(Math.max(i8, i9), i10);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f31405a == null) {
            this.f31405a = this.f31410f ? G0.c.l(viewGroup, this.f31409e, this.f31415k) : G0.c.m(viewGroup, this.f31415k);
        }
    }

    static float J(float f8, float f9, float f10) {
        return (f10 - f8) / (f9 - f8);
    }

    private void O(View view) {
        X.h0(view, 1048576);
        if (F(view)) {
            X.j0(view, z.a.f54y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f31405a == null) {
            return false;
        }
        if (this.f31408d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f31405a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f8) {
        this.f31414j = G(0.0f, f8, 1.0f);
    }

    public void L(c cVar) {
        this.f31406b = cVar;
    }

    public void M(float f8) {
        this.f31413i = G(0.0f, f8, 1.0f);
    }

    public void N(int i8) {
        this.f31411g = i8;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z7 = this.f31407c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z7 = coordinatorLayout.A(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f31407c = z7;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f31407c = false;
        }
        if (!z7) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f31408d && this.f31405a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
        boolean l8 = super.l(coordinatorLayout, view, i8);
        if (X.x(view) == 0) {
            X.w0(view, 1);
            O(view);
        }
        return l8;
    }
}
