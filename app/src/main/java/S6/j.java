package S6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y6.AbstractC6987o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j extends i {

    static final class a extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f5150o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            J6.r.e(str, "line");
            return str;
        }
    }

    static final class b extends J6.s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f5151o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f5151o = str;
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            J6.r.e(str, "line");
            return this.f5151o + str;
        }
    }

    private static final I6.l b(String str) {
        return str.length() == 0 ? a.f5150o : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            if (!S6.a.c(str.charAt(i8))) {
                break;
            }
            i8++;
        }
        return i8 == -1 ? str.length() : i8;
    }

    public static final String d(String str, String str2) {
        String str3;
        J6.r.e(str, "<this>");
        J6.r.e(str2, "newIndent");
        List Y7 = r.Y(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : Y7) {
            if (!h.t((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6987o.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(c((String) it.next())));
        }
        Integer num = (Integer) AbstractC6987o.L(arrayList2);
        int i8 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * Y7.size());
        I6.l b8 = b(str2);
        int f8 = AbstractC6987o.f(Y7);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : Y7) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC6987o.k();
            }
            String str4 = (String) obj2;
            if ((i8 == 0 || i8 == f8) && h.t(str4)) {
                str4 = null;
            } else {
                String y02 = h.y0(str4, intValue);
                if (y02 != null && (str3 = (String) b8.invoke(y02)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i8 = i9;
        }
        String sb = ((StringBuilder) y6.y.F(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        J6.r.d(sb, "toString(...)");
        return sb;
    }

    public static final String e(String str, String str2, String str3) {
        int i8;
        String str4;
        J6.r.e(str, "<this>");
        J6.r.e(str2, "newIndent");
        J6.r.e(str3, "marginPrefix");
        if (h.t(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List Y7 = r.Y(str);
        int length = str.length() + (str2.length() * Y7.size());
        I6.l b8 = b(str2);
        int f8 = AbstractC6987o.f(Y7);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        for (Object obj : Y7) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC6987o.k();
            }
            String str5 = (String) obj;
            String str6 = null;
            if ((i9 == 0 || i9 == f8) && h.t(str5)) {
                str5 = null;
            } else {
                int length2 = str5.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i8 = -1;
                        break;
                    }
                    if (!S6.a.c(str5.charAt(i11))) {
                        i8 = i11;
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    int i12 = i8;
                    if (q.A(str5, str3, i8, false, 4, null)) {
                        int length3 = i12 + str3.length();
                        J6.r.c(str5, "null cannot be cast to non-null type java.lang.String");
                        str6 = str5.substring(length3);
                        J6.r.d(str6, "substring(...)");
                    }
                }
                if (str6 != null && (str4 = (String) b8.invoke(str6)) != null) {
                    str5 = str4;
                }
            }
            if (str5 != null) {
                arrayList.add(str5);
            }
            i9 = i10;
        }
        String sb = ((StringBuilder) y6.y.F(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        J6.r.d(sb, "toString(...)");
        return sb;
    }

    public static String f(String str) {
        J6.r.e(str, "<this>");
        return d(str, "");
    }

    public static final String g(String str, String str2) {
        J6.r.e(str, "<this>");
        J6.r.e(str2, "marginPrefix");
        return e(str, "", str2);
    }

    public static /* synthetic */ String h(String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str2 = "|";
        }
        return g(str, str2);
    }
}
