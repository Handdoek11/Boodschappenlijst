package I5;

import J6.AbstractC0650j;
import java.util.List;
import y6.AbstractC6987o;

/* renamed from: I5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0635i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3266c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f3267a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3268b;

    /* renamed from: I5.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public AbstractC0635i(String str, List list) {
        J6.r.e(str, "content");
        J6.r.e(list, "parameters");
        this.f3267a = str;
        this.f3268b = list;
    }

    protected final String a() {
        return this.f3267a;
    }

    public final List b() {
        return this.f3268b;
    }

    public final String c(String str) {
        J6.r.e(str, "name");
        int f8 = AbstractC6987o.f(this.f3268b);
        if (f8 < 0) {
            return null;
        }
        int i8 = 0;
        while (true) {
            C0634h c0634h = (C0634h) this.f3268b.get(i8);
            if (S6.h.s(c0634h.c(), str, true)) {
                return c0634h.d();
            }
            if (i8 == f8) {
                return null;
            }
            i8++;
        }
    }

    public String toString() {
        if (this.f3268b.isEmpty()) {
            return this.f3267a;
        }
        int length = this.f3267a.length();
        int i8 = 0;
        int i9 = 0;
        for (C0634h c0634h : this.f3268b) {
            i9 += c0634h.c().length() + c0634h.d().length() + 3;
        }
        StringBuilder sb = new StringBuilder(length + i9);
        sb.append(this.f3267a);
        int f8 = AbstractC6987o.f(this.f3268b);
        if (f8 >= 0) {
            while (true) {
                C0634h c0634h2 = (C0634h) this.f3268b.get(i8);
                sb.append("; ");
                sb.append(c0634h2.c());
                sb.append("=");
                String d8 = c0634h2.d();
                if (AbstractC0636j.c(d8)) {
                    sb.append(AbstractC0636j.d(d8));
                } else {
                    sb.append(d8);
                }
                if (i8 == f8) {
                    break;
                }
                i8++;
            }
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "{\n            val size =…   }.toString()\n        }");
        return sb2;
    }
}
