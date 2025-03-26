package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC4888d0;

/* loaded from: classes2.dex */
public final class E2 {

    /* renamed from: a, reason: collision with root package name */
    final S2 f30336a;

    E2(H5 h52) {
        this.f30336a = h52.r0();
    }

    final Bundle a(String str, InterfaceC4888d0 interfaceC4888d0) {
        this.f30336a.j().l();
        if (interfaceC4888d0 == null) {
            this.f30336a.h().J().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle R7 = interfaceC4888d0.R(bundle);
            if (R7 != null) {
                return R7;
            }
            this.f30336a.h().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e8) {
            this.f30336a.h().E().b("Exception occurred while retrieving the Install Referrer", e8.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            h3.d a8 = h3.e.a(this.f30336a.zza());
            if (a8 != null) {
                return a8.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f30336a.h().I().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e8) {
            this.f30336a.h().I().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
