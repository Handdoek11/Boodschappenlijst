package C3;

import B3.C0401u;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.AbstractC5228a;
import com.google.android.gms.internal.wearable.AbstractC5232b0;

/* renamed from: C3.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0415c1 extends AbstractC5228a implements IInterface {
    C0415c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I3(Y0 y02) {
        Parcel J02 = J0();
        int i8 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        w0(8, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W4(Y0 y02, Uri uri, int i8) {
        Parcel J02 = J0();
        int i9 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        AbstractC5232b0.c(J02, uri);
        J02.writeInt(i8);
        w0(40, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p2(Y0 y02, K0 k02) {
        Parcel J02 = J0();
        int i8 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        AbstractC5232b0.c(J02, k02);
        w0(16, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q2(Y0 y02, Uri uri, int i8) {
        Parcel J02 = J0();
        int i9 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        AbstractC5232b0.c(J02, uri);
        J02.writeInt(i8);
        w0(41, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r3(Y0 y02, String str, int i8) {
        Parcel J02 = J0();
        int i9 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        J02.writeString(str);
        J02.writeInt(i8);
        w0(42, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s7(Y0 y02, C0401u c0401u) {
        Parcel J02 = J0();
        int i8 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        AbstractC5232b0.c(J02, c0401u);
        w0(6, J02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t7(Y0 y02, C0483z1 c0483z1) {
        Parcel J02 = J0();
        int i8 = AbstractC5232b0.f30117a;
        J02.writeStrongBinder(y02);
        AbstractC5232b0.c(J02, c0483z1);
        w0(17, J02);
    }
}
