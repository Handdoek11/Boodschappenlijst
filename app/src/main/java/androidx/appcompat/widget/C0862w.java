package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import f.AbstractC5752a;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0862w extends RatingBar {

    /* renamed from: o, reason: collision with root package name */
    private final C0860u f7942o;

    public C0862w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35366E);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        Bitmap b8 = this.f7942o.b();
        if (b8 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b8.getWidth() * getNumStars(), i8, 0), getMeasuredHeight());
        }
    }

    public C0862w(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        b0.a(this, getContext());
        C0860u c0860u = new C0860u(this);
        this.f7942o = c0860u;
        c0860u.c(attributeSet, i8);
    }
}
