package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.AbstractC6277a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    private final int f7950o;

    /* renamed from: s, reason: collision with root package name */
    private final int f7951s;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7950o = getResources().getDimensionPixelOffset(AbstractC6277a.f39809b);
        this.f7951s = getResources().getDimensionPixelOffset(AbstractC6277a.f39808a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f7950o * 2), this.f7951s), 1073741824), i9);
    }
}
