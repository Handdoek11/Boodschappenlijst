package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1804Tj extends AbstractC0813a {
    public static final Parcelable.Creator<C1804Tj> CREATOR = new C1839Uj();

    /* renamed from: o, reason: collision with root package name */
    public final String f19167o;

    /* renamed from: s, reason: collision with root package name */
    public final Bundle f19168s;

    public C1804Tj(String str, Bundle bundle) {
        this.f19167o = str;
        this.f19168s = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f19167o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.e(parcel, 2, this.f19168s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
