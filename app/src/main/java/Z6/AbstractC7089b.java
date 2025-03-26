package z6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7089b {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }
}
