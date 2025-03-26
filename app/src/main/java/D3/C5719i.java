package d3;

import X2.InterfaceC0757e;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m3.AbstractC6193a;

/* renamed from: d3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5719i extends AbstractC6193a implements IInterface {
    C5719i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void p2(InterfaceC5718h interfaceC5718h, C5711a c5711a) {
        Parcel w02 = w0();
        m3.c.d(w02, interfaceC5718h);
        m3.c.c(w02, c5711a);
        D0(1, w02);
    }

    public final void q2(InterfaceC5718h interfaceC5718h, C5711a c5711a, InterfaceC5721k interfaceC5721k) {
        Parcel w02 = w0();
        m3.c.d(w02, interfaceC5718h);
        m3.c.c(w02, c5711a);
        m3.c.d(w02, interfaceC5721k);
        D0(2, w02);
    }

    public final void r3(InterfaceC0757e interfaceC0757e, InterfaceC5721k interfaceC5721k) {
        Parcel w02 = w0();
        m3.c.d(w02, interfaceC0757e);
        m3.c.d(w02, interfaceC5721k);
        D0(6, w02);
    }
}
