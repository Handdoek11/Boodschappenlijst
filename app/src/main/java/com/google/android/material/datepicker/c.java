package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f31784a;

    /* renamed from: b, reason: collision with root package name */
    final b f31785b;

    /* renamed from: c, reason: collision with root package name */
    final b f31786c;

    /* renamed from: d, reason: collision with root package name */
    final b f31787d;

    /* renamed from: e, reason: collision with root package name */
    final b f31788e;

    /* renamed from: f, reason: collision with root package name */
    final b f31789f;

    /* renamed from: g, reason: collision with root package name */
    final b f31790g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f31791h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(S3.b.d(context, D3.b.f1423v, j.class.getCanonicalName()), D3.l.f1989q3);
        this.f31784a = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2024u3, 0));
        this.f31790g = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2007s3, 0));
        this.f31785b = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2016t3, 0));
        this.f31786c = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2032v3, 0));
        ColorStateList a8 = S3.c.a(context, obtainStyledAttributes, D3.l.f2040w3);
        this.f31787d = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2056y3, 0));
        this.f31788e = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2048x3, 0));
        this.f31789f = b.a(context, obtainStyledAttributes.getResourceId(D3.l.f2064z3, 0));
        Paint paint = new Paint();
        this.f31791h = paint;
        paint.setColor(a8.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
