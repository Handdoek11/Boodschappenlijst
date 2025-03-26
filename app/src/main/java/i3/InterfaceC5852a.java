package i3;

import android.os.IBinder;
import android.os.IInterface;
import o3.AbstractBinderC6287b;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5852a extends IInterface {

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0269a extends AbstractBinderC6287b implements InterfaceC5852a {
        public AbstractBinderC0269a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC5852a D0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC5852a ? (InterfaceC5852a) queryLocalInterface : new c(iBinder);
        }
    }
}
