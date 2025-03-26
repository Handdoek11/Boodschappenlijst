package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final c f32658o;

    /* renamed from: s, reason: collision with root package name */
    private final c f32659s;

    /* renamed from: t, reason: collision with root package name */
    final int f32660t;

    /* renamed from: u, reason: collision with root package name */
    int f32661u;

    /* renamed from: v, reason: collision with root package name */
    int f32662v;

    /* renamed from: w, reason: collision with root package name */
    int f32663w;

    /* renamed from: x, reason: collision with root package name */
    int f32664x;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i8) {
            return new f[i8];
        }
    }

    public f(int i8, int i9, int i10, int i11) {
        this.f32661u = i8;
        this.f32662v = i9;
        this.f32663w = i10;
        this.f32660t = i11;
        this.f32664x = c(i8);
        this.f32658o = new c(59);
        this.f32659s = new c(i11 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i8) {
        return i8 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f32661u == fVar.f32661u && this.f32662v == fVar.f32662v && this.f32660t == fVar.f32660t && this.f32663w == fVar.f32663w;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32660t), Integer.valueOf(this.f32661u), Integer.valueOf(this.f32662v), Integer.valueOf(this.f32663w)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f32661u);
        parcel.writeInt(this.f32662v);
        parcel.writeInt(this.f32663w);
        parcel.writeInt(this.f32660t);
    }

    protected f(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
