package com.headcode.ourgroceries.android;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;

/* loaded from: classes2.dex */
public class ThemePreference extends DialogPreference {
    public ThemePreference(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    @Override // androidx.preference.DialogPreference
    public int L0() {
        return J2.f33693W;
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence N0() {
        return null;
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence O0() {
        return null;
    }

    @Override // androidx.preference.DialogPreference
    public CharSequence P0() {
        return null;
    }

    public ThemePreference(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public ThemePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThemePreference(Context context) {
        this(context, null);
    }
}
