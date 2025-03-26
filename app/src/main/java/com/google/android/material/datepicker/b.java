package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import z0.X;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f31778a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f31779b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f31780c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f31781d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31782e;

    /* renamed from: f, reason: collision with root package name */
    private final V3.k f31783f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i8, V3.k kVar, Rect rect) {
        y0.i.d(rect.left);
        y0.i.d(rect.top);
        y0.i.d(rect.right);
        y0.i.d(rect.bottom);
        this.f31778a = rect;
        this.f31779b = colorStateList2;
        this.f31780c = colorStateList;
        this.f31781d = colorStateList3;
        this.f31782e = i8;
        this.f31783f = kVar;
    }

    static b a(Context context, int i8) {
        y0.i.b(i8 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, D3.l.f1637A3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(D3.l.f1645B3, 0), obtainStyledAttributes.getDimensionPixelOffset(D3.l.f1661D3, 0), obtainStyledAttributes.getDimensionPixelOffset(D3.l.f1653C3, 0), obtainStyledAttributes.getDimensionPixelOffset(D3.l.f1669E3, 0));
        ColorStateList a8 = S3.c.a(context, obtainStyledAttributes, D3.l.f1677F3);
        ColorStateList a9 = S3.c.a(context, obtainStyledAttributes, D3.l.f1717K3);
        ColorStateList a10 = S3.c.a(context, obtainStyledAttributes, D3.l.f1701I3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(D3.l.f1709J3, 0);
        V3.k m8 = V3.k.b(context, obtainStyledAttributes.getResourceId(D3.l.f1685G3, 0), obtainStyledAttributes.getResourceId(D3.l.f1693H3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a8, a9, a10, dimensionPixelSize, m8, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        V3.g gVar = new V3.g();
        V3.g gVar2 = new V3.g();
        gVar.setShapeAppearanceModel(this.f31783f);
        gVar2.setShapeAppearanceModel(this.f31783f);
        if (colorStateList == null) {
            colorStateList = this.f31780c;
        }
        gVar.U(colorStateList);
        gVar.Z(this.f31782e, this.f31781d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f31779b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f31779b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f31778a;
        X.r0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
