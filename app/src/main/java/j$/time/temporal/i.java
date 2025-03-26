package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    private final String f37174a;

    static {
        Duration duration = Duration.f36994c;
    }

    i(String str) {
        this.f37174a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j8) {
        int i8 = c.f37170a[ordinal()];
        if (i8 == 1) {
            return mVar.d(j$.com.android.tools.r8.a.d(mVar.k(r0), j8), j.f37177c);
        }
        if (i8 == 2) {
            return mVar.e(j8 / 4, b.YEARS).e((j8 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37174a;
    }
}
