package com.google.firebase.messaging;

import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public class T implements Parcelable.Creator {
    static void c(S s8, Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.e(parcel, 2, s8.f32887o, false);
        AbstractC0814b.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S createFromParcel(Parcel parcel) {
        int A7 = SafeParcelReader.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A7) {
            int t7 = SafeParcelReader.t(parcel);
            if (SafeParcelReader.l(t7) != 2) {
                SafeParcelReader.z(parcel, t7);
            } else {
                bundle = SafeParcelReader.a(parcel, t7);
            }
        }
        SafeParcelReader.k(parcel, A7);
        return new S(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S[] newArray(int i8) {
        return new S[i8];
    }
}
