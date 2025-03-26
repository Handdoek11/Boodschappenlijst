package C3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.wearable.AbstractC5232b0;
import java.util.ArrayList;

/* renamed from: C3.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0409a1 extends com.google.android.gms.internal.wearable.B implements InterfaceC0412b1 {
    public AbstractBinderC0409a1() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    @Override // com.google.android.gms.internal.wearable.B
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        W0 w02;
        switch (i8) {
            case 1:
                DataHolder dataHolder = (DataHolder) AbstractC5232b0.a(parcel, DataHolder.CREATOR);
                AbstractC5232b0.b(parcel);
                z5(dataHolder);
                return true;
            case 2:
                C0436j1 c0436j1 = (C0436j1) AbstractC5232b0.a(parcel, C0436j1.CREATOR);
                AbstractC5232b0.b(parcel);
                p1(c0436j1);
                return true;
            case 3:
                C0454p1 c0454p1 = (C0454p1) AbstractC5232b0.a(parcel, C0454p1.CREATOR);
                AbstractC5232b0.b(parcel);
                O0(c0454p1);
                return true;
            case 4:
                C0454p1 c0454p12 = (C0454p1) AbstractC5232b0.a(parcel, C0454p1.CREATOR);
                AbstractC5232b0.b(parcel);
                x1(c0454p12);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(C0454p1.CREATOR);
                AbstractC5232b0.b(parcel);
                W6(createTypedArrayList);
                return true;
            case 6:
                k2 k2Var = (k2) AbstractC5232b0.a(parcel, k2.CREATOR);
                AbstractC5232b0.b(parcel);
                G5(k2Var);
                return true;
            case 7:
                C0452p c0452p = (C0452p) AbstractC5232b0.a(parcel, C0452p.CREATOR);
                AbstractC5232b0.b(parcel);
                h4(c0452p);
                return true;
            case 8:
                C0434j c0434j = (C0434j) AbstractC5232b0.a(parcel, C0434j.CREATOR);
                AbstractC5232b0.b(parcel);
                R0(c0434j);
                return true;
            case 9:
                W1 w12 = (W1) AbstractC5232b0.a(parcel, W1.CREATOR);
                AbstractC5232b0.b(parcel);
                M1(w12);
                return true;
            case 10:
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C0436j1 c0436j12 = (C0436j1) AbstractC5232b0.a(parcel, C0436j1.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    w02 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                    w02 = queryLocalInterface instanceof W0 ? (W0) queryLocalInterface : new W0(readStrongBinder);
                }
                AbstractC5232b0.b(parcel);
                n6(c0436j12, w02);
                return true;
            case 14:
                AbstractC5232b0.b(parcel);
                return true;
            case 15:
                AbstractC5232b0.b(parcel);
                return true;
            case 16:
                C0451o1 c0451o1 = (C0451o1) AbstractC5232b0.a(parcel, C0451o1.CREATOR);
                AbstractC5232b0.b(parcel);
                k5(c0451o1);
                return true;
            case 17:
                AbstractC5232b0.b(parcel);
                return true;
        }
    }
}
