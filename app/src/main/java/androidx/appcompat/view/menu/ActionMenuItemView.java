package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.k0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends D implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: A, reason: collision with root package name */
    private Drawable f7058A;

    /* renamed from: B, reason: collision with root package name */
    e.b f7059B;

    /* renamed from: C, reason: collision with root package name */
    private S f7060C;

    /* renamed from: D, reason: collision with root package name */
    b f7061D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f7062E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f7063F;

    /* renamed from: G, reason: collision with root package name */
    private int f7064G;

    /* renamed from: H, reason: collision with root package name */
    private int f7065H;

    /* renamed from: I, reason: collision with root package name */
    private int f7066I;

    /* renamed from: y, reason: collision with root package name */
    g f7067y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f7068z;

    private class a extends S {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.S
        public k.e b() {
            b bVar = ActionMenuItemView.this.f7061D;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.S
        protected boolean d() {
            k.e b8;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f7059B;
            return bVar != null && bVar.a(actionMenuItemView.f7067y) && (b8 = b()) != null && b8.a();
        }
    }

    public static abstract class b {
        public abstract k.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean D() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        return i8 >= 480 || (i8 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void E() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f7068z);
        if (this.f7058A != null && (!this.f7067y.B() || (!this.f7062E && !this.f7063F))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f7068z : null);
        CharSequence contentDescription = this.f7067y.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z9 ? null : this.f7067y.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f7067y.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            k0.a(this, z9 ? null : this.f7067y.getTitle());
        } else {
            k0.a(this, tooltipText);
        }
    }

    public boolean C() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return C();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return C() && this.f7067y.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(g gVar, int i8) {
        this.f7067y = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f7060C == null) {
            this.f7060C = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f7067y;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f7059B;
        if (bVar != null) {
            bVar.a(this.f7067y);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7062E = D();
        E();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        boolean C7 = C();
        if (C7 && (i10 = this.f7065H) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f7064G) : this.f7064G;
        if (mode != 1073741824 && this.f7064G > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i9);
        }
        if (C7 || this.f7058A == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f7058A.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s8;
        if (this.f7067y.hasSubMenu() && (s8 = this.f7060C) != null && s8.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f7063F != z7) {
            this.f7063F = z7;
            g gVar = this.f7067y;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7058A = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.f7066I;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (intrinsicHeight * (i8 / intrinsicWidth));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (intrinsicWidth * (i8 / intrinsicHeight));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, null, null, null);
        E();
    }

    public void setItemInvoker(e.b bVar) {
        this.f7059B = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f7065H = i8;
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f7061D = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f7068z = charSequence;
        E();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Resources resources = context.getResources();
        this.f7062E = D();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35774v, i8, 0);
        this.f7064G = obtainStyledAttributes.getDimensionPixelSize(f.j.f35779w, 0);
        obtainStyledAttributes.recycle();
        this.f7066I = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f7065H = -1;
        setSaveEnabled(false);
    }
}
