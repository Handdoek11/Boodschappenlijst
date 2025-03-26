package y4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: y4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6953h extends IInterface {

    /* renamed from: y4.h$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void g1(Status status, C6946a c6946a);

    void v1(Status status, C6955j c6955j);

    /* renamed from: y4.h$a */
    public static abstract class a extends Binder implements InterfaceC6953h {
        public a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
            }
            if (i8 == 1598968902) {
                parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                return true;
            }
            if (i8 == 1) {
                g1((Status) b.b(parcel, Status.CREATOR), (C6946a) b.b(parcel, C6946a.CREATOR));
            } else {
                if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                v1((Status) b.b(parcel, Status.CREATOR), (C6955j) b.b(parcel, C6955j.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
