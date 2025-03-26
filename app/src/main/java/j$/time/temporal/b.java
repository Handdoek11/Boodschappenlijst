package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* renamed from: a, reason: collision with root package name */
    private final String f37169a;

    static {
        Duration duration = Duration.f36994c;
        Duration.n(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.f37169a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j8) {
        return mVar.e(j8, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37169a;
    }
}
