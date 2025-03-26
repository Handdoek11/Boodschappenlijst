package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: k0, reason: collision with root package name */
    private final a f10455k0;

    /* renamed from: l0, reason: collision with root package name */
    private CharSequence f10456l0;

    /* renamed from: m0, reason: collision with root package name */
    private CharSequence f10457m0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (SwitchPreference.this.c(Boolean.valueOf(z7))) {
                SwitchPreference.this.L0(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10455k0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10606O0, i8, i9);
        O0(p0.k.o(obtainStyledAttributes, t.f10622W0, t.f10608P0));
        N0(p0.k.o(obtainStyledAttributes, t.f10620V0, t.f10610Q0));
        S0(p0.k.o(obtainStyledAttributes, t.f10626Y0, t.f10614S0));
        R0(p0.k.o(obtainStyledAttributes, t.f10624X0, t.f10616T0));
        M0(p0.k.b(obtainStyledAttributes, t.f10618U0, t.f10612R0, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T0(View view) {
        boolean z7 = view instanceof Switch;
        if (z7) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10463f0);
        }
        if (z7) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f10456l0);
            r42.setTextOff(this.f10457m0);
            r42.setOnCheckedChangeListener(this.f10455k0);
        }
    }

    private void U0(View view) {
        if (((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            T0(view.findViewById(R.id.switch_widget));
            P0(view.findViewById(R.id.summary));
        }
    }

    public void R0(CharSequence charSequence) {
        this.f10457m0 = charSequence;
        P();
    }

    public void S0(CharSequence charSequence) {
        this.f10456l0 = charSequence;
        P();
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        T0(mVar.g0(R.id.switch_widget));
        Q0(mVar);
    }

    @Override // androidx.preference.Preference
    protected void h0(View view) {
        super.h0(view);
        U0(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10559l, R.attr.switchPreferenceStyle));
    }
}
