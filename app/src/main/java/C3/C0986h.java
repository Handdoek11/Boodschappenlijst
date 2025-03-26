package c3;

import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0986h extends AbstractC0813a {
    public static final Parcelable.Creator<C0986h> CREATOR = new C0991m();

    /* renamed from: o, reason: collision with root package name */
    private final int f12122o;

    /* renamed from: s, reason: collision with root package name */
    private final int f12123s;

    /* renamed from: t, reason: collision with root package name */
    private final Long f12124t;

    /* renamed from: u, reason: collision with root package name */
    private final Long f12125u;

    /* renamed from: v, reason: collision with root package name */
    private final int f12126v;

    /* renamed from: w, reason: collision with root package name */
    private final a f12127w;

    /* renamed from: c3.h$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f12128a;

        /* renamed from: b, reason: collision with root package name */
        private final long f12129b;

        a(long j8, long j9) {
            r.o(j9);
            this.f12128a = j8;
            this.f12129b = j9;
        }

        public long a() {
            return this.f12128a;
        }

        public long b() {
            return this.f12129b;
        }
    }

    public C0986h(int i8, int i9, Long l8, Long l9, int i10) {
        this.f12122o = i8;
        this.f12123s = i9;
        this.f12124t = l8;
        this.f12125u = l9;
        this.f12126v = i10;
        this.f12127w = (l8 == null || l9 == null || l9.longValue() == 0) ? null : new a(l8.longValue(), l9.longValue());
    }

    public int A0() {
        return this.f12126v;
    }

    public int B0() {
        return this.f12123s;
    }

    public a C0() {
        return this.f12127w;
    }

    public int D0() {
        return this.f12122o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, D0());
        AbstractC0814b.m(parcel, 2, B0());
        AbstractC0814b.q(parcel, 3, this.f12124t, false);
        AbstractC0814b.q(parcel, 4, this.f12125u, false);
        AbstractC0814b.m(parcel, 5, A0());
        AbstractC0814b.b(parcel, a8);
    }
}
