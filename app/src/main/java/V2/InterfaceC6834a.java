package v2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g2.AbstractBinderC5800b;
import g2.AbstractC5799a;
import g2.AbstractC5801c;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6834a extends IInterface {

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0337a extends AbstractBinderC5800b implements InterfaceC6834a {

        /* renamed from: v2.a$a$a, reason: collision with other inner class name */
        public static class C0338a extends AbstractC5799a implements InterfaceC6834a {
            C0338a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // v2.InterfaceC6834a
            public final Bundle P2(Bundle bundle) {
                Parcel w02 = w0();
                AbstractC5801c.b(w02, bundle);
                Parcel D02 = D0(w02);
                Bundle bundle2 = (Bundle) AbstractC5801c.a(D02, Bundle.CREATOR);
                D02.recycle();
                return bundle2;
            }
        }

        public static InterfaceC6834a w0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof InterfaceC6834a ? (InterfaceC6834a) queryLocalInterface : new C0338a(iBinder);
        }
    }

    Bundle P2(Bundle bundle);
}
