package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
class b extends c {
    b() {
    }

    @Override // com.google.android.material.tabs.c
    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        if (f8 >= 0.5f) {
            view = view2;
        }
        RectF a8 = c.a(tabLayout, view);
        float b8 = f8 < 0.5f ? E3.a.b(1.0f, 0.0f, 0.0f, 0.5f, f8) : E3.a.b(0.0f, 1.0f, 0.5f, 1.0f, f8);
        drawable.setBounds((int) a8.left, drawable.getBounds().top, (int) a8.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b8 * 255.0f));
    }
}
