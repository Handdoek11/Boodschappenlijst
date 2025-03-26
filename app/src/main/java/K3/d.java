package k3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends AbstractC6099a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // k3.f
    public final boolean H1(boolean z7) {
        Parcel w02 = w0();
        c.a(w02, true);
        Parcel D02 = D0(2, w02);
        boolean b8 = c.b(D02);
        D02.recycle();
        return b8;
    }

    @Override // k3.f
    public final String a() {
        Parcel D02 = D0(1, w0());
        String readString = D02.readString();
        D02.recycle();
        return readString;
    }

    @Override // k3.f
    public final boolean d() {
        Parcel D02 = D0(6, w0());
        boolean b8 = c.b(D02);
        D02.recycle();
        return b8;
    }
}
