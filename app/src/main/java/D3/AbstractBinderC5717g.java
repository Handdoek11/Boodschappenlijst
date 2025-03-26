package d3;

import android.os.Parcel;
import c3.C0980b;
import c3.C0983e;
import c3.C0985g;
import com.google.android.gms.common.api.Status;

/* renamed from: d3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5717g extends m3.b implements InterfaceC5718h {
    public AbstractBinderC5717g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // m3.b
    protected final boolean p2(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            Status status = (Status) m3.c.a(parcel, Status.CREATOR);
            C0980b c0980b = (C0980b) m3.c.a(parcel, C0980b.CREATOR);
            m3.c.b(parcel);
            S3(status, c0980b);
        } else if (i8 == 2) {
            Status status2 = (Status) m3.c.a(parcel, Status.CREATOR);
            C0985g c0985g = (C0985g) m3.c.a(parcel, C0985g.CREATOR);
            m3.c.b(parcel);
            a7(status2, c0985g);
        } else if (i8 == 3) {
            Status status3 = (Status) m3.c.a(parcel, Status.CREATOR);
            C0983e c0983e = (C0983e) m3.c.a(parcel, C0983e.CREATOR);
            m3.c.b(parcel);
            c3(status3, c0983e);
        } else {
            if (i8 != 4) {
                return false;
            }
            Status status4 = (Status) m3.c.a(parcel, Status.CREATOR);
            m3.c.b(parcel);
            W5(status4);
        }
        return true;
    }
}
