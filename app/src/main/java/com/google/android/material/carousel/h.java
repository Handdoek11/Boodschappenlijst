package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC6779a;

/* loaded from: classes2.dex */
public final class h extends d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f31640d = {1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f31641e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    private int f31642c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float b8 = bVar.b();
        if (bVar.f()) {
            b8 = bVar.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f8 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.f()) {
            f8 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f9 = f8;
        float d8 = d() + f9;
        float max = Math.max(c() + f9, d8);
        float min = Math.min(measuredHeight + f9, b8);
        float a8 = AbstractC6779a.a((measuredHeight / 3.0f) + f9, d8 + f9, max + f9);
        float f10 = (min + a8) / 2.0f;
        int[] iArr = f31640d;
        if (b8 < 2.0f * d8) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f31641e;
        if (bVar.d() == 1) {
            iArr = d.a(iArr);
            iArr2 = d.a(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((b8 - (e.i(iArr4) * f10)) - (e.i(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(b8 / min);
        int i8 = (ceil - max2) + 1;
        int[] iArr5 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr5[i9] = ceil - i9;
        }
        a c8 = a.c(b8, a8, d8, max, iArr3, f10, iArr4, min, iArr5);
        this.f31642c = c8.e();
        if (i(c8, bVar.e())) {
            c8 = a.c(b8, a8, d8, max, new int[]{c8.f31601c}, f10, new int[]{c8.f31602d}, min, new int[]{c8.f31605g});
        }
        return e.d(view.getContext(), f9, b8, c8, bVar.d());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i8) {
        return (i8 < this.f31642c && bVar.e() >= this.f31642c) || (i8 >= this.f31642c && bVar.e() < this.f31642c);
    }

    boolean i(a aVar, int i8) {
        int e8 = aVar.e() - i8;
        boolean z7 = e8 > 0 && (aVar.f31601c > 0 || aVar.f31602d > 1);
        while (e8 > 0) {
            int i9 = aVar.f31601c;
            if (i9 > 0) {
                aVar.f31601c = i9 - 1;
            } else {
                int i10 = aVar.f31602d;
                if (i10 > 1) {
                    aVar.f31602d = i10 - 1;
                }
            }
            e8--;
        }
        return z7;
    }
}
