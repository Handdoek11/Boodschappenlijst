package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5095d extends AbstractC5113g implements InterfaceC5107f {
    C5095d(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final int B1(int i8, String str, String str2) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        w02.writeString(str2);
        Parcel D02 = D0(1, w02);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle I1(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(6);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(9, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final void R5(int i8, String str, Bundle bundle, InterfaceC5089c interfaceC5089c) {
        Parcel w02 = w0();
        w02.writeInt(18);
        w02.writeString(str);
        AbstractC5125i.c(w02, bundle);
        w02.writeStrongBinder(interfaceC5089c);
        J0(1301, w02);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle V4(int i8, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        w02.writeString(null);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(8, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle Z6(int i8, String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(9);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(902, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle a5(int i8, String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(3);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(2, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle b3(int i8, String str, String str2, String str3) {
        Parcel w02 = w0();
        w02.writeInt(3);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        Parcel D02 = D0(4, w02);
        Bundle bundle = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final int c6(int i8, String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(10, w02);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle f1(int i8, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC5125i.c(w02, bundle);
        AbstractC5125i.c(w02, bundle2);
        Parcel D02 = D0(901, w02);
        Bundle bundle3 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final int j1(int i8, String str, String str2) {
        Parcel w02 = w0();
        w02.writeInt(3);
        w02.writeString(str);
        w02.writeString(str2);
        Parcel D02 = D0(5, w02);
        int readInt = D02.readInt();
        D02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle n1(int i8, String str, String str2, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(9);
        w02.writeString(str);
        w02.writeString(str2);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(12, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle n3(int i8, String str, String str2, String str3, String str4) {
        Parcel w02 = w0();
        w02.writeInt(3);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        w02.writeString(null);
        Parcel D02 = D0(3, w02);
        Bundle bundle = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5107f
    public final Bundle v6(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel w02 = w0();
        w02.writeInt(i8);
        w02.writeString(str);
        w02.writeString(str2);
        w02.writeString(str3);
        AbstractC5125i.c(w02, bundle);
        Parcel D02 = D0(11, w02);
        Bundle bundle2 = (Bundle) AbstractC5125i.a(D02, Bundle.CREATOR);
        D02.recycle();
        return bundle2;
    }
}
