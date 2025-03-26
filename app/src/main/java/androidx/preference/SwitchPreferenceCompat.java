package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: k0, reason: collision with root package name */
    private final a f10459k0;

    /* renamed from: l0, reason: collision with root package name */
    private CharSequence f10460l0;

    /* renamed from: m0, reason: collision with root package name */
    private CharSequence f10461m0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (SwitchPreferenceCompat.this.c(Boolean.valueOf(z7))) {
                SwitchPreferenceCompat.this.L0(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10459k0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10628Z0, i8, i9);
        O0(p0.k.o(obtainStyledAttributes, t.f10652h1, t.f10631a1));
        N0(p0.k.o(obtainStyledAttributes, t.f10649g1, t.f10634b1));
        S0(p0.k.o(obtainStyledAttributes, t.f10658j1, t.f10640d1));
        R0(p0.k.o(obtainStyledAttributes, t.f10655i1, t.f10643e1));
        M0(p0.k.b(obtainStyledAttributes, t.f10646f1, t.f10637c1, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T0(View view) {
        boolean z7 = view instanceof SwitchCompat;
        if (z7) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10463f0);
        }
        if (z7) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f10460l0);
            switchCompat.setTextOff(this.f10461m0);
            switchCompat.setOnCheckedChangeListener(this.f10459k0);
        }
    }

    private void U0(View view) {
        if (((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            T0(view.findViewById(p.f10566f));
            P0(view.findViewById(R.id.summary));
        }
    }

    public void R0(CharSequence charSequence) {
        this.f10461m0 = charSequence;
        P();
    }

    public void S0(CharSequence charSequence) {
        this.f10460l0 = charSequence;
        P();
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        T0(mVar.g0(p.f10566f));
        Q0(mVar);
    }

    @Override // androidx.preference.Preference
    protected void h0(View view) {
        super.h0(view);
        U0(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f10558k);
    }
}
