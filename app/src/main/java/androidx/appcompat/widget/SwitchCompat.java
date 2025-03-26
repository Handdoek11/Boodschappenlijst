package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import f.AbstractC5752a;
import f.AbstractC5759h;
import g.AbstractC5794a;
import j.C6048a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: m0, reason: collision with root package name */
    private static final Property f7558m0 = new a(Float.class, "thumbPos");

    /* renamed from: n0, reason: collision with root package name */
    private static final int[] f7559n0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private boolean f7560A;

    /* renamed from: B, reason: collision with root package name */
    private int f7561B;

    /* renamed from: C, reason: collision with root package name */
    private int f7562C;

    /* renamed from: D, reason: collision with root package name */
    private int f7563D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7564E;

    /* renamed from: F, reason: collision with root package name */
    private CharSequence f7565F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f7566G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f7567H;

    /* renamed from: I, reason: collision with root package name */
    private CharSequence f7568I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f7569J;

    /* renamed from: K, reason: collision with root package name */
    private int f7570K;

    /* renamed from: L, reason: collision with root package name */
    private int f7571L;

    /* renamed from: M, reason: collision with root package name */
    private float f7572M;

    /* renamed from: N, reason: collision with root package name */
    private float f7573N;

    /* renamed from: O, reason: collision with root package name */
    private VelocityTracker f7574O;

    /* renamed from: P, reason: collision with root package name */
    private int f7575P;

    /* renamed from: Q, reason: collision with root package name */
    float f7576Q;

    /* renamed from: R, reason: collision with root package name */
    private int f7577R;

    /* renamed from: S, reason: collision with root package name */
    private int f7578S;

    /* renamed from: T, reason: collision with root package name */
    private int f7579T;

    /* renamed from: U, reason: collision with root package name */
    private int f7580U;

    /* renamed from: V, reason: collision with root package name */
    private int f7581V;

    /* renamed from: W, reason: collision with root package name */
    private int f7582W;

    /* renamed from: a0, reason: collision with root package name */
    private int f7583a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f7584b0;

    /* renamed from: c0, reason: collision with root package name */
    private final TextPaint f7585c0;

    /* renamed from: d0, reason: collision with root package name */
    private ColorStateList f7586d0;

    /* renamed from: e0, reason: collision with root package name */
    private Layout f7587e0;

    /* renamed from: f0, reason: collision with root package name */
    private Layout f7588f0;

    /* renamed from: g0, reason: collision with root package name */
    private TransformationMethod f7589g0;

    /* renamed from: h0, reason: collision with root package name */
    ObjectAnimator f7590h0;

    /* renamed from: i0, reason: collision with root package name */
    private final C f7591i0;

    /* renamed from: j0, reason: collision with root package name */
    private C0854n f7592j0;

    /* renamed from: k0, reason: collision with root package name */
    private b f7593k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Rect f7594l0;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f7595o;

    /* renamed from: s, reason: collision with root package name */
    private ColorStateList f7596s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f7597t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7598u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7599v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable f7600w;

    /* renamed from: x, reason: collision with root package name */
    private ColorStateList f7601x;

    /* renamed from: y, reason: collision with root package name */
    private PorterDuff.Mode f7602y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f7603z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f7576Q);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f8) {
            switchCompat.setThumbPosition(f8.floatValue());
        }
    }

    static class b extends f.AbstractC0161f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f7604a;

        b(SwitchCompat switchCompat) {
            this.f7604a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.AbstractC0161f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f7604a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC0161f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f7604a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35370I);
    }

    private void a(boolean z7) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f7558m0, z7 ? 1.0f : 0.0f);
        this.f7590h0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f7590h0.setAutoCancel(true);
        this.f7590h0.start();
    }

    private void b() {
        Drawable drawable = this.f7595o;
        if (drawable != null) {
            if (this.f7598u || this.f7599v) {
                Drawable mutate = AbstractC6641a.r(drawable).mutate();
                this.f7595o = mutate;
                if (this.f7598u) {
                    AbstractC6641a.o(mutate, this.f7596s);
                }
                if (this.f7599v) {
                    AbstractC6641a.p(this.f7595o, this.f7597t);
                }
                if (this.f7595o.isStateful()) {
                    this.f7595o.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f7600w;
        if (drawable != null) {
            if (this.f7603z || this.f7560A) {
                Drawable mutate = AbstractC6641a.r(drawable).mutate();
                this.f7600w = mutate;
                if (this.f7603z) {
                    AbstractC6641a.o(mutate, this.f7601x);
                }
                if (this.f7560A) {
                    AbstractC6641a.p(this.f7600w, this.f7602y);
                }
                if (this.f7600w.isStateful()) {
                    this.f7600w.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f7590h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f8, float f9, float f10) {
        return f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f8 = getEmojiTextViewHelper().f(this.f7589g0);
        return f8 != null ? f8.getTransformation(charSequence, this) : charSequence;
    }

    private C0854n getEmojiTextViewHelper() {
        if (this.f7592j0 == null) {
            this.f7592j0 = new C0854n(this);
        }
        return this.f7592j0;
    }

    private boolean getTargetCheckedState() {
        return this.f7576Q > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((q0.b(this) ? 1.0f - this.f7576Q : this.f7576Q) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f7600w;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f7594l0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f7595o;
        Rect d8 = drawable2 != null ? O.d(drawable2) : O.f7446c;
        return ((((this.f7577R - this.f7579T) - rect.left) - rect.right) - d8.left) - d8.right;
    }

    private boolean h(float f8, float f9) {
        if (this.f7595o == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f7595o.getPadding(this.f7594l0);
        int i8 = this.f7581V;
        int i9 = this.f7571L;
        int i10 = i8 - i9;
        int i11 = (this.f7580U + thumbOffset) - i9;
        int i12 = this.f7579T + i11;
        Rect rect = this.f7594l0;
        return f8 > ((float) i11) && f8 < ((float) (((i12 + rect.left) + rect.right) + i9)) && f9 > ((float) i10) && f9 < ((float) (this.f7583a0 + i9));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f7585c0, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f7567H;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC5759h.f35530b);
            }
            z0.X.F0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f7565F;
            if (charSequence == null) {
                charSequence = getResources().getString(AbstractC5759h.f35531c);
            }
            z0.X.F0(this, charSequence);
        }
    }

    private void o(int i8, int i9) {
        n(i8 != 1 ? i8 != 2 ? i8 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i9);
    }

    private void p() {
        if (this.f7593k0 == null && this.f7592j0.b() && androidx.emoji2.text.f.i()) {
            androidx.emoji2.text.f c8 = androidx.emoji2.text.f.c();
            int e8 = c8.e();
            if (e8 == 3 || e8 == 0) {
                b bVar = new b(this);
                this.f7593k0 = bVar;
                c8.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f7570K = 0;
        boolean z7 = true;
        boolean z8 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z8) {
            this.f7574O.computeCurrentVelocity(1000);
            float xVelocity = this.f7574O.getXVelocity();
            if (Math.abs(xVelocity) <= this.f7575P) {
                z7 = getTargetCheckedState();
            } else if (!q0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z7 = false;
            }
        } else {
            z7 = isChecked;
        }
        if (z7 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z7);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f7567H = charSequence;
        this.f7568I = g(charSequence);
        this.f7588f0 = null;
        if (this.f7569J) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f7565F = charSequence;
        this.f7566G = g(charSequence);
        this.f7587e0 = null;
        if (this.f7569J) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i8;
        int i9;
        Rect rect = this.f7594l0;
        int i10 = this.f7580U;
        int i11 = this.f7581V;
        int i12 = this.f7582W;
        int i13 = this.f7583a0;
        int thumbOffset = getThumbOffset() + i10;
        Drawable drawable = this.f7595o;
        Rect d8 = drawable != null ? O.d(drawable) : O.f7446c;
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i14 = rect.left;
            thumbOffset += i14;
            if (d8 != null) {
                int i15 = d8.left;
                if (i15 > i14) {
                    i10 += i15 - i14;
                }
                int i16 = d8.top;
                int i17 = rect.top;
                i8 = i16 > i17 ? (i16 - i17) + i11 : i11;
                int i18 = d8.right;
                int i19 = rect.right;
                if (i18 > i19) {
                    i12 -= i18 - i19;
                }
                int i20 = d8.bottom;
                int i21 = rect.bottom;
                if (i20 > i21) {
                    i9 = i13 - (i20 - i21);
                }
                this.f7600w.setBounds(i10, i8, i12, i9);
            } else {
                i8 = i11;
            }
            i9 = i13;
            this.f7600w.setBounds(i10, i8, i12, i9);
        }
        Drawable drawable3 = this.f7595o;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i22 = thumbOffset - rect.left;
            int i23 = thumbOffset + this.f7579T + rect.right;
            this.f7595o.setBounds(i22, i11, i23, i13);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC6641a.l(background, i22, i11, i23, i13);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f7595o;
        if (drawable != null) {
            AbstractC6641a.k(drawable, f8, f9);
        }
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null) {
            AbstractC6641a.k(drawable2, f8, f9);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7595o;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!q0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f7577R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f7563D : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (q0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f7577R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f7563D : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.h.r(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f7569J;
    }

    public boolean getSplitTrack() {
        return this.f7564E;
    }

    public int getSwitchMinWidth() {
        return this.f7562C;
    }

    public int getSwitchPadding() {
        return this.f7563D;
    }

    public CharSequence getTextOff() {
        return this.f7567H;
    }

    public CharSequence getTextOn() {
        return this.f7565F;
    }

    public Drawable getThumbDrawable() {
        return this.f7595o;
    }

    protected final float getThumbPosition() {
        return this.f7576Q;
    }

    public int getThumbTextPadding() {
        return this.f7561B;
    }

    public ColorStateList getThumbTintList() {
        return this.f7596s;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f7597t;
    }

    public Drawable getTrackDrawable() {
        return this.f7600w;
    }

    public ColorStateList getTrackTintList() {
        return this.f7601x;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f7602y;
    }

    void j() {
        setTextOnInternal(this.f7565F);
        setTextOffInternal(this.f7567H);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7595o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f7590h0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f7590h0.end();
        this.f7590h0 = null;
    }

    public void m(Context context, int i8) {
        f0 t7 = f0.t(context, i8, f.j.f35640S2);
        ColorStateList c8 = t7.c(f.j.f35656W2);
        if (c8 != null) {
            this.f7586d0 = c8;
        } else {
            this.f7586d0 = getTextColors();
        }
        int f8 = t7.f(f.j.f35644T2, 0);
        if (f8 != 0) {
            float f9 = f8;
            if (f9 != this.f7585c0.getTextSize()) {
                this.f7585c0.setTextSize(f9);
                requestLayout();
            }
        }
        o(t7.k(f.j.f35648U2, -1), t7.k(f.j.f35652V2, -1));
        if (t7.a(f.j.f35678b3, false)) {
            this.f7589g0 = new C6048a(getContext());
        } else {
            this.f7589g0 = null;
        }
        setTextOnInternal(this.f7565F);
        setTextOffInternal(this.f7567H);
        t7.x();
    }

    public void n(Typeface typeface, int i8) {
        if (i8 <= 0) {
            this.f7585c0.setFakeBoldText(false);
            this.f7585c0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i8) : Typeface.create(typeface, i8);
            setSwitchTypeface(defaultFromStyle);
            int i9 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i8;
            this.f7585c0.setFakeBoldText((i9 & 1) != 0);
            this.f7585c0.setTextSkewX((i9 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f7559n0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f7594l0;
        Drawable drawable = this.f7600w;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i8 = this.f7581V;
        int i9 = this.f7583a0;
        int i10 = i8 + rect.top;
        int i11 = i9 - rect.bottom;
        Drawable drawable2 = this.f7595o;
        if (drawable != null) {
            if (!this.f7564E || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d8 = O.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d8.left;
                rect.right -= d8.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f7587e0 : this.f7588f0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f7586d0;
            if (colorStateList != null) {
                this.f7585c0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f7585c0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i10 + i11) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f7565F : this.f7567H;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        int i12;
        int width;
        int i13;
        int i14;
        int i15;
        int i16;
        super.onLayout(z7, i8, i9, i10, i11);
        int i17 = 0;
        if (this.f7595o != null) {
            Rect rect = this.f7594l0;
            Drawable drawable = this.f7600w;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d8 = O.d(this.f7595o);
            i12 = Math.max(0, d8.left - rect.left);
            i17 = Math.max(0, d8.right - rect.right);
        } else {
            i12 = 0;
        }
        if (q0.b(this)) {
            i13 = getPaddingLeft() + i12;
            width = ((this.f7577R + i13) - i12) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i13 = (width - this.f7577R) + i12 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f7578S;
            i15 = paddingTop - (i14 / 2);
        } else {
            if (gravity == 80) {
                i16 = getHeight() - getPaddingBottom();
                i15 = i16 - this.f7578S;
                this.f7580U = i13;
                this.f7581V = i15;
                this.f7583a0 = i16;
                this.f7582W = width;
            }
            i15 = getPaddingTop();
            i14 = this.f7578S;
        }
        i16 = i14 + i15;
        this.f7580U = i13;
        this.f7581V = i15;
        this.f7583a0 = i16;
        this.f7582W = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        if (this.f7569J) {
            if (this.f7587e0 == null) {
                this.f7587e0 = i(this.f7566G);
            }
            if (this.f7588f0 == null) {
                this.f7588f0 = i(this.f7568I);
            }
        }
        Rect rect = this.f7594l0;
        Drawable drawable = this.f7595o;
        int i12 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i10 = (this.f7595o.getIntrinsicWidth() - rect.left) - rect.right;
            i11 = this.f7595o.getIntrinsicHeight();
        } else {
            i10 = 0;
            i11 = 0;
        }
        this.f7579T = Math.max(this.f7569J ? Math.max(this.f7587e0.getWidth(), this.f7588f0.getWidth()) + (this.f7561B * 2) : 0, i10);
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i12 = this.f7600w.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i13 = rect.left;
        int i14 = rect.right;
        Drawable drawable3 = this.f7595o;
        if (drawable3 != null) {
            Rect d8 = O.d(drawable3);
            i13 = Math.max(i13, d8.left);
            i14 = Math.max(i14, d8.right);
        }
        int max = this.f7584b0 ? Math.max(this.f7562C, (this.f7579T * 2) + i13 + i14) : this.f7562C;
        int max2 = Math.max(i12, i11);
        this.f7577R = max;
        this.f7578S = max2;
        super.onMeasure(i8, i9);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f7565F : this.f7567H;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f7574O
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f7570K
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f7572M
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.q0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f7576Q
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f7576Q
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f7572M = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f7572M
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f7571L
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f7573N
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f7571L
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f7570K = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f7572M = r0
            r6.f7573N = r3
            return r1
        L89:
            int r0 = r6.f7570K
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f7570K = r0
            android.view.VelocityTracker r0 = r6.f7574O
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f7570K = r1
            r6.f7572M = r0
            r6.f7573N = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        super.setChecked(z7);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.h.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().e(z7);
        setTextOnInternal(this.f7565F);
        setTextOffInternal(this.f7567H);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z7) {
        this.f7584b0 = z7;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z7) {
        if (this.f7569J != z7) {
            this.f7569J = z7;
            requestLayout();
            if (z7) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z7) {
        this.f7564E = z7;
        invalidate();
    }

    public void setSwitchMinWidth(int i8) {
        this.f7562C = i8;
        requestLayout();
    }

    public void setSwitchPadding(int i8) {
        this.f7563D = i8;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f7585c0.getTypeface() == null || this.f7585c0.getTypeface().equals(typeface)) && (this.f7585c0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f7585c0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7595o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7595o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f8) {
        this.f7576Q = f8;
        invalidate();
    }

    public void setThumbResource(int i8) {
        setThumbDrawable(AbstractC5794a.b(getContext(), i8));
    }

    public void setThumbTextPadding(int i8) {
        this.f7561B = i8;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7596s = colorStateList;
        this.f7598u = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7597t = mode;
        this.f7599v = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7600w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7600w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i8) {
        setTrackDrawable(AbstractC5794a.b(getContext(), i8));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7601x = colorStateList;
        this.f7603z = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f7602y = mode;
        this.f7560A = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7595o || drawable == this.f7600w;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7596s = null;
        this.f7597t = null;
        this.f7598u = false;
        this.f7599v = false;
        this.f7601x = null;
        this.f7602y = null;
        this.f7603z = false;
        this.f7560A = false;
        this.f7574O = VelocityTracker.obtain();
        this.f7584b0 = true;
        this.f7594l0 = new Rect();
        b0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f7585c0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        f0 v7 = f0.v(context, attributeSet, f.j.f35565D2, i8, 0);
        z0.X.l0(this, context, f.j.f35565D2, attributeSet, v7.r(), i8, 0);
        Drawable g8 = v7.g(f.j.f35580G2);
        this.f7595o = g8;
        if (g8 != null) {
            g8.setCallback(this);
        }
        Drawable g9 = v7.g(f.j.f35625P2);
        this.f7600w = g9;
        if (g9 != null) {
            g9.setCallback(this);
        }
        setTextOnInternal(v7.p(f.j.f35570E2));
        setTextOffInternal(v7.p(f.j.f35575F2));
        this.f7569J = v7.a(f.j.f35585H2, true);
        this.f7561B = v7.f(f.j.f35610M2, 0);
        this.f7562C = v7.f(f.j.f35595J2, 0);
        this.f7563D = v7.f(f.j.f35600K2, 0);
        this.f7564E = v7.a(f.j.f35590I2, false);
        ColorStateList c8 = v7.c(f.j.f35615N2);
        if (c8 != null) {
            this.f7596s = c8;
            this.f7598u = true;
        }
        PorterDuff.Mode e8 = O.e(v7.k(f.j.f35620O2, -1), null);
        if (this.f7597t != e8) {
            this.f7597t = e8;
            this.f7599v = true;
        }
        if (this.f7598u || this.f7599v) {
            b();
        }
        ColorStateList c9 = v7.c(f.j.f35630Q2);
        if (c9 != null) {
            this.f7601x = c9;
            this.f7603z = true;
        }
        PorterDuff.Mode e9 = O.e(v7.k(f.j.f35635R2, -1), null);
        if (this.f7602y != e9) {
            this.f7602y = e9;
            this.f7560A = true;
        }
        if (this.f7603z || this.f7560A) {
            c();
        }
        int n8 = v7.n(f.j.f35605L2, 0);
        if (n8 != 0) {
            m(context, n8);
        }
        C c10 = new C(this);
        this.f7591i0 = c10;
        c10.m(attributeSet, i8);
        v7.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7571L = viewConfiguration.getScaledTouchSlop();
        this.f7575P = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i8);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
