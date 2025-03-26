package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.AbstractC5794a;
import p0.h;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7824a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f7825b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f7826c;

    private f0(Context context, TypedArray typedArray) {
        this.f7824a = context;
        this.f7825b = typedArray;
    }

    public static f0 t(Context context, int i8, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(i8, iArr));
    }

    public static f0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static f0 v(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9) {
        return new f0(context, context.obtainStyledAttributes(attributeSet, iArr, i8, i9));
    }

    public boolean a(int i8, boolean z7) {
        return this.f7825b.getBoolean(i8, z7);
    }

    public int b(int i8, int i9) {
        return this.f7825b.getColor(i8, i9);
    }

    public ColorStateList c(int i8) {
        int resourceId;
        ColorStateList a8;
        return (!this.f7825b.hasValue(i8) || (resourceId = this.f7825b.getResourceId(i8, 0)) == 0 || (a8 = AbstractC5794a.a(this.f7824a, resourceId)) == null) ? this.f7825b.getColorStateList(i8) : a8;
    }

    public float d(int i8, float f8) {
        return this.f7825b.getDimension(i8, f8);
    }

    public int e(int i8, int i9) {
        return this.f7825b.getDimensionPixelOffset(i8, i9);
    }

    public int f(int i8, int i9) {
        return this.f7825b.getDimensionPixelSize(i8, i9);
    }

    public Drawable g(int i8) {
        int resourceId;
        return (!this.f7825b.hasValue(i8) || (resourceId = this.f7825b.getResourceId(i8, 0)) == 0) ? this.f7825b.getDrawable(i8) : AbstractC5794a.b(this.f7824a, resourceId);
    }

    public Drawable h(int i8) {
        int resourceId;
        if (!this.f7825b.hasValue(i8) || (resourceId = this.f7825b.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return C0851k.b().d(this.f7824a, resourceId, true);
    }

    public float i(int i8, float f8) {
        return this.f7825b.getFloat(i8, f8);
    }

    public Typeface j(int i8, int i9, h.e eVar) {
        int resourceId = this.f7825b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f7826c == null) {
            this.f7826c = new TypedValue();
        }
        return p0.h.h(this.f7824a, resourceId, this.f7826c, i9, eVar);
    }

    public int k(int i8, int i9) {
        return this.f7825b.getInt(i8, i9);
    }

    public int l(int i8, int i9) {
        return this.f7825b.getInteger(i8, i9);
    }

    public int m(int i8, int i9) {
        return this.f7825b.getLayoutDimension(i8, i9);
    }

    public int n(int i8, int i9) {
        return this.f7825b.getResourceId(i8, i9);
    }

    public String o(int i8) {
        return this.f7825b.getString(i8);
    }

    public CharSequence p(int i8) {
        return this.f7825b.getText(i8);
    }

    public CharSequence[] q(int i8) {
        return this.f7825b.getTextArray(i8);
    }

    public TypedArray r() {
        return this.f7825b;
    }

    public boolean s(int i8) {
        return this.f7825b.hasValue(i8);
    }

    public TypedValue w(int i8) {
        return this.f7825b.peekValue(i8);
    }

    public void x() {
        this.f7825b.recycle();
    }
}
