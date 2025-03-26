package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class A00 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13469a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f13470b;

    A00(Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f13469a = context;
        this.f13470b = interfaceExecutorServiceC3522nk0;
    }

    final /* synthetic */ C4644y00 a() {
        Bundle bundle;
        C2.v.t();
        String string = !((Boolean) D2.A.c().a(AbstractC3184kf.f23796U5)).booleanValue() ? "" : this.f13469a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23812W5)).booleanValue() ? this.f13469a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        C2.v.t();
        Context context = this.f13469a;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23804V5)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i8 = 0; i8 < 4; i8++) {
                String str = strArr[i8];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new C4644y00(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f13470b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.x00
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f27707o.a();
            }
        });
    }
}
