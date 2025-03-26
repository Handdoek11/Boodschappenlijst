package c3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 1) {
                SafeParcelReader.z(parcel, t7);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, t7, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new C0983e(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C0983e[i8];
    }
}
