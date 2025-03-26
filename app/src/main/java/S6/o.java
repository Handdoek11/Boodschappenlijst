package S6;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class o extends n {
    public static Double i(String str) {
        J6.r.e(str, "<this>");
        try {
            if (g.f5149b.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
