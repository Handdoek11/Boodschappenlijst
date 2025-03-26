package u5;

import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6817a {

    /* renamed from: a, reason: collision with root package name */
    private final String f44010a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44011b;

    /* renamed from: c, reason: collision with root package name */
    private final List f44012c;

    /* renamed from: d, reason: collision with root package name */
    private final List f44013d;

    /* renamed from: e, reason: collision with root package name */
    private final String f44014e;

    /* renamed from: f, reason: collision with root package name */
    private final String f44015f;

    /* renamed from: g, reason: collision with root package name */
    private final String f44016g;

    protected C6817a(String str, boolean z7, List list, List list2, byte... bArr) {
        this.f44010a = str;
        this.f44011b = z7;
        this.f44012c = DesugarCollections.unmodifiableList(list);
        this.f44013d = DesugarCollections.unmodifiableList(list2);
        try {
            this.f44014e = new String(bArr, "UTF-8");
            int length = c().length();
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int codePointAt = c().codePointAt(i8);
                strArr[i9] = String.format("&#%d;", Integer.valueOf(codePointAt));
                strArr2[i9] = String.format("&#x%x;", Integer.valueOf(codePointAt));
                i8 += Character.charCount(codePointAt);
                i9++;
            }
            this.f44015f = d(strArr, i9);
            this.f44016g = d(strArr2, i9);
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(e8);
        }
    }

    private String d(String[] strArr, int i8) {
        String str = "";
        for (int i9 = 0; i9 < i8; i9++) {
            str = str + strArr[i9];
        }
        return str;
    }

    public List a() {
        return this.f44012c;
    }

    public List b() {
        return this.f44013d;
    }

    public String c() {
        return this.f44014e;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C6817a) && ((C6817a) obj).c().equals(c());
    }

    public int hashCode() {
        return this.f44014e.hashCode();
    }

    public String toString() {
        return "Emoji{description='" + this.f44010a + "', supportsFitzpatrick=" + this.f44011b + ", aliases=" + this.f44012c + ", tags=" + this.f44013d + ", unicode='" + this.f44014e + "', htmlDec='" + this.f44015f + "', htmlHex='" + this.f44016g + "'}";
    }
}
