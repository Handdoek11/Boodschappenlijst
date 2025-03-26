package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final int f31607a;

    class a extends c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f31608b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, CarouselLayoutManager carouselLayoutManager) {
            super(i8, null);
            this.f31608b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f31608b.b0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return e();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return this.f31608b.i0();
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f31608b.s0() - this.f31608b.j0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return j();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i8, int i9) {
            int g8 = g();
            this.f31608b.D0(view, g8, i8, g8 + m(view), i9);
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f8, float f9) {
            view.offsetTopAndBottom((int) (f9 - (rect.top + f8)));
        }

        int m(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f31608b.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    class b extends c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f31609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8, CarouselLayoutManager carouselLayoutManager) {
            super(i8, null);
            this.f31609b = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        public float d(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        int e() {
            return this.f31609b.b0() - this.f31609b.h0();
        }

        @Override // com.google.android.material.carousel.c
        int f() {
            return this.f31609b.F2() ? g() : h();
        }

        @Override // com.google.android.material.carousel.c
        int g() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        int h() {
            return this.f31609b.s0();
        }

        @Override // com.google.android.material.carousel.c
        int i() {
            return this.f31609b.F2() ? h() : g();
        }

        @Override // com.google.android.material.carousel.c
        int j() {
            return this.f31609b.k0();
        }

        @Override // com.google.android.material.carousel.c
        public void k(View view, int i8, int i9) {
            int j8 = j();
            this.f31609b.D0(view, i8, j8, i9, j8 + m(view));
        }

        @Override // com.google.android.material.carousel.c
        public void l(View view, Rect rect, float f8, float f9) {
            view.offsetLeftAndRight((int) (f9 - (rect.left + f8)));
        }

        int m(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f31609b.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    /* synthetic */ c(int i8, a aVar) {
        this(i8);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i8) {
        if (i8 == 0) {
            return a(carouselLayoutManager);
        }
        if (i8 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract float d(RecyclerView.q qVar);

    abstract int e();

    abstract int f();

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract void k(View view, int i8, int i9);

    abstract void l(View view, Rect rect, float f8, float f9);

    private c(int i8) {
        this.f31607a = i8;
    }
}
