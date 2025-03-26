package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f9071a = (IconCompat) versionedParcel.v(remoteActionCompat.f9071a, 1);
        remoteActionCompat.f9072b = versionedParcel.l(remoteActionCompat.f9072b, 2);
        remoteActionCompat.f9073c = versionedParcel.l(remoteActionCompat.f9073c, 3);
        remoteActionCompat.f9074d = (PendingIntent) versionedParcel.r(remoteActionCompat.f9074d, 4);
        remoteActionCompat.f9075e = versionedParcel.h(remoteActionCompat.f9075e, 5);
        remoteActionCompat.f9076f = versionedParcel.h(remoteActionCompat.f9076f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f9071a, 1);
        versionedParcel.D(remoteActionCompat.f9072b, 2);
        versionedParcel.D(remoteActionCompat.f9073c, 3);
        versionedParcel.H(remoteActionCompat.f9074d, 4);
        versionedParcel.z(remoteActionCompat.f9075e, 5);
        versionedParcel.z(remoteActionCompat.f9076f, 6);
    }
}
