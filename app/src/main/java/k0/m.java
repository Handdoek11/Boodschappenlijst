package k0;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f38444h;

    /* renamed from: c, reason: collision with root package name */
    p f38447c;

    /* renamed from: d, reason: collision with root package name */
    p f38448d;

    /* renamed from: f, reason: collision with root package name */
    int f38450f;

    /* renamed from: g, reason: collision with root package name */
    int f38451g;

    /* renamed from: a, reason: collision with root package name */
    public int f38445a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38446b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f38449e = new ArrayList();

    m(p pVar, int i8) {
        this.f38447c = null;
        this.f38448d = null;
        int i9 = f38444h;
        this.f38450f = i9;
        f38444h = i9 + 1;
        this.f38447c = pVar;
        this.f38448d = pVar;
        this.f38451g = i8;
    }

    private long c(C6091f c6091f, long j8) {
        p pVar = c6091f.f38420d;
        if (pVar instanceof k) {
            return j8;
        }
        int size = c6091f.f38427k.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC6089d interfaceC6089d = (InterfaceC6089d) c6091f.f38427k.get(i8);
            if (interfaceC6089d instanceof C6091f) {
                C6091f c6091f2 = (C6091f) interfaceC6089d;
                if (c6091f2.f38420d != pVar) {
                    j9 = Math.min(j9, c(c6091f2, c6091f2.f38422f + j8));
                }
            }
        }
        if (c6091f != pVar.f38477i) {
            return j9;
        }
        long j10 = j8 - pVar.j();
        return Math.min(Math.min(j9, c(pVar.f38476h, j10)), j10 - pVar.f38476h.f38422f);
    }

    private long d(C6091f c6091f, long j8) {
        p pVar = c6091f.f38420d;
        if (pVar instanceof k) {
            return j8;
        }
        int size = c6091f.f38427k.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC6089d interfaceC6089d = (InterfaceC6089d) c6091f.f38427k.get(i8);
            if (interfaceC6089d instanceof C6091f) {
                C6091f c6091f2 = (C6091f) interfaceC6089d;
                if (c6091f2.f38420d != pVar) {
                    j9 = Math.max(j9, d(c6091f2, c6091f2.f38422f + j8));
                }
            }
        }
        if (c6091f != pVar.f38476h) {
            return j9;
        }
        long j10 = j8 + pVar.j();
        return Math.max(Math.max(j9, d(pVar.f38477i, j10)), j10 - pVar.f38477i.f38422f);
    }

    public void a(p pVar) {
        this.f38449e.add(pVar);
        this.f38448d = pVar;
    }

    public long b(j0.f fVar, int i8) {
        long j8;
        int i9;
        p pVar = this.f38447c;
        if (pVar instanceof C6088c) {
            if (((C6088c) pVar).f38474f != i8) {
                return 0L;
            }
        } else if (i8 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        C6091f c6091f = (i8 == 0 ? fVar.f37950e : fVar.f37952f).f38476h;
        C6091f c6091f2 = (i8 == 0 ? fVar.f37950e : fVar.f37952f).f38477i;
        boolean contains = pVar.f38476h.f38428l.contains(c6091f);
        boolean contains2 = this.f38447c.f38477i.f38428l.contains(c6091f2);
        long j9 = this.f38447c.j();
        if (contains && contains2) {
            long d8 = d(this.f38447c.f38476h, 0L);
            long c8 = c(this.f38447c.f38477i, 0L);
            long j10 = d8 - j9;
            p pVar2 = this.f38447c;
            int i10 = pVar2.f38477i.f38422f;
            if (j10 >= (-i10)) {
                j10 += i10;
            }
            int i11 = pVar2.f38476h.f38422f;
            long j11 = ((-c8) - j9) - i11;
            if (j11 >= i11) {
                j11 -= i11;
            }
            float q8 = pVar2.f38470b.q(i8);
            float f8 = q8 > 0.0f ? (long) ((j11 / q8) + (j10 / (1.0f - q8))) : 0L;
            long j12 = ((long) ((f8 * q8) + 0.5f)) + j9 + ((long) ((f8 * (1.0f - q8)) + 0.5f));
            j8 = r12.f38476h.f38422f + j12;
            i9 = this.f38447c.f38477i.f38422f;
        } else {
            if (contains) {
                return Math.max(d(this.f38447c.f38476h, r12.f38422f), this.f38447c.f38476h.f38422f + j9);
            }
            if (contains2) {
                return Math.max(-c(this.f38447c.f38477i, r12.f38422f), (-this.f38447c.f38477i.f38422f) + j9);
            }
            j8 = r12.f38476h.f38422f + this.f38447c.j();
            i9 = this.f38447c.f38477i.f38422f;
        }
        return j8 - i9;
    }
}
