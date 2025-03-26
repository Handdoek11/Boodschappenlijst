package V2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
final class j implements Parcelable.Creator {
    j() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new l(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
