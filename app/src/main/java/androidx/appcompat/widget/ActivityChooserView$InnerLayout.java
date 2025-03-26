package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f7366o = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f0 u7 = f0.u(context, attributeSet, f7366o);
        setBackgroundDrawable(u7.g(0));
        u7.x();
    }
}
