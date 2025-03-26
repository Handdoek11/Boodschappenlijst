package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.t;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: o, reason: collision with root package name */
    private int f10519o;

    /* renamed from: s, reason: collision with root package name */
    private int f10520s;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f10520s;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f10519o;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i8);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i8 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i9);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i9 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i8) {
        this.f10520s = i8;
        super.setMaxHeight(i8);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i8) {
        this.f10519o = i8;
        super.setMaxWidth(i8);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f10519o = Integer.MAX_VALUE;
        this.f10520s = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10584D0, i8, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(t.f10588F0, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(t.f10586E0, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }
}
