package com.headcode.ourgroceries.android;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;

/* loaded from: classes2.dex */
public class PersonalizedAdsPreference extends DialogPreference {
    public PersonalizedAdsPreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    @Override // androidx.preference.DialogPreference
    public int L0() {
        return J2.f33682L;
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence N0() {
        return null;
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence O0() {
        return m().getString(M2.f33906K1);
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence P0() {
        return m().getString(M2.f33946P1);
    }

    public boolean Q0() {
        return y(true);
    }

    public void R0(boolean z7) {
        i0(z7);
    }

    public PersonalizedAdsPreference(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public PersonalizedAdsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PersonalizedAdsPreference(Context context) {
        this(context, null);
    }
}
