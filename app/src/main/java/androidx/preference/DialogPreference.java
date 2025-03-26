package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: f0, reason: collision with root package name */
    private CharSequence f10360f0;

    /* renamed from: g0, reason: collision with root package name */
    private CharSequence f10361g0;

    /* renamed from: h0, reason: collision with root package name */
    private Drawable f10362h0;

    /* renamed from: i0, reason: collision with root package name */
    private CharSequence f10363i0;

    /* renamed from: j0, reason: collision with root package name */
    private CharSequence f10364j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f10365k0;

    public interface a {
        Preference c(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10656j, i8, i9);
        String o8 = p0.k.o(obtainStyledAttributes, t.f10677t, t.f10659k);
        this.f10360f0 = o8;
        if (o8 == null) {
            this.f10360f0 = H();
        }
        this.f10361g0 = p0.k.o(obtainStyledAttributes, t.f10675s, t.f10661l);
        this.f10362h0 = p0.k.c(obtainStyledAttributes, t.f10671q, t.f10663m);
        this.f10363i0 = p0.k.o(obtainStyledAttributes, t.f10681v, t.f10665n);
        this.f10364j0 = p0.k.o(obtainStyledAttributes, t.f10679u, t.f10667o);
        this.f10365k0 = p0.k.n(obtainStyledAttributes, t.f10673r, t.f10669p, 0);
        obtainStyledAttributes.recycle();
    }

    public Drawable K0() {
        return this.f10362h0;
    }

    public int L0() {
        return this.f10365k0;
    }

    public CharSequence M0() {
        return this.f10361g0;
    }

    public CharSequence N0() {
        return this.f10360f0;
    }

    public CharSequence O0() {
        return this.f10364j0;
    }

    public CharSequence P0() {
        return this.f10363i0;
    }

    @Override // androidx.preference.Preference
    protected void W() {
        D().x(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10549b, R.attr.dialogPreferenceStyle));
    }
}
