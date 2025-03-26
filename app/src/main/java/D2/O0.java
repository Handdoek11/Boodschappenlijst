package D2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3612ob;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class O0 extends AbstractC3612ob implements Q0 {
    O0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // D2.Q0
    public final void h7(String str, InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2) {
        Parcel w02 = w0();
        w02.writeString(str);
        AbstractC3830qb.f(w02, interfaceC5852a);
        AbstractC3830qb.f(w02, interfaceC5852a2);
        J0(1, w02);
    }
}
