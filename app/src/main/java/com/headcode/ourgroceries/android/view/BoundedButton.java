package com.headcode.ourgroceries.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/* loaded from: classes2.dex */
public class BoundedButton extends Button {

    /* renamed from: o, reason: collision with root package name */
    private final a f35061o;

    public BoundedButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35061o = new a(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(this.f35061o.c(i8), this.f35061o.a(i9));
    }
}
