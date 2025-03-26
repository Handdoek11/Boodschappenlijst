package com.google.android.material.timepicker;

import D3.h;
import D3.l;
import V3.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z0.X;

/* loaded from: classes2.dex */
abstract class e extends ConstraintLayout {

    /* renamed from: Q, reason: collision with root package name */
    private final Runnable f32655Q;

    /* renamed from: R, reason: collision with root package name */
    private int f32656R;

    /* renamed from: S, reason: collision with root package name */
    private V3.g f32657S;

    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater.from(context).inflate(h.f1567j, this);
        X.r0(this, E());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f1742N4, i8, 0);
        this.f32656R = obtainStyledAttributes.getDimensionPixelSize(l.f1750O4, 0);
        this.f32655Q = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f32654o.J();
            }
        };
        obtainStyledAttributes.recycle();
    }

    private void D(List list, androidx.constraintlayout.widget.e eVar, int i8) {
        Iterator it = list.iterator();
        float f8 = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), D3.f.f1532c, i8, f8);
            f8 += 360.0f / list.size();
        }
    }

    private Drawable E() {
        V3.g gVar = new V3.g();
        this.f32657S = gVar;
        gVar.S(new i(0.5f));
        this.f32657S.U(ColorStateList.valueOf(-1));
        return this.f32657S;
    }

    private static boolean I(View view) {
        return "skip".equals(view.getTag());
    }

    private void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f32655Q);
            handler.post(this.f32655Q);
        }
    }

    int F(int i8) {
        return i8 == 2 ? Math.round(this.f32656R * 0.66f) : this.f32656R;
    }

    public int G() {
        return this.f32656R;
    }

    public void H(int i8) {
        this.f32656R = i8;
        J();
    }

    protected void J() {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() != D3.f.f1532c && !I(childAt)) {
                int i9 = (Integer) childAt.getTag(D3.f.f1540k);
                if (i9 == null) {
                    i9 = 1;
                }
                if (!hashMap.containsKey(i9)) {
                    hashMap.put(i9, new ArrayList());
                }
                ((List) hashMap.get(i9)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            D((List) entry.getValue(), eVar, F(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        if (view.getId() == -1) {
            view.setId(X.k());
        }
        K();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i8) {
        this.f32657S.U(ColorStateList.valueOf(i8));
    }
}
