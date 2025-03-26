package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5131j extends AbstractC5113g implements InterfaceC5143l {
    C5131j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5143l
    public final void b2(String str, String str2, InterfaceC5155n interfaceC5155n) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        int i8 = AbstractC5125i.f29913a;
        w02.writeStrongBinder(interfaceC5155n);
        p2(1, w02);
    }
}
