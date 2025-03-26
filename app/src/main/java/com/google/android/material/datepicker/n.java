package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class n implements Comparable, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final Calendar f31874o;

    /* renamed from: s, reason: collision with root package name */
    final int f31875s;

    /* renamed from: t, reason: collision with root package name */
    final int f31876t;

    /* renamed from: u, reason: collision with root package name */
    final int f31877u;

    /* renamed from: v, reason: collision with root package name */
    final int f31878v;

    /* renamed from: w, reason: collision with root package name */
    final long f31879w;

    /* renamed from: x, reason: collision with root package name */
    private String f31880x;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return n.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i8) {
            return new n[i8];
        }
    }

    private n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c8 = z.c(calendar);
        this.f31874o = c8;
        this.f31875s = c8.get(2);
        this.f31876t = c8.get(1);
        this.f31877u = c8.getMaximum(7);
        this.f31878v = c8.getActualMaximum(5);
        this.f31879w = c8.getTimeInMillis();
    }

    static n c(int i8, int i9) {
        Calendar k8 = z.k();
        k8.set(1, i8);
        k8.set(2, i9);
        return new n(k8);
    }

    static n f(long j8) {
        Calendar k8 = z.k();
        k8.setTimeInMillis(j8);
        return new n(k8);
    }

    static n g() {
        return new n(z.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f31874o.compareTo(nVar.f31874o);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f31875s == nVar.f31875s && this.f31876t == nVar.f31876t;
    }

    int h(int i8) {
        int i9 = this.f31874o.get(7);
        if (i8 <= 0) {
            i8 = this.f31874o.getFirstDayOfWeek();
        }
        int i10 = i9 - i8;
        return i10 < 0 ? i10 + this.f31877u : i10;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f31875s), Integer.valueOf(this.f31876t)});
    }

    long i(int i8) {
        Calendar c8 = z.c(this.f31874o);
        c8.set(5, i8);
        return c8.getTimeInMillis();
    }

    int k(long j8) {
        Calendar c8 = z.c(this.f31874o);
        c8.setTimeInMillis(j8);
        return c8.get(5);
    }

    String l() {
        if (this.f31880x == null) {
            this.f31880x = f.f(this.f31874o.getTimeInMillis());
        }
        return this.f31880x;
    }

    long m() {
        return this.f31874o.getTimeInMillis();
    }

    n p(int i8) {
        Calendar c8 = z.c(this.f31874o);
        c8.add(2, i8);
        return new n(c8);
    }

    int q(n nVar) {
        if (this.f31874o instanceof GregorianCalendar) {
            return ((nVar.f31876t - this.f31876t) * 12) + (nVar.f31875s - this.f31875s);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f31876t);
        parcel.writeInt(this.f31875s);
    }
}
