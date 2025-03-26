package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C5465a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class g implements C5465a.c {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final long f31792o;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i8) {
            return new g[i8];
        }
    }

    /* synthetic */ g(long j8, a aVar) {
        this(j8);
    }

    public static g a(long j8) {
        return new g(j8);
    }

    @Override // com.google.android.material.datepicker.C5465a.c
    public boolean c0(long j8) {
        return j8 >= this.f31792o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f31792o == ((g) obj).f31792o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31792o)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.f31792o);
    }

    private g(long j8) {
        this.f31792o = j8;
    }
}
