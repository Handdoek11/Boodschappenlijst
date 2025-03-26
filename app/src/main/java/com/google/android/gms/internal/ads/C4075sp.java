package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.sp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4075sp extends AbstractC0813a {
    public static final Parcelable.Creator<C4075sp> CREATOR = new C4184tp();

    /* renamed from: o, reason: collision with root package name */
    public final String f26744o;

    /* renamed from: s, reason: collision with root package name */
    public final String f26745s;

    public C4075sp(String str, String str2) {
        this.f26744o = str;
        this.f26745s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f26744o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.s(parcel, 2, this.f26745s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
