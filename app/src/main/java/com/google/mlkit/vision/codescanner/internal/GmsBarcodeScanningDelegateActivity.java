package com.google.mlkit.vision.codescanner.internal;

import Z2.r;
import a3.AbstractC0816d;
import a5.C0823a;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import d.C5694a;
import d.b;
import e.c;
import q3.O6;

/* loaded from: classes2.dex */
public class GmsBarcodeScanningDelegateActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE");
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i8 = applicationInfo.labelRes;
        registerForActivityResult(new c(), new b() { // from class: d5.f
            @Override // d.b
            public final void a(Object obj) {
                GmsBarcodeScanningDelegateActivity gmsBarcodeScanningDelegateActivity = this.f35281a;
                C5694a c5694a = (C5694a) obj;
                Intent a8 = c5694a.a();
                if (c5694a.b() == -1 && a8 != null && a8.hasExtra("extra_barcode_result")) {
                    C5729e.e(new C0823a(new C5725a((O6) AbstractC0816d.a((byte[]) r.l(a8.getByteArrayExtra("extra_barcode_result")), O6.CREATOR))), 0);
                } else {
                    C5729e.e(null, a8 != null ? a8.getIntExtra("extra_error_code", 13) : 13);
                }
                gmsBarcodeScanningDelegateActivity.finish();
            }
        }).a(action.putExtra("extra_calling_app_name", i8 != 0 ? getString(i8) : getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtra("extra_supported_formats", getIntent().getIntExtra("extra_supported_formats", 0)).putExtra("extra_allow_manual_input", getIntent().getBooleanExtra("extra_allow_manual_input", false)).putExtra("extra_enable_auto_zoom", getIntent().getBooleanExtra("extra_enable_auto_zoom", false)));
    }
}
