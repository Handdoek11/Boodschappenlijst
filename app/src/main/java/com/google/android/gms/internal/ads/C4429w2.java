package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4429w2 implements Parcelable.Creator {
    C4429w2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        String readString2 = parcel.readString();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        return new C4538x2(readString, readString2, AbstractC4169th0.v(createStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C4538x2[i8];
    }
}
