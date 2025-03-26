package U;

import J6.AbstractC0650j;
import J6.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import y6.AbstractC6987o;
import z6.AbstractC7088a;

/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: o, reason: collision with root package name */
    private final String f5313o;

    /* renamed from: s, reason: collision with root package name */
    private final List f5314s;

    /* renamed from: t, reason: collision with root package name */
    private final List f5315t;

    /* renamed from: u, reason: collision with root package name */
    private final List f5316u;

    /* renamed from: U.a$a, reason: collision with other inner class name */
    public static final class C0108a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f5317a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5318b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5319c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5320d;

        public C0108a(Object obj, int i8, int i9, String str) {
            this.f5317a = obj;
            this.f5318b = i8;
            this.f5319c = i9;
            this.f5320d = str;
            if (i8 > i9) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final Object a() {
            return this.f5317a;
        }

        public final int b() {
            return this.f5318b;
        }

        public final int c() {
            return this.f5319c;
        }

        public final int d() {
            return this.f5319c;
        }

        public final Object e() {
            return this.f5317a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0108a)) {
                return false;
            }
            C0108a c0108a = (C0108a) obj;
            return r.a(this.f5317a, c0108a.f5317a) && this.f5318b == c0108a.f5318b && this.f5319c == c0108a.f5319c && r.a(this.f5320d, c0108a.f5320d);
        }

        public final int f() {
            return this.f5318b;
        }

        public final String g() {
            return this.f5320d;
        }

        public int hashCode() {
            Object obj = this.f5317a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.f5318b) * 31) + this.f5319c) * 31) + this.f5320d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f5317a + ", start=" + this.f5318b + ", end=" + this.f5319c + ", tag=" + this.f5320d + ')';
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC7088a.a(Integer.valueOf(((C0108a) obj).f()), Integer.valueOf(((C0108a) obj2).f()));
        }
    }

    public a(String str, List list, List list2, List list3) {
        List U7;
        this.f5313o = str;
        this.f5314s = list;
        this.f5315t = list2;
        this.f5316u = list3;
        if (list2 == null || (U7 = AbstractC6987o.U(list2, new b())) == null) {
            return;
        }
        int size = U7.size();
        int i8 = -1;
        for (int i9 = 0; i9 < size; i9++) {
            C0108a c0108a = (C0108a) U7.get(i9);
            if (c0108a.f() < i8) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (c0108a.d() > this.f5313o.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + c0108a.f() + ", " + c0108a.d() + ") is out of boundary").toString());
            }
            i8 = c0108a.d();
        }
    }

    public char a(int i8) {
        return this.f5313o.charAt(i8);
    }

    public int b() {
        return this.f5313o.length();
    }

    public final List c() {
        return this.f5314s;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i8) {
        return a(i8);
    }

    public final String d() {
        return this.f5313o;
    }

    public final List e(int i8, int i9) {
        List e8;
        List list = this.f5316u;
        if (list != null) {
            e8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C0108a) list.get(i10)).e();
            }
        } else {
            e8 = AbstractC6987o.e();
        }
        r.c(e8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return e8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.a(this.f5313o, aVar.f5313o) && r.a(this.f5314s, aVar.f5314s) && r.a(this.f5315t, aVar.f5315t) && r.a(this.f5316u, aVar.f5316u);
    }

    public final List f(int i8, int i9) {
        List e8;
        List list = this.f5316u;
        if (list != null) {
            e8 = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C0108a) list.get(i10)).e();
            }
        } else {
            e8 = AbstractC6987o.e();
        }
        r.c(e8, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return e8;
    }

    @Override // java.lang.CharSequence
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a subSequence(int i8, int i9) {
        if (i8 <= i9) {
            if (i8 == 0 && i9 == this.f5313o.length()) {
                return this;
            }
            String substring = this.f5313o.substring(i8, i9);
            r.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new a(substring, U.b.c(this.f5314s, i8, i9), U.b.c(this.f5315t, i8, i9), U.b.c(this.f5316u, i8, i9));
        }
        throw new IllegalArgumentException(("start (" + i8 + ") should be less or equal to end (" + i9 + ')').toString());
    }

    public int hashCode() {
        int hashCode = this.f5313o.hashCode() * 31;
        List list = this.f5314s;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f5315t;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f5316u;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return b();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f5313o;
    }

    public /* synthetic */ a(String str, List list, List list2, int i8, AbstractC0650j abstractC0650j) {
        this(str, (i8 & 2) != 0 ? AbstractC6987o.e() : list, (i8 & 4) != 0 ? AbstractC6987o.e() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, List list, List list2) {
        List list3 = list;
        List list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
