package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.o;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
class c {
    c() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.B() || !(view instanceof TabLayout.f)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.f) view, 24);
    }

    static RectF b(TabLayout.f fVar, int i8) {
        int contentWidth = fVar.getContentWidth();
        int contentHeight = fVar.getContentHeight();
        int c8 = (int) o.c(fVar.getContext(), i8);
        if (contentWidth < c8) {
            contentWidth = c8;
        }
        int left = (fVar.getLeft() + fVar.getRight()) / 2;
        int top = (fVar.getTop() + fVar.getBottom()) / 2;
        int i9 = contentWidth / 2;
        return new RectF(left - i9, top - (contentHeight / 2), i9 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a8 = a(tabLayout, view);
        drawable.setBounds((int) a8.left, drawable.getBounds().top, (int) a8.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, float f8, Drawable drawable) {
        RectF a8 = a(tabLayout, view);
        RectF a9 = a(tabLayout, view2);
        drawable.setBounds(E3.a.c((int) a8.left, (int) a9.left, f8), drawable.getBounds().top, E3.a.c((int) a8.right, (int) a9.right, f8), drawable.getBounds().bottom);
    }
}
