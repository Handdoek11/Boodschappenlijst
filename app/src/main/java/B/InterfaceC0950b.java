package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0950b extends IInterface {

    /* renamed from: f, reason: collision with root package name */
    public static final String f11967f = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC0950b {

        /* renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C0202a implements InterfaceC0950b {

            /* renamed from: o, reason: collision with root package name */
            private IBinder f11968o;

            C0202a(IBinder iBinder) {
                this.f11968o = iBinder;
            }

            @Override // b.InterfaceC0950b
            public boolean R3(InterfaceC0949a interfaceC0949a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeStrongInterface(interfaceC0949a);
                    this.f11968o.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11968o;
            }

            @Override // b.InterfaceC0950b
            public boolean i1(InterfaceC0949a interfaceC0949a, Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeStrongInterface(interfaceC0949a);
                    C0203b.b(obtain, uri, 0);
                    C0203b.b(obtain, bundle, 0);
                    this.f11968o.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.InterfaceC0950b
            public boolean j5(InterfaceC0949a interfaceC0949a, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeStrongInterface(interfaceC0949a);
                    C0203b.b(obtain, bundle, 0);
                    this.f11968o.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.InterfaceC0950b
            public boolean k4(InterfaceC0949a interfaceC0949a, Uri uri) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeStrongInterface(interfaceC0949a);
                    C0203b.b(obtain, uri, 0);
                    this.f11968o.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.InterfaceC0950b
            public int t1(InterfaceC0949a interfaceC0949a, String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeStrongInterface(interfaceC0949a);
                    obtain.writeString(str);
                    C0203b.b(obtain, bundle, 0);
                    this.f11968o.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // b.InterfaceC0950b
            public boolean z3(long j8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(InterfaceC0950b.f11967f);
                    obtain.writeLong(j8);
                    this.f11968o.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC0950b w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0950b.f11967f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0950b)) ? new C0202a(iBinder) : (InterfaceC0950b) queryLocalInterface;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0203b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i8) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i8);
            }
        }
    }

    boolean R3(InterfaceC0949a interfaceC0949a);

    boolean i1(InterfaceC0949a interfaceC0949a, Uri uri, Bundle bundle);

    boolean j5(InterfaceC0949a interfaceC0949a, Bundle bundle);

    boolean k4(InterfaceC0949a interfaceC0949a, Uri uri);

    int t1(InterfaceC0949a interfaceC0949a, String str, Bundle bundle);

    boolean z3(long j8);
}
