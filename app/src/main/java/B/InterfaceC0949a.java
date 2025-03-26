package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0949a extends IInterface {

    /* renamed from: e, reason: collision with root package name */
    public static final String f11966e = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            }
        }
    }

    void A1(int i8, int i9, int i10, int i11, int i12, Bundle bundle);

    void C6(Bundle bundle);

    Bundle E2(String str, Bundle bundle);

    void J3(Bundle bundle);

    void J6(int i8, Uri uri, boolean z7, Bundle bundle);

    void W3(Bundle bundle);

    void X4(String str, Bundle bundle);

    void o4(int i8, int i9, Bundle bundle);

    void o5(Bundle bundle);

    void t6(String str, Bundle bundle);

    void x5(int i8, Bundle bundle);

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0201a extends Binder implements InterfaceC0949a {
        public AbstractBinderC0201a() {
            attachInterface(this, InterfaceC0949a.f11966e);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            String str = InterfaceC0949a.f11966e;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i8) {
                case 2:
                    x5(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    X4(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    C6((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    t6(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    J6(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle E22 = E2(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, E22, 1);
                    return true;
                case 8:
                    o4(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    o5((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    A1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    J3((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    W3((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
