package v0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class j implements k {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f44064c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f44065d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f44066e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f44067f = i.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f44068a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44069b;

    j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f44068a = f44064c;
            this.f44069b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < localeArr.length; i8++) {
            Locale locale = localeArr[i8];
            if (locale == null) {
                throw new NullPointerException("list[" + i8 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                c(sb, locale2);
                if (i8 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f44068a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f44069b = sb.toString();
    }

    static void c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // v0.k
    public String a() {
        return this.f44069b;
    }

    @Override // v0.k
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f44068a;
        if (this.f44068a.length != localeArr.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            Locale[] localeArr2 = this.f44068a;
            if (i8 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i8].equals(localeArr[i8])) {
                return false;
            }
            i8++;
        }
    }

    @Override // v0.k
    public Locale get(int i8) {
        if (i8 >= 0) {
            Locale[] localeArr = this.f44068a;
            if (i8 < localeArr.length) {
                return localeArr[i8];
            }
        }
        return null;
    }

    public int hashCode() {
        int i8 = 1;
        for (Locale locale : this.f44068a) {
            i8 = (i8 * 31) + locale.hashCode();
        }
        return i8;
    }

    @Override // v0.k
    public boolean isEmpty() {
        return this.f44068a.length == 0;
    }

    @Override // v0.k
    public int size() {
        return this.f44068a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.f44068a;
            if (i8 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i8]);
            if (i8 < this.f44068a.length - 1) {
                sb.append(',');
            }
            i8++;
        }
    }
}
