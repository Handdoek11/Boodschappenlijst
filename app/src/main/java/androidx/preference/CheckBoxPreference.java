package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: k0, reason: collision with root package name */
    private final a f10358k0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            if (CheckBoxPreference.this.c(Boolean.valueOf(z7))) {
                CheckBoxPreference.this.L0(z7);
            } else {
                compoundButton.setChecked(!z7);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R0(View view) {
        boolean z7 = view instanceof CompoundButton;
        if (z7) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f10463f0);
        }
        if (z7) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f10358k0);
        }
    }

    private void S0(View view) {
        if (((AccessibilityManager) m().getSystemService("accessibility")).isEnabled()) {
            R0(view.findViewById(R.id.checkbox));
            P0(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void V(m mVar) {
        super.V(mVar);
        R0(mVar.g0(R.id.checkbox));
        Q0(mVar);
    }

    @Override // androidx.preference.Preference
    protected void h0(View view) {
        super.h0(view);
        S0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f10358k0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f10635c, i8, i9);
        O0(p0.k.o(obtainStyledAttributes, t.f10653i, t.f10638d));
        N0(p0.k.o(obtainStyledAttributes, t.f10650h, t.f10641e));
        M0(p0.k.b(obtainStyledAttributes, t.f10647g, t.f10644f, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p0.k.a(context, n.f10548a, R.attr.checkBoxPreferenceStyle));
    }
}
