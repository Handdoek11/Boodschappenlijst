package S6;

import J6.AbstractC0650j;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f5146s = new a(null);

    /* renamed from: o, reason: collision with root package name */
    private final Pattern f5147o;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public f(Pattern pattern) {
        J6.r.e(pattern, "nativePattern");
        this.f5147o = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        J6.r.e(charSequence, "input");
        return this.f5147o.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        J6.r.e(charSequence, "input");
        J6.r.e(str, "replacement");
        String replaceAll = this.f5147o.matcher(charSequence).replaceAll(str);
        J6.r.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f5147o.toString();
        J6.r.d(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        J6.r.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        J6.r.d(compile, "compile(...)");
        this(compile);
    }
}
