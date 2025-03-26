package com.headcode.ourgroceries.android;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.headcode.ourgroceries.android.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5643s4 extends RecyclerView.o {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f35010d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private final a f35011a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f35012b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f35013c = new Rect();

    /* renamed from: com.headcode.ourgroceries.android.s4$a */
    public interface a {
        boolean a(int i8);

        boolean b(int i8);
    }

    public C5643s4(Context context, a aVar) {
        this.f35011a = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f35010d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f35012b = drawable;
        if (drawable == null) {
            Log.w("OG-SmartDividerItem", "@android:attr/listDivider was not set in the theme used for this SmartDividerItemDecoration. Please set that attribute or call setDrawable()");
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b8) {
        int k02 = recyclerView.k0(view);
        rect.set(0, 0, 0, (k02 == -1 || !this.f35011a.a(k02)) ? 0 : this.f35012b.getIntrinsicHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        int width;
        int i8;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i8 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i8, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i8 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            int k02 = recyclerView.k0(childAt);
            if (k02 != -1 && this.f35011a.b(k02)) {
                recyclerView.o0(childAt, this.f35013c);
                int round = this.f35013c.bottom + Math.round(childAt.getTranslationY());
                this.f35012b.setBounds(i8, round - this.f35012b.getIntrinsicHeight(), width, round);
                this.f35012b.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void j(Drawable drawable) {
        this.f35012b = drawable;
    }
}
