package j$.time.temporal;

import j$.time.chrono.AbstractC5889i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f37171a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f37172b;

    @Override // j$.time.temporal.r
    public final boolean v() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f37172b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.DAY_OF_YEAR) && oVar.f(a.MONTH_OF_YEAR) && oVar.f(a.YEAR)) {
                    r rVar = j.f37175a;
                    if (AbstractC5889i.p(oVar).equals(j$.time.chrono.u.f37068d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long s8 = oVar.s(h.QUARTER_OF_YEAR);
                if (s8 == 1) {
                    long s9 = oVar.s(a.YEAR);
                    j$.time.chrono.u.f37068d.getClass();
                    return j$.time.chrono.u.m(s9) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (s8 == 2) {
                    return w.j(1L, 91L);
                }
                if (s8 == 3 || s8 == 4) {
                    return w.j(1L, 92L);
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                int k8 = oVar.k(a.DAY_OF_YEAR);
                int k9 = oVar.k(a.MONTH_OF_YEAR);
                long s8 = oVar.s(a.YEAR);
                int[] iArr = h.f37171a;
                int i8 = (k9 - 1) / 3;
                j$.time.chrono.u.f37068d.getClass();
                return k8 - iArr[i8 + (j$.time.chrono.u.m(s8) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j8) {
                long k8 = k(mVar);
                j().b(j8, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.d((j8 - k8) + mVar.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w j() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.MONTH_OF_YEAR)) {
                    r rVar = j.f37175a;
                    if (AbstractC5889i.p(oVar).equals(j$.time.chrono.u.f37068d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return (oVar.s(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j8) {
                long k8 = k(mVar);
                j().b(j8, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.d(((j8 - k8) * 3) + mVar.s(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w j() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f37175a;
                    if (AbstractC5889i.p(oVar).equals(j$.time.chrono.u.f37068d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.F(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.C(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j8) {
                j().b(j8, this);
                return mVar.e(j$.com.android.tools.r8.a.k(j8, k(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w j() {
                return a.YEAR.j();
            }

            @Override // j$.time.temporal.r
            public final boolean m(o oVar) {
                if (oVar.f(a.EPOCH_DAY)) {
                    r rVar = j.f37175a;
                    if (AbstractC5889i.p(oVar).equals(j$.time.chrono.u.f37068d)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // j$.time.temporal.r
            public final long k(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return h.G(j$.time.h.E(oVar));
            }

            @Override // j$.time.temporal.r
            public final w s(o oVar) {
                if (!m(oVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return j();
            }

            @Override // j$.time.temporal.r
            public final m n(m mVar, long j8) {
                if (!m(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int a8 = a.YEAR.j().a(j8, h.WEEK_BASED_YEAR);
                j$.time.h E7 = j$.time.h.E(mVar);
                int k8 = E7.k(a.DAY_OF_WEEK);
                int C7 = h.C(E7);
                if (C7 == 53 && h.H(a8) == 52) {
                    C7 = 52;
                }
                return mVar.m(j$.time.h.N(a8, 1, 4).R(((C7 - 1) * 7) + (k8 - r6.k(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f37172b = new h[]{hVar, hVar2, hVar3, hVar4};
        f37171a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w F(j$.time.h hVar) {
        return w.j(1L, H(G(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(int i8) {
        j$.time.h N7 = j$.time.h.N(i8, 1, 1);
        if (N7.G() != j$.time.e.THURSDAY) {
            return (N7.G() == j$.time.e.WEDNESDAY && N7.L()) ? 53 : 52;
        }
        return 53;
    }

    static int C(j$.time.h hVar) {
        int ordinal = hVar.G().ordinal();
        int i8 = 1;
        int H7 = hVar.H() - 1;
        int i9 = (3 - ordinal) + H7;
        int i10 = i9 - ((i9 / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (H7 < i11) {
            return (int) w.j(1L, H(G(hVar.X(180).T(-1L)))).d();
        }
        int i12 = ((H7 - i11) / 7) + 1;
        if (i12 != 53 || i11 == -3 || (i11 == -2 && hVar.L())) {
            i8 = i12;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(j$.time.h hVar) {
        int J7 = hVar.J();
        int H7 = hVar.H();
        if (H7 <= 3) {
            return H7 - hVar.G().ordinal() < -2 ? J7 - 1 : J7;
        }
        if (H7 >= 363) {
            return ((H7 - 363) - (hVar.L() ? 1 : 0)) - hVar.G().ordinal() >= 0 ? J7 + 1 : J7;
        }
        return J7;
    }
}
