package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.f0;
import f.AbstractC5752a;
import f.AbstractC5757f;
import f.AbstractC5758g;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    private Drawable f7073A;

    /* renamed from: B, reason: collision with root package name */
    private int f7074B;

    /* renamed from: C, reason: collision with root package name */
    private Context f7075C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f7076D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f7077E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f7078F;

    /* renamed from: G, reason: collision with root package name */
    private LayoutInflater f7079G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7080H;

    /* renamed from: o, reason: collision with root package name */
    private g f7081o;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f7082s;

    /* renamed from: t, reason: collision with root package name */
    private RadioButton f7083t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f7084u;

    /* renamed from: v, reason: collision with root package name */
    private CheckBox f7085v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f7086w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f7087x;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f7088y;

    /* renamed from: z, reason: collision with root package name */
    private LinearLayout f7089z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35362A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i8) {
        LinearLayout linearLayout = this.f7089z;
        if (linearLayout != null) {
            linearLayout.addView(view, i8);
        } else {
            addView(view, i8);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC5758g.f35516h, (ViewGroup) this, false);
        this.f7085v = checkBox;
        a(checkBox);
    }

    private void e() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC5758g.f35517i, (ViewGroup) this, false);
        this.f7082s = imageView;
        b(imageView, 0);
    }

    private void f() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC5758g.f35519k, (ViewGroup) this, false);
        this.f7083t = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f7079G == null) {
            this.f7079G = LayoutInflater.from(getContext());
        }
        return this.f7079G;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f7087x;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7088y;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7088y.getLayoutParams();
        rect.top += this.f7088y.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(g gVar, int i8) {
        this.f7081o = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f7081o;
    }

    public void h(boolean z7, char c8) {
        int i8 = (z7 && this.f7081o.A()) ? 0 : 8;
        if (i8 == 0) {
            this.f7086w.setText(this.f7081o.h());
        }
        if (this.f7086w.getVisibility() != i8) {
            this.f7086w.setVisibility(i8);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f7073A);
        TextView textView = (TextView) findViewById(AbstractC5757f.f35479M);
        this.f7084u = textView;
        int i8 = this.f7074B;
        if (i8 != -1) {
            textView.setTextAppearance(this.f7075C, i8);
        }
        this.f7086w = (TextView) findViewById(AbstractC5757f.f35472F);
        ImageView imageView = (ImageView) findViewById(AbstractC5757f.f35475I);
        this.f7087x = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7077E);
        }
        this.f7088y = (ImageView) findViewById(AbstractC5757f.f35500r);
        this.f7089z = (LinearLayout) findViewById(AbstractC5757f.f35494l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f7082s != null && this.f7076D) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7082s.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i8, i9);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f7083t == null && this.f7085v == null) {
            return;
        }
        if (this.f7081o.m()) {
            if (this.f7083t == null) {
                f();
            }
            compoundButton = this.f7083t;
            view = this.f7085v;
        } else {
            if (this.f7085v == null) {
                c();
            }
            compoundButton = this.f7085v;
            view = this.f7083t;
        }
        if (z7) {
            compoundButton.setChecked(this.f7081o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f7085v;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f7083t;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f7081o.m()) {
            if (this.f7083t == null) {
                f();
            }
            compoundButton = this.f7083t;
        } else {
            if (this.f7085v == null) {
                c();
            }
            compoundButton = this.f7085v;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f7080H = z7;
        this.f7076D = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f7088y;
        if (imageView != null) {
            imageView.setVisibility((this.f7078F || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f7081o.z() || this.f7080H;
        if (z7 || this.f7076D) {
            ImageView imageView = this.f7082s;
            if (imageView == null && drawable == null && !this.f7076D) {
                return;
            }
            if (imageView == null) {
                e();
            }
            if (drawable == null && !this.f7076D) {
                this.f7082s.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f7082s;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f7082s.getVisibility() != 0) {
                this.f7082s.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f7084u.getVisibility() != 8) {
                this.f7084u.setVisibility(8);
            }
        } else {
            this.f7084u.setText(charSequence);
            if (this.f7084u.getVisibility() != 0) {
                this.f7084u.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        f0 v7 = f0.v(getContext(), attributeSet, f.j.f35643T1, i8, 0);
        this.f7073A = v7.g(f.j.f35651V1);
        this.f7074B = v7.n(f.j.f35647U1, -1);
        this.f7076D = v7.a(f.j.f35655W1, false);
        this.f7075C = context;
        this.f7077E = v7.g(f.j.f35659X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC5752a.f35397x, 0);
        this.f7078F = obtainStyledAttributes.hasValue(0);
        v7.x();
        obtainStyledAttributes.recycle();
    }
}
