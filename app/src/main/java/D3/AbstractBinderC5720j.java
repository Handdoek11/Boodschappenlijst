package d3;

import android.os.Parcel;
import c3.C0986h;

/* renamed from: d3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5720j extends m3.b implements InterfaceC5721k {
    public AbstractBinderC5720j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // m3.b
    protected final boolean p2(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        C0986h c0986h = (C0986h) m3.c.a(parcel, C0986h.CREATOR);
        m3.c.b(parcel);
        P6(c0986h);
        return true;
    }
}
