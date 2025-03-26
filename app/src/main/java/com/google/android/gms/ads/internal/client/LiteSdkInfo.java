package com.google.android.gms.ads.internal.client;

import D2.AbstractBinderC0535r0;
import D2.C0542t1;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC4830zl;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC0535r0 {
    public LiteSdkInfo(Context context) {
    }

    @Override // D2.InterfaceC0538s0
    public InterfaceC1242Dl getAdapterCreator() {
        return new BinderC4830zl();
    }

    @Override // D2.InterfaceC0538s0
    public C0542t1 getLiteSdkVersion() {
        return new C0542t1(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
