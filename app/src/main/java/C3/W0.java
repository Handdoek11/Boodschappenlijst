package C3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.AbstractC5228a;
import com.google.android.gms.internal.wearable.AbstractC5232b0;

/* loaded from: classes2.dex */
public final class W0 extends AbstractC5228a implements IInterface {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void p2(boolean z7, byte[] bArr) {
        Parcel J02 = J0();
        int i8 = AbstractC5232b0.f30117a;
        J02.writeInt(z7 ? 1 : 0);
        J02.writeByteArray(bArr);
        D0(1, J02);
    }
}
