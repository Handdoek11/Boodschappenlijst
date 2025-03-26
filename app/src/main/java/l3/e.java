package l3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // l3.b
    protected final boolean w0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        H3((Status) c.a(parcel, Status.CREATOR), (S2.f) c.a(parcel, S2.f.CREATOR));
        return true;
    }
}
