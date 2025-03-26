package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.b;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: androidx.room.c$a$a, reason: collision with other inner class name */
        private static class C0185a implements c {

            /* renamed from: o, reason: collision with root package name */
            private IBinder f11309o;

            C0185a(IBinder iBinder) {
                this.f11309o = iBinder;
            }

            @Override // androidx.room.c
            public void X6(b bVar, int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i8);
                    this.f11309o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11309o;
            }

            @Override // androidx.room.c
            public int t2(b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f11309o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // androidx.room.c
            public void z6(int i8, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i8);
                    obtain.writeStringArray(strArr);
                    this.f11309o.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static c w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0185a(iBinder) : (c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int t22 = t2(b.a.w0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(t22);
                return true;
            }
            if (i8 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                X6(b.a.w0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i8 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                z6(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i8 != 1598968902) {
                return super.onTransact(i8, parcel, parcel2, i9);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    void X6(b bVar, int i8);

    int t2(b bVar, String str);

    void z6(int i8, String[] strArr);
}
