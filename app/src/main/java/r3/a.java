package R3;

import D3.b;
import D3.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0861v;
import androidx.core.widget.c;
import com.google.android.material.internal.l;

/* loaded from: classes2.dex */
public class a extends C0861v {

    /* renamed from: x, reason: collision with root package name */
    private static final int f4759x = k.f1627q;

    /* renamed from: y, reason: collision with root package name */
    private static final int[][] f4760y = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f4761v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f4762w;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f1388L);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4761v == null) {
            int d8 = L3.a.d(this, b.f1407f);
            int d9 = L3.a.d(this, b.f1410i);
            int d10 = L3.a.d(this, b.f1413l);
            int[][] iArr = f4760y;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = L3.a.j(d10, d8, 1.0f);
            iArr2[1] = L3.a.j(d10, d9, 0.54f);
            iArr2[2] = L3.a.j(d10, d9, 0.38f);
            iArr2[3] = L3.a.j(d10, d9, 0.38f);
            this.f4761v = new ColorStateList(iArr, iArr2);
        }
        return this.f4761v;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4762w && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f4762w = z7;
        if (z7) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i8) {
        int i9 = f4759x;
        super(Z3.a.c(context, attributeSet, i8, i9), attributeSet, i8);
        Context context2 = getContext();
        TypedArray i10 = l.i(context2, attributeSet, D3.l.f1837Z3, i8, i9, new int[0]);
        if (i10.hasValue(D3.l.f1846a4)) {
            c.d(this, S3.c.a(context2, i10, D3.l.f1846a4));
        }
        this.f4762w = i10.getBoolean(D3.l.f1855b4, false);
        i10.recycle();
    }
}
