package com.headcode.ourgroceries.android;

import android.os.Bundle;
import android.view.View;
import androidx.preference.DialogPreference;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* renamed from: com.headcode.ourgroceries.android.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5641s2 extends androidx.preference.g {

    /* renamed from: R0, reason: collision with root package name */
    private SwitchMaterial f35008R0 = null;

    public static C5641s2 A2(String str) {
        C5641s2 c5641s2 = new C5641s2();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        c5641s2.R1(bundle);
        return c5641s2;
    }

    @Override // androidx.preference.g
    protected void u2(View view) {
        super.u2(view);
        if (B() == null) {
            return;
        }
        this.f35008R0 = (SwitchMaterial) view.findViewById(H2.f33593l1);
        DialogPreference s22 = s2();
        if (s22 instanceof PersonalizedAdsPreference) {
            this.f35008R0.setChecked(((PersonalizedAdsPreference) s22).Q0());
        }
    }

    @Override // androidx.preference.g
    public void w2(boolean z7) {
        if (!z7 || this.f35008R0 == null) {
            return;
        }
        DialogPreference s22 = s2();
        if (s22 instanceof PersonalizedAdsPreference) {
            ((PersonalizedAdsPreference) s22).R0(this.f35008R0.isChecked());
        }
    }
}
