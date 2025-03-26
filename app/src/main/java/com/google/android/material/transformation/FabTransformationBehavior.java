package com.google.android.material.transformation;

import E3.c;
import E3.f;
import E3.g;
import E3.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import z0.X;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f32673c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f32674d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f32675e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f32676f;

    /* renamed from: g, reason: collision with root package name */
    private float f32677g;

    /* renamed from: h, reason: collision with root package name */
    private float f32678h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f32679a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f32680b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32681c;

        a(boolean z7, View view, View view2) {
            this.f32679a = z7;
            this.f32680b = view;
            this.f32681c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f32679a) {
                return;
            }
            this.f32680b.setVisibility(4);
            this.f32681c.setAlpha(1.0f);
            this.f32681c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f32679a) {
                this.f32680b.setVisibility(0);
                this.f32681c.setAlpha(0.0f);
                this.f32681c.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public f f32683a;

        /* renamed from: b, reason: collision with root package name */
        public h f32684b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.f32673c = new Rect();
        this.f32674d = new RectF();
        this.f32675e = new RectF();
        this.f32676f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(D3.f.f1513C);
        return findViewById != null ? a0(findViewById) : a0(view);
    }

    private void L(View view, b bVar, g gVar, g gVar2, float f8, float f9, float f10, float f11, RectF rectF) {
        float Q7 = Q(bVar, gVar, f8, f10);
        float Q8 = Q(bVar, gVar2, f9, f11);
        Rect rect = this.f32673c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f32674d;
        rectF2.set(rect);
        RectF rectF3 = this.f32675e;
        R(view, rectF3);
        rectF3.offset(Q7, Q8);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        R(view, rectF);
        rectF.offset(this.f32677g, this.f32678h);
    }

    private Pair N(float f8, float f9, boolean z7, b bVar) {
        g e8;
        g e9;
        if (f8 == 0.0f || f9 == 0.0f) {
            e8 = bVar.f32683a.e("translationXLinear");
            e9 = bVar.f32683a.e("translationYLinear");
        } else if ((!z7 || f9 >= 0.0f) && (z7 || f9 <= 0.0f)) {
            e8 = bVar.f32683a.e("translationXCurveDownwards");
            e9 = bVar.f32683a.e("translationYCurveDownwards");
        } else {
            e8 = bVar.f32683a.e("translationXCurveUpwards");
            e9 = bVar.f32683a.e("translationYCurveUpwards");
        }
        return new Pair(e8, e9);
    }

    private float O(View view, View view2, h hVar) {
        float centerX;
        float centerX2;
        float f8;
        RectF rectF = this.f32674d;
        RectF rectF2 = this.f32675e;
        M(view, rectF);
        R(view2, rectF2);
        int i8 = hVar.f2162a & 7;
        if (i8 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i8 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else {
            if (i8 != 5) {
                f8 = 0.0f;
                return f8 + hVar.f2163b;
            }
            centerX = rectF2.right;
            centerX2 = rectF.right;
        }
        f8 = centerX - centerX2;
        return f8 + hVar.f2163b;
    }

    private float P(View view, View view2, h hVar) {
        float centerY;
        float centerY2;
        float f8;
        RectF rectF = this.f32674d;
        RectF rectF2 = this.f32675e;
        M(view, rectF);
        R(view2, rectF2);
        int i8 = hVar.f2162a & 112;
        if (i8 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i8 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else {
            if (i8 != 80) {
                f8 = 0.0f;
                return f8 + hVar.f2164c;
            }
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        }
        f8 = centerY - centerY2;
        return f8 + hVar.f2164c;
    }

    private float Q(b bVar, g gVar, float f8, float f9) {
        long c8 = gVar.c();
        long d8 = gVar.d();
        g e8 = bVar.f32683a.e("expansion");
        return E3.a.a(f8, f9, gVar.e().getInterpolation((((e8.c() + e8.d()) + 17) - c8) / d8));
    }

    private void R(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f32676f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void S(View view, View view2, boolean z7, boolean z8, b bVar, List list, List list2) {
        ViewGroup K7;
        ObjectAnimator ofFloat;
        if ((view2 instanceof ViewGroup) && (K7 = K(view2)) != null) {
            if (z7) {
                if (!z8) {
                    c.f2150a.set(K7, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(K7, (Property<ViewGroup, Float>) c.f2150a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K7, (Property<ViewGroup, Float>) c.f2150a, 0.0f);
            }
            bVar.f32683a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void T(View view, View view2, boolean z7, boolean z8, b bVar, List list, List list2) {
    }

    private void U(View view, View view2, boolean z7, b bVar, List list) {
        float O7 = O(view, view2, bVar.f32684b);
        float P7 = P(view, view2, bVar.f32684b);
        Pair N7 = N(O7, P7, z7, bVar);
        g gVar = (g) N7.first;
        g gVar2 = (g) N7.second;
        Property property = View.TRANSLATION_X;
        if (!z7) {
            O7 = this.f32677g;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, O7);
        Property property2 = View.TRANSLATION_Y;
        if (!z7) {
            P7 = this.f32678h;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, P7);
        gVar.a(ofFloat);
        gVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private void V(View view, View view2, boolean z7, boolean z8, b bVar, List list, List list2) {
        ObjectAnimator ofFloat;
        float u7 = X.u(view2) - X.u(view);
        if (z7) {
            if (!z8) {
                view2.setTranslationZ(-u7);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -u7);
        }
        bVar.f32683a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void W(View view, View view2, boolean z7, boolean z8, b bVar, float f8, float f9, List list, List list2) {
    }

    private void X(View view, View view2, boolean z7, boolean z8, b bVar, List list, List list2) {
    }

    private void Y(View view, View view2, boolean z7, boolean z8, b bVar, List list, List list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float O7 = O(view, view2, bVar.f32684b);
        float P7 = P(view, view2, bVar.f32684b);
        Pair N7 = N(O7, P7, z7, bVar);
        g gVar = (g) N7.first;
        g gVar2 = (g) N7.second;
        if (z7) {
            if (!z8) {
                view2.setTranslationX(-O7);
                view2.setTranslationY(-P7);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, bVar, gVar, gVar2, -O7, -P7, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -O7);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -P7);
        }
        gVar.a(ofFloat);
        gVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z7, boolean z8) {
        b Z7 = Z(view2.getContext(), z7);
        if (z7) {
            this.f32677g = view.getTranslationX();
            this.f32678h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V(view, view2, z7, z8, Z7, arrayList, arrayList2);
        RectF rectF = this.f32674d;
        Y(view, view2, z7, z8, Z7, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        U(view, view2, z7, Z7, arrayList);
        X(view, view2, z7, z8, Z7, arrayList, arrayList2);
        W(view, view2, z7, z8, Z7, width, height, arrayList, arrayList2);
        T(view, view2, z7, z8, Z7, arrayList, arrayList2);
        S(view, view2, z7, z8, Z7, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        E3.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z7, view2, view));
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i8));
        }
        return animatorSet;
    }

    protected abstract b Z(Context context, boolean z7);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f9052h == 0) {
            fVar.f9052h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32673c = new Rect();
        this.f32674d = new RectF();
        this.f32675e = new RectF();
        this.f32676f = new int[2];
    }
}
