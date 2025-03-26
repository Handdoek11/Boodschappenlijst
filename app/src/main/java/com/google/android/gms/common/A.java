package com.google.android.gms.common;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class A extends AbstractC0813a {
    public static final Parcelable.Creator<A> CREATOR = new B();

    /* renamed from: o, reason: collision with root package name */
    private final String f13184o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f13185s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f13186t;

    /* renamed from: u, reason: collision with root package name */
    private final Context f13187u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f13188v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f13189w;

    A(String str, boolean z7, boolean z8, IBinder iBinder, boolean z9, boolean z10) {
        this.f13184o = str;
        this.f13185s = z7;
        this.f13186t = z8;
        this.f13187u = (Context) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder));
        this.f13188v = z9;
        this.f13189w = z10;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, i3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f13184o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.c(parcel, 2, this.f13185s);
        AbstractC0814b.c(parcel, 3, this.f13186t);
        AbstractC0814b.l(parcel, 4, BinderC5853b.p2(this.f13187u), false);
        AbstractC0814b.c(parcel, 5, this.f13188v);
        AbstractC0814b.c(parcel, 6, this.f13189w);
        AbstractC0814b.b(parcel, a8);
    }
}
