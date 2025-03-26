package com.google.firebase.messaging;

import a3.AbstractC0813a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class S extends AbstractC0813a {
    public static final Parcelable.Creator<S> CREATOR = new T();

    /* renamed from: o, reason: collision with root package name */
    Bundle f32887o;

    public S(Bundle bundle) {
        this.f32887o = bundle;
    }

    public String A0() {
        return this.f32887o.getString("collapse_key");
    }

    public String B0() {
        return this.f32887o.getString("from");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        T.c(this, parcel, i8);
    }
}
