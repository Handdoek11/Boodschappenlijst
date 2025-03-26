package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e implements j$.time.temporal.o, j$.time.temporal.p {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    /* renamed from: a, reason: collision with root package name */
    private static final e[] f37077a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ e[] f37078b;

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f37078b.clone();
    }

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        f37078b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f37077a = values();
    }

    public static e C(int i8) {
        if (i8 < 1 || i8 > 7) {
            throw new c("Invalid value for DayOfWeek: " + i8);
        }
        return f37077a[i8 - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.DAY_OF_WEEK : rVar != null && rVar.m(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return rVar.j();
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.k(this);
    }

    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
