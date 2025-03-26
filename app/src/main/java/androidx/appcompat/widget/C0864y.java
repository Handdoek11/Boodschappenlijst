package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import f.AbstractC5752a;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0864y extends SeekBar {

    /* renamed from: o, reason: collision with root package name */
    private final C0865z f7943o;

    public C0864y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35368G);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f7943o.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f7943o.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f7943o.g(canvas);
    }

    public C0864y(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        b0.a(this, getContext());
        C0865z c0865z = new C0865z(this);
        this.f7943o = c0865z;
        c0865z.c(attributeSet, i8);
    }
}
