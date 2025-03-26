package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes2.dex */
public abstract class p extends ImageButton {

    /* renamed from: o, reason: collision with root package name */
    private int f32152o;

    public p(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f32152o = getVisibility();
    }

    public final void b(int i8, boolean z7) {
        super.setVisibility(i8);
        if (z7) {
            this.f32152o = i8;
        }
    }

    public final int getUserSetVisibility() {
        return this.f32152o;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i8) {
        b(i8, true);
    }
}
