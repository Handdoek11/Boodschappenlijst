package x0;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6897a {

    /* renamed from: d, reason: collision with root package name */
    static final n f44384d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f44385e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f44386f;

    /* renamed from: g, reason: collision with root package name */
    static final C6897a f44387g;

    /* renamed from: h, reason: collision with root package name */
    static final C6897a f44388h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44389a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44390b;

    /* renamed from: c, reason: collision with root package name */
    private final n f44391c;

    /* renamed from: x0.a$a, reason: collision with other inner class name */
    public static final class C0346a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44392a;

        /* renamed from: b, reason: collision with root package name */
        private int f44393b;

        /* renamed from: c, reason: collision with root package name */
        private n f44394c;

        public C0346a() {
            c(C6897a.e(Locale.getDefault()));
        }

        private static C6897a b(boolean z7) {
            return z7 ? C6897a.f44388h : C6897a.f44387g;
        }

        private void c(boolean z7) {
            this.f44392a = z7;
            this.f44394c = C6897a.f44384d;
            this.f44393b = 2;
        }

        public C6897a a() {
            return (this.f44393b == 2 && this.f44394c == C6897a.f44384d) ? b(this.f44392a) : new C6897a(this.f44392a, this.f44393b, this.f44394c);
        }
    }

    /* renamed from: x0.a$b */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f44395f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f44396a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f44397b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44398c;

        /* renamed from: d, reason: collision with root package name */
        private int f44399d;

        /* renamed from: e, reason: collision with root package name */
        private char f44400e;

        static {
            for (int i8 = 0; i8 < 1792; i8++) {
                f44395f[i8] = Character.getDirectionality(i8);
            }
        }

        b(CharSequence charSequence, boolean z7) {
            this.f44396a = charSequence;
            this.f44397b = z7;
            this.f44398c = charSequence.length();
        }

        private static byte c(char c8) {
            return c8 < 1792 ? f44395f[c8] : Character.getDirectionality(c8);
        }

        private byte f() {
            char charAt;
            int i8 = this.f44399d;
            do {
                int i9 = this.f44399d;
                if (i9 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f44396a;
                int i10 = i9 - 1;
                this.f44399d = i10;
                charAt = charSequence.charAt(i10);
                this.f44400e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f44399d = i8;
            this.f44400e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i8 = this.f44399d;
                if (i8 >= this.f44398c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f44396a;
                this.f44399d = i8 + 1;
                charAt = charSequence.charAt(i8);
                this.f44400e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i8 = this.f44399d;
            while (true) {
                int i9 = this.f44399d;
                if (i9 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f44396a;
                int i10 = i9 - 1;
                this.f44399d = i10;
                char charAt2 = charSequence.charAt(i10);
                this.f44400e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i11 = this.f44399d;
                        if (i11 > 0) {
                            CharSequence charSequence2 = this.f44396a;
                            int i12 = i11 - 1;
                            this.f44399d = i12;
                            charAt = charSequence2.charAt(i12);
                            this.f44400e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f44399d = i8;
            this.f44400e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i8 = this.f44399d;
            while (true) {
                int i9 = this.f44399d;
                if (i9 >= this.f44398c) {
                    this.f44399d = i8;
                    this.f44400e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f44396a;
                this.f44399d = i9 + 1;
                char charAt2 = charSequence.charAt(i9);
                this.f44400e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i10 = this.f44399d;
                        if (i10 < this.f44398c) {
                            CharSequence charSequence2 = this.f44396a;
                            this.f44399d = i10 + 1;
                            charAt = charSequence2.charAt(i10);
                            this.f44400e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f44396a.charAt(this.f44399d - 1);
            this.f44400e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f44396a, this.f44399d);
                this.f44399d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f44399d--;
            byte c8 = c(this.f44400e);
            if (!this.f44397b) {
                return c8;
            }
            char c9 = this.f44400e;
            return c9 == '>' ? h() : c9 == ';' ? f() : c8;
        }

        byte b() {
            char charAt = this.f44396a.charAt(this.f44399d);
            this.f44400e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f44396a, this.f44399d);
                this.f44399d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f44399d++;
            byte c8 = c(this.f44400e);
            if (!this.f44397b) {
                return c8;
            }
            char c9 = this.f44400e;
            return c9 == '<' ? i() : c9 == '&' ? g() : c8;
        }

        int d() {
            this.f44399d = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (this.f44399d < this.f44398c && i8 == 0) {
                byte b8 = b();
                if (b8 != 0) {
                    if (b8 == 1 || b8 == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                    } else if (b8 != 9) {
                        switch (b8) {
                            case 14:
                            case 15:
                                i10++;
                                i9 = -1;
                                continue;
                            case 16:
                            case 17:
                                i10++;
                                i9 = 1;
                                continue;
                            case 18:
                                i10--;
                                i9 = 0;
                                continue;
                        }
                    }
                } else if (i10 == 0) {
                    return -1;
                }
                i8 = i10;
            }
            if (i8 == 0) {
                return 0;
            }
            if (i9 != 0) {
                return i9;
            }
            while (this.f44399d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i8 == i10) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i8 == i10) {
                            return 1;
                        }
                        break;
                    case 18:
                        i10++;
                        continue;
                }
                i10--;
            }
            return 0;
        }

        int e() {
            this.f44399d = this.f44398c;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                while (this.f44399d > 0) {
                    byte a8 = a();
                    if (a8 != 0) {
                        if (a8 == 1 || a8 == 2) {
                            if (i8 == 0) {
                                return 1;
                            }
                            if (i9 == 0) {
                                break;
                            }
                        } else if (a8 != 9) {
                            switch (a8) {
                                case 14:
                                case 15:
                                    if (i9 == i8) {
                                        return -1;
                                    }
                                    i8--;
                                    break;
                                case 16:
                                case 17:
                                    if (i9 == i8) {
                                        return 1;
                                    }
                                    i8--;
                                    break;
                                case 18:
                                    i8++;
                                    break;
                                default:
                                    if (i9 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i8 == 0) {
                            return -1;
                        }
                        if (i9 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        n nVar = o.f44412c;
        f44384d = nVar;
        f44385e = Character.toString((char) 8206);
        f44386f = Character.toString((char) 8207);
        f44387g = new C6897a(false, 2, nVar);
        f44388h = new C6897a(true, 2, nVar);
    }

    C6897a(boolean z7, int i8, n nVar) {
        this.f44389a = z7;
        this.f44390b = i8;
        this.f44391c = nVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C6897a c() {
        return new C0346a().a();
    }

    static boolean e(Locale locale) {
        return p.a(locale) == 1;
    }

    private String f(CharSequence charSequence, n nVar) {
        boolean a8 = nVar.a(charSequence, 0, charSequence.length());
        return (this.f44389a || !(a8 || b(charSequence) == 1)) ? this.f44389a ? (!a8 || b(charSequence) == -1) ? f44386f : "" : "" : f44385e;
    }

    private String g(CharSequence charSequence, n nVar) {
        boolean a8 = nVar.a(charSequence, 0, charSequence.length());
        return (this.f44389a || !(a8 || a(charSequence) == 1)) ? this.f44389a ? (!a8 || a(charSequence) == -1) ? f44386f : "" : "" : f44385e;
    }

    public boolean d() {
        return (this.f44390b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f44391c, true);
    }

    public CharSequence i(CharSequence charSequence, n nVar, boolean z7) {
        if (charSequence == null) {
            return null;
        }
        boolean a8 = nVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z7) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a8 ? o.f44411b : o.f44410a));
        }
        if (a8 != this.f44389a) {
            spannableStringBuilder.append(a8 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z7) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a8 ? o.f44411b : o.f44410a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f44391c, true);
    }

    public String k(String str, n nVar, boolean z7) {
        if (str == null) {
            return null;
        }
        return i(str, nVar, z7).toString();
    }
}
