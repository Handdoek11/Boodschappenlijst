package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
class a extends c {
    a() {
    }

    private static float e(float f8) {
        return (float) (1.0d - Math.cos((f8 * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f8) {
        return (float) Math.sin((f8 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        float f9;
        float e8;
        RectF a8 = c.a(tabLayout, view);
        RectF a9 = c.a(tabLayout, view2);
        if (a8.left < a9.left) {
            f9 = e(f8);
            e8 = f(f8);
        } else {
            f9 = f(f8);
            e8 = e(f8);
        }
        drawable.setBounds(E3.a.c((int) a8.left, (int) a9.left, f9), drawable.getBounds().top, E3.a.c((int) a8.right, (int) a9.right, e8), drawable.getBounds().bottom);
    }
}
