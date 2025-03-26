package com.google.android.material.appbar;

import A0.z;
import D3.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.E;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;
import t0.AbstractC6779a;
import z0.C7013a;
import z0.X;

/* loaded from: classes2.dex */
public abstract class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a {

        /* renamed from: k, reason: collision with root package name */
        private int f31350k;

        /* renamed from: l, reason: collision with root package name */
        private int f31351l;

        /* renamed from: m, reason: collision with root package name */
        private b f31352m;

        /* renamed from: n, reason: collision with root package name */
        private WeakReference f31353n;

        class a extends C7013a {

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f31354u;

            a(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f31354u = coordinatorLayout;
            }

            @Override // z0.C7013a
            public void k(View view, z zVar) {
                super.k(view, zVar);
                zVar.k0(ScrollView.class.getName());
                throw null;
            }

            @Override // z0.C7013a
            public boolean n(View view, int i8, Bundle bundle) {
                if (i8 == 4096) {
                    throw null;
                }
                if (i8 != 8192) {
                    return super.n(view, i8, bundle);
                }
                if (BaseBehavior.this.L() == 0) {
                    return false;
                }
                if (BaseBehavior.this.U(this.f31354u).canScrollVertically(-1)) {
                    throw null;
                }
                throw null;
            }
        }

        protected static class b extends F0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: t, reason: collision with root package name */
            boolean f31356t;

            /* renamed from: u, reason: collision with root package name */
            boolean f31357u;

            /* renamed from: v, reason: collision with root package name */
            int f31358v;

            /* renamed from: w, reason: collision with root package name */
            float f31359w;

            /* renamed from: x, reason: collision with root package name */
            boolean f31360x;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f31356t = parcel.readByte() != 0;
                this.f31357u = parcel.readByte() != 0;
                this.f31358v = parcel.readInt();
                this.f31359w = parcel.readFloat();
                this.f31360x = parcel.readByte() != 0;
            }

            @Override // F0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                super.writeToParcel(parcel, i8);
                parcel.writeByte(this.f31356t ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f31357u ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f31358v);
                parcel.writeFloat(this.f31359w);
                parcel.writeByte(this.f31360x ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (X.M(coordinatorLayout)) {
                return;
            }
            X.n0(coordinatorLayout, new a(appBarLayout, coordinatorLayout));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View U(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            E.a(view);
            return e0(coordinatorLayout, null, view2, view3, i8, i9);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i8) {
            E.a(view);
            f0(coordinatorLayout, null, view2, i8);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ boolean G(View view) {
            E.a(view);
            return T(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int J(View view) {
            E.a(view);
            return V(null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int K(View view) {
            E.a(view);
            return W(null);
        }

        @Override // com.google.android.material.appbar.a
        int L() {
            return E() + this.f31350k;
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            E.a(view);
            X(coordinatorLayout, null);
        }

        @Override // com.google.android.material.appbar.a
        /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
            E.a(view);
            return i0(coordinatorLayout, null, i8, i9, i10);
        }

        boolean T(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f31353n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        int V(AppBarLayout appBarLayout) {
            throw null;
        }

        int W(AppBarLayout appBarLayout) {
            throw null;
        }

        void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            j0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8) {
            super.l(coordinatorLayout, appBarLayout, i8);
            throw null;
        }

        public boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, int i10, int i11) {
            throw null;
        }

        public void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int[] iArr, int i10) {
            if (i9 != 0 && i9 >= 0) {
                throw null;
            }
            throw null;
        }

        public void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            if (i11 < 0) {
                throw null;
            }
            if (i11 == 0) {
                S(coordinatorLayout, appBarLayout);
            }
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                g0((b) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f31352m.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f31352m = null;
            }
        }

        public Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y7 = super.y(coordinatorLayout, appBarLayout);
            b h02 = h0(y7, appBarLayout);
            return h02 == null ? y7 : h02;
        }

        public boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i8, int i9) {
            if ((i8 & 2) != 0) {
                throw null;
            }
            this.f31353n = null;
            this.f31351l = i9;
            return false;
        }

        public void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) {
            if (this.f31351l == 0 || i8 == 1) {
                j0(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f31353n = new WeakReference(view);
        }

        void g0(b bVar, boolean z7) {
            if (this.f31352m == null || z7) {
                this.f31352m = bVar;
            }
        }

        b h0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        int i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, int i10) {
            int L7 = L();
            if (i9 == 0 || L7 < i9 || L7 > i10) {
                this.f31350k = 0;
            } else if (L7 != AbstractC6779a.b(i8, i9, i10)) {
                throw null;
            }
            S(coordinatorLayout, appBarLayout);
            return 0;
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
            E.a(view);
            return Y(coordinatorLayout, null, i8);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
            E.a(view);
            return Z(coordinatorLayout, null, i8, i9, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
            E.a(view);
            a0(coordinatorLayout, null, view2, i8, i9, iArr, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            E.a(view);
            b0(coordinatorLayout, null, view2, i8, i9, i10, i11, i12, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            E.a(view);
            c0(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            E.a(view);
            return d0(coordinatorLayout, null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8) {
            return super.Y(coordinatorLayout, appBarLayout, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8, int i9, int i10, int i11) {
            return super.Z(coordinatorLayout, appBarLayout, i8, i9, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int[] iArr, int i10) {
            super.a0(coordinatorLayout, appBarLayout, view, i8, i9, iArr, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
            super.b0(coordinatorLayout, appBarLayout, view, i8, i9, i10, i11, i12, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.c0(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.d0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i8, int i9) {
            return super.e0(coordinatorLayout, appBarLayout, view, view2, i8, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) {
            super.f0(coordinatorLayout, appBarLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.a, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        private void P(View view, View view2) {
            CoordinatorLayout.c f8 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f8 instanceof BaseBehavior) {
                X.Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f8).f31350k) + K()) - H(view2));
            }
        }

        private void Q(View view, View view2) {
        }

        @Override // com.google.android.material.appbar.b
        /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        @Override // com.google.android.material.appbar.b
        float I(View view) {
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int J(View view) {
            return super.J(view);
        }

        AppBarLayout O(List list) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i8) {
            return super.l(coordinatorLayout, view, i8);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int i11) {
            return super.m(coordinatorLayout, view, i8, i9, i10, i11);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z7) {
            O(coordinatorLayout.r(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1798U4);
            M(obtainStyledAttributes.getDimensionPixelSize(l.f1806V4, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
