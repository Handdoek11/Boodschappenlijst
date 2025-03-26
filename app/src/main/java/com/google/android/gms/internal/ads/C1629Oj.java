package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629Oj extends AbstractC3612ob implements InterfaceC1699Qj {
    C1629Oj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1699Qj
    public final void u5(List list) {
        Parcel w02 = w0();
        w02.writeTypedList(list);
        J0(1, w02);
    }
}
