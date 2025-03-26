package X2;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0757e extends IInterface {

    /* renamed from: X2.e$a */
    public static abstract class a extends m3.b implements InterfaceC0757e {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // m3.b
        protected final boolean p2(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 != 1) {
                return false;
            }
            Status status = (Status) m3.c.a(parcel, Status.CREATOR);
            m3.c.b(parcel);
            v2(status);
            return true;
        }
    }

    void v2(Status status);
}
