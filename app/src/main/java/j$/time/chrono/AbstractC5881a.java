package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5881a implements n {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f37032a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f37033b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f37034c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i().compareTo(((n) obj).i());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static n k(AbstractC5881a abstractC5881a, String str) {
        String r8;
        n nVar = (n) f37032a.putIfAbsent(str, abstractC5881a);
        if (nVar == null && (r8 = abstractC5881a.r()) != null) {
            f37033b.putIfAbsent(r8, abstractC5881a);
        }
        return nVar;
    }

    static n j(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f37032a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) f37033b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(n.class).iterator();
                while (it.hasNext()) {
                    n nVar2 = (n) it.next();
                    if (str.equals(nVar2.i()) || str.equals(nVar2.r())) {
                        return nVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: " + str);
            }
            q qVar = q.f37050o;
            k(qVar, qVar.i());
            x xVar = x.f37071d;
            k(xVar, xVar.i());
            C c8 = C.f37021d;
            k(c8, c8.i());
            I i8 = I.f37028d;
            k(i8, i8.i());
            try {
                for (AbstractC5881a abstractC5881a : Arrays.asList(new AbstractC5881a[0])) {
                    if (!abstractC5881a.i().equals("ISO")) {
                        k(abstractC5881a, abstractC5881a.i());
                    }
                }
                u uVar = u.f37068d;
                k(uVar, uVar.i());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    protected AbstractC5881a() {
    }

    @Override // j$.time.chrono.n
    public InterfaceC5885e o(LocalDateTime localDateTime) {
        try {
            return l(localDateTime).u(j$.time.k.E(localDateTime));
        } catch (j$.time.c e8) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e8);
        }
    }

    @Override // j$.time.chrono.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC5881a) && i().compareTo(((AbstractC5881a) obj).i()) == 0;
    }

    @Override // j$.time.chrono.n
    public final int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    @Override // j$.time.chrono.n
    public final String toString() {
        return i();
    }
}
