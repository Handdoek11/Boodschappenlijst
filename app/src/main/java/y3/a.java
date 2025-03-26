package Y3;

import D3.l;
import S3.b;
import S3.c;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.D;

/* loaded from: classes2.dex */
public class a extends D {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void C(Resources.Theme theme, int i8) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i8, l.f1900g4);
        int G7 = G(getContext(), obtainStyledAttributes, l.f1918i4, l.f1927j4);
        obtainStyledAttributes.recycle();
        if (G7 >= 0) {
            setLineHeight(G7);
        }
    }

    private static boolean D(Context context) {
        return b.b(context, D3.b.f1397U, true);
    }

    private static int E(Resources.Theme theme, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f1936k4, i8, i9);
        int resourceId = obtainStyledAttributes.getResourceId(l.f1945l4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void F(AttributeSet attributeSet, int i8, int i9) {
        int E7;
        Context context = getContext();
        if (D(context)) {
            Resources.Theme theme = context.getTheme();
            if (H(context, theme, attributeSet, i8, i9) || (E7 = E(theme, attributeSet, i8, i9)) == -1) {
                return;
            }
            C(theme, E7);
        }
    }

    private static int G(Context context, TypedArray typedArray, int... iArr) {
        int i8 = -1;
        for (int i9 = 0; i9 < iArr.length && i8 < 0; i9++) {
            i8 = c.c(context, typedArray, iArr[i9], -1);
        }
        return i8;
    }

    private static boolean H(Context context, Resources.Theme theme, AttributeSet attributeSet, int i8, int i9) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f1936k4, i8, i9);
        int G7 = G(context, obtainStyledAttributes, l.f1954m4, l.f1963n4);
        obtainStyledAttributes.recycle();
        return G7 != -1;
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        if (D(context)) {
            C(context.getTheme(), i8);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i8) {
        super(Z3.a.c(context, attributeSet, i8, 0), attributeSet, i8);
        F(attributeSet, i8, 0);
    }
}
