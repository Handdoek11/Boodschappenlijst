package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2768go extends AbstractC0813a {
    public static final Parcelable.Creator<C2768go> CREATOR = new C2877ho();

    /* renamed from: o, reason: collision with root package name */
    public final String f22446o;

    public C2768go(String str) {
        this.f22446o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22446o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.b(parcel, a8);
    }
}
