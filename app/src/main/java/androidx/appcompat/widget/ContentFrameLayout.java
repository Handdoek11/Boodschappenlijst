package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private TypedValue f7393o;

    /* renamed from: s, reason: collision with root package name */
    private TypedValue f7394s;

    /* renamed from: t, reason: collision with root package name */
    private TypedValue f7395t;

    /* renamed from: u, reason: collision with root package name */
    private TypedValue f7396u;

    /* renamed from: v, reason: collision with root package name */
    private TypedValue f7397v;

    /* renamed from: w, reason: collision with root package name */
    private TypedValue f7398w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f7399x;

    /* renamed from: y, reason: collision with root package name */
    private a f7400y;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i8, int i9, int i10, int i11) {
        this.f7399x.set(i8, i9, i10, i11);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f7397v == null) {
            this.f7397v = new TypedValue();
        }
        return this.f7397v;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f7398w == null) {
            this.f7398w = new TypedValue();
        }
        return this.f7398w;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f7395t == null) {
            this.f7395t = new TypedValue();
        }
        return this.f7395t;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f7396u == null) {
            this.f7396u = new TypedValue();
        }
        return this.f7396u;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f7393o == null) {
            this.f7393o = new TypedValue();
        }
        return this.f7393o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f7394s == null) {
            this.f7394s = new TypedValue();
        }
        return this.f7394s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f7400y;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f7400y;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f7400y = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7399x = new Rect();
    }
}
