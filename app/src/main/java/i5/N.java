package I5;

/* loaded from: classes2.dex */
public abstract class N {
    public static final String a(K k8) {
        J6.r.e(k8, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(b(k8));
        if (k8.l() == 0 || k8.l() == k8.k().c()) {
            sb.append(k8.g());
        } else {
            sb.append(J.e(k8));
        }
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final String b(K k8) {
        J6.r.e(k8, "<this>");
        StringBuilder sb = new StringBuilder();
        J.d(sb, k8.f(), k8.c());
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
