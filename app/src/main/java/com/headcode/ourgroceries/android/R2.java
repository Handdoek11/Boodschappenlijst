package com.headcode.ourgroceries.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class R2 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f34354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34355b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34356c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34357d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34358e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34359f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34360g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34361h;

    /* renamed from: i, reason: collision with root package name */
    private final int f34362i;

    /* renamed from: j, reason: collision with root package name */
    private final float f34363j;

    /* renamed from: k, reason: collision with root package name */
    private final int f34364k;

    /* renamed from: l, reason: collision with root package name */
    private final float f34365l;

    /* renamed from: m, reason: collision with root package name */
    private final int f34366m;

    /* renamed from: n, reason: collision with root package name */
    private final float f34367n;

    public R2(Context context) {
        this.f34354a = androidx.preference.k.b(context);
        this.f34355b = context.getString(M2.f34037a4);
        this.f34356c = context.getString(M2.f34061d4);
        this.f34357d = context.getString(M2.f34053c4);
        this.f34358e = context.getString(M2.f34045b4);
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        this.f34359f = resources.getDimensionPixelSize(F2.f33447g);
        this.f34360g = resources.getDimensionPixelSize(F2.f33444d);
        this.f34361h = resources.getDimensionPixelSize(F2.f33442b);
        resources.getValue(F2.f33446f, typedValue, true);
        this.f34362i = d(typedValue);
        this.f34363j = TypedValue.complexToFloat(typedValue.data);
        resources.getValue(F2.f33443c, typedValue, true);
        this.f34364k = d(typedValue);
        this.f34365l = TypedValue.complexToFloat(typedValue.data);
        resources.getValue(F2.f33441a, typedValue, true);
        this.f34366m = d(typedValue);
        this.f34367n = TypedValue.complexToFloat(typedValue.data);
    }

    private void a(ImageView imageView, int i8) {
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i8;
            layoutParams.height = i8;
            imageView.setLayoutParams(layoutParams);
        }
    }

    private void b(ImageView imageView, int i8) {
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = i8;
            imageView.setLayoutParams(layoutParams);
        }
    }

    private static int d(TypedValue typedValue) {
        return typedValue.data & 15;
    }

    private String e() {
        return this.f34354a.getString(this.f34355b, this.f34357d);
    }

    public void c(TextView textView, ImageView imageView, ImageView imageView2, View view) {
        int i8;
        if (view == null) {
            view = textView;
        }
        String e8 = e();
        if (e8.equals(this.f34357d)) {
            view.setMinimumHeight(this.f34360g);
            textView.setTextSize(this.f34364k, this.f34365l);
            i8 = this.f34360g;
        } else if (e8.equals(this.f34356c)) {
            view.setMinimumHeight(this.f34359f);
            textView.setTextSize(this.f34362i, this.f34363j);
            i8 = this.f34359f;
        } else if (e8.equals(this.f34358e)) {
            view.setMinimumHeight(this.f34360g);
            textView.setTextSize(this.f34366m, this.f34367n);
            i8 = this.f34361h;
        } else {
            i8 = 0;
        }
        if (i8 != 0) {
            b(imageView, i8);
            a(imageView2, i8);
        }
    }
}
