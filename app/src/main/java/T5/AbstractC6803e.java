package t5;

import com.adadapted.android.sdk.core.ad.AdActionType;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: t5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6803e {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f43906a = t("\\p{InCombiningDiacriticalMarks}+");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f43907b = t("[\\p{Digit}\\p{Punct}$+<=>^`|~&&[^&]]+");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f43908c = t("\\p{Space}+");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f43909d = t("\\p{Digit}");

    /* renamed from: e, reason: collision with root package name */
    private static final Set f43910e = new HashSet(Arrays.asList("lb", "lbs", "pound", "pounds", "oz", "ounce", "ounces", "mg", "mgs", "milligram", "milligrams", "g", "gs", "gram", "grams", "kg", "kgs", "kilo", "kilos", "kilogram", "kilograms", "pt", "pts", "pint", "pints", "qt", "qts", "quart", "quarts", "gal", "gals", "gallon", "gallons", "ml", "mls", "milliliter", "milliliters", "millilitre", "millilitres", AdActionType.LINK, "liter", "liters", "litre", "litres", "t", "tbsp", "tablespoon", "tablespoons", "tsp", "teaspoon", "teaspoons", AdActionType.CONTENT, AdActionType.CONTENT_POPUP, "cup", "bu", "bushel", "bushels", "ea", "each", "x"));

    /* renamed from: f, reason: collision with root package name */
    private static final Set f43911f = new HashSet(Arrays.asList("mg", "mgs", "milligram", "milligrams", "g", "gs", "gram", "grams", "kg", "kgs", "kilo", "kilos", "kilogram", "kilograms", "ml", "mls", "milliliter", "milliliters", "millilitre", "millilitres", AdActionType.LINK, "liter", "liters", "litre", "litres", "x"));

    /* renamed from: g, reason: collision with root package name */
    private static final Map f43912g;

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f43913h;

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f43914i;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f43915j;

    /* renamed from: k, reason: collision with root package name */
    private static final c[] f43916k;

    /* renamed from: t5.e$a */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f43917a;

        a(StringBuilder sb) {
            this.f43917a = sb;
        }

        @Override // t5.AbstractC6803e.b
        public void a(String str) {
            this.f43917a.append(str);
        }

        @Override // t5.AbstractC6803e.b
        public void b(String str) {
            this.f43917a.append(str);
        }
    }

    /* renamed from: t5.e$b */
    public interface b {
        void a(String str);

        void b(String str);
    }

    /* renamed from: t5.e$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f43918a;

        public c(String str, int i8) {
            this.f43918a = Pattern.compile(str, i8);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f43912g = hashMap;
        hashMap.put(Locale.ENGLISH.getLanguage(), "and");
        hashMap.put(Locale.FRENCH.getLanguage(), "et");
        hashMap.put(new Locale("sp").getLanguage(), "y");
        hashMap.put(Locale.ITALIAN.getLanguage(), AdActionType.EXTERNAL_LINK);
        hashMap.put(Locale.GERMAN.getLanguage(), "und");
        hashMap.put(new Locale("sv").getLanguage(), "och");
        hashMap.put(new Locale("da").getLanguage(), "og");
        hashMap.put(new Locale("nl").getLanguage(), "en");
        hashMap.put(new Locale("no").getLanguage(), "og");
        hashMap.put(new Locale("nb").getLanguage(), "og");
        f43913h = t("[$£€]\\d+(?:\\.\\d{2})?");
        f43914i = t("\\d+(?:[,.]\\d{1,2})?€");
        f43915j = t("[\\p{Punct}$+<=>^`|~£€]+");
        f43916k = new c[]{new c("\\b(suck\\s+dick|fucks?|shits?|piss|cocksuckers?|motherfuckers?|cunts?|tits)\\b", 2)};
    }

    public static String A(String str) {
        if (str == null) {
            return null;
        }
        return f43906a.matcher(Normalizer.normalize(str, Normalizer.Form.NFD)).replaceAll("");
    }

    public static String a(String str, int i8) {
        C6800b y7 = y(str);
        return b((String) y7.f43899a, ((Integer) y7.f43900b).intValue() + i8);
    }

    private static String b(String str, int i8) {
        if (i8 <= 1) {
            return str;
        }
        return str + " (" + i8 + ")";
    }

    public static boolean c(String str, String str2) {
        return w(str).equals(w(str2));
    }

    public static String d(String str, Locale locale) {
        return f43908c.matcher(f43907b.matcher(A(locale == null ? str.toLowerCase(Locale.US) : str.toLowerCase(locale))).replaceAll(" ")).replaceAll(" ").trim();
    }

    public static String e(String str, Locale locale) {
        String trim = f43908c.matcher(f43907b.matcher(k(u5.e.e(str).toLowerCase(locale))).replaceAll(" ")).replaceAll(" ").trim();
        Set set = "en".equals(locale.getLanguage()) ? f43910e : f43911f;
        String[] split = trim.split(" ");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!set.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return q(" ", arrayList);
    }

    public static String f(String str, Locale locale) {
        if (o(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase(locale);
        int length = lowerCase.length();
        int[] iArr = new int[length];
        boolean z7 = true;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int codePointAt = lowerCase.codePointAt(i8);
            if (codePointAt == 32) {
                iArr[i9] = codePointAt;
                i9++;
                z7 = true;
            } else if (z7) {
                String upperCase = new String(new int[]{codePointAt}, 0, 1).toUpperCase(locale);
                if (!upperCase.isEmpty()) {
                    iArr[i9] = upperCase.codePointAt(0);
                    i9++;
                }
                z7 = false;
            } else {
                iArr[i9] = codePointAt;
                i9++;
            }
            i8 += Character.charCount(codePointAt);
        }
        return new String(iArr, 0, i9);
    }

    public static String g(String str, Locale locale) {
        if (o(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase(locale) + str.substring(1);
    }

    public static boolean h(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (Character.isWhitespace(str.charAt(i8))) {
                return true;
            }
        }
        return false;
    }

    public static String i(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String j(String str) {
        String trim = w(str).trim();
        if (!trim.endsWith("@gmail.con")) {
            return trim;
        }
        return trim.substring(0, trim.length() - 1) + "m";
    }

    public static String k(String str) {
        return (String) y(str).f43899a;
    }

    public static int l(String str) {
        return ((Integer) y(str).f43900b).intValue();
    }

    public static String m(String str) {
        int indexOf = str.indexOf(45);
        return indexOf >= 0 ? str.substring(0, indexOf) : str;
    }

    public static boolean n(String str) {
        int lastIndexOf;
        if (o(str) || (lastIndexOf = str.lastIndexOf(64)) < 0 || str.indexOf(44) >= 0) {
            return false;
        }
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        if (substring.length() == 0 || Character.isWhitespace(substring.charAt(substring.length() - 1)) || substring2.length() == 0 || h(substring2)) {
            return false;
        }
        int i8 = 0;
        boolean z7 = false;
        while (true) {
            int indexOf = substring2.indexOf(46, i8);
            if (indexOf < 0) {
                return z7;
            }
            if (indexOf == 0 || indexOf == substring2.length() - 1 || substring2.charAt(indexOf - 1) == '.') {
                return false;
            }
            i8 = indexOf + 1;
            z7 = true;
        }
        return false;
    }

    public static boolean o(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean p(String str, String str2) {
        if (str.isEmpty() != str2.isEmpty()) {
            return false;
        }
        return u(str2).equalsIgnoreCase(u(str));
    }

    public static String q(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : iterable) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    public static String r(List list, Locale locale) {
        StringBuilder sb = new StringBuilder();
        s(new a(sb), list, locale);
        return sb.toString();
    }

    public static void s(b bVar, List list, Locale locale) {
        int size = list.size();
        String str = (String) f43912g.get(locale.getLanguage());
        if (str == null) {
            str = "and";
        }
        boolean equals = locale.equals(Locale.US);
        for (int i8 = 0; i8 < size; i8++) {
            bVar.b(list.get(i8).toString());
            int i9 = size - 2;
            if (i8 < i9) {
                bVar.a(", ");
            } else if (i8 == i9) {
                if (size > 2 && equals) {
                    bVar.a(",");
                }
                bVar.a(" ");
                bVar.a(str);
                bVar.a(" ");
            }
        }
    }

    private static Pattern t(String str) {
        try {
            return Pattern.compile(str, 256);
        } catch (IllegalArgumentException unused) {
            return Pattern.compile(str);
        }
    }

    private static String u(String str) {
        return f43915j.matcher(f43914i.matcher(f43913h.matcher(f43908c.matcher(str).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll("");
    }

    public static String v(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String w(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static int x(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 10);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static C6800b y(String str) {
        String trim = str == null ? "" : str.trim();
        if (trim.length() < 3 || trim.charAt(trim.length() - 1) != ')') {
            return new C6800b(trim, 1);
        }
        int length = trim.length() - 2;
        while (true) {
            if (length < 0) {
                break;
            }
            char charAt = trim.charAt(length);
            if (Character.isDigit(charAt)) {
                length--;
            } else if (charAt == '(' && length > 0) {
                String trim2 = trim.substring(0, length).trim();
                if (trim2.length() > 0) {
                    return new C6800b(trim2, Integer.valueOf(x(trim.substring(length + 1, trim.length() - 1))));
                }
            }
        }
        return new C6800b(trim, 1);
    }

    public static String z(String str, int i8) {
        return b(k(str), i8);
    }
}
