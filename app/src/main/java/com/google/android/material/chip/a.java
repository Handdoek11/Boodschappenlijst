package com.google.android.material.chip;

import E3.f;
import S3.c;
import S3.d;
import T3.b;
import V3.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import com.google.android.material.internal.o;
import g.AbstractC5794a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import q0.AbstractC6410a;
import r0.AbstractC6641a;
import x0.C6897a;

/* loaded from: classes2.dex */
public class a extends g implements Drawable.Callback, j.b {

    /* renamed from: a1, reason: collision with root package name */
    private static final int[] f31695a1 = {R.attr.state_enabled};

    /* renamed from: b1, reason: collision with root package name */
    private static final ShapeDrawable f31696b1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    private final Paint.FontMetrics f31697A0;

    /* renamed from: B0, reason: collision with root package name */
    private final RectF f31698B0;

    /* renamed from: C0, reason: collision with root package name */
    private final PointF f31699C0;

    /* renamed from: D0, reason: collision with root package name */
    private final Path f31700D0;

    /* renamed from: E0, reason: collision with root package name */
    private final j f31701E0;

    /* renamed from: F0, reason: collision with root package name */
    private int f31702F0;

    /* renamed from: G0, reason: collision with root package name */
    private int f31703G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f31704H0;

    /* renamed from: I0, reason: collision with root package name */
    private int f31705I0;

    /* renamed from: J0, reason: collision with root package name */
    private int f31706J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f31707K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f31708L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f31709M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f31710N0;

    /* renamed from: O0, reason: collision with root package name */
    private ColorFilter f31711O0;

    /* renamed from: P0, reason: collision with root package name */
    private PorterDuffColorFilter f31712P0;

    /* renamed from: Q, reason: collision with root package name */
    private ColorStateList f31713Q;

    /* renamed from: Q0, reason: collision with root package name */
    private ColorStateList f31714Q0;

    /* renamed from: R, reason: collision with root package name */
    private ColorStateList f31715R;

    /* renamed from: R0, reason: collision with root package name */
    private PorterDuff.Mode f31716R0;

    /* renamed from: S, reason: collision with root package name */
    private float f31717S;

    /* renamed from: S0, reason: collision with root package name */
    private int[] f31718S0;

    /* renamed from: T, reason: collision with root package name */
    private float f31719T;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f31720T0;

    /* renamed from: U, reason: collision with root package name */
    private ColorStateList f31721U;

    /* renamed from: U0, reason: collision with root package name */
    private ColorStateList f31722U0;

    /* renamed from: V, reason: collision with root package name */
    private float f31723V;

    /* renamed from: V0, reason: collision with root package name */
    private WeakReference f31724V0;

    /* renamed from: W, reason: collision with root package name */
    private ColorStateList f31725W;

    /* renamed from: W0, reason: collision with root package name */
    private TextUtils.TruncateAt f31726W0;

    /* renamed from: X, reason: collision with root package name */
    private CharSequence f31727X;

    /* renamed from: X0, reason: collision with root package name */
    private boolean f31728X0;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f31729Y;

    /* renamed from: Y0, reason: collision with root package name */
    private int f31730Y0;

    /* renamed from: Z, reason: collision with root package name */
    private Drawable f31731Z;

    /* renamed from: Z0, reason: collision with root package name */
    private boolean f31732Z0;

    /* renamed from: a0, reason: collision with root package name */
    private ColorStateList f31733a0;

    /* renamed from: b0, reason: collision with root package name */
    private float f31734b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f31735c0;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f31736d0;

    /* renamed from: e0, reason: collision with root package name */
    private Drawable f31737e0;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f31738f0;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f31739g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f31740h0;

    /* renamed from: i0, reason: collision with root package name */
    private CharSequence f31741i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f31742j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f31743k0;

    /* renamed from: l0, reason: collision with root package name */
    private Drawable f31744l0;

    /* renamed from: m0, reason: collision with root package name */
    private ColorStateList f31745m0;

    /* renamed from: n0, reason: collision with root package name */
    private f f31746n0;

    /* renamed from: o0, reason: collision with root package name */
    private f f31747o0;

    /* renamed from: p0, reason: collision with root package name */
    private float f31748p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f31749q0;

    /* renamed from: r0, reason: collision with root package name */
    private float f31750r0;

    /* renamed from: s0, reason: collision with root package name */
    private float f31751s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f31752t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f31753u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f31754v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f31755w0;

    /* renamed from: x0, reason: collision with root package name */
    private final Context f31756x0;

    /* renamed from: y0, reason: collision with root package name */
    private final Paint f31757y0;

    /* renamed from: z0, reason: collision with root package name */
    private final Paint f31758z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0232a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f31719T = -1.0f;
        this.f31757y0 = new Paint(1);
        this.f31697A0 = new Paint.FontMetrics();
        this.f31698B0 = new RectF();
        this.f31699C0 = new PointF();
        this.f31700D0 = new Path();
        this.f31710N0 = 255;
        this.f31716R0 = PorterDuff.Mode.SRC_IN;
        this.f31724V0 = new WeakReference(null);
        J(context);
        this.f31756x0 = context;
        j jVar = new j(this);
        this.f31701E0 = jVar;
        this.f31727X = "";
        jVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f31758z0 = null;
        int[] iArr = f31695a1;
        setState(iArr);
        g2(iArr);
        this.f31728X0 = true;
        if (b.f5184a) {
            f31696b1.setTint(-1);
        }
    }

    private boolean I2() {
        return this.f31743k0 && this.f31744l0 != null && this.f31708L0;
    }

    private boolean J2() {
        return this.f31729Y && this.f31731Z != null;
    }

    private boolean K2() {
        return this.f31736d0 && this.f31737e0 != null;
    }

    private void L2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void M2() {
        this.f31722U0 = this.f31720T0 ? b.d(this.f31725W) : null;
    }

    private void N2() {
        this.f31738f0 = new RippleDrawable(b.d(a1()), this.f31737e0, f31696b1);
    }

    private float U0() {
        Drawable drawable = this.f31708L0 ? this.f31744l0 : this.f31731Z;
        float f8 = this.f31734b0;
        if (f8 <= 0.0f && drawable != null) {
            f8 = (float) Math.ceil(o.c(this.f31756x0, 24));
            if (drawable.getIntrinsicHeight() <= f8) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f8;
    }

    private float V0() {
        Drawable drawable = this.f31708L0 ? this.f31744l0 : this.f31731Z;
        float f8 = this.f31734b0;
        return (f8 > 0.0f || drawable == null) ? f8 : drawable.getIntrinsicWidth();
    }

    private void W1(ColorStateList colorStateList) {
        if (this.f31713Q != colorStateList) {
            this.f31713Q = colorStateList;
            onStateChange(getState());
        }
    }

    private void f0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC6641a.m(drawable, AbstractC6641a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f31737e0) {
            if (drawable.isStateful()) {
                drawable.setState(R0());
            }
            AbstractC6641a.o(drawable, this.f31739g0);
            return;
        }
        Drawable drawable2 = this.f31731Z;
        if (drawable == drawable2 && this.f31735c0) {
            AbstractC6641a.o(drawable2, this.f31733a0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2() || I2()) {
            float f8 = this.f31748p0 + this.f31749q0;
            float V02 = V0();
            if (AbstractC6641a.f(this) == 0) {
                float f9 = rect.left + f8;
                rectF.left = f9;
                rectF.right = f9 + V02;
            } else {
                float f10 = rect.right - f8;
                rectF.right = f10;
                rectF.left = f10 - V02;
            }
            float U02 = U0();
            float exactCenterY = rect.exactCenterY() - (U02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + U02;
        }
    }

    private ColorFilter g1() {
        ColorFilter colorFilter = this.f31711O0;
        return colorFilter != null ? colorFilter : this.f31712P0;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (K2()) {
            float f8 = this.f31755w0 + this.f31754v0 + this.f31740h0 + this.f31753u0 + this.f31752t0;
            if (AbstractC6641a.f(this) == 0) {
                rectF.right = rect.right - f8;
            } else {
                rectF.left = rect.left + f8;
            }
        }
    }

    private static boolean i1(int[] iArr, int i8) {
        if (iArr == null) {
            return false;
        }
        for (int i9 : iArr) {
            if (i9 == i8) {
                return true;
            }
        }
        return false;
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f8 = this.f31755w0 + this.f31754v0;
            if (AbstractC6641a.f(this) == 0) {
                float f9 = rect.right - f8;
                rectF.right = f9;
                rectF.left = f9 - this.f31740h0;
            } else {
                float f10 = rect.left + f8;
                rectF.left = f10;
                rectF.right = f10 + this.f31740h0;
            }
            float exactCenterY = rect.exactCenterY();
            float f11 = this.f31740h0;
            float f12 = exactCenterY - (f11 / 2.0f);
            rectF.top = f12;
            rectF.bottom = f12 + f11;
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2()) {
            float f8 = this.f31755w0 + this.f31754v0 + this.f31740h0 + this.f31753u0 + this.f31752t0;
            if (AbstractC6641a.f(this) == 0) {
                float f9 = rect.right;
                rectF.right = f9;
                rectF.left = f9 - f8;
            } else {
                int i8 = rect.left;
                rectF.left = i8;
                rectF.right = i8 + f8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f31727X != null) {
            float h02 = this.f31748p0 + h0() + this.f31751s0;
            float l02 = this.f31755w0 + l0() + this.f31752t0;
            if (AbstractC6641a.f(this) == 0) {
                rectF.left = rect.left + h02;
                rectF.right = rect.right - l02;
            } else {
                rectF.left = rect.left + l02;
                rectF.right = rect.right - h02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean m1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float n0() {
        this.f31701E0.g().getFontMetrics(this.f31697A0);
        Paint.FontMetrics fontMetrics = this.f31697A0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean n1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean o1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean p0() {
        return this.f31743k0 && this.f31744l0 != null && this.f31742j0;
    }

    private void p1(AttributeSet attributeSet, int i8, int i9) {
        TypedArray i10 = l.i(this.f31756x0, attributeSet, D3.l.f1650C0, i8, i9, new int[0]);
        this.f31732Z0 = i10.hasValue(D3.l.f1960n1);
        W1(c.a(this.f31756x0, i10, D3.l.f1843a1));
        A1(c.a(this.f31756x0, i10, D3.l.f1738N0));
        O1(i10.getDimension(D3.l.f1802V0, 0.0f));
        if (i10.hasValue(D3.l.f1746O0)) {
            C1(i10.getDimension(D3.l.f1746O0, 0.0f));
        }
        S1(c.a(this.f31756x0, i10, D3.l.f1826Y0));
        U1(i10.getDimension(D3.l.f1834Z0, 0.0f));
        t2(c.a(this.f31756x0, i10, D3.l.f1951m1));
        y2(i10.getText(D3.l.f1690H0));
        d g8 = c.g(this.f31756x0, i10, D3.l.f1658D0);
        g8.l(i10.getDimension(D3.l.f1666E0, g8.j()));
        z2(g8);
        int i11 = i10.getInt(D3.l.f1674F0, 0);
        if (i11 == 1) {
            l2(TextUtils.TruncateAt.START);
        } else if (i11 == 2) {
            l2(TextUtils.TruncateAt.MIDDLE);
        } else if (i11 == 3) {
            l2(TextUtils.TruncateAt.END);
        }
        N1(i10.getBoolean(D3.l.f1794U0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            N1(i10.getBoolean(D3.l.f1770R0, false));
        }
        G1(c.d(this.f31756x0, i10, D3.l.f1762Q0));
        if (i10.hasValue(D3.l.f1786T0)) {
            K1(c.a(this.f31756x0, i10, D3.l.f1786T0));
        }
        I1(i10.getDimension(D3.l.f1778S0, -1.0f));
        j2(i10.getBoolean(D3.l.f1906h1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            j2(i10.getBoolean(D3.l.f1861c1, false));
        }
        X1(c.d(this.f31756x0, i10, D3.l.f1852b1));
        h2(c.a(this.f31756x0, i10, D3.l.f1897g1));
        c2(i10.getDimension(D3.l.f1879e1, 0.0f));
        s1(i10.getBoolean(D3.l.f1698I0, false));
        z1(i10.getBoolean(D3.l.f1730M0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            z1(i10.getBoolean(D3.l.f1714K0, false));
        }
        u1(c.d(this.f31756x0, i10, D3.l.f1706J0));
        if (i10.hasValue(D3.l.f1722L0)) {
            w1(c.a(this.f31756x0, i10, D3.l.f1722L0));
        }
        w2(f.b(this.f31756x0, i10, D3.l.f1969o1));
        m2(f.b(this.f31756x0, i10, D3.l.f1924j1));
        Q1(i10.getDimension(D3.l.f1818X0, 0.0f));
        q2(i10.getDimension(D3.l.f1942l1, 0.0f));
        o2(i10.getDimension(D3.l.f1933k1, 0.0f));
        E2(i10.getDimension(D3.l.f1987q1, 0.0f));
        B2(i10.getDimension(D3.l.f1978p1, 0.0f));
        e2(i10.getDimension(D3.l.f1888f1, 0.0f));
        Z1(i10.getDimension(D3.l.f1870d1, 0.0f));
        E1(i10.getDimension(D3.l.f1754P0, 0.0f));
        s2(i10.getDimensionPixelSize(D3.l.f1682G0, Integer.MAX_VALUE));
        i10.recycle();
    }

    public static a q0(Context context, AttributeSet attributeSet, int i8, int i9) {
        a aVar = new a(context, attributeSet, i8, i9);
        aVar.p1(attributeSet, i8, i9);
        return aVar;
    }

    private void r0(Canvas canvas, Rect rect) {
        if (I2()) {
            g0(rect, this.f31698B0);
            RectF rectF = this.f31698B0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f31744l0.setBounds(0, 0, (int) this.f31698B0.width(), (int) this.f31698B0.height());
            this.f31744l0.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private boolean r1(int[] iArr, int[] iArr2) {
        boolean z7;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f31713Q;
        int l8 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f31702F0) : 0);
        boolean z8 = true;
        if (this.f31702F0 != l8) {
            this.f31702F0 = l8;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f31715R;
        int l9 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f31703G0) : 0);
        if (this.f31703G0 != l9) {
            this.f31703G0 = l9;
            onStateChange = true;
        }
        int i8 = L3.a.i(l8, l9);
        if ((this.f31704H0 != i8) | (v() == null)) {
            this.f31704H0 = i8;
            U(ColorStateList.valueOf(i8));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f31721U;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f31705I0) : 0;
        if (this.f31705I0 != colorForState) {
            this.f31705I0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f31722U0 == null || !b.e(iArr)) ? 0 : this.f31722U0.getColorForState(iArr, this.f31706J0);
        if (this.f31706J0 != colorForState2) {
            this.f31706J0 = colorForState2;
            if (this.f31720T0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f31701E0.e() == null || this.f31701E0.e().i() == null) ? 0 : this.f31701E0.e().i().getColorForState(iArr, this.f31707K0);
        if (this.f31707K0 != colorForState3) {
            this.f31707K0 = colorForState3;
            onStateChange = true;
        }
        boolean z9 = i1(getState(), R.attr.state_checked) && this.f31742j0;
        if (this.f31708L0 == z9 || this.f31744l0 == null) {
            z7 = false;
        } else {
            float h02 = h0();
            this.f31708L0 = z9;
            if (h02 != h0()) {
                onStateChange = true;
                z7 = true;
            } else {
                z7 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f31714Q0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f31709M0) : 0;
        if (this.f31709M0 != colorForState4) {
            this.f31709M0 = colorForState4;
            this.f31712P0 = com.google.android.material.drawable.d.l(this, this.f31714Q0, this.f31716R0);
        } else {
            z8 = onStateChange;
        }
        if (o1(this.f31731Z)) {
            z8 |= this.f31731Z.setState(iArr);
        }
        if (o1(this.f31744l0)) {
            z8 |= this.f31744l0.setState(iArr);
        }
        if (o1(this.f31737e0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z8 |= this.f31737e0.setState(iArr3);
        }
        if (b.f5184a && o1(this.f31738f0)) {
            z8 |= this.f31738f0.setState(iArr2);
        }
        if (z8) {
            invalidateSelf();
        }
        if (z7) {
            q1();
        }
        return z8;
    }

    private void s0(Canvas canvas, Rect rect) {
        if (this.f31732Z0) {
            return;
        }
        this.f31757y0.setColor(this.f31703G0);
        this.f31757y0.setStyle(Paint.Style.FILL);
        this.f31757y0.setColorFilter(g1());
        this.f31698B0.set(rect);
        canvas.drawRoundRect(this.f31698B0, D0(), D0(), this.f31757y0);
    }

    private void t0(Canvas canvas, Rect rect) {
        if (J2()) {
            g0(rect, this.f31698B0);
            RectF rectF = this.f31698B0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f31731Z.setBounds(0, 0, (int) this.f31698B0.width(), (int) this.f31698B0.height());
            this.f31731Z.draw(canvas);
            canvas.translate(-f8, -f9);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (this.f31723V <= 0.0f || this.f31732Z0) {
            return;
        }
        this.f31757y0.setColor(this.f31705I0);
        this.f31757y0.setStyle(Paint.Style.STROKE);
        if (!this.f31732Z0) {
            this.f31757y0.setColorFilter(g1());
        }
        RectF rectF = this.f31698B0;
        float f8 = rect.left;
        float f9 = this.f31723V;
        rectF.set(f8 + (f9 / 2.0f), rect.top + (f9 / 2.0f), rect.right - (f9 / 2.0f), rect.bottom - (f9 / 2.0f));
        float f10 = this.f31719T - (this.f31723V / 2.0f);
        canvas.drawRoundRect(this.f31698B0, f10, f10, this.f31757y0);
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.f31732Z0) {
            return;
        }
        this.f31757y0.setColor(this.f31702F0);
        this.f31757y0.setStyle(Paint.Style.FILL);
        this.f31698B0.set(rect);
        canvas.drawRoundRect(this.f31698B0, D0(), D0(), this.f31757y0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (K2()) {
            j0(rect, this.f31698B0);
            RectF rectF = this.f31698B0;
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas.translate(f8, f9);
            this.f31737e0.setBounds(0, 0, (int) this.f31698B0.width(), (int) this.f31698B0.height());
            if (b.f5184a) {
                this.f31738f0.setBounds(this.f31737e0.getBounds());
                this.f31738f0.jumpToCurrentState();
                this.f31738f0.draw(canvas);
            } else {
                this.f31737e0.draw(canvas);
            }
            canvas.translate(-f8, -f9);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        this.f31757y0.setColor(this.f31706J0);
        this.f31757y0.setStyle(Paint.Style.FILL);
        this.f31698B0.set(rect);
        if (!this.f31732Z0) {
            canvas.drawRoundRect(this.f31698B0, D0(), D0(), this.f31757y0);
        } else {
            h(new RectF(rect), this.f31700D0);
            super.q(canvas, this.f31757y0, this.f31700D0, s());
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        Paint paint = this.f31758z0;
        if (paint != null) {
            paint.setColor(AbstractC6410a.k(-16777216, ModuleDescriptor.MODULE_VERSION));
            canvas.drawRect(rect, this.f31758z0);
            if (J2() || I2()) {
                g0(rect, this.f31698B0);
                canvas.drawRect(this.f31698B0, this.f31758z0);
            }
            if (this.f31727X != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f31758z0);
            }
            if (K2()) {
                j0(rect, this.f31698B0);
                canvas.drawRect(this.f31698B0, this.f31758z0);
            }
            this.f31758z0.setColor(AbstractC6410a.k(-65536, ModuleDescriptor.MODULE_VERSION));
            i0(rect, this.f31698B0);
            canvas.drawRect(this.f31698B0, this.f31758z0);
            this.f31758z0.setColor(AbstractC6410a.k(-16711936, ModuleDescriptor.MODULE_VERSION));
            k0(rect, this.f31698B0);
            canvas.drawRect(this.f31698B0, this.f31758z0);
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.f31727X != null) {
            Paint.Align o02 = o0(rect, this.f31699C0);
            m0(rect, this.f31698B0);
            if (this.f31701E0.e() != null) {
                this.f31701E0.g().drawableState = getState();
                this.f31701E0.n(this.f31756x0);
            }
            this.f31701E0.g().setTextAlign(o02);
            int i8 = 0;
            boolean z7 = Math.round(this.f31701E0.h(c1().toString())) > Math.round(this.f31698B0.width());
            if (z7) {
                i8 = canvas.save();
                canvas.clipRect(this.f31698B0);
            }
            CharSequence charSequence = this.f31727X;
            if (z7 && this.f31726W0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f31701E0.g(), this.f31698B0.width(), this.f31726W0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f31699C0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f31701E0.g());
            if (z7) {
                canvas.restoreToCount(i8);
            }
        }
    }

    public Drawable A0() {
        return this.f31744l0;
    }

    public void A1(ColorStateList colorStateList) {
        if (this.f31715R != colorStateList) {
            this.f31715R = colorStateList;
            onStateChange(getState());
        }
    }

    public void A2(int i8) {
        z2(new d(this.f31756x0, i8));
    }

    public ColorStateList B0() {
        return this.f31745m0;
    }

    public void B1(int i8) {
        A1(AbstractC5794a.a(this.f31756x0, i8));
    }

    public void B2(float f8) {
        if (this.f31752t0 != f8) {
            this.f31752t0 = f8;
            invalidateSelf();
            q1();
        }
    }

    public ColorStateList C0() {
        return this.f31715R;
    }

    public void C1(float f8) {
        if (this.f31719T != f8) {
            this.f31719T = f8;
            setShapeAppearanceModel(A().w(f8));
        }
    }

    public void C2(int i8) {
        B2(this.f31756x0.getResources().getDimension(i8));
    }

    public float D0() {
        return this.f31732Z0 ? C() : this.f31719T;
    }

    public void D1(int i8) {
        C1(this.f31756x0.getResources().getDimension(i8));
    }

    public void D2(float f8) {
        d d12 = d1();
        if (d12 != null) {
            d12.l(f8);
            this.f31701E0.g().setTextSize(f8);
            a();
        }
    }

    public float E0() {
        return this.f31755w0;
    }

    public void E1(float f8) {
        if (this.f31755w0 != f8) {
            this.f31755w0 = f8;
            invalidateSelf();
            q1();
        }
    }

    public void E2(float f8) {
        if (this.f31751s0 != f8) {
            this.f31751s0 = f8;
            invalidateSelf();
            q1();
        }
    }

    public Drawable F0() {
        Drawable drawable = this.f31731Z;
        if (drawable != null) {
            return AbstractC6641a.q(drawable);
        }
        return null;
    }

    public void F1(int i8) {
        E1(this.f31756x0.getResources().getDimension(i8));
    }

    public void F2(int i8) {
        E2(this.f31756x0.getResources().getDimension(i8));
    }

    public float G0() {
        return this.f31734b0;
    }

    public void G1(Drawable drawable) {
        Drawable F02 = F0();
        if (F02 != drawable) {
            float h02 = h0();
            this.f31731Z = drawable != null ? AbstractC6641a.r(drawable).mutate() : null;
            float h03 = h0();
            L2(F02);
            if (J2()) {
                f0(this.f31731Z);
            }
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void G2(boolean z7) {
        if (this.f31720T0 != z7) {
            this.f31720T0 = z7;
            M2();
            onStateChange(getState());
        }
    }

    public ColorStateList H0() {
        return this.f31733a0;
    }

    public void H1(int i8) {
        G1(AbstractC5794a.b(this.f31756x0, i8));
    }

    boolean H2() {
        return this.f31728X0;
    }

    public float I0() {
        return this.f31717S;
    }

    public void I1(float f8) {
        if (this.f31734b0 != f8) {
            float h02 = h0();
            this.f31734b0 = f8;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public float J0() {
        return this.f31748p0;
    }

    public void J1(int i8) {
        I1(this.f31756x0.getResources().getDimension(i8));
    }

    public ColorStateList K0() {
        return this.f31721U;
    }

    public void K1(ColorStateList colorStateList) {
        this.f31735c0 = true;
        if (this.f31733a0 != colorStateList) {
            this.f31733a0 = colorStateList;
            if (J2()) {
                AbstractC6641a.o(this.f31731Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float L0() {
        return this.f31723V;
    }

    public void L1(int i8) {
        K1(AbstractC5794a.a(this.f31756x0, i8));
    }

    public Drawable M0() {
        Drawable drawable = this.f31737e0;
        if (drawable != null) {
            return AbstractC6641a.q(drawable);
        }
        return null;
    }

    public void M1(int i8) {
        N1(this.f31756x0.getResources().getBoolean(i8));
    }

    public CharSequence N0() {
        return this.f31741i0;
    }

    public void N1(boolean z7) {
        if (this.f31729Y != z7) {
            boolean J22 = J2();
            this.f31729Y = z7;
            boolean J23 = J2();
            if (J22 != J23) {
                if (J23) {
                    f0(this.f31731Z);
                } else {
                    L2(this.f31731Z);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public float O0() {
        return this.f31754v0;
    }

    public void O1(float f8) {
        if (this.f31717S != f8) {
            this.f31717S = f8;
            invalidateSelf();
            q1();
        }
    }

    public float P0() {
        return this.f31740h0;
    }

    public void P1(int i8) {
        O1(this.f31756x0.getResources().getDimension(i8));
    }

    public float Q0() {
        return this.f31753u0;
    }

    public void Q1(float f8) {
        if (this.f31748p0 != f8) {
            this.f31748p0 = f8;
            invalidateSelf();
            q1();
        }
    }

    public int[] R0() {
        return this.f31718S0;
    }

    public void R1(int i8) {
        Q1(this.f31756x0.getResources().getDimension(i8));
    }

    public ColorStateList S0() {
        return this.f31739g0;
    }

    public void S1(ColorStateList colorStateList) {
        if (this.f31721U != colorStateList) {
            this.f31721U = colorStateList;
            if (this.f31732Z0) {
                a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void T0(RectF rectF) {
        k0(getBounds(), rectF);
    }

    public void T1(int i8) {
        S1(AbstractC5794a.a(this.f31756x0, i8));
    }

    public void U1(float f8) {
        if (this.f31723V != f8) {
            this.f31723V = f8;
            this.f31757y0.setStrokeWidth(f8);
            if (this.f31732Z0) {
                super.b0(f8);
            }
            invalidateSelf();
        }
    }

    public void V1(int i8) {
        U1(this.f31756x0.getResources().getDimension(i8));
    }

    public TextUtils.TruncateAt W0() {
        return this.f31726W0;
    }

    public f X0() {
        return this.f31747o0;
    }

    public void X1(Drawable drawable) {
        Drawable M02 = M0();
        if (M02 != drawable) {
            float l02 = l0();
            this.f31737e0 = drawable != null ? AbstractC6641a.r(drawable).mutate() : null;
            if (b.f5184a) {
                N2();
            }
            float l03 = l0();
            L2(M02);
            if (K2()) {
                f0(this.f31737e0);
            }
            invalidateSelf();
            if (l02 != l03) {
                q1();
            }
        }
    }

    public float Y0() {
        return this.f31750r0;
    }

    public void Y1(CharSequence charSequence) {
        if (this.f31741i0 != charSequence) {
            this.f31741i0 = C6897a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Z0() {
        return this.f31749q0;
    }

    public void Z1(float f8) {
        if (this.f31754v0 != f8) {
            this.f31754v0 = f8;
            invalidateSelf();
            if (K2()) {
                q1();
            }
        }
    }

    @Override // com.google.android.material.internal.j.b
    public void a() {
        q1();
        invalidateSelf();
    }

    public ColorStateList a1() {
        return this.f31725W;
    }

    public void a2(int i8) {
        Z1(this.f31756x0.getResources().getDimension(i8));
    }

    public f b1() {
        return this.f31746n0;
    }

    public void b2(int i8) {
        X1(AbstractC5794a.b(this.f31756x0, i8));
    }

    public CharSequence c1() {
        return this.f31727X;
    }

    public void c2(float f8) {
        if (this.f31740h0 != f8) {
            this.f31740h0 = f8;
            invalidateSelf();
            if (K2()) {
                q1();
            }
        }
    }

    public d d1() {
        return this.f31701E0.e();
    }

    public void d2(int i8) {
        c2(this.f31756x0.getResources().getDimension(i8));
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i8 = this.f31710N0;
        int a8 = i8 < 255 ? H3.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i8) : 0;
        v0(canvas, bounds);
        s0(canvas, bounds);
        if (this.f31732Z0) {
            super.draw(canvas);
        }
        u0(canvas, bounds);
        x0(canvas, bounds);
        t0(canvas, bounds);
        r0(canvas, bounds);
        if (this.f31728X0) {
            z0(canvas, bounds);
        }
        w0(canvas, bounds);
        y0(canvas, bounds);
        if (this.f31710N0 < 255) {
            canvas.restoreToCount(a8);
        }
    }

    public float e1() {
        return this.f31752t0;
    }

    public void e2(float f8) {
        if (this.f31753u0 != f8) {
            this.f31753u0 = f8;
            invalidateSelf();
            if (K2()) {
                q1();
            }
        }
    }

    public float f1() {
        return this.f31751s0;
    }

    public void f2(int i8) {
        e2(this.f31756x0.getResources().getDimension(i8));
    }

    public boolean g2(int[] iArr) {
        if (Arrays.equals(this.f31718S0, iArr)) {
            return false;
        }
        this.f31718S0 = iArr;
        if (K2()) {
            return r1(getState(), iArr);
        }
        return false;
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31710N0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f31711O0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f31717S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f31748p0 + h0() + this.f31751s0 + this.f31701E0.h(c1().toString()) + this.f31752t0 + l0() + this.f31755w0), this.f31730Y0);
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f31732Z0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f31719T);
        } else {
            outline.setRoundRect(bounds, this.f31719T);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    float h0() {
        if (J2() || I2()) {
            return this.f31749q0 + V0() + this.f31750r0;
        }
        return 0.0f;
    }

    public boolean h1() {
        return this.f31720T0;
    }

    public void h2(ColorStateList colorStateList) {
        if (this.f31739g0 != colorStateList) {
            this.f31739g0 = colorStateList;
            if (K2()) {
                AbstractC6641a.o(this.f31737e0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i2(int i8) {
        h2(AbstractC5794a.a(this.f31756x0, i8));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return n1(this.f31713Q) || n1(this.f31715R) || n1(this.f31721U) || (this.f31720T0 && n1(this.f31722U0)) || m1(this.f31701E0.e()) || p0() || o1(this.f31731Z) || o1(this.f31744l0) || n1(this.f31714Q0);
    }

    public boolean j1() {
        return this.f31742j0;
    }

    public void j2(boolean z7) {
        if (this.f31736d0 != z7) {
            boolean K22 = K2();
            this.f31736d0 = z7;
            boolean K23 = K2();
            if (K22 != K23) {
                if (K23) {
                    f0(this.f31737e0);
                } else {
                    L2(this.f31737e0);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public boolean k1() {
        return o1(this.f31737e0);
    }

    public void k2(InterfaceC0232a interfaceC0232a) {
        this.f31724V0 = new WeakReference(interfaceC0232a);
    }

    float l0() {
        if (K2()) {
            return this.f31753u0 + this.f31740h0 + this.f31754v0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.f31736d0;
    }

    public void l2(TextUtils.TruncateAt truncateAt) {
        this.f31726W0 = truncateAt;
    }

    public void m2(f fVar) {
        this.f31747o0 = fVar;
    }

    public void n2(int i8) {
        m2(f.c(this.f31756x0, i8));
    }

    Paint.Align o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f31727X != null) {
            float h02 = this.f31748p0 + h0() + this.f31751s0;
            if (AbstractC6641a.f(this) == 0) {
                pointF.x = rect.left + h02;
            } else {
                pointF.x = rect.right - h02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - n0();
        }
        return align;
    }

    public void o2(float f8) {
        if (this.f31750r0 != f8) {
            float h02 = h0();
            this.f31750r0 = f8;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i8);
        if (J2()) {
            onLayoutDirectionChanged |= AbstractC6641a.m(this.f31731Z, i8);
        }
        if (I2()) {
            onLayoutDirectionChanged |= AbstractC6641a.m(this.f31744l0, i8);
        }
        if (K2()) {
            onLayoutDirectionChanged |= AbstractC6641a.m(this.f31737e0, i8);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        boolean onLevelChange = super.onLevelChange(i8);
        if (J2()) {
            onLevelChange |= this.f31731Z.setLevel(i8);
        }
        if (I2()) {
            onLevelChange |= this.f31744l0.setLevel(i8);
        }
        if (K2()) {
            onLevelChange |= this.f31737e0.setLevel(i8);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f31732Z0) {
            super.onStateChange(iArr);
        }
        return r1(iArr, R0());
    }

    public void p2(int i8) {
        o2(this.f31756x0.getResources().getDimension(i8));
    }

    protected void q1() {
        InterfaceC0232a interfaceC0232a = (InterfaceC0232a) this.f31724V0.get();
        if (interfaceC0232a != null) {
            interfaceC0232a.a();
        }
    }

    public void q2(float f8) {
        if (this.f31749q0 != f8) {
            float h02 = h0();
            this.f31749q0 = f8;
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void r2(int i8) {
        q2(this.f31756x0.getResources().getDimension(i8));
    }

    public void s1(boolean z7) {
        if (this.f31742j0 != z7) {
            this.f31742j0 = z7;
            float h02 = h0();
            if (!z7 && this.f31708L0) {
                this.f31708L0 = false;
            }
            float h03 = h0();
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void s2(int i8) {
        this.f31730Y0 = i8;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j8);
        }
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.f31710N0 != i8) {
            this.f31710N0 = i8;
            invalidateSelf();
        }
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f31711O0 != colorFilter) {
            this.f31711O0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f31714Q0 != colorStateList) {
            this.f31714Q0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // V3.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f31716R0 != mode) {
            this.f31716R0 = mode;
            this.f31712P0 = com.google.android.material.drawable.d.l(this, this.f31714Q0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        if (J2()) {
            visible |= this.f31731Z.setVisible(z7, z8);
        }
        if (I2()) {
            visible |= this.f31744l0.setVisible(z7, z8);
        }
        if (K2()) {
            visible |= this.f31737e0.setVisible(z7, z8);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(int i8) {
        s1(this.f31756x0.getResources().getBoolean(i8));
    }

    public void t2(ColorStateList colorStateList) {
        if (this.f31725W != colorStateList) {
            this.f31725W = colorStateList;
            M2();
            onStateChange(getState());
        }
    }

    public void u1(Drawable drawable) {
        if (this.f31744l0 != drawable) {
            float h02 = h0();
            this.f31744l0 = drawable;
            float h03 = h0();
            L2(this.f31744l0);
            f0(this.f31744l0);
            invalidateSelf();
            if (h02 != h03) {
                q1();
            }
        }
    }

    public void u2(int i8) {
        t2(AbstractC5794a.a(this.f31756x0, i8));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(int i8) {
        u1(AbstractC5794a.b(this.f31756x0, i8));
    }

    void v2(boolean z7) {
        this.f31728X0 = z7;
    }

    public void w1(ColorStateList colorStateList) {
        if (this.f31745m0 != colorStateList) {
            this.f31745m0 = colorStateList;
            if (p0()) {
                AbstractC6641a.o(this.f31744l0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void w2(f fVar) {
        this.f31746n0 = fVar;
    }

    public void x1(int i8) {
        w1(AbstractC5794a.a(this.f31756x0, i8));
    }

    public void x2(int i8) {
        w2(f.c(this.f31756x0, i8));
    }

    public void y1(int i8) {
        z1(this.f31756x0.getResources().getBoolean(i8));
    }

    public void y2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f31727X, charSequence)) {
            return;
        }
        this.f31727X = charSequence;
        this.f31701E0.m(true);
        invalidateSelf();
        q1();
    }

    public void z1(boolean z7) {
        if (this.f31743k0 != z7) {
            boolean I22 = I2();
            this.f31743k0 = z7;
            boolean I23 = I2();
            if (I22 != I23) {
                if (I23) {
                    f0(this.f31744l0);
                } else {
                    L2(this.f31744l0);
                }
                invalidateSelf();
                q1();
            }
        }
    }

    public void z2(d dVar) {
        this.f31701E0.k(dVar, this.f31756x0);
    }
}
