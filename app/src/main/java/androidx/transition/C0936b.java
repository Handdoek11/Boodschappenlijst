package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC0945k;
import java.util.Map;

/* renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0936b extends AbstractC0945k {

    /* renamed from: e0, reason: collision with root package name */
    private static final String[] f11456e0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: f0, reason: collision with root package name */
    private static final Property f11457f0 = new a(PointF.class, "topLeft");

    /* renamed from: g0, reason: collision with root package name */
    private static final Property f11458g0 = new C0189b(PointF.class, "bottomRight");

    /* renamed from: h0, reason: collision with root package name */
    private static final Property f11459h0 = new c(PointF.class, "bottomRight");

    /* renamed from: i0, reason: collision with root package name */
    private static final Property f11460i0 = new d(PointF.class, "topLeft");

    /* renamed from: j0, reason: collision with root package name */
    private static final Property f11461j0 = new e(PointF.class, "position");

    /* renamed from: k0, reason: collision with root package name */
    private static final C0943i f11462k0 = new C0943i();

    /* renamed from: d0, reason: collision with root package name */
    private boolean f11463d0 = false;

    /* renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0189b extends Property {
        C0189b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            A.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            A.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f11464a;
        private final i mViewBounds;

        f(i iVar) {
            this.f11464a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC0945k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f11466a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f11467b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f11468c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f11469d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f11470e;

        /* renamed from: f, reason: collision with root package name */
        private final int f11471f;

        /* renamed from: g, reason: collision with root package name */
        private final int f11472g;

        /* renamed from: h, reason: collision with root package name */
        private final int f11473h;

        /* renamed from: i, reason: collision with root package name */
        private final int f11474i;

        /* renamed from: j, reason: collision with root package name */
        private final int f11475j;

        /* renamed from: k, reason: collision with root package name */
        private final int f11476k;

        /* renamed from: l, reason: collision with root package name */
        private final int f11477l;

        /* renamed from: m, reason: collision with root package name */
        private final int f11478m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f11479n;

        g(View view, Rect rect, boolean z7, Rect rect2, boolean z8, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f11466a = view;
            this.f11467b = rect;
            this.f11468c = z7;
            this.f11469d = rect2;
            this.f11470e = z8;
            this.f11471f = i8;
            this.f11472g = i9;
            this.f11473h = i10;
            this.f11474i = i11;
            this.f11475j = i12;
            this.f11476k = i13;
            this.f11477l = i14;
            this.f11478m = i15;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void a(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
            this.f11466a.setTag(AbstractC0942h.f11511b, this.f11466a.getClipBounds());
            this.f11466a.setClipBounds(this.f11470e ? null : this.f11469d);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void c(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.a(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
            this.f11479n = true;
        }

        @Override // androidx.transition.AbstractC0945k.f
        public /* synthetic */ void f(AbstractC0945k abstractC0945k, boolean z7) {
            AbstractC0946l.b(this, abstractC0945k, z7);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
            Rect rect = (Rect) this.f11466a.getTag(AbstractC0942h.f11511b);
            this.f11466a.setTag(AbstractC0942h.f11511b, null);
            this.f11466a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z7) {
            if (this.f11479n) {
                return;
            }
            Rect rect = null;
            if (z7) {
                if (!this.f11468c) {
                    rect = this.f11467b;
                }
            } else if (!this.f11470e) {
                rect = this.f11469d;
            }
            this.f11466a.setClipBounds(rect);
            if (z7) {
                A.d(this.f11466a, this.f11471f, this.f11472g, this.f11473h, this.f11474i);
            } else {
                A.d(this.f11466a, this.f11475j, this.f11476k, this.f11477l, this.f11478m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z7) {
            int max = Math.max(this.f11473h - this.f11471f, this.f11477l - this.f11475j);
            int max2 = Math.max(this.f11474i - this.f11472g, this.f11478m - this.f11476k);
            int i8 = z7 ? this.f11475j : this.f11471f;
            int i9 = z7 ? this.f11476k : this.f11472g;
            A.d(this.f11466a, i8, i9, max + i8, max2 + i9);
            this.f11466a.setClipBounds(z7 ? this.f11469d : this.f11467b);
        }
    }

    /* renamed from: androidx.transition.b$h */
    private static class h extends s {

        /* renamed from: a, reason: collision with root package name */
        boolean f11480a = false;

        /* renamed from: b, reason: collision with root package name */
        final ViewGroup f11481b;

        h(ViewGroup viewGroup) {
            this.f11481b = viewGroup;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC0945k.f
        public void b(AbstractC0945k abstractC0945k) {
            z.b(this.f11481b, false);
        }

        @Override // androidx.transition.AbstractC0945k.f
        public void d(AbstractC0945k abstractC0945k) {
            if (!this.f11480a) {
                z.b(this.f11481b, false);
            }
            abstractC0945k.a0(this);
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC0945k.f
        public void e(AbstractC0945k abstractC0945k) {
            z.b(this.f11481b, false);
            this.f11480a = true;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC0945k.f
        public void g(AbstractC0945k abstractC0945k) {
            z.b(this.f11481b, true);
        }
    }

    /* renamed from: androidx.transition.b$i */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private int f11482a;

        /* renamed from: b, reason: collision with root package name */
        private int f11483b;

        /* renamed from: c, reason: collision with root package name */
        private int f11484c;

        /* renamed from: d, reason: collision with root package name */
        private int f11485d;

        /* renamed from: e, reason: collision with root package name */
        private final View f11486e;

        /* renamed from: f, reason: collision with root package name */
        private int f11487f;

        /* renamed from: g, reason: collision with root package name */
        private int f11488g;

        i(View view) {
            this.f11486e = view;
        }

        private void b() {
            A.d(this.f11486e, this.f11482a, this.f11483b, this.f11484c, this.f11485d);
            this.f11487f = 0;
            this.f11488g = 0;
        }

        void a(PointF pointF) {
            this.f11484c = Math.round(pointF.x);
            this.f11485d = Math.round(pointF.y);
            int i8 = this.f11488g + 1;
            this.f11488g = i8;
            if (this.f11487f == i8) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f11482a = Math.round(pointF.x);
            this.f11483b = Math.round(pointF.y);
            int i8 = this.f11487f + 1;
            this.f11487f = i8;
            if (i8 == this.f11488g) {
                b();
            }
        }
    }

    private void n0(x xVar) {
        View view = xVar.f11584b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f11583a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f11583a.put("android:changeBounds:parent", xVar.f11584b.getParent());
        if (this.f11463d0) {
            xVar.f11583a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC0945k
    public String[] M() {
        return f11456e0;
    }

    @Override // androidx.transition.AbstractC0945k
    public void l(x xVar) {
        n0(xVar);
    }

    @Override // androidx.transition.AbstractC0945k
    public void q(x xVar) {
        Rect rect;
        n0(xVar);
        if (!this.f11463d0 || (rect = (Rect) xVar.f11584b.getTag(AbstractC0942h.f11511b)) == null) {
            return;
        }
        xVar.f11583a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC0945k
    public Animator v(ViewGroup viewGroup, x xVar, x xVar2) {
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        ObjectAnimator a8;
        int i12;
        ObjectAnimator objectAnimator;
        Animator c8;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map map = xVar.f11583a;
        Map map2 = xVar2.f11583a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = xVar2.f11584b;
        Rect rect = (Rect) xVar.f11583a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) xVar2.f11583a.get("android:changeBounds:bounds");
        int i13 = rect.left;
        int i14 = rect2.left;
        int i15 = rect.top;
        int i16 = rect2.top;
        int i17 = rect.right;
        int i18 = rect2.right;
        int i19 = rect.bottom;
        int i20 = rect2.bottom;
        int i21 = i17 - i13;
        int i22 = i19 - i15;
        int i23 = i18 - i14;
        int i24 = i20 - i16;
        Rect rect3 = (Rect) xVar.f11583a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) xVar2.f11583a.get("android:changeBounds:clip");
        if ((i21 == 0 || i22 == 0) && (i23 == 0 || i24 == 0)) {
            i8 = 0;
        } else {
            i8 = (i13 == i14 && i15 == i16) ? 0 : 1;
            if (i17 != i18 || i19 != i20) {
                i8++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i8++;
        }
        if (i8 <= 0) {
            return null;
        }
        if (this.f11463d0) {
            view = view2;
            A.d(view, i13, i15, Math.max(i21, i23) + i13, i15 + Math.max(i22, i24));
            if (i13 == i14 && i15 == i16) {
                i9 = i18;
                i10 = i17;
                i11 = i15;
                a8 = null;
            } else {
                i9 = i18;
                i10 = i17;
                i11 = i15;
                a8 = AbstractC0940f.a(view, f11461j0, D().a(i13, i15, i14, i16));
            }
            boolean z7 = rect3 == null;
            if (z7) {
                i12 = 0;
                rect3 = new Rect(0, 0, i21, i22);
            } else {
                i12 = 0;
            }
            Rect rect5 = rect3;
            int i25 = rect4 == null ? 1 : i12;
            Rect rect6 = i25 != 0 ? new Rect(i12, i12, i23, i24) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect5);
                C0943i c0943i = f11462k0;
                Object[] objArr = new Object[2];
                objArr[i12] = rect5;
                objArr[1] = rect6;
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", c0943i, objArr);
                g gVar = new g(view, rect5, z7, rect6, i25, i13, i11, i10, i19, i14, i16, i9, i20);
                objectAnimator.addListener(gVar);
                b(gVar);
            }
            c8 = w.c(a8, objectAnimator);
        } else {
            view = view2;
            A.d(view, i13, i15, i17, i19);
            if (i8 != 2) {
                c8 = (i13 == i14 && i15 == i16) ? AbstractC0940f.a(view, f11459h0, D().a(i17, i19, i18, i20)) : AbstractC0940f.a(view, f11460i0, D().a(i13, i15, i14, i16));
            } else if (i21 == i23 && i22 == i24) {
                c8 = AbstractC0940f.a(view, f11461j0, D().a(i13, i15, i14, i16));
            } else {
                i iVar = new i(view);
                ObjectAnimator a9 = AbstractC0940f.a(iVar, f11457f0, D().a(i13, i15, i14, i16));
                ObjectAnimator a10 = AbstractC0940f.a(iVar, f11458g0, D().a(i17, i19, i18, i20));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a9, a10);
                animatorSet.addListener(new f(iVar));
                c8 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            z.b(viewGroup4, true);
            F().b(new h(viewGroup4));
        }
        return c8;
    }
}
