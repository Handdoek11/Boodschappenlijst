package y4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: y4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6954i extends IInterface {

    /* renamed from: y4.i$a */
    public static abstract class a extends Binder implements InterfaceC6954i {

        /* renamed from: y4.i$a$a, reason: collision with other inner class name */
        private static class C0350a implements InterfaceC6954i {

            /* renamed from: o, reason: collision with root package name */
            private IBinder f44593o;

            C0350a(IBinder iBinder) {
                this.f44593o = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f44593o;
            }

            @Override // y4.InterfaceC6954i
            public void l1(InterfaceC6953h interfaceC6953h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    obtain.writeStrongInterface(interfaceC6953h);
                    obtain.writeString(str);
                    this.f44593o.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static InterfaceC6954i w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC6954i)) ? new C0350a(iBinder) : (InterfaceC6954i) queryLocalInterface;
        }
    }

    void l1(InterfaceC6953h interfaceC6953h, String str);
}
