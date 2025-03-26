package u5;

import java.util.ArrayList;
import java.util.List;
import u5.f;

/* loaded from: classes2.dex */
public abstract class e {

    static class a implements b {
        a() {
        }

        @Override // u5.e.b
        public String a(c cVar) {
            return "";
        }
    }

    public interface b {
        String a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final C6817a f44021a;

        /* renamed from: b, reason: collision with root package name */
        private final g f44022b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44023c;

        /* synthetic */ c(C6817a c6817a, String str, int i8, d dVar) {
            this(c6817a, str, i8);
        }

        public int a() {
            return this.f44023c + this.f44021a.c().length();
        }

        public int b() {
            return this.f44023c;
        }

        public int c() {
            return a() + (this.f44022b != null ? 2 : 0);
        }

        private c(C6817a c6817a, String str, int i8) {
            this.f44021a = c6817a;
            this.f44022b = g.a(str);
            this.f44023c = i8;
        }
    }

    protected static int a(char[] cArr, int i8) {
        int i9 = -1;
        for (int i10 = i8 + 1; i10 <= cArr.length; i10++) {
            f.b c8 = u5.c.f44020d.c(cArr, i8, i10);
            if (c8.a()) {
                i9 = i10;
            } else if (c8.c()) {
                return i9;
            }
        }
        return i9;
    }

    protected static c b(char[] cArr, int i8) {
        while (true) {
            d dVar = null;
            if (i8 >= cArr.length) {
                return null;
            }
            int a8 = a(cArr, i8);
            if (a8 != -1) {
                return new c(u5.c.a(new String(cArr, i8, a8 - i8)), a8 + 2 <= cArr.length ? new String(cArr, a8, 2) : null, i8, dVar);
            }
            i8++;
        }
    }

    protected static List c(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            c b8 = b(charArray, i8);
            if (b8 == null) {
                return arrayList;
            }
            arrayList.add(b8);
            i8 = b8.c();
        }
    }

    public static String d(String str, b bVar) {
        StringBuilder sb = new StringBuilder(str.length());
        int i8 = 0;
        for (c cVar : c(str)) {
            sb.append((CharSequence) str, i8, cVar.b());
            sb.append(bVar.a(cVar));
            i8 = cVar.c();
        }
        sb.append(str.substring(i8));
        return sb.toString();
    }

    public static String e(String str) {
        return d(str, new a());
    }
}
