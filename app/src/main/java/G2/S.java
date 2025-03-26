package G2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3721pb;
import com.google.android.gms.internal.ads.AbstractC3830qb;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public abstract class S extends AbstractBinderC3721pb implements T {
    public S() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3721pb
    protected final boolean s7(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            InterfaceC5852a D02 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AbstractC3830qb.c(parcel);
            boolean zzf = zzf(D02, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i8 == 2) {
            InterfaceC5852a D03 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            AbstractC3830qb.c(parcel);
            zze(D03);
            parcel2.writeNoException();
        } else {
            if (i8 != 3) {
                return false;
            }
            InterfaceC5852a D04 = InterfaceC5852a.AbstractBinderC0269a.D0(parcel.readStrongBinder());
            E2.a aVar = (E2.a) AbstractC3830qb.a(parcel, E2.a.CREATOR);
            AbstractC3830qb.c(parcel);
            boolean zzg = zzg(D04, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zzg ? 1 : 0);
        }
        return true;
    }
}
