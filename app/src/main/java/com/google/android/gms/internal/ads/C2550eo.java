package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2550eo extends AbstractC0813a {
    public static final Parcelable.Creator<C2550eo> CREATOR = new C2659fo();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f21893o;

    /* renamed from: s, reason: collision with root package name */
    public final List f21894s;

    public C2550eo(boolean z7, List list) {
        this.f21893o = z7;
        this.f21894s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f21893o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 2, z7);
        AbstractC0814b.u(parcel, 3, this.f21894s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
