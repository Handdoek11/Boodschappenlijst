package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.M1;
import com.google.android.gms.internal.measurement.O1;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5291b {

    /* renamed from: a, reason: collision with root package name */
    String f30825a;

    /* renamed from: b, reason: collision with root package name */
    int f30826b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f30827c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f30828d;

    /* renamed from: e, reason: collision with root package name */
    Long f30829e;

    /* renamed from: f, reason: collision with root package name */
    Long f30830f;

    AbstractC5291b(String str, int i8) {
        this.f30825a = str;
        this.f30826b = i8;
    }

    static Boolean b(double d8, com.google.android.gms.internal.measurement.M1 m12) {
        try {
            return h(new BigDecimal(d8), m12, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j8, com.google.android.gms.internal.measurement.M1 m12) {
        try {
            return h(new BigDecimal(j8), m12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean d(Boolean bool, boolean z7) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z7);
    }

    static Boolean e(String str, com.google.android.gms.internal.measurement.M1 m12) {
        if (!Z5.e0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), m12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, O1.b bVar, boolean z7, String str2, List list, String str3, C5378n2 c5378n2) {
        if (str == null) {
            return null;
        }
        if (bVar == O1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z7 && bVar != O1.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (k6.f31055a[bVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c5378n2 != null) {
                            c5378n2.J().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean g(String str, com.google.android.gms.internal.measurement.O1 o12, C5378n2 c5378n2) {
        List list;
        Z2.r.l(o12);
        if (str == null || !o12.O() || o12.G() == O1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        O1.b G7 = o12.G();
        O1.b bVar = O1.b.IN_LIST;
        if (G7 == bVar) {
            if (o12.k() == 0) {
                return null;
            }
        } else if (!o12.N()) {
            return null;
        }
        O1.b G8 = o12.G();
        boolean L7 = o12.L();
        String J7 = (L7 || G8 == O1.b.REGEXP || G8 == bVar) ? o12.J() : o12.J().toUpperCase(Locale.ENGLISH);
        if (o12.k() == 0) {
            list = null;
        } else {
            List K7 = o12.K();
            if (!L7) {
                ArrayList arrayList = new ArrayList(K7.size());
                Iterator it = K7.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                K7 = DesugarCollections.unmodifiableList(arrayList);
            }
            list = K7;
        }
        return f(str, G8, L7, J7, list, G8 == O1.b.REGEXP ? J7 : null, c5378n2);
    }

    private static Boolean h(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.M1 m12, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Z2.r.l(m12);
        if (m12.N() && m12.G() != M1.b.UNKNOWN_COMPARISON_TYPE) {
            M1.b G7 = m12.G();
            M1.b bVar = M1.b.BETWEEN;
            if (G7 == bVar) {
                if (!m12.R() || !m12.Q()) {
                    return null;
                }
            } else if (!m12.O()) {
                return null;
            }
            M1.b G8 = m12.G();
            if (m12.G() == bVar) {
                if (Z5.e0(m12.L()) && Z5.e0(m12.K())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(m12.L());
                        bigDecimal4 = new BigDecimal(m12.K());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!Z5.e0(m12.J())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(m12.J());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (G8 == bVar) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i8 = k6.f31056b[G8.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4 || bigDecimal3 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                            r2 = true;
                        }
                        return Boolean.valueOf(r2);
                    }
                    if (bigDecimal2 != null) {
                        if (d8 == 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) < 0) {
                            r2 = true;
                        }
                        return Boolean.valueOf(r2);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
            } else if (bigDecimal2 != null) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}
