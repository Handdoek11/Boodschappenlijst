package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0184a implements b {

            /* renamed from: o, reason: collision with root package name */
            private IBinder f11308o;

            C0184a(IBinder iBinder) {
                this.f11308o = iBinder;
            }

            @Override // androidx.room.b
            public void G1(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f11308o.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11308o;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static b w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0184a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                G1(parcel.createStringArray());
                return true;
            }
            if (i8 != 1598968902) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    void G1(String[] strArr);
}
