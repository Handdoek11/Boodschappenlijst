package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5465a implements Parcelable {
    public static final Parcelable.Creator<C5465a> CREATOR = new C0233a();

    /* renamed from: o, reason: collision with root package name */
    private final n f31764o;

    /* renamed from: s, reason: collision with root package name */
    private final n f31765s;

    /* renamed from: t, reason: collision with root package name */
    private final c f31766t;

    /* renamed from: u, reason: collision with root package name */
    private n f31767u;

    /* renamed from: v, reason: collision with root package name */
    private final int f31768v;

    /* renamed from: w, reason: collision with root package name */
    private final int f31769w;

    /* renamed from: x, reason: collision with root package name */
    private final int f31770x;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0233a implements Parcelable.Creator {
        C0233a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5465a createFromParcel(Parcel parcel) {
            return new C5465a((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5465a[] newArray(int i8) {
            return new C5465a[i8];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f31771f = z.a(n.c(1900, 0).f31879w);

        /* renamed from: g, reason: collision with root package name */
        static final long f31772g = z.a(n.c(2100, 11).f31879w);

        /* renamed from: a, reason: collision with root package name */
        private long f31773a;

        /* renamed from: b, reason: collision with root package name */
        private long f31774b;

        /* renamed from: c, reason: collision with root package name */
        private Long f31775c;

        /* renamed from: d, reason: collision with root package name */
        private int f31776d;

        /* renamed from: e, reason: collision with root package name */
        private c f31777e;

        b(C5465a c5465a) {
            this.f31773a = f31771f;
            this.f31774b = f31772g;
            this.f31777e = g.a(Long.MIN_VALUE);
            this.f31773a = c5465a.f31764o.f31879w;
            this.f31774b = c5465a.f31765s.f31879w;
            this.f31775c = Long.valueOf(c5465a.f31767u.f31879w);
            this.f31776d = c5465a.f31768v;
            this.f31777e = c5465a.f31766t;
        }

        public C5465a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f31777e);
            n f8 = n.f(this.f31773a);
            n f9 = n.f(this.f31774b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l8 = this.f31775c;
            return new C5465a(f8, f9, cVar, l8 == null ? null : n.f(l8.longValue()), this.f31776d, null);
        }

        public b b(long j8) {
            this.f31775c = Long.valueOf(j8);
            return this;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        boolean c0(long j8);
    }

    /* synthetic */ C5465a(n nVar, n nVar2, c cVar, n nVar3, int i8, C0233a c0233a) {
        this(nVar, nVar2, cVar, nVar3, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5465a)) {
            return false;
        }
        C5465a c5465a = (C5465a) obj;
        return this.f31764o.equals(c5465a.f31764o) && this.f31765s.equals(c5465a.f31765s) && y0.d.a(this.f31767u, c5465a.f31767u) && this.f31768v == c5465a.f31768v && this.f31766t.equals(c5465a.f31766t);
    }

    public c f() {
        return this.f31766t;
    }

    n g() {
        return this.f31765s;
    }

    int h() {
        return this.f31768v;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31764o, this.f31765s, this.f31767u, Integer.valueOf(this.f31768v), this.f31766t});
    }

    int i() {
        return this.f31770x;
    }

    n j() {
        return this.f31767u;
    }

    n k() {
        return this.f31764o;
    }

    int l() {
        return this.f31769w;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f31764o, 0);
        parcel.writeParcelable(this.f31765s, 0);
        parcel.writeParcelable(this.f31767u, 0);
        parcel.writeParcelable(this.f31766t, 0);
        parcel.writeInt(this.f31768v);
    }

    private C5465a(n nVar, n nVar2, c cVar, n nVar3, int i8) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f31764o = nVar;
        this.f31765s = nVar2;
        this.f31767u = nVar3;
        this.f31768v = i8;
        this.f31766t = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i8 < 0 || i8 > z.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f31770x = nVar.q(nVar2) + 1;
        this.f31769w = (nVar2.f31876t - nVar.f31876t) + 1;
    }
}
