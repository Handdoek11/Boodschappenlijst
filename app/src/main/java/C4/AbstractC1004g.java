package c4;

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1004g {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(valueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    static int b(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    static void c(boolean z7) {
        b4.h.o(z7, "no calls to next() since the last call to remove()");
    }
}
