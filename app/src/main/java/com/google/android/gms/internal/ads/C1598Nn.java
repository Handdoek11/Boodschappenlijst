package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598Nn extends AbstractC0813a {
    public static final Parcelable.Creator<C1598Nn> CREATOR = new C1633On();

    /* renamed from: o, reason: collision with root package name */
    public final View f17594o;

    /* renamed from: s, reason: collision with root package name */
    public final Map f17595s;

    public C1598Nn(IBinder iBinder, IBinder iBinder2) {
        this.f17594o = (View) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder));
        this.f17595s = (Map) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        View view = this.f17594o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.l(parcel, 1, BinderC5853b.p2(view).asBinder(), false);
        AbstractC0814b.l(parcel, 2, BinderC5853b.p2(this.f17595s).asBinder(), false);
        AbstractC0814b.b(parcel, a8);
    }
}
