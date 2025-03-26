package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388Hn extends AbstractC3612ob implements InterfaceC1459Jn {
    C1388Hn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1459Jn
    public final void T1(List list) {
        Parcel w02 = w0();
        w02.writeTypedList(list);
        J0(1, w02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1459Jn
    public final void n(String str) {
        Parcel w02 = w0();
        w02.writeString(str);
        J0(2, w02);
    }
}
