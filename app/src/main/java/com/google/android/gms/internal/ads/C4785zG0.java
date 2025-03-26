package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.zG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4785zG0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<C4785zG0> CREATOR = new LE0();

    /* renamed from: o, reason: collision with root package name */
    private final VF0[] f28571o;

    /* renamed from: s, reason: collision with root package name */
    private int f28572s;

    /* renamed from: t, reason: collision with root package name */
    public final String f28573t;

    /* renamed from: u, reason: collision with root package name */
    public final int f28574u;

    C4785zG0(Parcel parcel) {
        this.f28573t = parcel.readString();
        VF0[] vf0Arr = (VF0[]) parcel.createTypedArray(VF0.CREATOR);
        int i8 = AbstractC2301cW.f21206a;
        this.f28571o = vf0Arr;
        this.f28574u = vf0Arr.length;
    }

    public final VF0 a(int i8) {
        return this.f28571o[i8];
    }

    public final C4785zG0 b(String str) {
        return Objects.equals(this.f28573t, str) ? this : new C4785zG0(str, false, this.f28571o);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        VF0 vf0 = (VF0) obj;
        VF0 vf02 = (VF0) obj2;
        UUID uuid = Lv0.f17164a;
        return uuid.equals(vf0.f19571s) ? !uuid.equals(vf02.f19571s) ? 1 : 0 : vf0.f19571s.compareTo(vf02.f19571s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4785zG0.class == obj.getClass()) {
            C4785zG0 c4785zG0 = (C4785zG0) obj;
            if (Objects.equals(this.f28573t, c4785zG0.f28573t) && Arrays.equals(this.f28571o, c4785zG0.f28571o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f28572s;
        if (i8 != 0) {
            return i8;
        }
        String str = this.f28573t;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f28571o);
        this.f28572s = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f28573t);
        parcel.writeTypedArray(this.f28571o, 0);
    }

    private C4785zG0(String str, boolean z7, VF0... vf0Arr) {
        this.f28573t = str;
        vf0Arr = z7 ? (VF0[]) vf0Arr.clone() : vf0Arr;
        this.f28571o = vf0Arr;
        this.f28574u = vf0Arr.length;
        Arrays.sort(vf0Arr, this);
    }

    public C4785zG0(String str, VF0... vf0Arr) {
        this(null, true, vf0Arr);
    }

    public C4785zG0(List list) {
        this(null, false, (VF0[]) list.toArray(new VF0[0]));
    }
}
