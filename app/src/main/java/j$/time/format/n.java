package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    private static final a f37112f = new a();

    /* renamed from: a, reason: collision with root package name */
    private n f37113a;

    /* renamed from: b, reason: collision with root package name */
    private final n f37114b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f37115c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37116d;

    /* renamed from: e, reason: collision with root package name */
    private int f37117e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f37175a;
        hashMap.put('Q', rVar);
        hashMap.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.l.f37182a);
    }

    public n() {
        this.f37113a = this;
        this.f37115c = new ArrayList();
        this.f37117e = -1;
        this.f37114b = null;
        this.f37116d = false;
    }

    private n(n nVar) {
        this.f37113a = this;
        this.f37115c = new ArrayList();
        this.f37117e = -1;
        this.f37114b = nVar;
        this.f37116d = true;
    }

    public final void q() {
        d(k.SENSITIVE);
    }

    public final void p() {
        d(k.INSENSITIVE);
    }

    public final void s() {
        d(k.STRICT);
    }

    public final void r() {
        d(k.LENIENT);
    }

    public final void k(j$.time.temporal.r rVar, int i8) {
        Objects.requireNonNull(rVar, "field");
        if (i8 < 1 || i8 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i8);
        }
        j(new i(rVar, i8, i8, u.NOT_NEGATIVE));
    }

    public final void l(j$.time.temporal.r rVar, int i8, int i9, u uVar) {
        if (i8 == i9 && uVar == u.NOT_NEGATIVE) {
            k(rVar, i9);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i8 < 1 || i8 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i8);
        }
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i9);
        }
        if (i9 < i8) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i9 + " < " + i8);
        }
        j(new i(rVar, i8, i9, uVar));
    }

    private void j(i iVar) {
        i b8;
        n nVar = this.f37113a;
        int i8 = nVar.f37117e;
        if (i8 >= 0) {
            i iVar2 = (i) nVar.f37115c.get(i8);
            int i9 = iVar.f37096b;
            int i10 = iVar.f37097c;
            if (i9 == i10 && iVar.f37098d == u.NOT_NEGATIVE) {
                b8 = iVar2.c(i10);
                d(iVar.b());
                this.f37113a.f37117e = i8;
            } else {
                b8 = iVar2.b();
                this.f37113a.f37117e = d(iVar);
            }
            this.f37113a.f37115c.set(i8, b8);
            return;
        }
        nVar.f37117e = d(iVar);
    }

    public final void b(j$.time.temporal.a aVar) {
        g gVar = new g(aVar, 0, 9, true, 0);
        Objects.requireNonNull(aVar, "field");
        if (aVar.j().g()) {
            d(gVar);
        } else {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
    }

    public final void i(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        v vVar = v.FULL;
        d(new m(aVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c() {
        d(new h());
    }

    public final void h() {
        d(j.f37101e);
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void m() {
        d(new l(1, f37112f));
    }

    public final void e(char c8) {
        d(new d(c8));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            d(new d(str.charAt(0)));
        } else {
            d(new l(0, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.e());
    }

    public final void o() {
        n nVar = this.f37113a;
        nVar.f37117e = -1;
        this.f37113a = new n(nVar);
    }

    public final void n() {
        n nVar = this.f37113a;
        if (nVar.f37114b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (nVar.f37115c.size() > 0) {
            n nVar2 = this.f37113a;
            e eVar = new e(nVar2.f37115c, nVar2.f37116d);
            this.f37113a = this.f37113a.f37114b;
            d(eVar);
            return;
        }
        this.f37113a = this.f37113a.f37114b;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f37113a;
        nVar.getClass();
        nVar.f37115c.add(fVar);
        this.f37113a.f37117e = -1;
        return r2.f37115c.size() - 1;
    }

    public final void v() {
        u(Locale.getDefault(), t.SMART, null);
    }

    final DateTimeFormatter t(t tVar, j$.time.chrono.u uVar) {
        return u(Locale.getDefault(), tVar, uVar);
    }

    private DateTimeFormatter u(Locale locale, t tVar, j$.time.chrono.u uVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f37113a.f37114b != null) {
            n();
        }
        e eVar = new e(this.f37115c, false);
        s sVar = s.f37126a;
        return new DateTimeFormatter(eVar, locale, tVar, uVar);
    }
}
