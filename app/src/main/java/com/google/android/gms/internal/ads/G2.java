package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class G2 implements InterfaceC1541Ma {
    public static final Parcelable.Creator<G2> CREATOR = new D2();

    /* renamed from: o, reason: collision with root package name */
    public final List f15240o;

    public G2(List list) {
        this.f15240o = list;
        boolean z7 = false;
        if (!list.isEmpty()) {
            long j8 = ((F2) list.get(0)).f15042s;
            int i8 = 1;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                if (((F2) list.get(i8)).f15041o < j8) {
                    z7 = true;
                    break;
                } else {
                    j8 = ((F2) list.get(i8)).f15042s;
                    i8++;
                }
            }
        }
        AbstractC3796qC.d(!z7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1541Ma
    public final /* synthetic */ void I(G8 g8) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G2.class != obj.getClass()) {
            return false;
        }
        return this.f15240o.equals(((G2) obj).f15240o);
    }

    public final int hashCode() {
        return this.f15240o.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f15240o.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeList(this.f15240o);
    }
}
