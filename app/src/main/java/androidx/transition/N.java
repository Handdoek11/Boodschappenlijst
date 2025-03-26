package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0945k;

/* loaded from: classes.dex */
public abstract class N extends AbstractC0945k {

    /* renamed from: e0, reason: collision with root package name */
    private static final String[] f11437e0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: d0, reason: collision with root package name */
    private int f11438d0 = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f11439a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11440b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f11441c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f11442d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11443e;

        /* renamed from: f, reason: collision with root package name */
        boolean f11444f = false;

        a(View view, int i8, boolean z7) {
            this.f11439a = view;
            this.f11440b = i8;
            this.f11441c = (ViewGroup) view.getParent();
            this.f11442d = z7;
            i(true);
        }

        private void h() {
            if (!this.f11444f) {
                A.f(this.f11439a, this.f11440b);
                ViewGroup viewGroup = this.f11441c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z7) {
            ViewGroup viewGroup;
            if (!this.f11442d || this.f11443e == z7 || (viewGroup = this.f11441c) == null) {
                return;
            }
            this.f11443e = z7;
            z.b(viewGroup, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
            i(false);
            if (this.f11444f) {
                return;
            }
            A.f(this.f11439a, this.f11440b);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            abstractC0945k.a0(this);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void f(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.b(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
            i(true);
            if (this.f11444f) {
                return;
            }
            A.f(this.f11439a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11444f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            if (z7) {
                A.f(this.f11439a, 0);
                ViewGroup viewGroup = this.f11441c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f11445a;

        /* renamed from: b, reason: collision with root package name */
        private final View f11446b;

        /* renamed from: c, reason: collision with root package name */
        private final View f11447c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11448d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f11445a = viewGroup;
            this.f11446b = view;
            this.f11447c = view2;
        }

        private void h() {
            this.f11447c.setTag(AbstractC0942h.f11510a, null);
            this.f11445a.getOverlay().remove(this.f11446b);
            this.f11448d = false;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            abstractC0945k.a0(this);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
            if (this.f11448d) {
                h();
            }
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void f(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.b(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f11445a.getOverlay().remove(this.f11446b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f11446b.getParent() == null) {
                this.f11445a.getOverlay().add(this.f11446b);
            } else {
                N.this.k();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            if (z7) {
                this.f11447c.setTag(AbstractC0942h.f11510a, this.f11446b);
                this.f11445a.getOverlay().add(this.f11446b);
                this.f11448d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (z7) {
                return;
            }
            h();
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f11450a;

        /* renamed from: b, reason: collision with root package name */
        boolean f11451b;

        /* renamed from: c, reason: collision with root package name */
        int f11452c;

        /* renamed from: d, reason: collision with root package name */
        int f11453d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f11454e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f11455f;

        c() {
        }
    }

    private void n0(x xVar) {
        xVar.f11583a.put("android:visibility:visibility", Integer.valueOf(xVar.f11584b.getVisibility()));
        xVar.f11583a.put("android:visibility:parent", xVar.f11584b.getParent());
        int[] iArr = new int[2];
        xVar.f11584b.getLocationOnScreen(iArr);
        xVar.f11583a.put("android:visibility:screenLocation", iArr);
    }

    private c o0(x xVar, x xVar2) {
        c cVar = new c();
        cVar.f11450a = false;
        cVar.f11451b = false;
        if (xVar == null || !xVar.f11583a.containsKey("android:visibility:visibility")) {
            cVar.f11452c = -1;
            cVar.f11454e = null;
        } else {
            cVar.f11452c = ((Integer) xVar.f11583a.get("android:visibility:visibility")).intValue();
            cVar.f11454e = (ViewGroup) xVar.f11583a.get("android:visibility:parent");
        }
        if (xVar2 == null || !xVar2.f11583a.containsKey("android:visibility:visibility")) {
            cVar.f11453d = -1;
            cVar.f11455f = null;
        } else {
            cVar.f11453d = ((Integer) xVar2.f11583a.get("android:visibility:visibility")).intValue();
            cVar.f11455f = (ViewGroup) xVar2.f11583a.get("android:visibility:parent");
        }
        if (xVar != null && xVar2 != null) {
            int i8 = cVar.f11452c;
            int i9 = cVar.f11453d;
            if (i8 == i9 && cVar.f11454e == cVar.f11455f) {
                return cVar;
            }
            if (i8 != i9) {
                if (i8 == 0) {
                    cVar.f11451b = false;
                    cVar.f11450a = true;
                } else if (i9 == 0) {
                    cVar.f11451b = true;
                    cVar.f11450a = true;
                }
            } else if (cVar.f11455f == null) {
                cVar.f11451b = false;
                cVar.f11450a = true;
            } else if (cVar.f11454e == null) {
                cVar.f11451b = true;
                cVar.f11450a = true;
            }
        } else if (xVar == null && cVar.f11453d == 0) {
            cVar.f11451b = true;
            cVar.f11450a = true;
        } else if (xVar2 == null && cVar.f11452c == 0) {
            cVar.f11451b = false;
            cVar.f11450a = true;
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC0945k
    public String[] M() {
        return f11437e0;
    }

    @Override // androidx.transition.AbstractC0945k
    public boolean O(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f11583a.containsKey("android:visibility:visibility") != xVar.f11583a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c o02 = o0(xVar, xVar2);
        if (o02.f11450a) {
            return o02.f11452c == 0 || o02.f11453d == 0;
        }
        return false;
    }

    @Override // androidx.transition.AbstractC0945k
    public void l(x xVar) {
        n0(xVar);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    @Override // androidx.transition.AbstractC0945k
    public void q(x xVar) {
        n0(xVar);
    }

    public Animator q0(ViewGroup viewGroup, x xVar, int i8, x xVar2, int i9) {
        if ((this.f11438d0 & 1) != 1 || xVar2 == null) {
            return null;
        }
        if (xVar == null) {
            View view = (View) xVar2.f11584b.getParent();
            if (o0(B(view, false), N(view, false)).f11450a) {
                return null;
            }
        }
        return p0(viewGroup, xVar2.f11584b, xVar, xVar2);
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, x xVar, x xVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator s0(android.view.ViewGroup r11, androidx.transition.x r12, int r13, androidx.transition.x r14, int r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.N.s0(android.view.ViewGroup, androidx.transition.x, int, androidx.transition.x, int):android.animation.Animator");
    }

    public void t0(int i8) {
        if ((i8 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f11438d0 = i8;
    }

    @Override // androidx.transition.AbstractC0945k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        c o02 = o0(xVar, xVar2);
        if (!o02.f11450a) {
            return null;
        }
        if (o02.f11454e == null && o02.f11455f == null) {
            return null;
        }
        return o02.f11451b ? q0(viewGroup, xVar, o02.f11452c, xVar2, o02.f11453d) : s0(viewGroup, xVar, o02.f11452c, xVar2, o02.f11453d);
    }
}
