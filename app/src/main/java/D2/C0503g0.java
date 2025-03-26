package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;

/* renamed from: D2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503g0 extends AbstractC3612ob implements InterfaceC0509i0 {
    C0503g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // D2.InterfaceC0509i0
    public final void B0(String str, String str2) {
        Parcel w02 = w0();
        w02.writeString(str);
        w02.writeString(str2);
        J0(1, w02);
    }
}
